/**
 */
package factory.processes.tests;

import factory.processes.Material;
import factory.processes.ProcessesFactory;

import factory.tests.IdentifiedElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaterialTest extends IdentifiedElementTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MaterialTest.class);
    }

    /**
     * Constructs a new Material test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaterialTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Material test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Material getFixture() {
        return (Material)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProcessesFactory.eINSTANCE.createMaterial());
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

} //MaterialTest
