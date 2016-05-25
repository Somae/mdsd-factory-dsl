/**
 */
package factory.impl;

import factory.FactoryPackage;
import factory.Machine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.impl.MachineImpl#getX <em>X</em>}</li>
 *   <li>{@link factory.impl.MachineImpl#getY <em>Y</em>}</li>
 *   <li>{@link factory.impl.MachineImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends IdentifiedElementImpl implements Machine {
    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final int X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected int x = X_EDEFAULT;

    /**
     * The default value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected static final int Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected int y = Y_EDEFAULT;

    /**
     * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected static final int DIMENSION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected int dimension = DIMENSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FactoryPackage.Literals.MACHINE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX(int newX) {
        int oldX = x;
        x = newX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__X, oldX, x));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getY() {
        return y;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY(int newY) {
        int oldY = y;
        y = newY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__Y, oldY, y));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDimension(int newDimension) {
        int oldDimension = dimension;
        dimension = newDimension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__DIMENSION, oldDimension, dimension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FactoryPackage.MACHINE__X:
                return getX();
            case FactoryPackage.MACHINE__Y:
                return getY();
            case FactoryPackage.MACHINE__DIMENSION:
                return getDimension();
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
            case FactoryPackage.MACHINE__X:
                setX((Integer)newValue);
                return;
            case FactoryPackage.MACHINE__Y:
                setY((Integer)newValue);
                return;
            case FactoryPackage.MACHINE__DIMENSION:
                setDimension((Integer)newValue);
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
            case FactoryPackage.MACHINE__X:
                setX(X_EDEFAULT);
                return;
            case FactoryPackage.MACHINE__Y:
                setY(Y_EDEFAULT);
                return;
            case FactoryPackage.MACHINE__DIMENSION:
                setDimension(DIMENSION_EDEFAULT);
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
            case FactoryPackage.MACHINE__X:
                return x != X_EDEFAULT;
            case FactoryPackage.MACHINE__Y:
                return y != Y_EDEFAULT;
            case FactoryPackage.MACHINE__DIMENSION:
                return dimension != DIMENSION_EDEFAULT;
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
        result.append(" (x: ");
        result.append(x);
        result.append(", y: ");
        result.append(y);
        result.append(", dimension: ");
        result.append(dimension);
        result.append(')');
        return result.toString();
    }

} //MachineImpl
