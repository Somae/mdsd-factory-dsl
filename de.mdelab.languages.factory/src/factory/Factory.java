/**
 */
package factory;

import factory.processes.Product;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.Factory#getAddress <em>Address</em>}</li>
 *   <li>{@link factory.Factory#getWidth <em>Width</em>}</li>
 *   <li>{@link factory.Factory#getLength <em>Length</em>}</li>
 *   <li>{@link factory.Factory#getHeight <em>Height</em>}</li>
 *   <li>{@link factory.Factory#getOwnedHumanOperator <em>Owned Human Operator</em>}</li>
 *   <li>{@link factory.Factory#getOwnedMachines <em>Owned Machines</em>}</li>
 *   <li>{@link factory.Factory#getOwnedProducts <em>Owned Products</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends IdentifiedElement {
    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see factory.FactoryPackage#getFactory_Address()
     * @model required="true"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link factory.Factory#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Width</em>' attribute.
     * @see #setWidth(int)
     * @see factory.FactoryPackage#getFactory_Width()
     * @model required="true"
     * @generated
     */
    int getWidth();

    /**
     * Sets the value of the '{@link factory.Factory#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Width</em>' attribute.
     * @see #getWidth()
     * @generated
     */
    void setWidth(int value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see factory.FactoryPackage#getFactory_Length()
     * @model required="true"
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link factory.Factory#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Height</em>' attribute.
     * @see #setHeight(int)
     * @see factory.FactoryPackage#getFactory_Height()
     * @model required="true"
     * @generated
     */
    int getHeight();

    /**
     * Sets the value of the '{@link factory.Factory#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #getHeight()
     * @generated
     */
    void setHeight(int value);

    /**
     * Returns the value of the '<em><b>Owned Human Operator</b></em>' containment reference list.
     * The list contents are of type {@link factory.HumanOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Human Operator</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Human Operator</em>' containment reference list.
     * @see factory.FactoryPackage#getFactory_OwnedHumanOperator()
     * @model containment="true"
     * @generated
     */
    EList<HumanOperator> getOwnedHumanOperator();

    /**
     * Returns the value of the '<em><b>Owned Machines</b></em>' containment reference list.
     * The list contents are of type {@link factory.Machine}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Machines</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Machines</em>' containment reference list.
     * @see factory.FactoryPackage#getFactory_OwnedMachines()
     * @model containment="true"
     * @generated
     */
    EList<Machine> getOwnedMachines();

    /**
     * Returns the value of the '<em><b>Owned Products</b></em>' containment reference list.
     * The list contents are of type {@link factory.processes.Product}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Products</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Products</em>' containment reference list.
     * @see factory.FactoryPackage#getFactory_OwnedProducts()
     * @model containment="true"
     * @generated
     */
    EList<Product> getOwnedProducts();

} // Factory
