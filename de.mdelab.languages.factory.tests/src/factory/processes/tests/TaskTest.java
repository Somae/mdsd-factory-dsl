/**
 */
package factory.processes.tests;

import factory.processes.ProcessesFactory;
import factory.processes.Task;

import factory.tests.IdentifiedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskTest extends IdentifiedElementTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TaskTest.class);
    }

    /**
     * Constructs a new Task test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TaskTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Task test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Task getFixture() {
        return (Task)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProcessesFactory.eINSTANCE.createTask());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //TaskTest
