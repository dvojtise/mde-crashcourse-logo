/**
 */
package fr.inria.sed.logo.impl;

import fr.inria.sed.logo.Div;
import fr.inria.sed.logo.Expression;
import fr.inria.sed.logo.LogoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.impl.DivImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link fr.inria.sed.logo.impl.DivImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivImpl extends ExpressionImpl implements Div {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Expression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Expression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogoPackage.Literals.DIV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Expression newLhs, NotificationChain msgs) {
		Expression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoPackage.DIV__LHS, oldLhs,
					newLhs);
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
	public void setLhs(Expression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoPackage.DIV__LHS, null,
						msgs);
			if (newLhs != null)
				msgs = ((InternalEObject) newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoPackage.DIV__LHS, null,
						msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoPackage.DIV__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Expression newRhs, NotificationChain msgs) {
		Expression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoPackage.DIV__RHS, oldRhs,
					newRhs);
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
	public void setRhs(Expression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoPackage.DIV__RHS, null,
						msgs);
			if (newRhs != null)
				msgs = ((InternalEObject) newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoPackage.DIV__RHS, null,
						msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoPackage.DIV__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LogoPackage.DIV__LHS:
			return basicSetLhs(null, msgs);
		case LogoPackage.DIV__RHS:
			return basicSetRhs(null, msgs);
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
		case LogoPackage.DIV__LHS:
			return getLhs();
		case LogoPackage.DIV__RHS:
			return getRhs();
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
		case LogoPackage.DIV__LHS:
			setLhs((Expression) newValue);
			return;
		case LogoPackage.DIV__RHS:
			setRhs((Expression) newValue);
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
		case LogoPackage.DIV__LHS:
			setLhs((Expression) null);
			return;
		case LogoPackage.DIV__RHS:
			setRhs((Expression) null);
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
		case LogoPackage.DIV__LHS:
			return lhs != null;
		case LogoPackage.DIV__RHS:
			return rhs != null;
		}
		return super.eIsSet(featureID);
	}

} //DivImpl
