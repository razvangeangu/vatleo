/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.scoping;

import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class VideoAnnotationsDSLScopeProvider extends AbstractVideoAnnotationsDSLScopeProvider {

	override getScope(EObject context, EReference reference) {
		if (context instanceof Annotation && reference == VideoAnnotationsDSLPackage.Literals.ANNOTATION__TARGET) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Annotation)
			return Scopes.scopeFor(candidates)
		}
		return super.getScope(context, reference);
	}
	
}
