/**
 */
package factory.processes.impl;

import factory.impl.IdentifiedElementImpl;

import factory.processes.ProcessesPackage;
import factory.processes.Product;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.impl.ProductImpl#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends IdentifiedElementImpl implements Product {
    /**
     * The cached value of the '{@link #getOwnedProcess() <em>Owned Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedProcess()
     * @generated
     * @ordered
     */
    protected factory.processes.Process ownedProcess;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProcessesPackage.Literals.PRODUCT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public factory.processes.Process getOwnedProcess() {
        return ownedProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedProcess(factory.processes.Process newOwnedProcess, NotificationChain msgs) {
        factory.processes.Process oldOwnedProcess = ownedProcess;
        ownedProcess = newOwnedProcess;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessesPackage.PRODUCT__OWNED_PROCESS, oldOwnedProcess, newOwnedProcess);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedProcess(factory.processes.Process newOwnedProcess) {
        if (newOwnedProcess != ownedProcess) {
            NotificationChain msgs = null;
            if (ownedProcess != null)
                msgs = ((InternalEObject)ownedProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.PRODUCT__OWNED_PROCESS, null, msgs);
            if (newOwnedProcess != null)
                msgs = ((InternalEObject)newOwnedProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessesPackage.PRODUCT__OWNED_PROCESS, null, msgs);
            msgs = basicSetOwnedProcess(newOwnedProcess, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ProcessesPackage.PRODUCT__OWNED_PROCESS, newOwnedProcess, newOwnedProcess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProcessesPackage.PRODUCT__OWNED_PROCESS:
                return basicSetOwnedProcess(null, msgs);
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
            case ProcessesPackage.PRODUCT__OWNED_PROCESS:
                return getOwnedProcess();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProcessesPackage.PRODUCT__OWNED_PROCESS:
                setOwnedProcess((factory.processes.Process)newValue);
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
            case ProcessesPackage.PRODUCT__OWNED_PROCESS:
                setOwnedProcess((factory.processes.Process)null);
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
            case ProcessesPackage.PRODUCT__OWNED_PROCESS:
                return ownedProcess != null;
        }
        return super.eIsSet(featureID);
    }

} //ProductImpl
