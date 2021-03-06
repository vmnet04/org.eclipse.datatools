/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeDefinitionItemProvider.java,v 1.3 2007/05/31 00:29:17 dpchou Exp $
 */
package org.eclipse.datatools.modelbase.sql.datatypes.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.schema.provider.SqlmodelEditPlugin;
import org.eclipse.datatools.modelbase.sql.schema.provider.TypedElementItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;


/**
 * This is the item provider adapter for a {@link org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDefinitionItemProvider
	extends TypedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addScopeCheckPropertyDescriptor(object);
			addScopeCheckedPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scope Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopeCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDefinition_scopeCheck_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDefinition_scopeCheck_feature", "_UI_AttributeDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope Checked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopeCheckedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDefinition_scopeChecked_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDefinition_scopeChecked_feature", "_UI_AttributeDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDefinition_defaultValue_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDefinition_defaultValue_feature", "_UI_AttributeDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AttributeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeDefinition")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((AttributeDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeDefinition_type") : //$NON-NLS-1$
			getString("_UI_AttributeDefinition_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AttributeDefinition.class)) {
			case SQLDataTypesPackage.ATTRIBUTE_DEFINITION__SCOPE_CHECK:
			case SQLDataTypesPackage.ATTRIBUTE_DEFINITION__SCOPE_CHECKED:
			case SQLDataTypesPackage.ATTRIBUTE_DEFINITION__DEFAULT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return SqlmodelEditPlugin.INSTANCE;
	}

}
