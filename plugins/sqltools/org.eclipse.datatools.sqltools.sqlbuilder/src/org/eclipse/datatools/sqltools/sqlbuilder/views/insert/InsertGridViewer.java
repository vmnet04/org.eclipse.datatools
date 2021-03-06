/*******************************************************************************
 * Copyright � 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.sqlbuilder.views.insert;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.help.WorkbenchHelp;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.XMLDataType;

import org.eclipse.datatools.modelbase.sql.query.ValueExpressionColumn;
import org.eclipse.datatools.sqltools.sqlbuilder.Messages;
import org.eclipse.datatools.sqltools.sqlbuilder.SQLBuilderContextIds;
import org.eclipse.datatools.sqltools.sqlbuilder.model.SQLBuilderConstants;
import org.eclipse.datatools.sqltools.sqlbuilder.model.SQLDomainModel;
import org.eclipse.datatools.sqltools.sqlbuilder.util.LabelValuePair;
import org.eclipse.datatools.sqltools.sqlbuilder.views.DynamicComboBoxCellEditor;
import org.eclipse.datatools.sqltools.sqlbuilder.views.GridViewer;
import org.eclipse.datatools.sqltools.sqlbuilder.views.Modifier;

public class InsertGridViewer extends GridViewer {

    TableColumn c2;
    SQLDomainModel domainModel;
    DynamicComboBoxCellEditor insertValueCellEditor;

    public InsertGridViewer(SQLDomainModel domainModel, Composite parent) {
        super(domainModel, parent);

        this.domainModel = domainModel;

        WorkbenchHelp.setHelp(table, SQLBuilderContextIds.SQLB_INSERT_VIEW);

        c2 = new TableColumn(table, SWT.NULL);
        c2.setText(Messages._UI_COLUMN_INSERT_VALUE);

        TableLayout layout = new TableLayout();
        layout.addColumnData(new ColumnPixelData(200)); // column name
        layout.addColumnData(new ColumnPixelData(200));
        table.setLayout(layout);

        String columnProperties[] = { (String) SQLBuilderConstants.P_STATEMENT_COLUMN, (String) SQLBuilderConstants.P_STATEMENT_VALUE };
        setColumnProperties(columnProperties);

//        LabelValuePair valueComboItems[] = { new LabelValuePair(SQLBuilderConstants.P_VALUE_DEFAULT, SQLBuilderConstants.P_VALUE_DEFAULT),
//                new LabelValuePair(SQLBuilderConstants.P_VALUE_NULL, SQLBuilderConstants.P_VALUE_NULL),
//                new LabelValuePair(SQLBuilderConstants.P_BUILD_EXPRESSION, SQLBuilderConstants.P_BUILD_EXPRESSION) };

        insertValueCellEditor = new DynamicComboBoxCellEditor(table, null, this);
        // Create the cell editors
        CellEditor editors[] = { columnComboBoxCellEditor, insertValueCellEditor };
        setCellEditors(editors);

        setCellModifier(new Modifier());

        InsertGridContentProvider gridContentProvider = new InsertGridContentProvider(domainModel);

        //TODO QMP-ALL provider
        setContentProvider(gridContentProvider);
        InsertGridLabelProvider insertGridLabelProvider = new InsertGridLabelProvider();
        setLabelProvider(insertGridLabelProvider);

    }

    public SQLDomainModel getDomainModel() {
        return domainModel;
    }

    class InsertGridLabelProvider extends LabelProvider implements ITableLabelProvider {

        public String getColumnText(Object object, int columnIndex) {
            if (object instanceof InsertTableElement) {
                InsertTableElement insertElement = (InsertTableElement) object;
                return insertElement.getColumnText(columnIndex);
            }
            return ""; //$NON-NLS-1$
        }

        public Image getColumnImage(Object object, int columnIndex) {
            return null;
        }
    }

    public void menuAboutToShow(IMenuManager menu) {
        RemoveInsertColumnAction removeColumnAction = new RemoveInsertColumnAction(this);
        menu.add(removeColumnAction);
    }

    public void inputChanged(java.lang.Object input, java.lang.Object oldInput) {
        super.inputChanged(input, oldInput);
        setGridTitle();
    }

    private void setGridTitle() {
        //setTitle("Insert Row");
    }

    public void refreshCellEditor(int row) {
        Object obj = getElementAt(row);
        int numOfItems = 2;
        if (domainModel.getVendor().isDB2()) {
            numOfItems = 3;
        }

        LabelValuePair[] valueComboItems = new LabelValuePair[numOfItems];

        if (domainModel.getVendor().isDB2()) {
            valueComboItems[0] = new LabelValuePair(SQLBuilderConstants.P_VALUE_DEFAULT, SQLBuilderConstants.P_VALUE_DEFAULT);
            valueComboItems[1] = new LabelValuePair(SQLBuilderConstants.P_VALUE_NULL, SQLBuilderConstants.P_VALUE_NULL);
            valueComboItems[2] = new LabelValuePair(SQLBuilderConstants.P_BUILD_EXPRESSION, SQLBuilderConstants.P_BUILD_EXPRESSION);
        }
        else {
            valueComboItems[0] = new LabelValuePair(SQLBuilderConstants.P_VALUE_NULL, SQLBuilderConstants.P_VALUE_NULL);
            valueComboItems[1] = new LabelValuePair(SQLBuilderConstants.P_BUILD_EXPRESSION, SQLBuilderConstants.P_BUILD_EXPRESSION);
        }

        insertValueCellEditor.createItems(valueComboItems);
        insertValueCellEditor.setNeedQuotes(false);

        //LabelValuePair[] valueComboItems2 = null;
        if (obj instanceof InsertTableElement) {
            Object expr = ((InsertTableElement) obj).getExpression();
            InsertTableElement insTE = (InsertTableElement) obj;
            ValueExpressionColumn colExpr =  insTE.getColumn();
            if (expr != null) {
                int numOfItems2 = 3;
                if (domainModel.getVendor().isDB2()) {
                    if (colExpr != null && (colExpr.getDataType() instanceof XMLDataType ||
                            colExpr.getDataType() instanceof CharacterStringDataType)) {
                    	numOfItems2 = 5;
                    }
                    else {
                    	numOfItems2 = 4;
                    }
                }

                LabelValuePair[] valueComboItems2 = new LabelValuePair[numOfItems2];

                if (domainModel.getVendor().isDB2()) {
                    valueComboItems2[0] = new LabelValuePair(SQLBuilderConstants.P_VALUE_DEFAULT, SQLBuilderConstants.P_VALUE_DEFAULT);
                    valueComboItems2[1] = new LabelValuePair(SQLBuilderConstants.P_VALUE_NULL, SQLBuilderConstants.P_VALUE_NULL);
                    valueComboItems2[2] = new LabelValuePair(SQLBuilderConstants.P_EDIT_EXPRESSION, SQLBuilderConstants.P_EDIT_EXPRESSION);
                    valueComboItems2[3] = new LabelValuePair(SQLBuilderConstants.P_REPLACE_EXPRESSION, SQLBuilderConstants.P_REPLACE_EXPRESSION);  
                    if (colExpr != null && (colExpr.getDataType() instanceof XMLDataType ||
                            colExpr.getDataType() instanceof CharacterStringDataType)) {
                    	valueComboItems2[4] = new LabelValuePair(SQLBuilderConstants.P_EDIT_INPUT_VALUE,
                                SQLBuilderConstants.P_EDIT_INPUT_VALUE);
                    }
                }
                else {
                    valueComboItems2[0] = new LabelValuePair(SQLBuilderConstants.P_VALUE_NULL, SQLBuilderConstants.P_VALUE_NULL);
                    valueComboItems2[1] = new LabelValuePair(SQLBuilderConstants.P_EDIT_EXPRESSION, SQLBuilderConstants.P_EDIT_EXPRESSION);
                    valueComboItems2[2] = new LabelValuePair(SQLBuilderConstants.P_REPLACE_EXPRESSION, SQLBuilderConstants.P_REPLACE_EXPRESSION);
                }
                insertValueCellEditor.createItems(valueComboItems2);
            }
            //InsertTableElement insTE = (InsertTableElement) obj;
            //ValueExpressionColumn colExpr =  insTE.getColumn();
            if (colExpr != null) {
                insertValueCellEditor.setNeedQuotes(true);
                insertValueCellEditor.setQuotesContext("insert"); //$NON-NLS-1$
                insertValueCellEditor.setPairDataType(colExpr.getDataType());              
            }
            else {
                insertValueCellEditor.setNeedQuotes(false);
            }

        }
        CellEditor editors[] = { columnComboBoxCellEditor, insertValueCellEditor };
        setCellEditors(editors);
    }

    public void setEnabled(boolean enable) {
        table.setEnabled(enable);
    }
}
