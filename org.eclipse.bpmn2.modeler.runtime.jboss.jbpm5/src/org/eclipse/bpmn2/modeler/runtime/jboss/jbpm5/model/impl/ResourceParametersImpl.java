/**
 */
package org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl;

import java.util.Collection;

import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.ModelPackage;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.Parameter;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.ResourceParameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl.ResourceParametersImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl.ResourceParametersImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl.ResourceParametersImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl.ResourceParametersImpl#getWorkinghours <em>Workinghours</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.impl.ResourceParametersImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceParametersImpl extends EObjectImpl implements ResourceParameters {
	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Parameter selection;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Parameter availability;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Parameter quantity;

	/**
	 * The cached value of the '{@link #getWorkinghours() <em>Workinghours</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkinghours()
	 * @generated
	 * @ordered
	 */
	protected Parameter workinghours;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESOURCE_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelection(Parameter newSelection, NotificationChain msgs) {
		Parameter oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__SELECTION, oldSelection, newSelection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Parameter newSelection) {
		if (newSelection != selection) {
			NotificationChain msgs = null;
			if (selection != null)
				msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__SELECTION, null, msgs);
			if (newSelection != null)
				msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__SELECTION, null, msgs);
			msgs = basicSetSelection(newSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__SELECTION, newSelection, newSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailability(Parameter newAvailability, NotificationChain msgs) {
		Parameter oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY, oldAvailability, newAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Parameter newAvailability) {
		if (newAvailability != availability) {
			NotificationChain msgs = null;
			if (availability != null)
				msgs = ((InternalEObject)availability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY, null, msgs);
			if (newAvailability != null)
				msgs = ((InternalEObject)newAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY, null, msgs);
			msgs = basicSetAvailability(newAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY, newAvailability, newAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Parameter newQuantity, NotificationChain msgs) {
		Parameter oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Parameter newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getWorkinghours() {
		return workinghours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkinghours(Parameter newWorkinghours, NotificationChain msgs) {
		Parameter oldWorkinghours = workinghours;
		workinghours = newWorkinghours;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS, oldWorkinghours, newWorkinghours);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkinghours(Parameter newWorkinghours) {
		if (newWorkinghours != workinghours) {
			NotificationChain msgs = null;
			if (workinghours != null)
				msgs = ((InternalEObject)workinghours).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS, null, msgs);
			if (newWorkinghours != null)
				msgs = ((InternalEObject)newWorkinghours).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS, null, msgs);
			msgs = basicSetWorkinghours(newWorkinghours, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS, newWorkinghours, newWorkinghours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModelPackage.RESOURCE_PARAMETERS__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESOURCE_PARAMETERS__SELECTION:
				return basicSetSelection(null, msgs);
			case ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY:
				return basicSetAvailability(null, msgs);
			case ModelPackage.RESOURCE_PARAMETERS__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS:
				return basicSetWorkinghours(null, msgs);
			case ModelPackage.RESOURCE_PARAMETERS__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RESOURCE_PARAMETERS__SELECTION:
				return getSelection();
			case ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY:
				return getAvailability();
			case ModelPackage.RESOURCE_PARAMETERS__QUANTITY:
				return getQuantity();
			case ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS:
				return getWorkinghours();
			case ModelPackage.RESOURCE_PARAMETERS__ROLE:
				return getRole();
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
			case ModelPackage.RESOURCE_PARAMETERS__SELECTION:
				setSelection((Parameter)newValue);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY:
				setAvailability((Parameter)newValue);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__QUANTITY:
				setQuantity((Parameter)newValue);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS:
				setWorkinghours((Parameter)newValue);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Parameter>)newValue);
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
			case ModelPackage.RESOURCE_PARAMETERS__SELECTION:
				setSelection((Parameter)null);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY:
				setAvailability((Parameter)null);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__QUANTITY:
				setQuantity((Parameter)null);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS:
				setWorkinghours((Parameter)null);
				return;
			case ModelPackage.RESOURCE_PARAMETERS__ROLE:
				getRole().clear();
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
			case ModelPackage.RESOURCE_PARAMETERS__SELECTION:
				return selection != null;
			case ModelPackage.RESOURCE_PARAMETERS__AVAILABILITY:
				return availability != null;
			case ModelPackage.RESOURCE_PARAMETERS__QUANTITY:
				return quantity != null;
			case ModelPackage.RESOURCE_PARAMETERS__WORKINGHOURS:
				return workinghours != null;
			case ModelPackage.RESOURCE_PARAMETERS__ROLE:
				return role != null && !role.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceParametersImpl