/**
 */
package uAFMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.ResourceAsset#getRelatas <em>Relatas</em>}</li>
 * </ul>
 *
 * @see uAFMetaModel.UAFMetaModelPackage#getResourceAsset()
 * @model
 * @generated
 */
public interface ResourceAsset extends EObject {

	/**
	 * Returns the value of the '<em><b>Relatas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatas</em>' reference.
	 * @see #setRelatas(ResourceExchange)
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourceAsset_Relatas()
	 * @model
	 * @generated
	 */
	ResourceExchange getRelatas();

	/**
	 * Sets the value of the '{@link uAFMetaModel.ResourceAsset#getRelatas <em>Relatas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatas</em>' reference.
	 * @see #getRelatas()
	 * @generated
	 */
	void setRelatas(ResourceExchange value);
} // ResourceAsset
