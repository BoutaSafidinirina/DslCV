/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cv.Experience#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.cv.Experience#getCompany <em>Company</em>}</li>
 *   <li>{@link org.xtext.example.cv.Experience#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cv.CvPackage#getExperience()
 * @model
 * @generated
 */
public interface Experience extends EObject
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(String)
   * @see org.xtext.example.cv.CvPackage#getExperience_Position()
   * @model
   * @generated
   */
  String getPosition();

  /**
   * Sets the value of the '{@link org.xtext.example.cv.Experience#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(String value);

  /**
   * Returns the value of the '<em><b>Company</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Company</em>' attribute.
   * @see #setCompany(String)
   * @see org.xtext.example.cv.CvPackage#getExperience_Company()
   * @model
   * @generated
   */
  String getCompany();

  /**
   * Sets the value of the '{@link org.xtext.example.cv.Experience#getCompany <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Company</em>' attribute.
   * @see #getCompany()
   * @generated
   */
  void setCompany(String value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(int)
   * @see org.xtext.example.cv.CvPackage#getExperience_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link org.xtext.example.cv.Experience#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(int value);

} // Experience
