/**
 */
package uAFMetaModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uAFMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uAFMetaModel.UAFMetaModelPackage
 * @generated
 */
public class UAFMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UAFMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAFMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = UAFMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UAFMetaModelPackage.RESOURCE_PERFORMER: {
			ResourcePerformer resourcePerformer = (ResourcePerformer) theEObject;
			T result = caseResourcePerformer(resourcePerformer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.RESOURCE_ARCHITECTURE: {
			ResourceArchitecture resourceArchitecture = (ResourceArchitecture) theEObject;
			T result = caseResourceArchitecture(resourceArchitecture);
			if (result == null)
				result = caseResourcePerformer(resourceArchitecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.PHYSICAL_RESOURCE: {
			PhysicalResource physicalResource = (PhysicalResource) theEObject;
			T result = casePhysicalResource(physicalResource);
			if (result == null)
				result = caseResourcePerformer(physicalResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.ORGANIZATIONAL_RESOURCE: {
			OrganizationalResource organizationalResource = (OrganizationalResource) theEObject;
			T result = caseOrganizationalResource(organizationalResource);
			if (result == null)
				result = casePhysicalResource(organizationalResource);
			if (result == null)
				result = caseResourcePerformer(organizationalResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.NATURAL_RESOURCE: {
			NaturalResource naturalResource = (NaturalResource) theEObject;
			T result = caseNaturalResource(naturalResource);
			if (result == null)
				result = casePhysicalResource(naturalResource);
			if (result == null)
				result = caseResourcePerformer(naturalResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.RESOURCE_ARTIFACT: {
			ResourceArtifact resourceArtifact = (ResourceArtifact) theEObject;
			T result = caseResourceArtifact(resourceArtifact);
			if (result == null)
				result = casePhysicalResource(resourceArtifact);
			if (result == null)
				result = caseResourcePerformer(resourceArtifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.RESOURCE_EXCHANGE: {
			ResourceExchange resourceExchange = (ResourceExchange) theEObject;
			T result = caseResourceExchange(resourceExchange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.RESOURCE_ROLE: {
			ResourceRole resourceRole = (ResourceRole) theEObject;
			T result = caseResourceRole(resourceRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.IMPLEMENTS: {
			Implements implements_ = (Implements) theEObject;
			T result = caseImplements(implements_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.OPERATION_AGENT: {
			OperationAgent operationAgent = (OperationAgent) theEObject;
			T result = caseOperationAgent(operationAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UAFMetaModelPackage.RESOURCE_ASSET: {
			ResourceAsset resourceAsset = (ResourceAsset) theEObject;
			T result = caseResourceAsset(resourceAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePerformer(ResourcePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceArchitecture(ResourceArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalResource(PhysicalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizational Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizational Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationalResource(OrganizationalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalResource(NaturalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceArtifact(ResourceArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceExchange(ResourceExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRole(ResourceRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplements(Implements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAgent(OperationAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAsset(ResourceAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UAFMetaModelSwitch
