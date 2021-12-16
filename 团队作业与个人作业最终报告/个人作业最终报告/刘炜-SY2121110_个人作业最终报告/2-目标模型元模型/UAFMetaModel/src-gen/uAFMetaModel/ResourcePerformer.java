/**
 */
package uAFMetaModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.ResourcePerformer#getRealizingResource <em>Realizing Resource</em>}</li>
 *   <li>{@link uAFMetaModel.ResourcePerformer#getResourceexchange <em>Resourceexchange</em>}</li>
 *   <li>{@link uAFMetaModel.ResourcePerformer#getResourceasset <em>Resourceasset</em>}</li>
 * </ul>
 *
 * @see uAFMetaModel.UAFMetaModelPackage#getResourcePerformer()
 * @model
 * @generated
 */
public interface ResourcePerformer extends EObject {
	/**
	 * Returns the value of the '<em><b>Realizing Resource</b></em>' reference list.
	 * The list contents are of type {@link uAFMetaModel.Implements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Resource</em>' reference list.
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourcePerformer_RealizingResource()
	 * @model required="true"
	 * @generated
	 */
	EList<Implements> getRealizingResource();

	/**
	 * Returns the value of the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * The list contents are of type {@link uAFMetaModel.ResourceExchange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceexchange</em>' containment reference list.
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourcePerformer_Resourceexchange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceExchange> getResourceexchange();

	/**
	 * Returns the value of the '<em><b>Resourceasset</b></em>' containment reference list.
	 * The list contents are of type {@link uAFMetaModel.ResourceAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceasset</em>' containment reference list.
	 * @see uAFMetaModel.UAFMetaModelPackage#getResourcePerformer_Resourceasset()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAsset> getResourceasset();

} // ResourcePerformer
