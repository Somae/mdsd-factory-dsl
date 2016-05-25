/**
 */
package factory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see factory.FactoryPackage
 * @generated
 */
public interface FactoryFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FactoryFactory eINSTANCE = factory.impl.FactoryFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Factory</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Factory</em>'.
     * @generated
     */
    Factory createFactory();

    /**
     * Returns a new object of class '<em>Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Machine</em>'.
     * @generated
     */
    Machine createMachine();

    /**
     * Returns a new object of class '<em>Human Operator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Human Operator</em>'.
     * @generated
     */
    HumanOperator createHumanOperator();

    /**
     * Returns a new object of class '<em>Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Specification</em>'.
     * @generated
     */
    FactorySpecification createFactorySpecification();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    FactoryPackage getFactoryPackage();

} //FactoryFactory
