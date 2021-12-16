/**
 */
package uAFMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.OperationAgent#getRealizedOperationalPerformer <em>Realized Operational Performer</em>}</li>
 * </ul>
 *
 * @see uAFMetaModel.UAFMetaModelPackage#getOperationAgent()
 * @model
 * @generated
 */
public interface OperationAgent extends EObject {
	/**
	 * Returns the value of the '<em><b>Realized Operational Performer</b></em>' reference list.
	 * The list contents are of type {@link uAFMetaModel.Implements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Performer</em>' reference list.
	 * @see uAFMetaModel.UAFMetaModelPackage#getOperationAgent_RealizedOperationalPerformer()
	 * @model required="true"
	 * @generated
	 */
	EList<Implements> getRealizedOperationalPerformer();

} // OperationAgent
