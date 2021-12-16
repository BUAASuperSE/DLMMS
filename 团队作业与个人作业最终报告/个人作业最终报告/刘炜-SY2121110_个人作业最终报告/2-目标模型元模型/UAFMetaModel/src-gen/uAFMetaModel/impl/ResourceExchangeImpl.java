/**
 */
package uAFMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uAFMetaModel.ResourceExchange;
import uAFMetaModel.ResourcePerformer;
import uAFMetaModel.UAFMetaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uAFMetaModel.impl.ResourceExchangeImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceExchangeImpl extends MinimalEObjectImpl.Container implements ResourceExchange {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ResourcePerformer from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UAFMetaModelPackage.Literals.RESOURCE_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePerformer getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (ResourcePerformer) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePerformer basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ResourcePerformer newFrom) {
		ResourcePerformer oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM, oldFrom,
					from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
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
		case UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM:
			setFrom((ResourcePerformer) newValue);
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
		case UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM:
			setFrom((ResourcePerformer) null);
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
		case UAFMetaModelPackage.RESOURCE_EXCHANGE__FROM:
			return from != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceExchangeImpl
