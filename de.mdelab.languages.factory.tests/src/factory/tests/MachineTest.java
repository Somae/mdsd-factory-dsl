/**
 */
package factory.tests;

import factory.FactoryFactory;
import factory.Machine;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineTest extends IdentifiedElementTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(MachineTest.class);
	}

    /**
	 * Constructs a new Machine test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MachineTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Machine test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected Machine getFixture() {
		return (Machine)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createMachine());
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

} //MachineTest
