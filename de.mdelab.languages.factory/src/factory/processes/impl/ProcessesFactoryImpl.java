/**
 */
package factory.processes.impl;

import factory.processes.Material;
import factory.processes.ProcessesFactory;
import factory.processes.ProcessesPackage;
import factory.processes.Product;
import factory.processes.Task;

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
public class ProcessesFactoryImpl extends EFactoryImpl implements ProcessesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProcessesFactory init() {
        try {
            ProcessesFactory theProcessesFactory = (ProcessesFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessesPackage.eNS_URI);
            if (theProcessesFactory != null) {
                return theProcessesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ProcessesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessesFactoryImpl() {
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
            case ProcessesPackage.PRODUCT: return createProduct();
            case ProcessesPackage.PROCESS: return createProcess();
            case ProcessesPackage.TASK: return createTask();
            case ProcessesPackage.MATERIAL: return createMaterial();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Product createProduct() {
        ProductImpl product = new ProductImpl();
        return product;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public factory.processes.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Material createMaterial() {
        MaterialImpl material = new MaterialImpl();
        return material;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessesPackage getProcessesPackage() {
        return (ProcessesPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ProcessesPackage getPackage() {
        return ProcessesPackage.eINSTANCE;
    }

} //ProcessesFactoryImpl
