/**
 */
package uAFMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uAFMetaModel.UAFMetaModelPackage
 * @generated
 */
public interface UAFMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UAFMetaModelFactory eINSTANCE = uAFMetaModel.impl.UAFMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Performer</em>'.
	 * @generated
	 */
	ResourcePerformer createResourcePerformer();

	/**
	 * Returns a new object of class '<em>Resource Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Architecture</em>'.
	 * @generated
	 */
	ResourceArchitecture createResourceArchitecture();

	/**
	 * Returns a new object of class '<em>Physical Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Resource</em>'.
	 * @generated
	 */
	PhysicalResource createPhysicalResource();

	/**
	 * Returns a new object of class '<em>Organizational Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizational Resource</em>'.
	 * @generated
	 */
	OrganizationalResource createOrganizationalResource();

	/**
	 * Returns a new object of class '<em>Natural Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Resource</em>'.
	 * @generated
	 */
	NaturalResource createNaturalResource();

	/**
	 * Returns a new object of class '<em>Resource Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Artifact</em>'.
	 * @generated
	 */
	ResourceArtifact createResourceArtifact();

	/**
	 * Returns a new object of class '<em>Resource Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Exchange</em>'.
	 * @generated
	 */
	ResourceExchange createResourceExchange();

	/**
	 * Returns a new object of class '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Role</em>'.
	 * @generated
	 */
	ResourceRole createResourceRole();

	/**
	 * Returns a new object of class '<em>Operation Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Agent</em>'.
	 * @generated
	 */
	OperationAgent createOperationAgent();

	/**
	 * Returns a new object of class '<em>Resource Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Asset</em>'.
	 * @generated
	 */
	ResourceAsset createResourceAsset();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UAFMetaModelPackage getUAFMetaModelPackage();

} //UAFMetaModelFactory
