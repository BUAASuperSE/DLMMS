/**
 */
package uAFMetaModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uAFMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uAFMetaModel.UAFMetaModelPackage
 * @generated
 */
public class UAFMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UAFMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAFMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UAFMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UAFMetaModelSwitch<Adapter> modelSwitch = new UAFMetaModelSwitch<Adapter>() {
		@Override
		public Adapter caseResourcePerformer(ResourcePerformer object) {
			return createResourcePerformerAdapter();
		}

		@Override
		public Adapter caseResourceArchitecture(ResourceArchitecture object) {
			return createResourceArchitectureAdapter();
		}

		@Override
		public Adapter casePhysicalResource(PhysicalResource object) {
			return createPhysicalResourceAdapter();
		}

		@Override
		public Adapter caseOrganizationalResource(OrganizationalResource object) {
			return createOrganizationalResourceAdapter();
		}

		@Override
		public Adapter caseNaturalResource(NaturalResource object) {
			return createNaturalResourceAdapter();
		}

		@Override
		public Adapter caseResourceArtifact(ResourceArtifact object) {
			return createResourceArtifactAdapter();
		}

		@Override
		public Adapter caseResourceExchange(ResourceExchange object) {
			return createResourceExchangeAdapter();
		}

		@Override
		public Adapter caseResourceRole(ResourceRole object) {
			return createResourceRoleAdapter();
		}

		@Override
		public Adapter caseImplements(Implements object) {
			return createImplementsAdapter();
		}

		@Override
		public Adapter caseOperationAgent(OperationAgent object) {
			return createOperationAgentAdapter();
		}

		@Override
		public Adapter caseResourceAsset(ResourceAsset object) {
			return createResourceAssetAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourcePerformer <em>Resource Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourcePerformer
	 * @generated
	 */
	public Adapter createResourcePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourceArchitecture <em>Resource Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourceArchitecture
	 * @generated
	 */
	public Adapter createResourceArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.PhysicalResource <em>Physical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.PhysicalResource
	 * @generated
	 */
	public Adapter createPhysicalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.OrganizationalResource <em>Organizational Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.OrganizationalResource
	 * @generated
	 */
	public Adapter createOrganizationalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.NaturalResource <em>Natural Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.NaturalResource
	 * @generated
	 */
	public Adapter createNaturalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourceArtifact <em>Resource Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourceArtifact
	 * @generated
	 */
	public Adapter createResourceArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourceExchange <em>Resource Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourceExchange
	 * @generated
	 */
	public Adapter createResourceExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.Implements
	 * @generated
	 */
	public Adapter createImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.OperationAgent <em>Operation Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.OperationAgent
	 * @generated
	 */
	public Adapter createOperationAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uAFMetaModel.ResourceAsset <em>Resource Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uAFMetaModel.ResourceAsset
	 * @generated
	 */
	public Adapter createResourceAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UAFMetaModelAdapterFactory
