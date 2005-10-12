/*******************************************************************************
 * Copyright (c) 2004-2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: brianf - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.connectivity.internal.ui;

import java.util.ArrayList;

import org.eclipse.datatools.connectivity.drivers.IPropertySet;
import org.eclipse.datatools.connectivity.drivers.models.CategoryDescriptor;
import org.eclipse.datatools.connectivity.drivers.models.TemplateDescriptor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * Filters the tree to only show those categories or templates you want.
 * 
 * @author brianf
 */
public class DriverTreeFilter extends ViewerFilter {

	// applicable category and driver template IDs
	private String mCategoryId;
	private String mDriverTemplateId;

	// Lists of OK categories and templates
	private ArrayList okCategoryIds;
	private ArrayList okTemplateIds;

	/**
	 * Constructor
	 */
	public DriverTreeFilter() {
		super();
	}

	/**
	 * Set the category id
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(String categoryId) {
		this.mCategoryId = categoryId;
		refreshOkList();
	}

	/**
	 * Set the driver template id
	 * 
	 * @param driverTypeId
	 */
	public void setDriverTemplateId(String driverTemplateId) {
		this.mDriverTemplateId = driverTemplateId;
	}

	/*
	 * Refresh the OK lists
	 */
	private void refreshOkList() {
		this.okCategoryIds = new ArrayList();
		this.okTemplateIds = new ArrayList();
		if (this.mCategoryId != null) {
			this.okCategoryIds = new ArrayList();
			this.okCategoryIds.add(this.mCategoryId);

			CategoryDescriptor category = CategoryDescriptor
					.getCategoryDescriptor(this.mCategoryId);
			if (category != null) {
				if (category.getParentCategory() != null) {
					CategoryDescriptor parent = CategoryDescriptor
							.getCategoryDescriptor(category.getParentCategory());
					this.okCategoryIds.add(parent.getId());
					while (parent.getParentCategory() != null) {
						parent = CategoryDescriptor
								.getCategoryDescriptor(parent
										.getParentCategory());
						this.okCategoryIds.add(parent.getId());
					}
				}
				else {
					addChildren(category);
				}
			}
		}
		else if (this.mDriverTemplateId != null) {
			this.okTemplateIds.add(this.mDriverTemplateId);

			TemplateDescriptor template = TemplateDescriptor
					.getDriverTemplateDescriptor(this.mDriverTemplateId);
			if (template != null) {
				if (template.getParentCategory() != null) {
					CategoryDescriptor parent = CategoryDescriptor
							.getCategoryDescriptor(template.getParentCategory());
					this.okCategoryIds.add(parent.getId());
					while (parent.getParentCategory() != null) {
						parent = CategoryDescriptor
								.getCategoryDescriptor(parent
										.getParentCategory());
						this.okCategoryIds.add(parent.getId());
					}
				}
			}
		}
	}

	/*
	 * Add child categories for the given parent
	 */
	private void addChildren(CategoryDescriptor parent) {
		Object children[] = parent.getChildCategories().toArray();
		if (children.length > 0) {
			for (int i = 0; i < children.length; i++) {
				CategoryDescriptor child = (CategoryDescriptor) children[i];
				this.okCategoryIds.add(child.getId());
				addChildren(child);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if (element instanceof TemplateDescriptor) {
			return true;
		}
		else if (element instanceof CategoryDescriptor) {
			CategoryDescriptor category = (CategoryDescriptor) element;
			if (this.okCategoryIds.contains(category.getId()))
				return true;
		}
		else if (element instanceof IPropertySet) {
			if (this.mDriverTemplateId != null) {
				TemplateDescriptor template = (TemplateDescriptor) element;
				if (this.okTemplateIds.contains(template.getId()))
					return true;
			}
			return true;
		}

		return false;
	}
}
