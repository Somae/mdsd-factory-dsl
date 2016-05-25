/**
 */
package factory.processes;

import factory.HumanOperator;
import factory.IdentifiedElement;
import factory.Machine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.Task#getMachines <em>Machines</em>}</li>
 *   <li>{@link factory.processes.Task#getHumanOperators <em>Human Operators</em>}</li>
 *   <li>{@link factory.processes.Task#getInput <em>Input</em>}</li>
 *   <li>{@link factory.processes.Task#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see factory.processes.ProcessesPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends IdentifiedElement {
    /**
	 * Returns the value of the '<em><b>Machines</b></em>' reference list.
	 * The list contents are of type {@link factory.Machine}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Machines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' reference list.
	 * @see factory.processes.ProcessesPackage#getTask_Machines()
	 * @model
	 * @generated
	 */
    EList<Machine> getMachines();

    /**
	 * Returns the value of the '<em><b>Human Operators</b></em>' reference list.
	 * The list contents are of type {@link factory.HumanOperator}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Human Operators</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Operators</em>' reference list.
	 * @see factory.processes.ProcessesPackage#getTask_HumanOperators()
	 * @model
	 * @generated
	 */
    EList<HumanOperator> getHumanOperators();

    /**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link factory.processes.Material}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see factory.processes.ProcessesPackage#getTask_Input()
	 * @model
	 * @generated
	 */
    EList<Material> getInput();

    /**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link factory.processes.Material}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see factory.processes.ProcessesPackage#getTask_Output()
	 * @model
	 * @generated
	 */
    EList<Material> getOutput();

} // Task
