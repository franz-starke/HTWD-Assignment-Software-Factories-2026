package de.htwdd.sf.beleg.s86320.s86372.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.beleg.s86320.s86372.services.BelegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBelegParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "','", "'m\\u00F6chte'", "'ich'", "'als'", "'.'", "'zu'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_WORT=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalBelegParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBelegParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBelegParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBeleg.g"; }



     	private BelegGrammarAccess grammarAccess;

        public InternalBelegParser(TokenStream input, BelegGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BelegGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBeleg.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBeleg.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBeleg.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBeleg.g:71:1: ruleModel returns [EObject current=null] : ( (lv_story_0_0= ruleUser_Story_Um ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_story_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:77:2: ( ( (lv_story_0_0= ruleUser_Story_Um ) )* )
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleUser_Story_Um ) )*
            {
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleUser_Story_Um ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBeleg.g:79:3: (lv_story_0_0= ruleUser_Story_Um )
            	    {
            	    // InternalBeleg.g:79:3: (lv_story_0_0= ruleUser_Story_Um )
            	    // InternalBeleg.g:80:4: lv_story_0_0= ruleUser_Story_Um
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStoryUser_Story_UmParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_story_0_0=ruleUser_Story_Um();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"story",
            	    					lv_story_0_0,
            	    					"de.htwdd.sf.beleg.s86320.s86372.Beleg.User_Story_Um");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUser_Story_Um"
    // InternalBeleg.g:100:1: entryRuleUser_Story_Um returns [EObject current=null] : iv_ruleUser_Story_Um= ruleUser_Story_Um EOF ;
    public final EObject entryRuleUser_Story_Um() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser_Story_Um = null;


        try {
            // InternalBeleg.g:100:54: (iv_ruleUser_Story_Um= ruleUser_Story_Um EOF )
            // InternalBeleg.g:101:2: iv_ruleUser_Story_Um= ruleUser_Story_Um EOF
            {
             newCompositeNode(grammarAccess.getUser_Story_UmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser_Story_Um=ruleUser_Story_Um();

            state._fsp--;

             current =iv_ruleUser_Story_Um; 
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
    // $ANTLR end "entryRuleUser_Story_Um"


    // $ANTLR start "ruleUser_Story_Um"
    // InternalBeleg.g:107:1: ruleUser_Story_Um returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_use_3_0= ruleNutzen ) ) otherlv_4= ',' otherlv_5= 'm\\u00F6chte' otherlv_6= 'ich' otherlv_7= 'als' ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) otherlv_10= '.' ) ;
    public final EObject ruleUser_Story_Um() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_title_0_0 = null;

        EObject lv_use_3_0 = null;

        EObject lv_role_8_0 = null;

        EObject lv_goal_9_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:113:2: ( ( ( (lv_title_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_use_3_0= ruleNutzen ) ) otherlv_4= ',' otherlv_5= 'm\\u00F6chte' otherlv_6= 'ich' otherlv_7= 'als' ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) otherlv_10= '.' ) )
            // InternalBeleg.g:114:2: ( ( (lv_title_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_use_3_0= ruleNutzen ) ) otherlv_4= ',' otherlv_5= 'm\\u00F6chte' otherlv_6= 'ich' otherlv_7= 'als' ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) otherlv_10= '.' )
            {
            // InternalBeleg.g:114:2: ( ( (lv_title_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_use_3_0= ruleNutzen ) ) otherlv_4= ',' otherlv_5= 'm\\u00F6chte' otherlv_6= 'ich' otherlv_7= 'als' ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) otherlv_10= '.' )
            // InternalBeleg.g:115:3: ( (lv_title_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_use_3_0= ruleNutzen ) ) otherlv_4= ',' otherlv_5= 'm\\u00F6chte' otherlv_6= 'ich' otherlv_7= 'als' ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) otherlv_10= '.'
            {
            // InternalBeleg.g:115:3: ( (lv_title_0_0= ruleTitel ) )
            // InternalBeleg.g:116:4: (lv_title_0_0= ruleTitel )
            {
            // InternalBeleg.g:116:4: (lv_title_0_0= ruleTitel )
            // InternalBeleg.g:117:5: lv_title_0_0= ruleTitel
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getTitleTitelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_0_0=ruleTitel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Titel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUser_Story_UmAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUser_Story_UmAccess().getUmKeyword_2());
            		
            // InternalBeleg.g:142:3: ( (lv_use_3_0= ruleNutzen ) )
            // InternalBeleg.g:143:4: (lv_use_3_0= ruleNutzen )
            {
            // InternalBeleg.g:143:4: (lv_use_3_0= ruleNutzen )
            // InternalBeleg.g:144:5: lv_use_3_0= ruleNutzen
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getUseNutzenParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_use_3_0=ruleNutzen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"use",
            						lv_use_3_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUser_Story_UmAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getUser_Story_UmAccess().getMöchteKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getUser_Story_UmAccess().getIchKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getUser_Story_UmAccess().getAlsKeyword_7());
            		
            // InternalBeleg.g:177:3: ( (lv_role_8_0= ruleRolle ) )
            // InternalBeleg.g:178:4: (lv_role_8_0= ruleRolle )
            {
            // InternalBeleg.g:178:4: (lv_role_8_0= ruleRolle )
            // InternalBeleg.g:179:5: lv_role_8_0= ruleRolle
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getRoleRolleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_role_8_0=ruleRolle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"role",
            						lv_role_8_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Rolle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:196:3: ( (lv_goal_9_0= ruleZiel ) )
            // InternalBeleg.g:197:4: (lv_goal_9_0= ruleZiel )
            {
            // InternalBeleg.g:197:4: (lv_goal_9_0= ruleZiel )
            // InternalBeleg.g:198:5: lv_goal_9_0= ruleZiel
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getGoalZielParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_goal_9_0=ruleZiel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_9_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Ziel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUser_Story_UmAccess().getFullStopKeyword_10());
            		

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
    // $ANTLR end "ruleUser_Story_Um"


    // $ANTLR start "entryRuleTitel"
    // InternalBeleg.g:223:1: entryRuleTitel returns [EObject current=null] : iv_ruleTitel= ruleTitel EOF ;
    public final EObject entryRuleTitel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitel = null;


        try {
            // InternalBeleg.g:223:46: (iv_ruleTitel= ruleTitel EOF )
            // InternalBeleg.g:224:2: iv_ruleTitel= ruleTitel EOF
            {
             newCompositeNode(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitel=ruleTitel();

            state._fsp--;

             current =iv_ruleTitel; 
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
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalBeleg.g:230:1: ruleTitel returns [EObject current=null] : ( (lv_textpart_0_0= ruleText ) )+ ;
    public final EObject ruleTitel() throws RecognitionException {
        EObject current = null;

        EObject lv_textpart_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:236:2: ( ( (lv_textpart_0_0= ruleText ) )+ )
            // InternalBeleg.g:237:2: ( (lv_textpart_0_0= ruleText ) )+
            {
            // InternalBeleg.g:237:2: ( (lv_textpart_0_0= ruleText ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBeleg.g:238:3: (lv_textpart_0_0= ruleText )
            	    {
            	    // InternalBeleg.g:238:3: (lv_textpart_0_0= ruleText )
            	    // InternalBeleg.g:239:4: lv_textpart_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getTitelAccess().getTextpartTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_textpart_0_0=ruleText();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTitelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"textpart",
            	    					lv_textpart_0_0,
            	    					"de.htwdd.sf.beleg.s86320.s86372.Beleg.Text");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleText"
    // InternalBeleg.g:259:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalBeleg.g:259:45: (iv_ruleText= ruleText EOF )
            // InternalBeleg.g:260:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalBeleg.g:266:1: ruleText returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:272:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:273:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:273:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:274:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:274:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:275:4: lv_value_0_0= RULE_WORT
            {
            lv_value_0_0=(Token)match(input,RULE_WORT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getTextAccess().getValueWORTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.htwdd.sf.beleg.s86320.s86372.Beleg.WORT");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNutzen"
    // InternalBeleg.g:294:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalBeleg.g:294:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalBeleg.g:295:2: iv_ruleNutzen= ruleNutzen EOF
            {
             newCompositeNode(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutzen=ruleNutzen();

            state._fsp--;

             current =iv_ruleNutzen; 
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
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalBeleg.g:301:1: ruleNutzen returns [EObject current=null] : ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zuBlock_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;

        AntlrDatatypeRuleToken lv_zuBlock_1_0 = null;

        EObject lv_infinit_2_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:307:2: ( ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zuBlock_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ ) )
            // InternalBeleg.g:308:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zuBlock_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ )
            {
            // InternalBeleg.g:308:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zuBlock_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ )
            // InternalBeleg.g:309:3: ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zuBlock_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+
            {
            // InternalBeleg.g:309:3: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:310:4: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:310:4: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:311:5: lv_subst_0_0= ruleSubstantiv
            {

            					newCompositeNode(grammarAccess.getNutzenAccess().getSubstSubstantivParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_subst_0_0=ruleSubstantiv();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutzenRule());
            					}
            					set(
            						current,
            						"subst",
            						lv_subst_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Substantiv");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:328:3: ( (lv_zuBlock_1_0= ruleZuBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBeleg.g:329:4: (lv_zuBlock_1_0= ruleZuBlock )
                    {
                    // InternalBeleg.g:329:4: (lv_zuBlock_1_0= ruleZuBlock )
                    // InternalBeleg.g:330:5: lv_zuBlock_1_0= ruleZuBlock
                    {

                    					newCompositeNode(grammarAccess.getNutzenAccess().getZuBlockZuBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_zuBlock_1_0=ruleZuBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNutzenRule());
                    					}
                    					set(
                    						current,
                    						"zuBlock",
                    						lv_zuBlock_1_0,
                    						"de.htwdd.sf.beleg.s86320.s86372.Beleg.ZuBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBeleg.g:347:3: ( (lv_infinit_2_0= ruleInfinit ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WORT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBeleg.g:348:4: (lv_infinit_2_0= ruleInfinit )
            	    {
            	    // InternalBeleg.g:348:4: (lv_infinit_2_0= ruleInfinit )
            	    // InternalBeleg.g:349:5: lv_infinit_2_0= ruleInfinit
            	    {

            	    					newCompositeNode(grammarAccess.getNutzenAccess().getInfinitInfinitParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_infinit_2_0=ruleInfinit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNutzenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"infinit",
            	    						lv_infinit_2_0,
            	    						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Infinit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "entryRuleZuBlock"
    // InternalBeleg.g:370:1: entryRuleZuBlock returns [String current=null] : iv_ruleZuBlock= ruleZuBlock EOF ;
    public final String entryRuleZuBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleZuBlock = null;


        try {
            // InternalBeleg.g:370:47: (iv_ruleZuBlock= ruleZuBlock EOF )
            // InternalBeleg.g:371:2: iv_ruleZuBlock= ruleZuBlock EOF
            {
             newCompositeNode(grammarAccess.getZuBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZuBlock=ruleZuBlock();

            state._fsp--;

             current =iv_ruleZuBlock.getText(); 
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
    // $ANTLR end "entryRuleZuBlock"


    // $ANTLR start "ruleZuBlock"
    // InternalBeleg.g:377:1: ruleZuBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'zu' ;
    public final AntlrDatatypeRuleToken ruleZuBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBeleg.g:383:2: (kw= 'zu' )
            // InternalBeleg.g:384:2: kw= 'zu'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getZuBlockAccess().getZuKeyword());
            	

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
    // $ANTLR end "ruleZuBlock"


    // $ANTLR start "entryRuleRolle"
    // InternalBeleg.g:392:1: entryRuleRolle returns [EObject current=null] : iv_ruleRolle= ruleRolle EOF ;
    public final EObject entryRuleRolle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolle = null;


        try {
            // InternalBeleg.g:392:46: (iv_ruleRolle= ruleRolle EOF )
            // InternalBeleg.g:393:2: iv_ruleRolle= ruleRolle EOF
            {
             newCompositeNode(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolle=ruleRolle();

            state._fsp--;

             current =iv_ruleRolle; 
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
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalBeleg.g:399:1: ruleRolle returns [EObject current=null] : ( (lv_subst_0_0= ruleSubstantiv ) ) ;
    public final EObject ruleRolle() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:405:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) )
            // InternalBeleg.g:406:2: ( (lv_subst_0_0= ruleSubstantiv ) )
            {
            // InternalBeleg.g:406:2: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:407:3: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:407:3: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:408:4: lv_subst_0_0= ruleSubstantiv
            {

            				newCompositeNode(grammarAccess.getRolleAccess().getSubstSubstantivParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_subst_0_0=ruleSubstantiv();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRolleRule());
            				}
            				set(
            					current,
            					"subst",
            					lv_subst_0_0,
            					"de.htwdd.sf.beleg.s86320.s86372.Beleg.Substantiv");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalBeleg.g:428:1: entryRuleZiel returns [EObject current=null] : iv_ruleZiel= ruleZiel EOF ;
    public final EObject entryRuleZiel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZiel = null;


        try {
            // InternalBeleg.g:428:45: (iv_ruleZiel= ruleZiel EOF )
            // InternalBeleg.g:429:2: iv_ruleZiel= ruleZiel EOF
            {
             newCompositeNode(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZiel=ruleZiel();

            state._fsp--;

             current =iv_ruleZiel; 
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
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalBeleg.g:435:1: ruleZiel returns [EObject current=null] : ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ ) ;
    public final EObject ruleZiel() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;

        EObject lv_infinit_1_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:441:2: ( ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ ) )
            // InternalBeleg.g:442:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ )
            {
            // InternalBeleg.g:442:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ )
            // InternalBeleg.g:443:3: ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+
            {
            // InternalBeleg.g:443:3: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:444:4: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:444:4: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:445:5: lv_subst_0_0= ruleSubstantiv
            {

            					newCompositeNode(grammarAccess.getZielAccess().getSubstSubstantivParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_subst_0_0=ruleSubstantiv();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZielRule());
            					}
            					set(
            						current,
            						"subst",
            						lv_subst_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Substantiv");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:462:3: ( (lv_infinit_1_0= ruleInfinit ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WORT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBeleg.g:463:4: (lv_infinit_1_0= ruleInfinit )
            	    {
            	    // InternalBeleg.g:463:4: (lv_infinit_1_0= ruleInfinit )
            	    // InternalBeleg.g:464:5: lv_infinit_1_0= ruleInfinit
            	    {

            	    					newCompositeNode(grammarAccess.getZielAccess().getInfinitInfinitParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_infinit_1_0=ruleInfinit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getZielRule());
            	    					}
            	    					add(
            	    						current,
            	    						"infinit",
            	    						lv_infinit_1_0,
            	    						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Infinit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleSubstantiv"
    // InternalBeleg.g:485:1: entryRuleSubstantiv returns [EObject current=null] : iv_ruleSubstantiv= ruleSubstantiv EOF ;
    public final EObject entryRuleSubstantiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstantiv = null;


        try {
            // InternalBeleg.g:485:51: (iv_ruleSubstantiv= ruleSubstantiv EOF )
            // InternalBeleg.g:486:2: iv_ruleSubstantiv= ruleSubstantiv EOF
            {
             newCompositeNode(grammarAccess.getSubstantivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstantiv=ruleSubstantiv();

            state._fsp--;

             current =iv_ruleSubstantiv; 
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
    // $ANTLR end "entryRuleSubstantiv"


    // $ANTLR start "ruleSubstantiv"
    // InternalBeleg.g:492:1: ruleSubstantiv returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleSubstantiv() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:498:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:499:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:499:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:500:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:500:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:501:4: lv_value_0_0= RULE_WORT
            {
            lv_value_0_0=(Token)match(input,RULE_WORT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getSubstantivAccess().getValueWORTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubstantivRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.htwdd.sf.beleg.s86320.s86372.Beleg.WORT");
            			

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
    // $ANTLR end "ruleSubstantiv"


    // $ANTLR start "entryRuleInfinit"
    // InternalBeleg.g:520:1: entryRuleInfinit returns [EObject current=null] : iv_ruleInfinit= ruleInfinit EOF ;
    public final EObject entryRuleInfinit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinit = null;


        try {
            // InternalBeleg.g:520:48: (iv_ruleInfinit= ruleInfinit EOF )
            // InternalBeleg.g:521:2: iv_ruleInfinit= ruleInfinit EOF
            {
             newCompositeNode(grammarAccess.getInfinitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfinit=ruleInfinit();

            state._fsp--;

             current =iv_ruleInfinit; 
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
    // $ANTLR end "entryRuleInfinit"


    // $ANTLR start "ruleInfinit"
    // InternalBeleg.g:527:1: ruleInfinit returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleInfinit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:533:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:534:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:534:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:535:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:535:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:536:4: lv_value_0_0= RULE_WORT
            {
            lv_value_0_0=(Token)match(input,RULE_WORT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getInfinitAccess().getValueWORTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInfinitRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.htwdd.sf.beleg.s86320.s86372.Beleg.WORT");
            			

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
    // $ANTLR end "ruleInfinit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080012L});

}