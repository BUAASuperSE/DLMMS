/**
 */
package uAFMetaModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import uAFMetaModel.Implements;
import uAFMetaModel.ResourceAsset;
import uAFMetaModel.ResourceExchange;
import uAFMetaModel.ResourcePerformer;
import uAFMetaModel.UAFMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.impl.ResourcePerformerImpl#getRealizingResource <em>Realizing Resource</em>}</li>
 *   <li>{@link uAFMetaModel.impl.ResourcePerformerImpl#getResourceexchange <em>Resourceexchange</em>}</li>
 *   <li>{@link uAFMetaModel.impl.ResourcePerformerImpl#getResourceasset <em>Resourceasset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePerformerImpl extends MinimalEObjectImpl.Container implements ResourcePerformer {
	/**
	 * The cached value of the '{@link #getRealizingResource() <em>Realizing Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Implements> realizingResource;

	/**
	 * The cached value of the '{@link #getResourceexchange() <em>Resourceexchange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceexchange()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceExchange> resourceexchange;

	/**
	 * The cached value of the '{@link #getResourceasset() <em>Resourceasset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceasset()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAsset> resourceasset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UAFMetaModelPackage.Literals.RESOURCE_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implements> getRealizingResource() {
		if (realizingResource == null) {
			realizingResource = new EObjectResolvingEList<Implements>(Implements.class, this,
					UAFMetaModelPackage.RESOURCE_PERFORMER__REALIZING_RESOURCE);
		}
		return realizingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceExchange> getResourceexchange() {
		if (resourceexchange == null) {
			resourceexchange = new EObjectContainmentEList<ResourceExchange>(ResourceExchange.class, this,
					UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE);
		}
		return resourceexchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAsset> getResourceasset() {
		if (resourceasset == null) {
			resourceasset = new EObjectContainmentEList<ResourceAsset>(ResourceAsset.class, this,
					UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET);
		}
		return resourceasset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE:
			return ((InternalEList<?>) getResourceexchange()).basicRemove(otherEnd, msgs);
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET:
			return ((InternalEList<?>) getResourceasset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UAFMetaModelPackage.RESOURCE_PERFORMER__REALIZING_RESOURCE:
			return getRealizingResource();
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE:
			return getResourceexchange();
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET:
			return getResourceasset();
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
		case UAFMetaModelPackage.RESOURCE_PERFORMER__REALIZING_RESOURCE:
			getRealizingResource().clear();
			getRealizingResource().addAll((Collection<? extends Implements>) newValue);
			return;
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE:
			getResourceexchange().clear();
			getResourceexchange().addAll((Collection<? extends ResourceExchange>) newValue);
			return;
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET:
			getResourceasset().clear();
			getResourceasset().addAll((Collection<? extends ResourceAsset>) newValue);
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
		case UAFMetaModelPackage.RESOURCE_PERFORMER__REALIZING_RESOURCE:
			getRealizingResource().clear();
			return;
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE:
			getResourceexchange().clear();
			return;
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET:
			getResourceasset().clear();
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
		case UAFMetaModelPackage.RESOURCE_PERFORMER__REALIZING_RESOURCE:
			return realizingResource != null && !realizingResource.isEmpty();
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEEXCHANGE:
			return resourceexchange != null && !resourceexchange.isEmpty();
		case UAFMetaModelPackage.RESOURCE_PERFORMER__RESOURCEASSET:
			return resourceasset != null && !resourceasset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourcePerformerImpl
