/**
 */
package factory.tests;

import factory.FactoryFactory;
import factory.FactorySpecification;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactorySpecificationTest extends TestCase {

    /**
	 * The fixture for this Specification test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected FactorySpecification fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(FactorySpecificationTest.class);
	}

    /**
	 * Constructs a new Specification test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FactorySpecificationTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Specification test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(FactorySpecification fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Specification test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected FactorySpecification getFixture() {
		return fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createFactorySpecification());
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

} //FactorySpecificationTest
