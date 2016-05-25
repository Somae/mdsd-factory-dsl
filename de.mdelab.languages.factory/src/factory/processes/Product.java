/**
 */
package factory.processes;

import factory.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.Product#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 *
 * @see factory.processes.ProcessesPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IdentifiedElement {
    /**
	 * Returns the value of the '<em><b>Owned Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process</em>' containment reference.
	 * @see #setOwnedProcess(factory.processes.Process)
	 * @see factory.processes.ProcessesPackage#getProduct_OwnedProcess()
	 * @model containment="true" required="true"
	 * @generated
	 */
    factory.processes.Process getOwnedProcess();

    /**
	 * Sets the value of the '{@link factory.processes.Product#getOwnedProcess <em>Owned Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Process</em>' containment reference.
	 * @see #getOwnedProcess()
	 * @generated
	 */
    void setOwnedProcess(factory.processes.Process value);

} // Product
