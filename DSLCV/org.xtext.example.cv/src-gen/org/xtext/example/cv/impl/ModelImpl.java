/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cv.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.cv.CvPackage;
import org.xtext.example.cv.Education;
import org.xtext.example.cv.Experience;
import org.xtext.example.cv.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getEducation <em>Education</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getExperience <em>Experience</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.ModelImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbout()
   * @generated
   * @ordered
   */
  protected static final String ABOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbout()
   * @generated
   * @ordered
   */
  protected String about = ABOUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getEducation() <em>Education</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEducation()
   * @generated
   * @ordered
   */
  protected EList<Education> education;

  /**
   * The cached value of the '{@link #getExperience() <em>Experience</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperience()
   * @generated
   * @ordered
   */
  protected EList<Experience> experience;

  /**
   * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected static final String CONTACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected String contact = CONTACT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CvPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.MODEL__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAbout()
  {
    return about;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbout(String newAbout)
  {
    String oldAbout = about;
    about = newAbout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.MODEL__ABOUT, oldAbout, about));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Education> getEducation()
  {
    if (education == null)
    {
      education = new EObjectContainmentEList<Education>(Education.class, this, CvPackage.MODEL__EDUCATION);
    }
    return education;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Experience> getExperience()
  {
    if (experience == null)
    {
      experience = new EObjectContainmentEList<Experience>(Experience.class, this, CvPackage.MODEL__EXPERIENCE);
    }
    return experience;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContact()
  {
    return contact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContact(String newContact)
  {
    String oldContact = contact;
    contact = newContact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.MODEL__CONTACT, oldContact, contact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CvPackage.MODEL__EDUCATION:
        return ((InternalEList<?>)getEducation()).basicRemove(otherEnd, msgs);
      case CvPackage.MODEL__EXPERIENCE:
        return ((InternalEList<?>)getExperience()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CvPackage.MODEL__NAME:
        return getName();
      case CvPackage.MODEL__TITLE:
        return getTitle();
      case CvPackage.MODEL__ABOUT:
        return getAbout();
      case CvPackage.MODEL__EDUCATION:
        return getEducation();
      case CvPackage.MODEL__EXPERIENCE:
        return getExperience();
      case CvPackage.MODEL__CONTACT:
        return getContact();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CvPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case CvPackage.MODEL__TITLE:
        setTitle((String)newValue);
        return;
      case CvPackage.MODEL__ABOUT:
        setAbout((String)newValue);
        return;
      case CvPackage.MODEL__EDUCATION:
        getEducation().clear();
        getEducation().addAll((Collection<? extends Education>)newValue);
        return;
      case CvPackage.MODEL__EXPERIENCE:
        getExperience().clear();
        getExperience().addAll((Collection<? extends Experience>)newValue);
        return;
      case CvPackage.MODEL__CONTACT:
        setContact((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CvPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CvPackage.MODEL__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case CvPackage.MODEL__ABOUT:
        setAbout(ABOUT_EDEFAULT);
        return;
      case CvPackage.MODEL__EDUCATION:
        getEducation().clear();
        return;
      case CvPackage.MODEL__EXPERIENCE:
        getExperience().clear();
        return;
      case CvPackage.MODEL__CONTACT:
        setContact(CONTACT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CvPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CvPackage.MODEL__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case CvPackage.MODEL__ABOUT:
        return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
      case CvPackage.MODEL__EDUCATION:
        return education != null && !education.isEmpty();
      case CvPackage.MODEL__EXPERIENCE:
        return experience != null && !experience.isEmpty();
      case CvPackage.MODEL__CONTACT:
        return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", about: ");
    result.append(about);
    result.append(", contact: ");
    result.append(contact);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
