/**
 */
package uAFMetaModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uAFMetaModel.UAFMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface UAFMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uAFMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uAFMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uAFMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UAFMetaModelPackage eINSTANCE = uAFMetaModel.impl.UAFMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourceAssetImpl <em>Resource Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourceAssetImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceAsset()
	 * @generated
	 */
	int RESOURCE_ASSET = 10;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourcePerformerImpl <em>Resource Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourcePerformerImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourcePerformer()
	 * @generated
	 */
	int RESOURCE_PERFORMER = 0;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PERFORMER__REALIZING_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PERFORMER__RESOURCEEXCHANGE = 1;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PERFORMER__RESOURCEASSET = 2;

	/**
	 * The number of structural features of the '<em>Resource Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PERFORMER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PERFORMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourceArchitectureImpl <em>Resource Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourceArchitectureImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceArchitecture()
	 * @generated
	 */
	int RESOURCE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__REALIZING_RESOURCE = RESOURCE_PERFORMER__REALIZING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__RESOURCEEXCHANGE = RESOURCE_PERFORMER__RESOURCEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE__RESOURCEASSET = RESOURCE_PERFORMER__RESOURCEASSET;

	/**
	 * The number of structural features of the '<em>Resource Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE_FEATURE_COUNT = RESOURCE_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARCHITECTURE_OPERATION_COUNT = RESOURCE_PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.PhysicalResourceImpl <em>Physical Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.PhysicalResourceImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getPhysicalResource()
	 * @generated
	 */
	int PHYSICAL_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__REALIZING_RESOURCE = RESOURCE_PERFORMER__REALIZING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__RESOURCEEXCHANGE = RESOURCE_PERFORMER__RESOURCEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE__RESOURCEASSET = RESOURCE_PERFORMER__RESOURCEASSET;

	/**
	 * The number of structural features of the '<em>Physical Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE_FEATURE_COUNT = RESOURCE_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RESOURCE_OPERATION_COUNT = RESOURCE_PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.OrganizationalResourceImpl <em>Organizational Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.OrganizationalResourceImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getOrganizationalResource()
	 * @generated
	 */
	int ORGANIZATIONAL_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_RESOURCE__REALIZING_RESOURCE = PHYSICAL_RESOURCE__REALIZING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_RESOURCE__RESOURCEEXCHANGE = PHYSICAL_RESOURCE__RESOURCEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_RESOURCE__RESOURCEASSET = PHYSICAL_RESOURCE__RESOURCEASSET;

	/**
	 * The number of structural features of the '<em>Organizational Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_RESOURCE_FEATURE_COUNT = PHYSICAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organizational Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_RESOURCE_OPERATION_COUNT = PHYSICAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.NaturalResourceImpl <em>Natural Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.NaturalResourceImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getNaturalResource()
	 * @generated
	 */
	int NATURAL_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_RESOURCE__REALIZING_RESOURCE = PHYSICAL_RESOURCE__REALIZING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_RESOURCE__RESOURCEEXCHANGE = PHYSICAL_RESOURCE__RESOURCEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_RESOURCE__RESOURCEASSET = PHYSICAL_RESOURCE__RESOURCEASSET;

	/**
	 * The number of structural features of the '<em>Natural Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_RESOURCE_FEATURE_COUNT = PHYSICAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Natural Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_RESOURCE_OPERATION_COUNT = PHYSICAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourceArtifactImpl <em>Resource Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourceArtifactImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceArtifact()
	 * @generated
	 */
	int RESOURCE_ARTIFACT = 5;

	/**
	 * The feature id for the '<em><b>Realizing Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTIFACT__REALIZING_RESOURCE = PHYSICAL_RESOURCE__REALIZING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resourceexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTIFACT__RESOURCEEXCHANGE = PHYSICAL_RESOURCE__RESOURCEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Resourceasset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTIFACT__RESOURCEASSET = PHYSICAL_RESOURCE__RESOURCEASSET;

	/**
	 * The number of structural features of the '<em>Resource Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTIFACT_FEATURE_COUNT = PHYSICAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ARTIFACT_OPERATION_COUNT = PHYSICAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourceExchangeImpl <em>Resource Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourceExchangeImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceExchange()
	 * @generated
	 */
	int RESOURCE_EXCHANGE = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXCHANGE__FROM = 0;

	/**
	 * The number of structural features of the '<em>Resource Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXCHANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ResourceRoleImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.ImplementsImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 8;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uAFMetaModel.impl.OperationAgentImpl <em>Operation Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uAFMetaModel.impl.OperationAgentImpl
	 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getOperationAgent()
	 * @generated
	 */
	int OPERATION_AGENT = 9;

	/**
	 * The feature id for the '<em><b>Realized Operational Performer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER = 0;

	/**
	 * The number of structural features of the '<em>Operation Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_AGENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_AGENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Relatas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSET__RELATAS = 0;

	/**
	 * The number of structural features of the '<em>Resource Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSET_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourcePerformer <em>Resource Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Performer</em>'.
	 * @see uAFMetaModel.ResourcePerformer
	 * @generated
	 */
	EClass getResourcePerformer();

	/**
	 * Returns the meta object for the reference list '{@link uAFMetaModel.ResourcePerformer#getRealizingResource <em>Realizing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizing Resource</em>'.
	 * @see uAFMetaModel.ResourcePerformer#getRealizingResource()
	 * @see #getResourcePerformer()
	 * @generated
	 */
	EReference getResourcePerformer_RealizingResource();

	/**
	 * Returns the meta object for the containment reference list '{@link uAFMetaModel.ResourcePerformer#getResourceexchange <em>Resourceexchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceexchange</em>'.
	 * @see uAFMetaModel.ResourcePerformer#getResourceexchange()
	 * @see #getResourcePerformer()
	 * @generated
	 */
	EReference getResourcePerformer_Resourceexchange();

	/**
	 * Returns the meta object for the containment reference list '{@link uAFMetaModel.ResourcePerformer#getResourceasset <em>Resourceasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceasset</em>'.
	 * @see uAFMetaModel.ResourcePerformer#getResourceasset()
	 * @see #getResourcePerformer()
	 * @generated
	 */
	EReference getResourcePerformer_Resourceasset();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourceArchitecture <em>Resource Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Architecture</em>'.
	 * @see uAFMetaModel.ResourceArchitecture
	 * @generated
	 */
	EClass getResourceArchitecture();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.PhysicalResource <em>Physical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Resource</em>'.
	 * @see uAFMetaModel.PhysicalResource
	 * @generated
	 */
	EClass getPhysicalResource();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.OrganizationalResource <em>Organizational Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizational Resource</em>'.
	 * @see uAFMetaModel.OrganizationalResource
	 * @generated
	 */
	EClass getOrganizationalResource();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.NaturalResource <em>Natural Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Resource</em>'.
	 * @see uAFMetaModel.NaturalResource
	 * @generated
	 */
	EClass getNaturalResource();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourceArtifact <em>Resource Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Artifact</em>'.
	 * @see uAFMetaModel.ResourceArtifact
	 * @generated
	 */
	EClass getResourceArtifact();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourceExchange <em>Resource Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Exchange</em>'.
	 * @see uAFMetaModel.ResourceExchange
	 * @generated
	 */
	EClass getResourceExchange();

	/**
	 * Returns the meta object for the reference '{@link uAFMetaModel.ResourceExchange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see uAFMetaModel.ResourceExchange#getFrom()
	 * @see #getResourceExchange()
	 * @generated
	 */
	EReference getResourceExchange_From();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see uAFMetaModel.ResourceRole
	 * @generated
	 */
	EClass getResourceRole();

	/**
	 * Returns the meta object for the reference '{@link uAFMetaModel.ResourceRole#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uAFMetaModel.ResourceRole#getType()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_Type();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements</em>'.
	 * @see uAFMetaModel.Implements
	 * @generated
	 */
	EClass getImplements();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.OperationAgent <em>Operation Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Agent</em>'.
	 * @see uAFMetaModel.OperationAgent
	 * @generated
	 */
	EClass getOperationAgent();

	/**
	 * Returns the meta object for the reference list '{@link uAFMetaModel.OperationAgent#getRealizedOperationalPerformer <em>Realized Operational Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized Operational Performer</em>'.
	 * @see uAFMetaModel.OperationAgent#getRealizedOperationalPerformer()
	 * @see #getOperationAgent()
	 * @generated
	 */
	EReference getOperationAgent_RealizedOperationalPerformer();

	/**
	 * Returns the meta object for class '{@link uAFMetaModel.ResourceAsset <em>Resource Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Asset</em>'.
	 * @see uAFMetaModel.ResourceAsset
	 * @generated
	 */
	EClass getResourceAsset();

	/**
	 * Returns the meta object for the reference '{@link uAFMetaModel.ResourceAsset#getRelatas <em>Relatas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relatas</em>'.
	 * @see uAFMetaModel.ResourceAsset#getRelatas()
	 * @see #getResourceAsset()
	 * @generated
	 */
	EReference getResourceAsset_Relatas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UAFMetaModelFactory getUAFMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourcePerformerImpl <em>Resource Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourcePerformerImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourcePerformer()
		 * @generated
		 */
		EClass RESOURCE_PERFORMER = eINSTANCE.getResourcePerformer();

		/**
		 * The meta object literal for the '<em><b>Realizing Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PERFORMER__REALIZING_RESOURCE = eINSTANCE.getResourcePerformer_RealizingResource();

		/**
		 * The meta object literal for the '<em><b>Resourceexchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PERFORMER__RESOURCEEXCHANGE = eINSTANCE.getResourcePerformer_Resourceexchange();

		/**
		 * The meta object literal for the '<em><b>Resourceasset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PERFORMER__RESOURCEASSET = eINSTANCE.getResourcePerformer_Resourceasset();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourceArchitectureImpl <em>Resource Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourceArchitectureImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceArchitecture()
		 * @generated
		 */
		EClass RESOURCE_ARCHITECTURE = eINSTANCE.getResourceArchitecture();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.PhysicalResourceImpl <em>Physical Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.PhysicalResourceImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getPhysicalResource()
		 * @generated
		 */
		EClass PHYSICAL_RESOURCE = eINSTANCE.getPhysicalResource();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.OrganizationalResourceImpl <em>Organizational Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.OrganizationalResourceImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getOrganizationalResource()
		 * @generated
		 */
		EClass ORGANIZATIONAL_RESOURCE = eINSTANCE.getOrganizationalResource();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.NaturalResourceImpl <em>Natural Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.NaturalResourceImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getNaturalResource()
		 * @generated
		 */
		EClass NATURAL_RESOURCE = eINSTANCE.getNaturalResource();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourceArtifactImpl <em>Resource Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourceArtifactImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceArtifact()
		 * @generated
		 */
		EClass RESOURCE_ARTIFACT = eINSTANCE.getResourceArtifact();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourceExchangeImpl <em>Resource Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourceExchangeImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceExchange()
		 * @generated
		 */
		EClass RESOURCE_EXCHANGE = eINSTANCE.getResourceExchange();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EXCHANGE__FROM = eINSTANCE.getResourceExchange_From();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourceRoleImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceRole()
		 * @generated
		 */
		EClass RESOURCE_ROLE = eINSTANCE.getResourceRole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROLE__TYPE = eINSTANCE.getResourceRole_Type();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ImplementsImpl <em>Implements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ImplementsImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getImplements()
		 * @generated
		 */
		EClass IMPLEMENTS = eINSTANCE.getImplements();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.OperationAgentImpl <em>Operation Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.OperationAgentImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getOperationAgent()
		 * @generated
		 */
		EClass OPERATION_AGENT = eINSTANCE.getOperationAgent();

		/**
		 * The meta object literal for the '<em><b>Realized Operational Performer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER = eINSTANCE
				.getOperationAgent_RealizedOperationalPerformer();

		/**
		 * The meta object literal for the '{@link uAFMetaModel.impl.ResourceAssetImpl <em>Resource Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uAFMetaModel.impl.ResourceAssetImpl
		 * @see uAFMetaModel.impl.UAFMetaModelPackageImpl#getResourceAsset()
		 * @generated
		 */
		EClass RESOURCE_ASSET = eINSTANCE.getResourceAsset();

		/**
		 * The meta object literal for the '<em><b>Relatas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ASSET__RELATAS = eINSTANCE.getResourceAsset_Relatas();

	}

} //UAFMetaModelPackage
