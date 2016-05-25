/**
 */
package factory.tests;

import factory.FactoryFactory;
import factory.HumanOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Human Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HumanOperatorTest extends IdentifiedElementTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(HumanOperatorTest.class);
	}

    /**
	 * Constructs a new Human Operator test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HumanOperatorTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Human Operator test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected HumanOperator getFixture() {
		return (HumanOperator)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createHumanOperator());
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

} //HumanOperatorTest
