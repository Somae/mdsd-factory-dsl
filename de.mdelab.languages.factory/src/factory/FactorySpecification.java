/**
 */
package factory;

import factory.processes.Material;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factory.FactorySpecification#getOwnedFactories <em>Owned Factories</em>}</li>
 *   <li>{@link factory.FactorySpecification#getOwnedMaterials <em>Owned Materials</em>}</li>
 * </ul>
 *
 * @see factory.FactoryPackage#getFactorySpecification()
 * @model
 * @generated
 */
public interface FactorySpecification extends EObject {
    /**
	 * Returns the value of the '<em><b>Owned Factories</b></em>' containment reference list.
	 * The list contents are of type {@link factory.Factory}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Factories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Factories</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedFactories()
	 * @model containment="true"
	 * @generated
	 */
    EList<Factory> getOwnedFactories();

				/**
	 * Returns the value of the '<em><b>Owned Materials</b></em>' containment reference list.
	 * The list contents are of type {@link factory.processes.Material}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Materials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Materials</em>' containment reference list.
	 * @see factory.FactoryPackage#getFactorySpecification_OwnedMaterials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Material> getOwnedMaterials();

} // FactorySpecification
