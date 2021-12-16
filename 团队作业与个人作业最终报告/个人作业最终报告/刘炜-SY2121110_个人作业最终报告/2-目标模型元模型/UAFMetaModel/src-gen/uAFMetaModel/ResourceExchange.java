/**
 */
package uAFMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.ResourceExchange#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see uAFMetaModel.UAFMetaModelPackage#getResourceExchange()
 * @model
 * @generated
 */
public interface ResourceExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ResourcePerformer)
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourceExchange_From()
	 * @model
	 * @generated
	 */
	ResourcePerformer getFrom();

	/**
	 * Sets the value of the '{@link uAFMetaModel.ResourceExchange#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ResourcePerformer value);

} // ResourceExchange
