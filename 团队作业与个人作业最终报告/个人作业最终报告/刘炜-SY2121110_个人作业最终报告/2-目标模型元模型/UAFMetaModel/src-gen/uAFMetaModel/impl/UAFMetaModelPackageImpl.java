/**
 */
package uAFMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uAFMetaModel.Implements;
import uAFMetaModel.NaturalResource;
import uAFMetaModel.OperationAgent;
import uAFMetaModel.OrganizationalResource;
import uAFMetaModel.PhysicalResource;
import uAFMetaModel.ResourceArchitecture;
import uAFMetaModel.ResourceArtifact;
import uAFMetaModel.ResourceAsset;
import uAFMetaModel.ResourceExchange;
import uAFMetaModel.ResourcePerformer;
import uAFMetaModel.ResourceRole;
import uAFMetaModel.UAFMetaModelFactory;
import uAFMetaModel.UAFMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAFMetaModelPackageImpl extends EPackageImpl implements UAFMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAssetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uAFMetaModel.UAFMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UAFMetaModelPackageImpl() {
		super(eNS_URI, UAFMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UAFMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UAFMetaModelPackage init() {
		if (isInited)
			return (UAFMetaModelPackage) EPackage.Registry.INSTANCE.getEPackage(UAFMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUAFMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UAFMetaModelPackageImpl theUAFMetaModelPackage = registeredUAFMetaModelPackage instanceof UAFMetaModelPackageImpl
				? (UAFMetaModelPackageImpl) registeredUAFMetaModelPackage
				: new UAFMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUAFMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theUAFMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUAFMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UAFMetaModelPackage.eNS_URI, theUAFMetaModelPackage);
		return theUAFMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePerformer() {
		return resourcePerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePerformer_RealizingResource() {
		return (EReference) resourcePerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePerformer_Resourceexchange() {
		return (EReference) resourcePerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePerformer_Resourceasset() {
		return (EReference) resourcePerformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceArchitecture() {
		return resourceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalResource() {
		return physicalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationalResource() {
		return organizationalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalResource() {
		return naturalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceArtifact() {
		return resourceArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceExchange() {
		return resourceExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceExchange_From() {
		return (EReference) resourceExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRole() {
		return resourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_Type() {
		return (EReference) resourceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplements() {
		return implementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAgent() {
		return operationAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAgent_RealizedOperationalPerformer() {
		return (EReference) operationAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAsset() {
		return resourceAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAsset_Relatas() {
		return (EReference) resourceAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAFMetaModelFactory getUAFMetaModelFactory() {
		return (UAFMetaModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		resourcePerformerEClass = createEClass(RESOURCE_PERFORMER);
		createEReference(resourcePerformerEClass, RESOURCE_PERFORMER__REALIZING_RESOURCE);
		createEReference(resourcePerformerEClass, RESOURCE_PERFORMER__RESOURCEEXCHANGE);
		createEReference(resourcePerformerEClass, RESOURCE_PERFORMER__RESOURCEASSET);

		resourceArchitectureEClass = createEClass(RESOURCE_ARCHITECTURE);

		physicalResourceEClass = createEClass(PHYSICAL_RESOURCE);

		organizationalResourceEClass = createEClass(ORGANIZATIONAL_RESOURCE);

		naturalResourceEClass = createEClass(NATURAL_RESOURCE);

		resourceArtifactEClass = createEClass(RESOURCE_ARTIFACT);

		resourceExchangeEClass = createEClass(RESOURCE_EXCHANGE);
		createEReference(resourceExchangeEClass, RESOURCE_EXCHANGE__FROM);

		resourceRoleEClass = createEClass(RESOURCE_ROLE);
		createEReference(resourceRoleEClass, RESOURCE_ROLE__TYPE);

		implementsEClass = createEClass(IMPLEMENTS);

		operationAgentEClass = createEClass(OPERATION_AGENT);
		createEReference(operationAgentEClass, OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER);

		resourceAssetEClass = createEClass(RESOURCE_ASSET);
		createEReference(resourceAssetEClass, RESOURCE_ASSET__RELATAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceArchitectureEClass.getESuperTypes().add(this.getResourcePerformer());
		physicalResourceEClass.getESuperTypes().add(this.getResourcePerformer());
		organizationalResourceEClass.getESuperTypes().add(this.getPhysicalResource());
		naturalResourceEClass.getESuperTypes().add(this.getPhysicalResource());
		resourceArtifactEClass.getESuperTypes().add(this.getPhysicalResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourcePerformerEClass, ResourcePerformer.class, "ResourcePerformer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePerformer_RealizingResource(), this.getImplements(), null, "realizingResource", null,
				1, -1, ResourcePerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcePerformer_Resourceexchange(), this.getResourceExchange(), null, "resourceexchange",
				null, 0, -1, ResourcePerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcePerformer_Resourceasset(), this.getResourceAsset(), null, "resourceasset", null, 0,
				-1, ResourcePerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceArchitectureEClass, ResourceArchitecture.class, "ResourceArchitecture", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalResourceEClass, PhysicalResource.class, "PhysicalResource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(organizationalResourceEClass, OrganizationalResource.class, "OrganizationalResource", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(naturalResourceEClass, NaturalResource.class, "NaturalResource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceArtifactEClass, ResourceArtifact.class, "ResourceArtifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceExchangeEClass, ResourceExchange.class, "ResourceExchange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceExchange_From(), this.getResourcePerformer(), null, "from", null, 0, 1,
				ResourceExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRoleEClass, ResourceRole.class, "ResourceRole", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRole_Type(), this.getResourcePerformer(), null, "type", null, 0, 1,
				ResourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementsEClass, Implements.class, "Implements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationAgentEClass, OperationAgent.class, "OperationAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationAgent_RealizedOperationalPerformer(), this.getImplements(), null,
				"realizedOperationalPerformer", null, 1, -1, OperationAgent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAssetEClass, ResourceAsset.class, "ResourceAsset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAsset_Relatas(), this.getResourceExchange(), null, "relatas", null, 0, 1,
				ResourceAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UAFMetaModelPackageImpl
