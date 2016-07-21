/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Time#getSec <em>Sec</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject
{
  /**
   * Returns the value of the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec</em>' attribute.
   * @see #setSec(int)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getTime_Sec()
   * @model
   * @generated
   */
  int getSec();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Time#getSec <em>Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec</em>' attribute.
   * @see #getSec()
   * @generated
   */
  void setSec(int value);

} // Time