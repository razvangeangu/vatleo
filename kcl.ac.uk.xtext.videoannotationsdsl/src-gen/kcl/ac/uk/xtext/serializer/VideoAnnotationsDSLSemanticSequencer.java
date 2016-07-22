/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Focus;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Move;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Scope;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Time;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class VideoAnnotationsDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VideoAnnotationsDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VideoAnnotationsDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VideoAnnotationsDSLPackage.ANNOTATED_VIDEO:
				sequence_AnnotatedVideo(context, (AnnotatedVideo) semanticObject); 
				return; 
			case VideoAnnotationsDSLPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case VideoAnnotationsDSLPackage.FOCUS:
				sequence_Focus(context, (Focus) semanticObject); 
				return; 
			case VideoAnnotationsDSLPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case VideoAnnotationsDSLPackage.SCOPE:
				sequence_Scope(context, (Scope) semanticObject); 
				return; 
			case VideoAnnotationsDSLPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AnnotatedVideo returns AnnotatedVideo
	 *
	 * Constraint:
	 *     annotations+=Annotation+
	 */
	protected void sequence_AnnotatedVideo(ISerializationContext context, AnnotatedVideo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     (
	 *         fromTime=Time 
	 *         toTime=Time 
	 *         name=ID 
	 *         sender=Sender 
	 *         type=Move 
	 *         scope=Scope 
	 *         focus=Focus 
	 *         content=STRING 
	 *         target=[Annotation|ID]?
	 *     )
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Focus returns Focus
	 *
	 * Constraint:
	 *     (focus='R' | focus='S' | focus='G' | focus='V' | focus='↵')
	 */
	protected void sequence_Focus(ISerializationContext context, Focus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (
	 *         type='propose' | 
	 *         type='question' | 
	 *         type='challenge' | 
	 *         type='justify' | 
	 *         type='withdraw' | 
	 *         type='accept' | 
	 *         type='reject' | 
	 *         type='commit' | 
	 *         type='uncommit'
	 *     )
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns Scope
	 *
	 * Constraint:
	 *     (scope='feature' | scope='rating' | scope='criteria' | scope='topic')
	 */
	protected void sequence_Scope(ISerializationContext context, Scope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     sec=INT
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VideoAnnotationsDSLPackage.Literals.TIME__SEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VideoAnnotationsDSLPackage.Literals.TIME__SEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0(), semanticObject.getSec());
		feeder.finish();
	}
	
	
}
