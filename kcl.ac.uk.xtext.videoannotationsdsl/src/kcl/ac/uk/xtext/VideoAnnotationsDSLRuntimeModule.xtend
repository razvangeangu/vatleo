/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext

import com.google.inject.Binder
import kcl.ac.uk.xtext.scoping.VideoAnnotationsDSLScopeProvider
import org.eclipse.xtext.scoping.IScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class VideoAnnotationsDSLRuntimeModule extends AbstractVideoAnnotationsDSLRuntimeModule {
	
	override public Class<? extends IScopeProvider> bindIScopeProvider() {
		return VideoAnnotationsDSLScopeProvider;
	}
	
	override public void configureSerializerIScopeProvider(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider).annotatedWith(org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding).to(VideoAnnotationsDSLScopeProvider);
	}
	
}
