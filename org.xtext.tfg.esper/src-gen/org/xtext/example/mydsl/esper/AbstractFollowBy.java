/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Follow By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.AbstractFollowBy#getFollowBy <em>Follow By</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.AbstractFollowBy#getWherePart <em>Where Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getAbstractFollowBy()
 * @model
 * @generated
 */
public interface AbstractFollowBy extends EObject
{
  /**
   * Returns the value of the '<em><b>Follow By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Follow By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Follow By</em>' containment reference.
   * @see #setFollowBy(FollowBy)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getAbstractFollowBy_FollowBy()
   * @model containment="true"
   * @generated
   */
  FollowBy getFollowBy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.AbstractFollowBy#getFollowBy <em>Follow By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Follow By</em>' containment reference.
   * @see #getFollowBy()
   * @generated
   */
  void setFollowBy(FollowBy value);

  /**
   * Returns the value of the '<em><b>Where Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Part</em>' containment reference.
   * @see #setWherePart(FollowByWhere)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getAbstractFollowBy_WherePart()
   * @model containment="true"
   * @generated
   */
  FollowByWhere getWherePart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.AbstractFollowBy#getWherePart <em>Where Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Part</em>' containment reference.
   * @see #getWherePart()
   * @generated
   */
  void setWherePart(FollowByWhere value);

} // AbstractFollowBy
