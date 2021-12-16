/**
 */
package uAFMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uAFMetaModel.ResourceAsset;
import uAFMetaModel.ResourceExchange;
import uAFMetaModel.UAFMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.impl.ResourceAssetImpl#getRelatas <em>Relatas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAssetImpl extends MinimalEObjectImpl.Container implements ResourceAsset {
	/**
	 * The cached value of the '{@link #getRelatas() <em>Relatas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatas()
	 * @generated
	 * @ordered
	 */
	protected ResourceExchange relatas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UAFMetaModelPackage.Literals.RESOURCE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExchange getRelatas() {
		if (relatas != null && relatas.eIsProxy()) {
			InternalEObject oldRelatas = (InternalEObject) relatas;
			relatas = (ResourceExchange) eResolveProxy(oldRelatas);
			if (relatas != oldRelatas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UAFMetaModelPackage.RESOURCE_ASSET__RELATAS, oldRelatas, relatas));
			}
		}
		return relatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceExchange basicGetRelatas() {
		return relatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatas(ResourceExchange newRelatas) {
		ResourceExchange oldRelatas = relatas;
		relatas = newRelatas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UAFMetaModelPackage.RESOURCE_ASSET__RELATAS,
					oldRelatas, relatas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UAFMetaModelPackage.RESOURCE_ASSET__RELATAS:
			if (resolve)
				return getRelatas();
			return basicGetRelatas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UAFMetaModelPackage.RESOURCE_ASSET__RELATAS:
			setRelatas((ResourceExchange) newValue);
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
		case UAFMetaModelPackage.RESOURCE_ASSET__RELATAS:
			setRelatas((ResourceExchange) null);
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
		case UAFMetaModelPackage.RESOURCE_ASSET__RELATAS:
			return relatas != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceAssetImpl
