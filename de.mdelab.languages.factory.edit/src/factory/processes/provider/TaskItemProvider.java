/**
 */
package factory.processes.provider;


import factory.processes.ProcessesPackage;
import factory.processes.Task;

import factory.provider.FactoryEditPlugin;
import factory.provider.IdentifiedElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link factory.processes.Task} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskItemProvider extends IdentifiedElementItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TaskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

    /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMachinesPropertyDescriptor(object);
			addHumanOperatorsPropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Machines feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addMachinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_machines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_machines_feature", "_UI_Task_type"),
				 ProcessesPackage.Literals.TASK__MACHINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Human Operators feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addHumanOperatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_humanOperators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_humanOperators_feature", "_UI_Task_type"),
				 ProcessesPackage.Literals.TASK__HUMAN_OPERATORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_input_feature", "_UI_Task_type"),
				 ProcessesPackage.Literals.TASK__INPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_output_feature", "_UI_Task_type"),
				 ProcessesPackage.Literals.TASK__OUTPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This returns Task.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Task"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		String label = ((Task)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Task_type") :
			getString("_UI_Task_type") + " " + label;
	}
    

    /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

    /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		return FactoryEditPlugin.INSTANCE;
	}

}
