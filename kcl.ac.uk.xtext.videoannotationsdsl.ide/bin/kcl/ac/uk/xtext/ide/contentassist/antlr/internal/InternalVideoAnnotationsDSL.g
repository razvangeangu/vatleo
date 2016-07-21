/*
 * generated by Xtext 2.10.0
 */
grammar InternalVideoAnnotationsDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package kcl.ac.uk.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package kcl.ac.uk.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;

}
@parser::members {
	private VideoAnnotationsDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(VideoAnnotationsDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAnnotatedVideo
entryRuleAnnotatedVideo
:
{ before(grammarAccess.getAnnotatedVideoRule()); }
	 ruleAnnotatedVideo
{ after(grammarAccess.getAnnotatedVideoRule()); } 
	 EOF 
;

// Rule AnnotatedVideo
ruleAnnotatedVideo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAssignment()); }
		(rule__AnnotatedVideo__AnnotationsAssignment)*
		{ after(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSender
entryRuleSender
:
{ before(grammarAccess.getSenderRule()); }
	 ruleSender
{ after(grammarAccess.getSenderRule()); } 
	 EOF 
;

// Rule Sender
ruleSender 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); }
			(RULE_INT)
			{ after(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); }
		)
		(
			{ before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); }
			(RULE_INT)*
			{ after(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMove
entryRuleMove
:
{ before(grammarAccess.getMoveRule()); }
	 ruleMove
{ after(grammarAccess.getMoveRule()); } 
	 EOF 
;

// Rule Move
ruleMove 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveAccess().getTypeAssignment()); }
		(rule__Move__TypeAssignment)
		{ after(grammarAccess.getMoveAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScope
entryRuleScope
:
{ before(grammarAccess.getScopeRule()); }
	 ruleScope
{ after(grammarAccess.getScopeRule()); } 
	 EOF 
;

// Rule Scope
ruleScope 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScopeAccess().getScopeAssignment()); }
		(rule__Scope__ScopeAssignment)
		{ after(grammarAccess.getScopeAccess().getScopeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFocus
entryRuleFocus
:
{ before(grammarAccess.getFocusRule()); }
	 ruleFocus
{ after(grammarAccess.getFocusRule()); } 
	 EOF 
;

// Rule Focus
ruleFocus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFocusAccess().getFocusAssignment()); }
		(rule__Focus__FocusAssignment)
		{ after(grammarAccess.getFocusAccess().getFocusAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTime
entryRuleTime
:
{ before(grammarAccess.getTimeRule()); }
	 ruleTime
{ after(grammarAccess.getTimeRule()); } 
	 EOF 
;

// Rule Time
ruleTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeAccess().getSecAssignment()); }
		(rule__Time__SecAssignment)
		{ after(grammarAccess.getTimeAccess().getSecAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__TypeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0()); }
		'propose'
		{ after(grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1()); }
		'question'
		{ after(grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2()); }
		'challenge'
		{ after(grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3()); }
		'justify'
		{ after(grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4()); }
		'withdraw'
		{ after(grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5()); }
		'accept'
		{ after(grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6()); }
		'reject'
		{ after(grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7()); }
		'commit'
		{ after(grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_8()); }
		'uncommit'
		{ after(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__ScopeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); }
		'feature'
		{ after(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); }
		'rating'
		{ after(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); }
		'criteria'
		{ after(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); }
		'topic'
		{ after(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Focus__FocusAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); }
		'R'
		{ after(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); }
		'S'
		{ after(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); }
		'G'
		{ after(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); }
		'V'
		{ after(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getFocusAccess().getFocusDownwardsArrowWithCornerLeftwardsKeyword_0_4()); }
		'\u21B5'
		{ after(grammarAccess.getFocusAccess().getFocusDownwardsArrowWithCornerLeftwardsKeyword_0_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getFromKeyword_0()); }
	'from'
	{ after(grammarAccess.getAnnotationAccess().getFromKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getFromTimeAssignment_1()); }
	(rule__Annotation__FromTimeAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getFromTimeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__2__Impl
	rule__Annotation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getAnnotationAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__3__Impl
	rule__Annotation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getToTimeAssignment_3()); }
	(rule__Annotation__ToTimeAssignment_3)
	{ after(grammarAccess.getAnnotationAccess().getToTimeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__4__Impl
	rule__Annotation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getAnnotateKeyword_4()); }
	'annotate'
	{ after(grammarAccess.getAnnotationAccess().getAnnotateKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__5__Impl
	rule__Annotation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5()); }
	'('
	{ after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__6__Impl
	rule__Annotation__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getIdAssignment_6()); }
	(rule__Annotation__IdAssignment_6)
	{ after(grammarAccess.getAnnotationAccess().getIdAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__7__Impl
	rule__Annotation__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_7()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__8__Impl
	rule__Annotation__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getSenderAssignment_8()); }
	(rule__Annotation__SenderAssignment_8)
	{ after(grammarAccess.getAnnotationAccess().getSenderAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__9__Impl
	rule__Annotation__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_9()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__10__Impl
	rule__Annotation__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getTypeAssignment_10()); }
	(rule__Annotation__TypeAssignment_10)
	{ after(grammarAccess.getAnnotationAccess().getTypeAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__11__Impl
	rule__Annotation__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_11()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__12__Impl
	rule__Annotation__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getScopeAssignment_12()); }
	(rule__Annotation__ScopeAssignment_12)
	{ after(grammarAccess.getAnnotationAccess().getScopeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__13__Impl
	rule__Annotation__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_13()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__14__Impl
	rule__Annotation__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getFocusAssignment_14()); }
	(rule__Annotation__FocusAssignment_14)
	{ after(grammarAccess.getAnnotationAccess().getFocusAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__15__Impl
	rule__Annotation__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_15()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__16__Impl
	rule__Annotation__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getContentAssignment_16()); }
	(rule__Annotation__ContentAssignment_16)
	{ after(grammarAccess.getAnnotationAccess().getContentAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__17__Impl
	rule__Annotation__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_17()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__18__Impl
	rule__Annotation__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getTargetAssignment_18()); }
	(rule__Annotation__TargetAssignment_18)
	{ after(grammarAccess.getAnnotationAccess().getTargetAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19()); }
	')'
	{ after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotatedVideo__AnnotationsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0()); }
		ruleAnnotation
		{ after(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__FromTimeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0()); }
		ruleTime
		{ after(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ToTimeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0()); }
		ruleTime
		{ after(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__IdAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getIdIDTerminalRuleCall_6_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnotationAccess().getIdIDTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__SenderAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0()); }
		ruleSender
		{ after(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__TypeAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0()); }
		ruleMove
		{ after(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ScopeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0()); }
		ruleScope
		{ after(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__FocusAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0()); }
		ruleFocus
		{ after(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ContentAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_16_0()); }
		RULE_STRING
		{ after(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__TargetAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_0()); }
		(
			{ before(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_18_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_18_0_1()); }
		)
		{ after(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getTypeAlternatives_0()); }
		(rule__Move__TypeAlternatives_0)
		{ after(grammarAccess.getMoveAccess().getTypeAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__ScopeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getScopeAlternatives_0()); }
		(rule__Scope__ScopeAlternatives_0)
		{ after(grammarAccess.getScopeAccess().getScopeAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Focus__FocusAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFocusAccess().getFocusAlternatives_0()); }
		(rule__Focus__FocusAlternatives_0)
		{ after(grammarAccess.getFocusAccess().getFocusAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__SecAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;