/**
 */
package factory.impl;

import factory.Factory;
import factory.FactoryPackage;
import factory.HumanOperator;
import factory.Machine;

import factory.processes.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.FactoryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getLength <em>Length</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getOwnedHumanOperator <em>Owned Human Operator</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getOwnedMachines <em>Owned Machines</em>}</li>
 *   <li>{@link factory.impl.FactoryImpl#getOwnedProducts <em>Owned Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends IdentifiedElementImpl implements Factory {
    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final int WIDTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected int width = WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected static final int HEIGHT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected int height = HEIGHT_EDEFAULT;

    /**
     * The cached value of the '{@link #getOwnedHumanOperator() <em>Owned Human Operator</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedHumanOperator()
     * @generated
     * @ordered
     */
    protected EList<HumanOperator> ownedHumanOperator;

    /**
     * The cached value of the '{@link #getOwnedMachines() <em>Owned Machines</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedMachines()
     * @generated
     * @ordered
     */
    protected EList<Machine> ownedMachines;

    /**
     * The cached value of the '{@link #getOwnedProducts() <em>Owned Products</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedProducts()
     * @generated
     * @ordered
     */
    protected EList<Product> ownedProducts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FactoryPackage.Literals.FACTORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWidth(int newWidth) {
        int oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHeight() {
        return height;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeight(int newHeight) {
        int oldHeight = height;
        height = newHeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__HEIGHT, oldHeight, height));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HumanOperator> getOwnedHumanOperator() {
        if (ownedHumanOperator == null) {
            ownedHumanOperator = new EObjectContainmentEList<HumanOperator>(HumanOperator.class, this, FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR);
        }
        return ownedHumanOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Machine> getOwnedMachines() {
        if (ownedMachines == null) {
            ownedMachines = new EObjectContainmentEList<Machine>(Machine.class, this, FactoryPackage.FACTORY__OWNED_MACHINES);
        }
        return ownedMachines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Product> getOwnedProducts() {
        if (ownedProducts == null) {
            ownedProducts = new EObjectContainmentEList<Product>(Product.class, this, FactoryPackage.FACTORY__OWNED_PRODUCTS);
        }
        return ownedProducts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR:
                return ((InternalEList<?>)getOwnedHumanOperator()).basicRemove(otherEnd, msgs);
            case FactoryPackage.FACTORY__OWNED_MACHINES:
                return ((InternalEList<?>)getOwnedMachines()).basicRemove(otherEnd, msgs);
            case FactoryPackage.FACTORY__OWNED_PRODUCTS:
                return ((InternalEList<?>)getOwnedProducts()).basicRemove(otherEnd, msgs);
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
            case FactoryPackage.FACTORY__ADDRESS:
                return getAddress();
            case FactoryPackage.FACTORY__WIDTH:
                return getWidth();
            case FactoryPackage.FACTORY__LENGTH:
                return getLength();
            case FactoryPackage.FACTORY__HEIGHT:
                return getHeight();
            case FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR:
                return getOwnedHumanOperator();
            case FactoryPackage.FACTORY__OWNED_MACHINES:
                return getOwnedMachines();
            case FactoryPackage.FACTORY__OWNED_PRODUCTS:
                return getOwnedProducts();
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
            case FactoryPackage.FACTORY__ADDRESS:
                setAddress((String)newValue);
                return;
            case FactoryPackage.FACTORY__WIDTH:
                setWidth((Integer)newValue);
                return;
            case FactoryPackage.FACTORY__LENGTH:
                setLength((Integer)newValue);
                return;
            case FactoryPackage.FACTORY__HEIGHT:
                setHeight((Integer)newValue);
                return;
            case FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR:
                getOwnedHumanOperator().clear();
                getOwnedHumanOperator().addAll((Collection<? extends HumanOperator>)newValue);
                return;
            case FactoryPackage.FACTORY__OWNED_MACHINES:
                getOwnedMachines().clear();
                getOwnedMachines().addAll((Collection<? extends Machine>)newValue);
                return;
            case FactoryPackage.FACTORY__OWNED_PRODUCTS:
                getOwnedProducts().clear();
                getOwnedProducts().addAll((Collection<? extends Product>)newValue);
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
            case FactoryPackage.FACTORY__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case FactoryPackage.FACTORY__WIDTH:
                setWidth(WIDTH_EDEFAULT);
                return;
            case FactoryPackage.FACTORY__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case FactoryPackage.FACTORY__HEIGHT:
                setHeight(HEIGHT_EDEFAULT);
                return;
            case FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR:
                getOwnedHumanOperator().clear();
                return;
            case FactoryPackage.FACTORY__OWNED_MACHINES:
                getOwnedMachines().clear();
                return;
            case FactoryPackage.FACTORY__OWNED_PRODUCTS:
                getOwnedProducts().clear();
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
            case FactoryPackage.FACTORY__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case FactoryPackage.FACTORY__WIDTH:
                return width != WIDTH_EDEFAULT;
            case FactoryPackage.FACTORY__LENGTH:
                return length != LENGTH_EDEFAULT;
            case FactoryPackage.FACTORY__HEIGHT:
                return height != HEIGHT_EDEFAULT;
            case FactoryPackage.FACTORY__OWNED_HUMAN_OPERATOR:
                return ownedHumanOperator != null && !ownedHumanOperator.isEmpty();
            case FactoryPackage.FACTORY__OWNED_MACHINES:
                return ownedMachines != null && !ownedMachines.isEmpty();
            case FactoryPackage.FACTORY__OWNED_PRODUCTS:
                return ownedProducts != null && !ownedProducts.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (address: ");
        result.append(address);
        result.append(", width: ");
        result.append(width);
        result.append(", length: ");
        result.append(length);
        result.append(", height: ");
        result.append(height);
        result.append(')');
        return result.toString();
    }

} //FactoryImpl
