/**
 */
package uAFMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.ResourceRole#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uAFMetaModel.UAFMetaModelPackage#getResourceRole()
 * @model
 * @generated
 */
public interface ResourceRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ResourcePerformer)
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourceRole_Type()
	 * @model
	 * @generated
	 */
	ResourcePerformer getType();

	/**
	 * Sets the value of the '{@link uAFMetaModel.ResourceRole#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourcePerformer value);

} // ResourceRole
