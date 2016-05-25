/**
 */
package factory.processes;

import factory.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.Process#getOwnedTasks <em>Owned Tasks</em>}</li>
 * </ul>
 *
 * @see factory.processes.ProcessesPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends IdentifiedElement {
    /**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link factory.processes.Task}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Tasks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' containment reference list.
	 * @see factory.processes.ProcessesPackage#getProcess_OwnedTasks()
	 * @model containment="true"
	 * @generated
	 */
    EList<Task> getOwnedTasks();

} // Process
