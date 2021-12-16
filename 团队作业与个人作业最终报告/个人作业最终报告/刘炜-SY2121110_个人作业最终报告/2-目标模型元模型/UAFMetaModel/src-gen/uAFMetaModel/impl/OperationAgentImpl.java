/**
 */
package uAFMetaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uAFMetaModel.Implements;
import uAFMetaModel.OperationAgent;
import uAFMetaModel.UAFMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.impl.OperationAgentImpl#getRealizedOperationalPerformer <em>Realized Operational Performer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAgentImpl extends MinimalEObjectImpl.Container implements OperationAgent {
	/**
	 * The cached value of the '{@link #getRealizedOperationalPerformer() <em>Realized Operational Performer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Implements> realizedOperationalPerformer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UAFMetaModelPackage.Literals.OPERATION_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implements> getRealizedOperationalPerformer() {
		if (realizedOperationalPerformer == null) {
			realizedOperationalPerformer = new EObjectResolvingEList<Implements>(Implements.class, this,
					UAFMetaModelPackage.OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER);
		}
		return realizedOperationalPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UAFMetaModelPackage.OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER:
			return getRealizedOperationalPerformer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UAFMetaModelPackage.OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER:
			getRealizedOperationalPerformer().clear();
			getRealizedOperationalPerformer().addAll((Collection<? extends Implements>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UAFMetaModelPackage.OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER:
			getRealizedOperationalPerformer().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UAFMetaModelPackage.OPERATION_AGENT__REALIZED_OPERATIONAL_PERFORMER:
			return realizedOperationalPerformer != null && !realizedOperationalPerformer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationAgentImpl
