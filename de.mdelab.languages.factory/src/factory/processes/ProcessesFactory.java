/**
 */
package factory.processes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see factory.processes.ProcessesPackage
 * @generated
 */
public interface ProcessesFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ProcessesFactory eINSTANCE = factory.processes.impl.ProcessesFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
    Product createProduct();

    /**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
    Process createProcess();

    /**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
    Task createTask();

    /**
	 * Returns a new object of class '<em>Material</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material</em>'.
	 * @generated
	 */
    Material createMaterial();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    ProcessesPackage getProcessesPackage();

} //ProcessesFactory
