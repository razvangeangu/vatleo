package kcl.ac.uk.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoAnnotationsDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "'to'", "'annotate'", "'('", "','", "')'", "'#'", "'propose'", "'question'", "'challenge'", "'justify'", "'withdraw'", "'accept'", "'reject'", "'commit'", "'counter'", "'uncommit'", "'other'", "'feature'", "'rating'", "'criteria'", "'topic'", "'R'", "'S'", "'G'", "'V'", "'A'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoAnnotationsDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoAnnotationsDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoAnnotationsDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoAnnotationsDSL.g"; }



     	private VideoAnnotationsDSLGrammarAccess grammarAccess;

        public InternalVideoAnnotationsDSLParser(TokenStream input, VideoAnnotationsDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AnnotatedVideo";
       	}

       	@Override
       	protected VideoAnnotationsDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAnnotatedVideo"
    // InternalVideoAnnotationsDSL.g:64:1: entryRuleAnnotatedVideo returns [EObject current=null] : iv_ruleAnnotatedVideo= ruleAnnotatedVideo EOF ;
    public final EObject entryRuleAnnotatedVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedVideo = null;


        try {
            // InternalVideoAnnotationsDSL.g:64:55: (iv_ruleAnnotatedVideo= ruleAnnotatedVideo EOF )
            // InternalVideoAnnotationsDSL.g:65:2: iv_ruleAnnotatedVideo= ruleAnnotatedVideo EOF
            {
             newCompositeNode(grammarAccess.getAnnotatedVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatedVideo=ruleAnnotatedVideo();

            state._fsp--;

             current =iv_ruleAnnotatedVideo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedVideo"


    // $ANTLR start "ruleAnnotatedVideo"
    // InternalVideoAnnotationsDSL.g:71:1: ruleAnnotatedVideo returns [EObject current=null] : ( (lv_annotations_0_0= ruleAnnotation ) )* ;
    public final EObject ruleAnnotatedVideo() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:77:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* )
            // InternalVideoAnnotationsDSL.g:78:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            {
            // InternalVideoAnnotationsDSL.g:78:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVideoAnnotationsDSL.g:79:3: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalVideoAnnotationsDSL.g:79:3: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalVideoAnnotationsDSL.g:80:4: lv_annotations_0_0= ruleAnnotation
            	    {

            	    				newCompositeNode(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAnnotatedVideoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"annotations",
            	    					lv_annotations_0_0,
            	    					"kcl.ac.uk.xtext.VideoAnnotationsDSL.Annotation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedVideo"


    // $ANTLR start "entryRuleAnnotation"
    // InternalVideoAnnotationsDSL.g:100:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalVideoAnnotationsDSL.g:100:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalVideoAnnotationsDSL.g:101:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalVideoAnnotationsDSL.g:107:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'from' ( (lv_fromTime_1_0= ruleTime ) ) otherlv_2= 'to' ( (lv_toTime_3_0= ruleTime ) ) otherlv_4= 'annotate' otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_sender_8_0= ruleSender ) ) otherlv_9= ',' ( (lv_type_10_0= ruleMove ) ) otherlv_11= ',' ( (lv_scope_12_0= ruleScope ) ) otherlv_13= ',' ( (lv_focus_14_0= ruleFocus ) ) otherlv_15= ',' ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )? ( (lv_content_18_0= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= ')' (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_contentLabel_16_0=null;
        Token otherlv_17=null;
        Token lv_content_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_comment_23_0=null;
        Token otherlv_24=null;
        EObject lv_fromTime_1_0 = null;

        EObject lv_toTime_3_0 = null;

        AntlrDatatypeRuleToken lv_sender_8_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_scope_12_0 = null;

        EObject lv_focus_14_0 = null;



        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:113:2: ( (otherlv_0= 'from' ( (lv_fromTime_1_0= ruleTime ) ) otherlv_2= 'to' ( (lv_toTime_3_0= ruleTime ) ) otherlv_4= 'annotate' otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_sender_8_0= ruleSender ) ) otherlv_9= ',' ( (lv_type_10_0= ruleMove ) ) otherlv_11= ',' ( (lv_scope_12_0= ruleScope ) ) otherlv_13= ',' ( (lv_focus_14_0= ruleFocus ) ) otherlv_15= ',' ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )? ( (lv_content_18_0= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= ')' (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )? ) )
            // InternalVideoAnnotationsDSL.g:114:2: (otherlv_0= 'from' ( (lv_fromTime_1_0= ruleTime ) ) otherlv_2= 'to' ( (lv_toTime_3_0= ruleTime ) ) otherlv_4= 'annotate' otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_sender_8_0= ruleSender ) ) otherlv_9= ',' ( (lv_type_10_0= ruleMove ) ) otherlv_11= ',' ( (lv_scope_12_0= ruleScope ) ) otherlv_13= ',' ( (lv_focus_14_0= ruleFocus ) ) otherlv_15= ',' ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )? ( (lv_content_18_0= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= ')' (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )? )
            {
            // InternalVideoAnnotationsDSL.g:114:2: (otherlv_0= 'from' ( (lv_fromTime_1_0= ruleTime ) ) otherlv_2= 'to' ( (lv_toTime_3_0= ruleTime ) ) otherlv_4= 'annotate' otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_sender_8_0= ruleSender ) ) otherlv_9= ',' ( (lv_type_10_0= ruleMove ) ) otherlv_11= ',' ( (lv_scope_12_0= ruleScope ) ) otherlv_13= ',' ( (lv_focus_14_0= ruleFocus ) ) otherlv_15= ',' ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )? ( (lv_content_18_0= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= ')' (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )? )
            // InternalVideoAnnotationsDSL.g:115:3: otherlv_0= 'from' ( (lv_fromTime_1_0= ruleTime ) ) otherlv_2= 'to' ( (lv_toTime_3_0= ruleTime ) ) otherlv_4= 'annotate' otherlv_5= '(' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_sender_8_0= ruleSender ) ) otherlv_9= ',' ( (lv_type_10_0= ruleMove ) ) otherlv_11= ',' ( (lv_scope_12_0= ruleScope ) ) otherlv_13= ',' ( (lv_focus_14_0= ruleFocus ) ) otherlv_15= ',' ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )? ( (lv_content_18_0= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )? otherlv_21= ')' (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getFromKeyword_0());
            		
            // InternalVideoAnnotationsDSL.g:119:3: ( (lv_fromTime_1_0= ruleTime ) )
            // InternalVideoAnnotationsDSL.g:120:4: (lv_fromTime_1_0= ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:120:4: (lv_fromTime_1_0= ruleTime )
            // InternalVideoAnnotationsDSL.g:121:5: lv_fromTime_1_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_fromTime_1_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"fromTime",
            						lv_fromTime_1_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getToKeyword_2());
            		
            // InternalVideoAnnotationsDSL.g:142:3: ( (lv_toTime_3_0= ruleTime ) )
            // InternalVideoAnnotationsDSL.g:143:4: (lv_toTime_3_0= ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:143:4: (lv_toTime_3_0= ruleTime )
            // InternalVideoAnnotationsDSL.g:144:5: lv_toTime_3_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_toTime_3_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"toTime",
            						lv_toTime_3_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getAnnotateKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5());
            		
            // InternalVideoAnnotationsDSL.g:169:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalVideoAnnotationsDSL.g:170:4: (lv_name_6_0= RULE_ID )
            {
            // InternalVideoAnnotationsDSL.g:170:4: (lv_name_6_0= RULE_ID )
            // InternalVideoAnnotationsDSL.g:171:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_6_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getCommaKeyword_7());
            		
            // InternalVideoAnnotationsDSL.g:191:3: ( (lv_sender_8_0= ruleSender ) )
            // InternalVideoAnnotationsDSL.g:192:4: (lv_sender_8_0= ruleSender )
            {
            // InternalVideoAnnotationsDSL.g:192:4: (lv_sender_8_0= ruleSender )
            // InternalVideoAnnotationsDSL.g:193:5: lv_sender_8_0= ruleSender
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_sender_8_0=ruleSender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"sender",
            						lv_sender_8_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Sender");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getCommaKeyword_9());
            		
            // InternalVideoAnnotationsDSL.g:214:3: ( (lv_type_10_0= ruleMove ) )
            // InternalVideoAnnotationsDSL.g:215:4: (lv_type_10_0= ruleMove )
            {
            // InternalVideoAnnotationsDSL.g:215:4: (lv_type_10_0= ruleMove )
            // InternalVideoAnnotationsDSL.g:216:5: lv_type_10_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_10_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_10_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getCommaKeyword_11());
            		
            // InternalVideoAnnotationsDSL.g:237:3: ( (lv_scope_12_0= ruleScope ) )
            // InternalVideoAnnotationsDSL.g:238:4: (lv_scope_12_0= ruleScope )
            {
            // InternalVideoAnnotationsDSL.g:238:4: (lv_scope_12_0= ruleScope )
            // InternalVideoAnnotationsDSL.g:239:5: lv_scope_12_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_scope_12_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_12_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getAnnotationAccess().getCommaKeyword_13());
            		
            // InternalVideoAnnotationsDSL.g:260:3: ( (lv_focus_14_0= ruleFocus ) )
            // InternalVideoAnnotationsDSL.g:261:4: (lv_focus_14_0= ruleFocus )
            {
            // InternalVideoAnnotationsDSL.g:261:4: (lv_focus_14_0= ruleFocus )
            // InternalVideoAnnotationsDSL.g:262:5: lv_focus_14_0= ruleFocus
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_focus_14_0=ruleFocus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"focus",
            						lv_focus_14_0,
            						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Focus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getAnnotationAccess().getCommaKeyword_15());
            		
            // InternalVideoAnnotationsDSL.g:283:3: ( ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_STRING) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:284:4: ( (lv_contentLabel_16_0= RULE_STRING ) ) otherlv_17= ','
                    {
                    // InternalVideoAnnotationsDSL.g:284:4: ( (lv_contentLabel_16_0= RULE_STRING ) )
                    // InternalVideoAnnotationsDSL.g:285:5: (lv_contentLabel_16_0= RULE_STRING )
                    {
                    // InternalVideoAnnotationsDSL.g:285:5: (lv_contentLabel_16_0= RULE_STRING )
                    // InternalVideoAnnotationsDSL.g:286:6: lv_contentLabel_16_0= RULE_STRING
                    {
                    lv_contentLabel_16_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_contentLabel_16_0, grammarAccess.getAnnotationAccess().getContentLabelSTRINGTerminalRuleCall_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"contentLabel",
                    							lv_contentLabel_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getCommaKeyword_16_1());
                    			

                    }
                    break;

            }

            // InternalVideoAnnotationsDSL.g:307:3: ( (lv_content_18_0= RULE_STRING ) )
            // InternalVideoAnnotationsDSL.g:308:4: (lv_content_18_0= RULE_STRING )
            {
            // InternalVideoAnnotationsDSL.g:308:4: (lv_content_18_0= RULE_STRING )
            // InternalVideoAnnotationsDSL.g:309:5: lv_content_18_0= RULE_STRING
            {
            lv_content_18_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_content_18_0, grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVideoAnnotationsDSL.g:325:3: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:326:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_19=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getAnnotationAccess().getCommaKeyword_18_0());
                    			
                    // InternalVideoAnnotationsDSL.g:330:4: ( (otherlv_20= RULE_ID ) )
                    // InternalVideoAnnotationsDSL.g:331:5: (otherlv_20= RULE_ID )
                    {
                    // InternalVideoAnnotationsDSL.g:331:5: (otherlv_20= RULE_ID )
                    // InternalVideoAnnotationsDSL.g:332:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_21, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19());
            		
            // InternalVideoAnnotationsDSL.g:348:3: (otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:349:4: otherlv_22= '#' ( (lv_comment_23_0= RULE_STRING ) ) otherlv_24= '#'
                    {
                    otherlv_22=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_0());
                    			
                    // InternalVideoAnnotationsDSL.g:353:4: ( (lv_comment_23_0= RULE_STRING ) )
                    // InternalVideoAnnotationsDSL.g:354:5: (lv_comment_23_0= RULE_STRING )
                    {
                    // InternalVideoAnnotationsDSL.g:354:5: (lv_comment_23_0= RULE_STRING )
                    // InternalVideoAnnotationsDSL.g:355:6: lv_comment_23_0= RULE_STRING
                    {
                    lv_comment_23_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_comment_23_0, grammarAccess.getAnnotationAccess().getCommentSTRINGTerminalRuleCall_20_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_23_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleSender"
    // InternalVideoAnnotationsDSL.g:380:1: entryRuleSender returns [String current=null] : iv_ruleSender= ruleSender EOF ;
    public final String entryRuleSender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSender = null;


        try {
            // InternalVideoAnnotationsDSL.g:380:46: (iv_ruleSender= ruleSender EOF )
            // InternalVideoAnnotationsDSL.g:381:2: iv_ruleSender= ruleSender EOF
            {
             newCompositeNode(grammarAccess.getSenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSender=ruleSender();

            state._fsp--;

             current =iv_ruleSender.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSender"


    // $ANTLR start "ruleSender"
    // InternalVideoAnnotationsDSL.g:387:1: ruleSender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleSender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:393:2: ( (this_INT_0= RULE_INT )+ )
            // InternalVideoAnnotationsDSL.g:394:2: (this_INT_0= RULE_INT )+
            {
            // InternalVideoAnnotationsDSL.g:394:2: (this_INT_0= RULE_INT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVideoAnnotationsDSL.g:395:3: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    			current.merge(this_INT_0);
            	    		

            	    			newLeafNode(this_INT_0, grammarAccess.getSenderAccess().getINTTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSender"


    // $ANTLR start "entryRuleMove"
    // InternalVideoAnnotationsDSL.g:406:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalVideoAnnotationsDSL.g:406:45: (iv_ruleMove= ruleMove EOF )
            // InternalVideoAnnotationsDSL.g:407:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalVideoAnnotationsDSL.g:413:1: ruleMove returns [EObject current=null] : ( ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;
        Token lv_type_0_8=null;
        Token lv_type_0_9=null;
        Token lv_type_0_10=null;
        Token lv_type_0_11=null;


        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:419:2: ( ( ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) ) ) )
            // InternalVideoAnnotationsDSL.g:420:2: ( ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) ) )
            {
            // InternalVideoAnnotationsDSL.g:420:2: ( ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) ) )
            // InternalVideoAnnotationsDSL.g:421:3: ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) )
            {
            // InternalVideoAnnotationsDSL.g:421:3: ( (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' ) )
            // InternalVideoAnnotationsDSL.g:422:4: (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' )
            {
            // InternalVideoAnnotationsDSL.g:422:4: (lv_type_0_1= 'propose' | lv_type_0_2= 'question' | lv_type_0_3= 'challenge' | lv_type_0_4= 'justify' | lv_type_0_5= 'withdraw' | lv_type_0_6= 'accept' | lv_type_0_7= 'reject' | lv_type_0_8= 'commit' | lv_type_0_9= 'counter' | lv_type_0_10= 'uncommit' | lv_type_0_11= 'other' )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            case 26:
                {
                alt6=9;
                }
                break;
            case 27:
                {
                alt6=10;
                }
                break;
            case 28:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:423:5: lv_type_0_1= 'propose'
                    {
                    lv_type_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:434:5: lv_type_0_2= 'question'
                    {
                    lv_type_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:445:5: lv_type_0_3= 'challenge'
                    {
                    lv_type_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:456:5: lv_type_0_4= 'justify'
                    {
                    lv_type_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalVideoAnnotationsDSL.g:467:5: lv_type_0_5= 'withdraw'
                    {
                    lv_type_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalVideoAnnotationsDSL.g:478:5: lv_type_0_6= 'accept'
                    {
                    lv_type_0_6=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalVideoAnnotationsDSL.g:489:5: lv_type_0_7= 'reject'
                    {
                    lv_type_0_7=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalVideoAnnotationsDSL.g:500:5: lv_type_0_8= 'commit'
                    {
                    lv_type_0_8=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_0_8, grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalVideoAnnotationsDSL.g:511:5: lv_type_0_9= 'counter'
                    {
                    lv_type_0_9=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_9, grammarAccess.getMoveAccess().getTypeCounterKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalVideoAnnotationsDSL.g:522:5: lv_type_0_10= 'uncommit'
                    {
                    lv_type_0_10=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_type_0_10, grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalVideoAnnotationsDSL.g:533:5: lv_type_0_11= 'other'
                    {
                    lv_type_0_11=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_11, grammarAccess.getMoveAccess().getTypeOtherKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_11, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleScope"
    // InternalVideoAnnotationsDSL.g:549:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalVideoAnnotationsDSL.g:549:46: (iv_ruleScope= ruleScope EOF )
            // InternalVideoAnnotationsDSL.g:550:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalVideoAnnotationsDSL.g:556:1: ruleScope returns [EObject current=null] : ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_scope_0_1=null;
        Token lv_scope_0_2=null;
        Token lv_scope_0_3=null;
        Token lv_scope_0_4=null;


        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:562:2: ( ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) ) )
            // InternalVideoAnnotationsDSL.g:563:2: ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) )
            {
            // InternalVideoAnnotationsDSL.g:563:2: ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) )
            // InternalVideoAnnotationsDSL.g:564:3: ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) )
            {
            // InternalVideoAnnotationsDSL.g:564:3: ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) )
            // InternalVideoAnnotationsDSL.g:565:4: (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' )
            {
            // InternalVideoAnnotationsDSL.g:565:4: (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:566:5: lv_scope_0_1= 'feature'
                    {
                    lv_scope_0_1=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_1, grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:577:5: lv_scope_0_2= 'rating'
                    {
                    lv_scope_0_2=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_2, grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:588:5: lv_scope_0_3= 'criteria'
                    {
                    lv_scope_0_3=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_3, grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:599:5: lv_scope_0_4= 'topic'
                    {
                    lv_scope_0_4=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_4, grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleFocus"
    // InternalVideoAnnotationsDSL.g:615:1: entryRuleFocus returns [EObject current=null] : iv_ruleFocus= ruleFocus EOF ;
    public final EObject entryRuleFocus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocus = null;


        try {
            // InternalVideoAnnotationsDSL.g:615:46: (iv_ruleFocus= ruleFocus EOF )
            // InternalVideoAnnotationsDSL.g:616:2: iv_ruleFocus= ruleFocus EOF
            {
             newCompositeNode(grammarAccess.getFocusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFocus=ruleFocus();

            state._fsp--;

             current =iv_ruleFocus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFocus"


    // $ANTLR start "ruleFocus"
    // InternalVideoAnnotationsDSL.g:622:1: ruleFocus returns [EObject current=null] : ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) ) ;
    public final EObject ruleFocus() throws RecognitionException {
        EObject current = null;

        Token lv_focus_0_1=null;
        Token lv_focus_0_2=null;
        Token lv_focus_0_3=null;
        Token lv_focus_0_4=null;
        Token lv_focus_0_5=null;


        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:628:2: ( ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) ) )
            // InternalVideoAnnotationsDSL.g:629:2: ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) )
            {
            // InternalVideoAnnotationsDSL.g:629:2: ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) )
            // InternalVideoAnnotationsDSL.g:630:3: ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) )
            {
            // InternalVideoAnnotationsDSL.g:630:3: ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) )
            // InternalVideoAnnotationsDSL.g:631:4: (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' )
            {
            // InternalVideoAnnotationsDSL.g:631:4: (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:632:5: lv_focus_0_1= 'R'
                    {
                    lv_focus_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_1, grammarAccess.getFocusAccess().getFocusRKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:643:5: lv_focus_0_2= 'S'
                    {
                    lv_focus_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_2, grammarAccess.getFocusAccess().getFocusSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:654:5: lv_focus_0_3= 'G'
                    {
                    lv_focus_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_3, grammarAccess.getFocusAccess().getFocusGKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:665:5: lv_focus_0_4= 'V'
                    {
                    lv_focus_0_4=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_4, grammarAccess.getFocusAccess().getFocusVKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalVideoAnnotationsDSL.g:676:5: lv_focus_0_5= 'A'
                    {
                    lv_focus_0_5=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_5, grammarAccess.getFocusAccess().getFocusAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFocus"


    // $ANTLR start "entryRuleTime"
    // InternalVideoAnnotationsDSL.g:692:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalVideoAnnotationsDSL.g:692:45: (iv_ruleTime= ruleTime EOF )
            // InternalVideoAnnotationsDSL.g:693:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalVideoAnnotationsDSL.g:699:1: ruleTime returns [EObject current=null] : ( (lv_sec_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_sec_0_0=null;


        	enterRule();

        try {
            // InternalVideoAnnotationsDSL.g:705:2: ( ( (lv_sec_0_0= RULE_INT ) ) )
            // InternalVideoAnnotationsDSL.g:706:2: ( (lv_sec_0_0= RULE_INT ) )
            {
            // InternalVideoAnnotationsDSL.g:706:2: ( (lv_sec_0_0= RULE_INT ) )
            // InternalVideoAnnotationsDSL.g:707:3: (lv_sec_0_0= RULE_INT )
            {
            // InternalVideoAnnotationsDSL.g:707:3: (lv_sec_0_0= RULE_INT )
            // InternalVideoAnnotationsDSL.g:708:4: lv_sec_0_0= RULE_INT
            {
            lv_sec_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_sec_0_0, grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTimeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"sec",
            					lv_sec_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001FFC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});

}