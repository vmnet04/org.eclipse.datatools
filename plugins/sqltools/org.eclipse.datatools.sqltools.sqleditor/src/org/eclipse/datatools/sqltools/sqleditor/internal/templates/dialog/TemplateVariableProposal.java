/*
 * Created on 2005-10-12
 * 
 * Copyright (c) Sybase, Inc. 2004 All rights reserved.
 */
package org.eclipse.datatools.sqltools.sqleditor.internal.templates.dialog;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.templates.TemplateVariableResolver;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;

/**
 * A proposal for insertion of template variables.
 * <p>
 * This class should not be used by clients and may become package visible in the future.
 * </p>
 * 
 * @since 3.0
 */
final class TemplateVariableProposal implements ICompletionProposal
{

    private TemplateVariableResolver fVariable;
    private int                      fOffset;
    private int                      fLength;
    private ITextViewer              fViewer;

    private Point                    fSelection;

    /**
     * Creates a template variable proposal.
     * 
     * @param variable the template variable
     * @param offset the offset to replace
     * @param length the length to replace
     * @param viewer the viewer
     */
    public TemplateVariableProposal(TemplateVariableResolver variable, int offset, int length, ITextViewer viewer)
    {
        fVariable = variable;
        fOffset = offset;
        fLength = length;
        fViewer = viewer;
    }

    /*
     * @see ICompletionProposal#apply(IDocument)
     */
    public void apply(IDocument document)
    {

        try
        {
            String variable = fVariable.getType().equals("dollar") ? "$$" : "${" + fVariable.getType() + '}'; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            document.replace(fOffset, fLength, variable);
            fSelection = new Point(fOffset + variable.length(), 0);

        }
        catch (BadLocationException e)
        {
            Shell shell = fViewer.getTextWidget().getShell();
            MessageDialog.openError(shell, TextEditorTemplateMessages.TemplateVariableProposal_error_title, e
                .getMessage());
        }
    }

    /*
     * @see ICompletionProposal#getSelection(IDocument)
     */
    public Point getSelection(IDocument document)
    {
        return fSelection;
    }

    /*
     * @see ICompletionProposal#getAdditionalProposalInfo()
     */
    public String getAdditionalProposalInfo()
    {
        return null;
    }

    /*
     * @see ICompletionProposal#getDisplayString()
     */
    public String getDisplayString()
    {
        return fVariable.getType() + " - " + fVariable.getDescription(); //$NON-NLS-1$
    }

    /*
     * @see ICompletionProposal#getImage()
     */
    public Image getImage()
    {
        return null;
    }

    /*
     * @see ICompletionProposal#getContextInformation()
     */
    public IContextInformation getContextInformation()
    {
        return null;
    }
}
