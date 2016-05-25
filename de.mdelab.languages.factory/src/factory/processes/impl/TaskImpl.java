/**
 */
package factory.processes.impl;

import factory.HumanOperator;
import factory.Machine;

import factory.impl.IdentifiedElementImpl;

import factory.processes.Material;
import factory.processes.ProcessesPackage;
import factory.processes.Task;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factory.processes.impl.TaskImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link factory.processes.impl.TaskImpl#getHumanOperators <em>Human Operators</em>}</li>
 *   <li>{@link factory.processes.impl.TaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link factory.processes.impl.TaskImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends IdentifiedElementImpl implements Task {
    /**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
    protected EList<Machine> machines;

    /**
	 * The cached value of the '{@link #getHumanOperators() <em>Human Operators</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHumanOperators()
	 * @generated
	 * @ordered
	 */
    protected EList<HumanOperator> humanOperators;

    /**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
    protected EList<Material> input;

    /**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
    protected EList<Material> output;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected TaskImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ProcessesPackage.Literals.TASK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Machine> getMachines() {
		if (machines == null) {
			machines = new EObjectResolvingEList<Machine>(Machine.class, this, ProcessesPackage.TASK__MACHINES);
		}
		return machines;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HumanOperator> getHumanOperators() {
		if (humanOperators == null) {
			humanOperators = new EObjectResolvingEList<HumanOperator>(HumanOperator.class, this, ProcessesPackage.TASK__HUMAN_OPERATORS);
		}
		return humanOperators;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Material> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Material>(Material.class, this, ProcessesPackage.TASK__INPUT);
		}
		return input;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Material> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Material>(Material.class, this, ProcessesPackage.TASK__OUTPUT);
		}
		return output;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessesPackage.TASK__MACHINES:
				return getMachines();
			case ProcessesPackage.TASK__HUMAN_OPERATORS:
				return getHumanOperators();
			case ProcessesPackage.TASK__INPUT:
				return getInput();
			case ProcessesPackage.TASK__OUTPUT:
				return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessesPackage.TASK__MACHINES:
				getMachines().clear();
				getMachines().addAll((Collection<? extends Machine>)newValue);
				return;
			case ProcessesPackage.TASK__HUMAN_OPERATORS:
				getHumanOperators().clear();
				getHumanOperators().addAll((Collection<? extends HumanOperator>)newValue);
				return;
			case ProcessesPackage.TASK__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Material>)newValue);
				return;
			case ProcessesPackage.TASK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Material>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessesPackage.TASK__MACHINES:
				getMachines().clear();
				return;
			case ProcessesPackage.TASK__HUMAN_OPERATORS:
				getHumanOperators().clear();
				return;
			case ProcessesPackage.TASK__INPUT:
				getInput().clear();
				return;
			case ProcessesPackage.TASK__OUTPUT:
				getOutput().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessesPackage.TASK__MACHINES:
				return machines != null && !machines.isEmpty();
			case ProcessesPackage.TASK__HUMAN_OPERATORS:
				return humanOperators != null && !humanOperators.isEmpty();
			case ProcessesPackage.TASK__INPUT:
				return input != null && !input.isEmpty();
			case ProcessesPackage.TASK__OUTPUT:
				return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
