/**
 */
package fr.inria.sed.logo.impl;

import fr.inria.sed.logo.Expression;
import fr.inria.sed.logo.LogoPackage;
import fr.inria.sed.logo.Right;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.impl.RightImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightImpl extends PrimitiveInstructionImpl implements Right {
	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Expression angle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogoPackage.Literals.RIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(Expression newAngle, NotificationChain msgs) {
		Expression oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoPackage.RIGHT__ANGLE,
					oldAngle, newAngle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Expression newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject) angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoPackage.RIGHT__ANGLE,
						null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject) newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoPackage.RIGHT__ANGLE,
						null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoPackage.RIGHT__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LogoPackage.RIGHT__ANGLE:
			return basicSetAngle(null, msgs);
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
		case LogoPackage.RIGHT__ANGLE:
			return getAngle();
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
		case LogoPackage.RIGHT__ANGLE:
			setAngle((Expression) newValue);
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
		case LogoPackage.RIGHT__ANGLE:
			setAngle((Expression) null);
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
		case LogoPackage.RIGHT__ANGLE:
			return angle != null;
		}
		return super.eIsSet(featureID);
	}

} //RightImpl
