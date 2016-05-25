/**
 */
package factory.impl;

import factory.Factory;
import factory.FactoryFactory;
import factory.FactoryPackage;
import factory.FactorySpecification;
import factory.HumanOperator;
import factory.IdentifiedElement;
import factory.Machine;

import factory.processes.ProcessesPackage;

import factory.processes.impl.ProcessesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class FactoryPackageImpl extends EPackageImpl implements FactoryPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass identifiedElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass factoryEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass machineEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass humanOperatorEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass factorySpecificationEClass = null;

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
	 * @see factory.FactoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private FactoryPackageImpl() {
		super(eNS_URI, FactoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FactoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static FactoryPackage init() {
		if (isInited) return (FactoryPackage)EPackage.Registry.INSTANCE.getEPackage(FactoryPackage.eNS_URI);

		// Obtain or create and register package
		FactoryPackageImpl theFactoryPackage = (FactoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FactoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FactoryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ProcessesPackageImpl theProcessesPackage = (ProcessesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) instanceof ProcessesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI) : ProcessesPackage.eINSTANCE);

		// Create package meta-data objects
		theFactoryPackage.createPackageContents();
		theProcessesPackage.createPackageContents();

		// Initialize created meta-data
		theFactoryPackage.initializePackageContents();
		theProcessesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFactoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FactoryPackage.eNS_URI, theFactoryPackage);
		return theFactoryPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIdentifiedElement_ID() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFactory() {
		return factoryEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFactory_Address() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFactory_Width() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFactory_Length() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFactory_Height() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFactory_OwnedHumanOperator() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFactory_OwnedMachines() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFactory_OwnedProducts() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMachine() {
		return machineEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMachine_X() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMachine_Y() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMachine_Dimension() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getHumanOperator() {
		return humanOperatorEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFactorySpecification() {
		return factorySpecificationEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFactorySpecification_OwnedFactories() {
		return (EReference)factorySpecificationEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FactoryFactory getFactoryFactory() {
		return (FactoryFactory)getEFactoryInstance();
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
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);

		factoryEClass = createEClass(FACTORY);
		createEAttribute(factoryEClass, FACTORY__ADDRESS);
		createEAttribute(factoryEClass, FACTORY__WIDTH);
		createEAttribute(factoryEClass, FACTORY__LENGTH);
		createEAttribute(factoryEClass, FACTORY__HEIGHT);
		createEReference(factoryEClass, FACTORY__OWNED_HUMAN_OPERATOR);
		createEReference(factoryEClass, FACTORY__OWNED_MACHINES);
		createEReference(factoryEClass, FACTORY__OWNED_PRODUCTS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__X);
		createEAttribute(machineEClass, MACHINE__Y);
		createEAttribute(machineEClass, MACHINE__DIMENSION);

		humanOperatorEClass = createEClass(HUMAN_OPERATOR);

		factorySpecificationEClass = createEClass(FACTORY_SPECIFICATION);
		createEReference(factorySpecificationEClass, FACTORY_SPECIFICATION__OWNED_FACTORIES);
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
		ProcessesPackage theProcessesPackage = (ProcessesPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theProcessesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		factoryEClass.getESuperTypes().add(this.getIdentifiedElement());
		machineEClass.getESuperTypes().add(this.getIdentifiedElement());
		humanOperatorEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_ID(), ecorePackage.getEString(), "ID", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactory_Address(), ecorePackage.getEString(), "address", null, 1, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_Length(), ecorePackage.getEInt(), "length", null, 1, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_OwnedHumanOperator(), this.getHumanOperator(), null, "ownedHumanOperator", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_OwnedMachines(), this.getMachine(), null, "ownedMachines", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_OwnedProducts(), theProcessesPackage.getProduct(), null, "ownedProducts", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_X(), ecorePackage.getEInt(), "x", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Dimension(), ecorePackage.getEInt(), "dimension", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanOperatorEClass, HumanOperator.class, "HumanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factorySpecificationEClass, FactorySpecification.class, "FactorySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactorySpecification_OwnedFactories(), this.getFactory(), null, "ownedFactories", null, 0, -1, FactorySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FactoryPackageImpl
