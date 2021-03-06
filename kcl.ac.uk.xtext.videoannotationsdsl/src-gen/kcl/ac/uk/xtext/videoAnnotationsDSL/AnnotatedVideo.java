/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotatedVideo()
 * @model
 * @generated
 */
public interface AnnotatedVideo extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotatedVideo_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

} // AnnotatedVideo
