/**
 */
package factory.processes.impl;

import factory.impl.IdentifiedElementImpl;

import factory.processes.ProcessesPackage;
import factory.processes.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.impl.ProcessImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends IdentifiedElementImpl implements factory.processes.Process {
    /**
     * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedTasks()
     * @generated
     * @ordered
     */
    protected EList<Task> ownedTasks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProcessesPackage.Literals.PROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Task> getOwnedTasks() {
        if (ownedTasks == null) {
            ownedTasks = new EObjectContainmentEList<Task>(Task.class, this, ProcessesPackage.PROCESS__OWNED_TASKS);
        }
        return ownedTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProcessesPackage.PROCESS__OWNED_TASKS:
                return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ProcessesPackage.PROCESS__OWNED_TASKS:
                return getOwnedTasks();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProcessesPackage.PROCESS__OWNED_TASKS:
                getOwnedTasks().clear();
                getOwnedTasks().addAll((Collection<? extends Task>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ProcessesPackage.PROCESS__OWNED_TASKS:
                getOwnedTasks().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ProcessesPackage.PROCESS__OWNED_TASKS:
                return ownedTasks != null && !ownedTasks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProcessImpl
