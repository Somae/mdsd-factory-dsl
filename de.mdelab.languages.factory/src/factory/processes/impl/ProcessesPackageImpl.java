/**
 */
package factory.processes.impl;

import factory.FactoryPackage;

import factory.impl.FactoryPackageImpl;

import factory.processes.Material;
import factory.processes.ProcessesFactory;
import factory.processes.ProcessesPackage;
import factory.processes.Product;
import factory.processes.Task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessesPackageImpl extends EPackageImpl implements ProcessesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass productEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass materialEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see factory.processes.ProcessesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ProcessesPackageImpl() {
        super(eNS_URI, ProcessesFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ProcessesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ProcessesPackage init() {
        if (isInited) return (ProcessesPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI);

        // Obtain or create and register package
        ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessesPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        FactoryPackageImpl theFactoryPackage = (FactoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryPackage.eNS_URI) instanceof FactoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryPackage.eNS_URI) : FactoryPackage.eINSTANCE);

        // Create package meta-data objects
        theProcessesPackage.createPackageContents();
        theFactoryPackage.createPackageContents();

        // Initialize created meta-data
        theProcessesPackage.initializePackageContents();
        theFactoryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theProcessesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ProcessesPackage.eNS_URI, theProcessesPackage);
        return theProcessesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProduct() {
        return productEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProduct_OwnedProcess() {
        return (EReference)productEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_OwnedTasks() {
        return (EReference)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTask() {
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_Machines() {
        return (EReference)taskEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_HumanOperators() {
        return (EReference)taskEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_Input() {
        return (EReference)taskEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_Output() {
        return (EReference)taskEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaterial() {
        return materialEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessesFactory getProcessesFactory() {
        return (ProcessesFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        productEClass = createEClass(PRODUCT);
        createEReference(productEClass, PRODUCT__OWNED_PROCESS);

        processEClass = createEClass(PROCESS);
        createEReference(processEClass, PROCESS__OWNED_TASKS);

        taskEClass = createEClass(TASK);
        createEReference(taskEClass, TASK__MACHINES);
        createEReference(taskEClass, TASK__HUMAN_OPERATORS);
        createEReference(taskEClass, TASK__INPUT);
        createEReference(taskEClass, TASK__OUTPUT);

        materialEClass = createEClass(MATERIAL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        FactoryPackage theFactoryPackage = (FactoryPackage)EPackage.Registry.INSTANCE.getEPackage(FactoryPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        productEClass.getESuperTypes().add(theFactoryPackage.getIdentifiedElement());
        processEClass.getESuperTypes().add(theFactoryPackage.getIdentifiedElement());
        taskEClass.getESuperTypes().add(theFactoryPackage.getIdentifiedElement());
        materialEClass.getESuperTypes().add(theFactoryPackage.getIdentifiedElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProduct_OwnedProcess(), this.getProcess(), null, "ownedProcess", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, factory.processes.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcess_OwnedTasks(), this.getTask(), null, "ownedTasks", null, 0, -1, factory.processes.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTask_Machines(), theFactoryPackage.getMachine(), null, "machines", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_HumanOperators(), theFactoryPackage.getHumanOperator(), null, "humanOperators", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_Input(), this.getMaterial(), null, "input", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_Output(), this.getMaterial(), null, "output", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //ProcessesPackageImpl
