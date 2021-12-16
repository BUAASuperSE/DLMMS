/**
 */
package uAFMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uAFMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UAFMetaModelFactoryImpl extends EFactoryImpl implements UAFMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UAFMetaModelFactory init() {
		try {
			UAFMetaModelFactory theUAFMetaModelFactory = (UAFMetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(UAFMetaModelPackage.eNS_URI);
			if (theUAFMetaModelFactory != null) {
				return theUAFMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UAFMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAFMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UAFMetaModelPackage.RESOURCE_PERFORMER:
			return createResourcePerformer();
		case UAFMetaModelPackage.RESOURCE_ARCHITECTURE:
			return createResourceArchitecture();
		case UAFMetaModelPackage.PHYSICAL_RESOURCE:
			return createPhysicalResource();
		case UAFMetaModelPackage.ORGANIZATIONAL_RESOURCE:
			return createOrganizationalResource();
		case UAFMetaModelPackage.NATURAL_RESOURCE:
			return createNaturalResource();
		case UAFMetaModelPackage.RESOURCE_ARTIFACT:
			return createResourceArtifact();
		case UAFMetaModelPackage.RESOURCE_EXCHANGE:
			return createResourceExchange();
		case UAFMetaModelPackage.RESOURCE_ROLE:
			return createResourceRole();
		case UAFMetaModelPackage.OPERATION_AGENT:
			return createOperationAgent();
		case UAFMetaModelPackage.RESOURCE_ASSET:
			return createResourceAsset();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePerformer createResourcePerformer() {
		ResourcePerformerImpl resourcePerformer = new ResourcePerformerImpl();
		return resourcePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceArchitecture createResourceArchitecture() {
		ResourceArchitectureImpl resourceArchitecture = new ResourceArchitectureImpl();
		return resourceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalResource createPhysicalResource() {
		PhysicalResourceImpl physicalResource = new PhysicalResourceImpl();
		return physicalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalResource createOrganizationalResource() {
		OrganizationalResourceImpl organizationalResource = new OrganizationalResourceImpl();
		return organizationalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalResource createNaturalResource() {
		NaturalResourceImpl naturalResource = new NaturalResourceImpl();
		return naturalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceArtifact createResourceArtifact() {
		ResourceArtifactImpl resourceArtifact = new ResourceArtifactImpl();
		return resourceArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExchange createResourceExchange() {
		ResourceExchangeImpl resourceExchange = new ResourceExchangeImpl();
		return resourceExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAgent createOperationAgent() {
		OperationAgentImpl operationAgent = new OperationAgentImpl();
		return operationAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAsset createResourceAsset() {
		ResourceAssetImpl resourceAsset = new ResourceAssetImpl();
		return resourceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAFMetaModelPackage getUAFMetaModelPackage() {
		return (UAFMetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UAFMetaModelPackage getPackage() {
		return UAFMetaModelPackage.eINSTANCE;
	}

} //UAFMetaModelFactoryImpl
