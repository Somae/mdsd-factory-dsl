/**
 */
package factory.impl;

import factory.Factory;
import factory.FactoryPackage;
import factory.FactorySpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.FactorySpecificationImpl#getOwnedFactories <em>Owned Factories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorySpecificationImpl extends MinimalEObjectImpl.Container implements FactorySpecification {
    /**
     * The cached value of the '{@link #getOwnedFactories() <em>Owned Factories</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedFactories()
     * @generated
     * @ordered
     */
    protected EList<Factory> ownedFactories;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FactorySpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FactoryPackage.Literals.FACTORY_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Factory> getOwnedFactories() {
        if (ownedFactories == null) {
            ownedFactories = new EObjectContainmentEList<Factory>(Factory.class, this, FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES);
        }
        return ownedFactories;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
                return ((InternalEList<?>)getOwnedFactories()).basicRemove(otherEnd, msgs);
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
            case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
                return getOwnedFactories();
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
            case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
                getOwnedFactories().clear();
                getOwnedFactories().addAll((Collection<? extends Factory>)newValue);
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
            case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
                getOwnedFactories().clear();
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
            case FactoryPackage.FACTORY_SPECIFICATION__OWNED_FACTORIES:
                return ownedFactories != null && !ownedFactories.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FactorySpecificationImpl
