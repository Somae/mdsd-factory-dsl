/**
 */
package factory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.Machine#getX <em>X</em>}</li>
 *   <li>{@link factory.Machine#getY <em>Y</em>}</li>
 *   <li>{@link factory.Machine#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends IdentifiedElement {
    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #setX(int)
     * @see factory.FactoryPackage#getMachine_X()
     * @model required="true"
     * @generated
     */
    int getX();

    /**
     * Sets the value of the '{@link factory.Machine#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #getX()
     * @generated
     */
    void setX(int value);

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #setY(int)
     * @see factory.FactoryPackage#getMachine_Y()
     * @model required="true"
     * @generated
     */
    int getY();

    /**
     * Sets the value of the '{@link factory.Machine#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
    void setY(int value);

    /**
     * Returns the value of the '<em><b>Dimension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dimension</em>' attribute.
     * @see #setDimension(int)
     * @see factory.FactoryPackage#getMachine_Dimension()
     * @model required="true"
     * @generated
     */
    int getDimension();

    /**
     * Sets the value of the '{@link factory.Machine#getDimension <em>Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dimension</em>' attribute.
     * @see #getDimension()
     * @generated
     */
    void setDimension(int value);

} // Machine
