/**
 */
package factory.tests;

import factory.Factory;
import factory.FactoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryTest extends IdentifiedElementTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(FactoryTest.class);
	}

    /**
	 * Constructs a new Factory test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FactoryTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Factory test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected Factory getFixture() {
		return (Factory)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createFactory());
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

} //FactoryTest
