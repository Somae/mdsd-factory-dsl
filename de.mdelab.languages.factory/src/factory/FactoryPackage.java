/**
 */
package factory;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see factory.FactoryFactory
 * @model kind="package"
 * @generated
 */
public interface FactoryPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "factory";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://www.example.org/factory";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "factory";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    FactoryPackage eINSTANCE = factory.impl.FactoryPackageImpl.init();

    /**
	 * The meta object id for the '{@link factory.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.impl.IdentifiedElementImpl
	 * @see factory.impl.FactoryPackageImpl#getIdentifiedElement()
	 * @generated
	 */
    int IDENTIFIED_ELEMENT = 0;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIED_ELEMENT__ID = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIED_ELEMENT__NAME = 1;

    /**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIED_ELEMENT_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.impl.FactoryImpl
	 * @see factory.impl.FactoryPackageImpl#getFactory()
	 * @generated
	 */
    int FACTORY = 1;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__ID = IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__NAME = IDENTIFIED_ELEMENT__NAME;

    /**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__ADDRESS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__WIDTH = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__LENGTH = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__HEIGHT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Owned Human Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__OWNED_HUMAN_OPERATORS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Owned Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__OWNED_MACHINES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Owned Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY__OWNED_PRODUCTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

    /**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.impl.MachineImpl
	 * @see factory.impl.FactoryPackageImpl#getMachine()
	 * @generated
	 */
    int MACHINE = 2;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE__ID = IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE__NAME = IDENTIFIED_ELEMENT__NAME;

    /**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE__X = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE__Y = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE__DIMENSION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MACHINE_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.impl.HumanOperatorImpl <em>Human Operator</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.impl.HumanOperatorImpl
	 * @see factory.impl.FactoryPackageImpl#getHumanOperator()
	 * @generated
	 */
    int HUMAN_OPERATOR = 3;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HUMAN_OPERATOR__ID = IDENTIFIED_ELEMENT__ID;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HUMAN_OPERATOR__NAME = IDENTIFIED_ELEMENT__NAME;

    /**
	 * The number of structural features of the '<em>Human Operator</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HUMAN_OPERATOR_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Human Operator</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HUMAN_OPERATOR_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link factory.impl.FactorySpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see factory.impl.FactorySpecificationImpl
	 * @see factory.impl.FactoryPackageImpl#getFactorySpecification()
	 * @generated
	 */
    int FACTORY_SPECIFICATION = 4;

    /**
	 * The feature id for the '<em><b>Owned Factories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY_SPECIFICATION__OWNED_FACTORIES = 0;

    /**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY_SPECIFICATION_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FACTORY_SPECIFICATION_OPERATION_COUNT = 0;


    /**
	 * Returns the meta object for class '{@link factory.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see factory.IdentifiedElement
	 * @generated
	 */
    EClass getIdentifiedElement();

    /**
	 * Returns the meta object for the attribute '{@link factory.IdentifiedElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see factory.IdentifiedElement#getID()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
    EAttribute getIdentifiedElement_ID();

    /**
	 * Returns the meta object for the attribute '{@link factory.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factory.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
    EAttribute getIdentifiedElement_Name();

    /**
	 * Returns the meta object for class '{@link factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see factory.Factory
	 * @generated
	 */
    EClass getFactory();

    /**
	 * Returns the meta object for the attribute '{@link factory.Factory#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see factory.Factory#getAddress()
	 * @see #getFactory()
	 * @generated
	 */
    EAttribute getFactory_Address();

    /**
	 * Returns the meta object for the attribute '{@link factory.Factory#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see factory.Factory#getWidth()
	 * @see #getFactory()
	 * @generated
	 */
    EAttribute getFactory_Width();

    /**
	 * Returns the meta object for the attribute '{@link factory.Factory#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see factory.Factory#getLength()
	 * @see #getFactory()
	 * @generated
	 */
    EAttribute getFactory_Length();

    /**
	 * Returns the meta object for the attribute '{@link factory.Factory#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see factory.Factory#getHeight()
	 * @see #getFactory()
	 * @generated
	 */
    EAttribute getFactory_Height();

    /**
	 * Returns the meta object for the containment reference list '{@link factory.Factory#getOwnedHumanOperators <em>Owned Human Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Human Operators</em>'.
	 * @see factory.Factory#getOwnedHumanOperators()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_OwnedHumanOperators();

				/**
	 * Returns the meta object for the containment reference list '{@link factory.Factory#getOwnedMachines <em>Owned Machines</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Machines</em>'.
	 * @see factory.Factory#getOwnedMachines()
	 * @see #getFactory()
	 * @generated
	 */
    EReference getFactory_OwnedMachines();

    /**
	 * Returns the meta object for the containment reference list '{@link factory.Factory#getOwnedProducts <em>Owned Products</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Products</em>'.
	 * @see factory.Factory#getOwnedProducts()
	 * @see #getFactory()
	 * @generated
	 */
    EReference getFactory_OwnedProducts();

    /**
	 * Returns the meta object for class '{@link factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see factory.Machine
	 * @generated
	 */
    EClass getMachine();

    /**
	 * Returns the meta object for the attribute '{@link factory.Machine#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see factory.Machine#getX()
	 * @see #getMachine()
	 * @generated
	 */
    EAttribute getMachine_X();

    /**
	 * Returns the meta object for the attribute '{@link factory.Machine#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see factory.Machine#getY()
	 * @see #getMachine()
	 * @generated
	 */
    EAttribute getMachine_Y();

    /**
	 * Returns the meta object for the attribute '{@link factory.Machine#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see factory.Machine#getDimension()
	 * @see #getMachine()
	 * @generated
	 */
    EAttribute getMachine_Dimension();

    /**
	 * Returns the meta object for class '{@link factory.HumanOperator <em>Human Operator</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Operator</em>'.
	 * @see factory.HumanOperator
	 * @generated
	 */
    EClass getHumanOperator();

    /**
	 * Returns the meta object for class '{@link factory.FactorySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see factory.FactorySpecification
	 * @generated
	 */
    EClass getFactorySpecification();

    /**
	 * Returns the meta object for the containment reference list '{@link factory.FactorySpecification#getOwnedFactories <em>Owned Factories</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Factories</em>'.
	 * @see factory.FactorySpecification#getOwnedFactories()
	 * @see #getFactorySpecification()
	 * @generated
	 */
    EReference getFactorySpecification_OwnedFactories();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    FactoryFactory getFactoryFactory();

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
		 * The meta object literal for the '{@link factory.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.impl.IdentifiedElementImpl
		 * @see factory.impl.FactoryPackageImpl#getIdentifiedElement()
		 * @generated
		 */
        EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

        /**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_ID();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IDENTIFIED_ELEMENT__NAME = eINSTANCE.getIdentifiedElement_Name();

        /**
		 * The meta object literal for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.impl.FactoryImpl
		 * @see factory.impl.FactoryPackageImpl#getFactory()
		 * @generated
		 */
        EClass FACTORY = eINSTANCE.getFactory();

        /**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FACTORY__ADDRESS = eINSTANCE.getFactory_Address();

        /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FACTORY__WIDTH = eINSTANCE.getFactory_Width();

        /**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FACTORY__LENGTH = eINSTANCE.getFactory_Length();

        /**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FACTORY__HEIGHT = eINSTANCE.getFactory_Height();

        /**
		 * The meta object literal for the '<em><b>Owned Human Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__OWNED_HUMAN_OPERATORS = eINSTANCE.getFactory_OwnedHumanOperators();

								/**
		 * The meta object literal for the '<em><b>Owned Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FACTORY__OWNED_MACHINES = eINSTANCE.getFactory_OwnedMachines();

        /**
		 * The meta object literal for the '<em><b>Owned Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FACTORY__OWNED_PRODUCTS = eINSTANCE.getFactory_OwnedProducts();

        /**
		 * The meta object literal for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.impl.MachineImpl
		 * @see factory.impl.FactoryPackageImpl#getMachine()
		 * @generated
		 */
        EClass MACHINE = eINSTANCE.getMachine();

        /**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MACHINE__X = eINSTANCE.getMachine_X();

        /**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MACHINE__Y = eINSTANCE.getMachine_Y();

        /**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MACHINE__DIMENSION = eINSTANCE.getMachine_Dimension();

        /**
		 * The meta object literal for the '{@link factory.impl.HumanOperatorImpl <em>Human Operator</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.impl.HumanOperatorImpl
		 * @see factory.impl.FactoryPackageImpl#getHumanOperator()
		 * @generated
		 */
        EClass HUMAN_OPERATOR = eINSTANCE.getHumanOperator();

        /**
		 * The meta object literal for the '{@link factory.impl.FactorySpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see factory.impl.FactorySpecificationImpl
		 * @see factory.impl.FactoryPackageImpl#getFactorySpecification()
		 * @generated
		 */
        EClass FACTORY_SPECIFICATION = eINSTANCE.getFactorySpecification();

        /**
		 * The meta object literal for the '<em><b>Owned Factories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FACTORY_SPECIFICATION__OWNED_FACTORIES = eINSTANCE.getFactorySpecification_OwnedFactories();

    }

} //FactoryPackage
