/**
 */
package factory.impl;

import factory.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryFactoryImpl extends EFactoryImpl implements FactoryFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FactoryFactory init() {
        try {
            FactoryFactory theFactoryFactory = (FactoryFactory)EPackage.Registry.INSTANCE.getEFactory(FactoryPackage.eNS_URI);
            if (theFactoryFactory != null) {
                return theFactoryFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FactoryFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FactoryFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case FactoryPackage.FACTORY: return createFactory();
            case FactoryPackage.MACHINE: return createMachine();
            case FactoryPackage.HUMAN_OPERATOR: return createHumanOperator();
            case FactoryPackage.FACTORY_SPECIFICATION: return createFactorySpecification();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Factory createFactory() {
        FactoryImpl factory = new FactoryImpl();
        return factory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Machine createMachine() {
        MachineImpl machine = new MachineImpl();
        return machine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanOperator createHumanOperator() {
        HumanOperatorImpl humanOperator = new HumanOperatorImpl();
        return humanOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FactorySpecification createFactorySpecification() {
        FactorySpecificationImpl factorySpecification = new FactorySpecificationImpl();
        return factorySpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FactoryPackage getFactoryPackage() {
        return (FactoryPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FactoryPackage getPackage() {
        return FactoryPackage.eINSTANCE;
    }

} //FactoryFactoryImpl
