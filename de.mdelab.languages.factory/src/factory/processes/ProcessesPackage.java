/**
 */
package factory.processes;

import factory.FactoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see factory.processes.ProcessesFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessesPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "processes";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://www.example.org/factory/processes";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "factory.processes";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ProcessesPackage eINSTANCE = factory.processes.impl.ProcessesPackageImpl.init();

    /**
	 * The meta object id for the '{@link factory.processes.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.processes.impl.ProductImpl
	 * @see factory.processes.impl.ProcessesPackageImpl#getProduct()
	 * @generated
	 */
    int PRODUCT = 0;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRODUCT__ID = FactoryPackage.IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRODUCT__NAME = FactoryPackage.IDENTIFIED_ELEMENT__NAME;

    /**
	 * The feature id for the '<em><b>Owned Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRODUCT__OWNED_PROCESS = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRODUCT_FEATURE_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRODUCT_OPERATION_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.processes.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.processes.impl.ProcessImpl
	 * @see factory.processes.impl.ProcessesPackageImpl#getProcess()
	 * @generated
	 */
    int PROCESS = 1;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESS__ID = FactoryPackage.IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESS__NAME = FactoryPackage.IDENTIFIED_ELEMENT__NAME;

    /**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESS__OWNED_TASKS = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESS_FEATURE_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESS_OPERATION_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.processes.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.processes.impl.TaskImpl
	 * @see factory.processes.impl.ProcessesPackageImpl#getTask()
	 * @generated
	 */
    int TASK = 2;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__ID = FactoryPackage.IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__NAME = FactoryPackage.IDENTIFIED_ELEMENT__NAME;

    /**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__MACHINES = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Human Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__HUMAN_OPERATORS = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__INPUT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK__OUTPUT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK_FEATURE_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

    /**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TASK_OPERATION_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.processes.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.processes.impl.MaterialImpl
	 * @see factory.processes.impl.ProcessesPackageImpl#getMaterial()
	 * @generated
	 */
    int MATERIAL = 3;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MATERIAL__ID = FactoryPackage.IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MATERIAL__NAME = FactoryPackage.IDENTIFIED_ELEMENT__NAME;

    /**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MATERIAL_FEATURE_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MATERIAL_OPERATION_COUNT = FactoryPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


    /**
	 * Returns the meta object for class '{@link factory.processes.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see factory.processes.Product
	 * @generated
	 */
    EClass getProduct();

    /**
	 * Returns the meta object for the containment reference '{@link factory.processes.Product#getOwnedProcess <em>Owned Process</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Process</em>'.
	 * @see factory.processes.Product#getOwnedProcess()
	 * @see #getProduct()
	 * @generated
	 */
    EReference getProduct_OwnedProcess();

    /**
	 * Returns the meta object for class '{@link factory.processes.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see factory.processes.Process
	 * @generated
	 */
    EClass getProcess();

    /**
	 * Returns the meta object for the containment reference list '{@link factory.processes.Process#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
	 * @see factory.processes.Process#getOwnedTasks()
	 * @see #getProcess()
	 * @generated
	 */
    EReference getProcess_OwnedTasks();

    /**
	 * Returns the meta object for class '{@link factory.processes.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see factory.processes.Task
	 * @generated
	 */
    EClass getTask();

    /**
	 * Returns the meta object for the reference list '{@link factory.processes.Task#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see factory.processes.Task#getMachines()
	 * @see #getTask()
	 * @generated
	 */
    EReference getTask_Machines();

    /**
	 * Returns the meta object for the reference list '{@link factory.processes.Task#getHumanOperators <em>Human Operators</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Human Operators</em>'.
	 * @see factory.processes.Task#getHumanOperators()
	 * @see #getTask()
	 * @generated
	 */
    EReference getTask_HumanOperators();

    /**
	 * Returns the meta object for the reference list '{@link factory.processes.Task#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see factory.processes.Task#getInput()
	 * @see #getTask()
	 * @generated
	 */
    EReference getTask_Input();

    /**
	 * Returns the meta object for the reference list '{@link factory.processes.Task#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see factory.processes.Task#getOutput()
	 * @see #getTask()
	 * @generated
	 */
    EReference getTask_Output();

    /**
	 * Returns the meta object for class '{@link factory.processes.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see factory.processes.Material
	 * @generated
	 */
    EClass getMaterial();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ProcessesFactory getProcessesFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link factory.processes.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.processes.impl.ProductImpl
		 * @see factory.processes.impl.ProcessesPackageImpl#getProduct()
		 * @generated
		 */
        EClass PRODUCT = eINSTANCE.getProduct();

        /**
		 * The meta object literal for the '<em><b>Owned Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PRODUCT__OWNED_PROCESS = eINSTANCE.getProduct_OwnedProcess();

        /**
		 * The meta object literal for the '{@link factory.processes.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.processes.impl.ProcessImpl
		 * @see factory.processes.impl.ProcessesPackageImpl#getProcess()
		 * @generated
		 */
        EClass PROCESS = eINSTANCE.getProcess();

        /**
		 * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PROCESS__OWNED_TASKS = eINSTANCE.getProcess_OwnedTasks();

        /**
		 * The meta object literal for the '{@link factory.processes.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.processes.impl.TaskImpl
		 * @see factory.processes.impl.ProcessesPackageImpl#getTask()
		 * @generated
		 */
        EClass TASK = eINSTANCE.getTask();

        /**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TASK__MACHINES = eINSTANCE.getTask_Machines();

        /**
		 * The meta object literal for the '<em><b>Human Operators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TASK__HUMAN_OPERATORS = eINSTANCE.getTask_HumanOperators();

        /**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TASK__INPUT = eINSTANCE.getTask_Input();

        /**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TASK__OUTPUT = eINSTANCE.getTask_Output();

        /**
		 * The meta object literal for the '{@link factory.processes.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.processes.impl.MaterialImpl
		 * @see factory.processes.impl.ProcessesPackageImpl#getMaterial()
		 * @generated
		 */
        EClass MATERIAL = eINSTANCE.getMaterial();

    }

} //ProcessesPackage
