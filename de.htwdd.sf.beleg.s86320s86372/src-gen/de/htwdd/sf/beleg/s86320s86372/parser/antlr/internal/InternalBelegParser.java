package de.htwdd.sf.beleg.s86320s86372.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.beleg.s86320s86372.services.BelegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBelegParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "','", "'zu'", "'m\\u00F6chte'", "'ich'", "'als'", "'.'"
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
    // InternalBeleg.g:71:1: ruleModel returns [EObject current=null] : ( (lv_story_0_0= ruleUser_Story_Um ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_story_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:77:2: ( ( (lv_story_0_0= ruleUser_Story_Um ) )+ )
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleUser_Story_Um ) )+
            {
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleUser_Story_Um ) )+
            int cnt1=0;
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
            	    					"de.htwdd.sf.beleg.s86320s86372.Beleg.User_Story_Um");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // InternalBeleg.g:107:1: ruleUser_Story_Um returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitel ) ) ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) ) ( (lv_um_2_0= ruleUmBlock ) ) ( (lv_use_3_0= ruleNutzen ) ) ( (lv_komma_4_0= ruleKommaBlock ) ) ( (lv_moechte_5_0= ruleMoechteBlock ) ) ( (lv_ich_6_0= ruleIchBlock ) ) ( (lv_als_7_0= ruleAlsBlock ) ) ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) ( (lv_punkt_10_0= rulePunktBlock ) ) ) ;
    public final EObject ruleUser_Story_Um() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_doppelpunkt_1_0 = null;

        EObject lv_um_2_0 = null;

        EObject lv_use_3_0 = null;

        EObject lv_komma_4_0 = null;

        EObject lv_moechte_5_0 = null;

        EObject lv_ich_6_0 = null;

        EObject lv_als_7_0 = null;

        EObject lv_role_8_0 = null;

        EObject lv_goal_9_0 = null;

        EObject lv_punkt_10_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:113:2: ( ( ( (lv_title_0_0= ruleTitel ) ) ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) ) ( (lv_um_2_0= ruleUmBlock ) ) ( (lv_use_3_0= ruleNutzen ) ) ( (lv_komma_4_0= ruleKommaBlock ) ) ( (lv_moechte_5_0= ruleMoechteBlock ) ) ( (lv_ich_6_0= ruleIchBlock ) ) ( (lv_als_7_0= ruleAlsBlock ) ) ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) ( (lv_punkt_10_0= rulePunktBlock ) ) ) )
            // InternalBeleg.g:114:2: ( ( (lv_title_0_0= ruleTitel ) ) ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) ) ( (lv_um_2_0= ruleUmBlock ) ) ( (lv_use_3_0= ruleNutzen ) ) ( (lv_komma_4_0= ruleKommaBlock ) ) ( (lv_moechte_5_0= ruleMoechteBlock ) ) ( (lv_ich_6_0= ruleIchBlock ) ) ( (lv_als_7_0= ruleAlsBlock ) ) ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) ( (lv_punkt_10_0= rulePunktBlock ) ) )
            {
            // InternalBeleg.g:114:2: ( ( (lv_title_0_0= ruleTitel ) ) ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) ) ( (lv_um_2_0= ruleUmBlock ) ) ( (lv_use_3_0= ruleNutzen ) ) ( (lv_komma_4_0= ruleKommaBlock ) ) ( (lv_moechte_5_0= ruleMoechteBlock ) ) ( (lv_ich_6_0= ruleIchBlock ) ) ( (lv_als_7_0= ruleAlsBlock ) ) ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) ( (lv_punkt_10_0= rulePunktBlock ) ) )
            // InternalBeleg.g:115:3: ( (lv_title_0_0= ruleTitel ) ) ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) ) ( (lv_um_2_0= ruleUmBlock ) ) ( (lv_use_3_0= ruleNutzen ) ) ( (lv_komma_4_0= ruleKommaBlock ) ) ( (lv_moechte_5_0= ruleMoechteBlock ) ) ( (lv_ich_6_0= ruleIchBlock ) ) ( (lv_als_7_0= ruleAlsBlock ) ) ( (lv_role_8_0= ruleRolle ) ) ( (lv_goal_9_0= ruleZiel ) ) ( (lv_punkt_10_0= rulePunktBlock ) )
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Titel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:134:3: ( (lv_doppelpunkt_1_0= ruleDoppelPunktBlock ) )
            // InternalBeleg.g:135:4: (lv_doppelpunkt_1_0= ruleDoppelPunktBlock )
            {
            // InternalBeleg.g:135:4: (lv_doppelpunkt_1_0= ruleDoppelPunktBlock )
            // InternalBeleg.g:136:5: lv_doppelpunkt_1_0= ruleDoppelPunktBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getDoppelpunktDoppelPunktBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_doppelpunkt_1_0=ruleDoppelPunktBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"doppelpunkt",
            						lv_doppelpunkt_1_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.DoppelPunktBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:153:3: ( (lv_um_2_0= ruleUmBlock ) )
            // InternalBeleg.g:154:4: (lv_um_2_0= ruleUmBlock )
            {
            // InternalBeleg.g:154:4: (lv_um_2_0= ruleUmBlock )
            // InternalBeleg.g:155:5: lv_um_2_0= ruleUmBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getUmUmBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_um_2_0=ruleUmBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"um",
            						lv_um_2_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.UmBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:172:3: ( (lv_use_3_0= ruleNutzen ) )
            // InternalBeleg.g:173:4: (lv_use_3_0= ruleNutzen )
            {
            // InternalBeleg.g:173:4: (lv_use_3_0= ruleNutzen )
            // InternalBeleg.g:174:5: lv_use_3_0= ruleNutzen
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:191:3: ( (lv_komma_4_0= ruleKommaBlock ) )
            // InternalBeleg.g:192:4: (lv_komma_4_0= ruleKommaBlock )
            {
            // InternalBeleg.g:192:4: (lv_komma_4_0= ruleKommaBlock )
            // InternalBeleg.g:193:5: lv_komma_4_0= ruleKommaBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getKommaKommaBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_komma_4_0=ruleKommaBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"komma",
            						lv_komma_4_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.KommaBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:210:3: ( (lv_moechte_5_0= ruleMoechteBlock ) )
            // InternalBeleg.g:211:4: (lv_moechte_5_0= ruleMoechteBlock )
            {
            // InternalBeleg.g:211:4: (lv_moechte_5_0= ruleMoechteBlock )
            // InternalBeleg.g:212:5: lv_moechte_5_0= ruleMoechteBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getMoechteMoechteBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_moechte_5_0=ruleMoechteBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"moechte",
            						lv_moechte_5_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.MoechteBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:229:3: ( (lv_ich_6_0= ruleIchBlock ) )
            // InternalBeleg.g:230:4: (lv_ich_6_0= ruleIchBlock )
            {
            // InternalBeleg.g:230:4: (lv_ich_6_0= ruleIchBlock )
            // InternalBeleg.g:231:5: lv_ich_6_0= ruleIchBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getIchIchBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_ich_6_0=ruleIchBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"ich",
            						lv_ich_6_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.IchBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:248:3: ( (lv_als_7_0= ruleAlsBlock ) )
            // InternalBeleg.g:249:4: (lv_als_7_0= ruleAlsBlock )
            {
            // InternalBeleg.g:249:4: (lv_als_7_0= ruleAlsBlock )
            // InternalBeleg.g:250:5: lv_als_7_0= ruleAlsBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getAlsAlsBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
            lv_als_7_0=ruleAlsBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"als",
            						lv_als_7_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.AlsBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:267:3: ( (lv_role_8_0= ruleRolle ) )
            // InternalBeleg.g:268:4: (lv_role_8_0= ruleRolle )
            {
            // InternalBeleg.g:268:4: (lv_role_8_0= ruleRolle )
            // InternalBeleg.g:269:5: lv_role_8_0= ruleRolle
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Rolle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:286:3: ( (lv_goal_9_0= ruleZiel ) )
            // InternalBeleg.g:287:4: (lv_goal_9_0= ruleZiel )
            {
            // InternalBeleg.g:287:4: (lv_goal_9_0= ruleZiel )
            // InternalBeleg.g:288:5: lv_goal_9_0= ruleZiel
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Ziel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:305:3: ( (lv_punkt_10_0= rulePunktBlock ) )
            // InternalBeleg.g:306:4: (lv_punkt_10_0= rulePunktBlock )
            {
            // InternalBeleg.g:306:4: (lv_punkt_10_0= rulePunktBlock )
            // InternalBeleg.g:307:5: lv_punkt_10_0= rulePunktBlock
            {

            					newCompositeNode(grammarAccess.getUser_Story_UmAccess().getPunktPunktBlockParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_punkt_10_0=rulePunktBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_Story_UmRule());
            					}
            					set(
            						current,
            						"punkt",
            						lv_punkt_10_0,
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.PunktBlock");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleUser_Story_Um"


    // $ANTLR start "entryRuleTitel"
    // InternalBeleg.g:328:1: entryRuleTitel returns [EObject current=null] : iv_ruleTitel= ruleTitel EOF ;
    public final EObject entryRuleTitel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitel = null;


        try {
            // InternalBeleg.g:328:46: (iv_ruleTitel= ruleTitel EOF )
            // InternalBeleg.g:329:2: iv_ruleTitel= ruleTitel EOF
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
    // InternalBeleg.g:335:1: ruleTitel returns [EObject current=null] : ( (lv_textpart_0_0= ruleText ) )+ ;
    public final EObject ruleTitel() throws RecognitionException {
        EObject current = null;

        EObject lv_textpart_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:341:2: ( ( (lv_textpart_0_0= ruleText ) )+ )
            // InternalBeleg.g:342:2: ( (lv_textpart_0_0= ruleText ) )+
            {
            // InternalBeleg.g:342:2: ( (lv_textpart_0_0= ruleText ) )+
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
            	    // InternalBeleg.g:343:3: (lv_textpart_0_0= ruleText )
            	    {
            	    // InternalBeleg.g:343:3: (lv_textpart_0_0= ruleText )
            	    // InternalBeleg.g:344:4: lv_textpart_0_0= ruleText
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
            	    					"de.htwdd.sf.beleg.s86320s86372.Beleg.Text");
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
    // InternalBeleg.g:364:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalBeleg.g:364:45: (iv_ruleText= ruleText EOF )
            // InternalBeleg.g:365:2: iv_ruleText= ruleText EOF
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
    // InternalBeleg.g:371:1: ruleText returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:377:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:378:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:378:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:379:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:379:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:380:4: lv_value_0_0= RULE_WORT
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
            					"de.htwdd.sf.beleg.s86320s86372.Beleg.WORT");
            			

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
    // InternalBeleg.g:399:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalBeleg.g:399:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalBeleg.g:400:2: iv_ruleNutzen= ruleNutzen EOF
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
    // InternalBeleg.g:406:1: ruleNutzen returns [EObject current=null] : ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zu_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;

        EObject lv_zu_1_0 = null;

        EObject lv_infinit_2_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:412:2: ( ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zu_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ ) )
            // InternalBeleg.g:413:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zu_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ )
            {
            // InternalBeleg.g:413:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zu_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+ )
            // InternalBeleg.g:414:3: ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_zu_1_0= ruleZuBlock ) )? ( (lv_infinit_2_0= ruleInfinit ) )+
            {
            // InternalBeleg.g:414:3: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:415:4: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:415:4: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:416:5: lv_subst_0_0= ruleSubstantiv
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Substantiv");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:433:3: ( (lv_zu_1_0= ruleZuBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBeleg.g:434:4: (lv_zu_1_0= ruleZuBlock )
                    {
                    // InternalBeleg.g:434:4: (lv_zu_1_0= ruleZuBlock )
                    // InternalBeleg.g:435:5: lv_zu_1_0= ruleZuBlock
                    {

                    					newCompositeNode(grammarAccess.getNutzenAccess().getZuZuBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_zu_1_0=ruleZuBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNutzenRule());
                    					}
                    					set(
                    						current,
                    						"zu",
                    						lv_zu_1_0,
                    						"de.htwdd.sf.beleg.s86320s86372.Beleg.ZuBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBeleg.g:452:3: ( (lv_infinit_2_0= ruleInfinit ) )+
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
            	    // InternalBeleg.g:453:4: (lv_infinit_2_0= ruleInfinit )
            	    {
            	    // InternalBeleg.g:453:4: (lv_infinit_2_0= ruleInfinit )
            	    // InternalBeleg.g:454:5: lv_infinit_2_0= ruleInfinit
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
            	    						"de.htwdd.sf.beleg.s86320s86372.Beleg.Infinit");
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


    // $ANTLR start "entryRuleRolle"
    // InternalBeleg.g:475:1: entryRuleRolle returns [EObject current=null] : iv_ruleRolle= ruleRolle EOF ;
    public final EObject entryRuleRolle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolle = null;


        try {
            // InternalBeleg.g:475:46: (iv_ruleRolle= ruleRolle EOF )
            // InternalBeleg.g:476:2: iv_ruleRolle= ruleRolle EOF
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
    // InternalBeleg.g:482:1: ruleRolle returns [EObject current=null] : ( (lv_subst_0_0= ruleSubstantiv ) ) ;
    public final EObject ruleRolle() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:488:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) )
            // InternalBeleg.g:489:2: ( (lv_subst_0_0= ruleSubstantiv ) )
            {
            // InternalBeleg.g:489:2: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:490:3: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:490:3: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:491:4: lv_subst_0_0= ruleSubstantiv
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
            					"de.htwdd.sf.beleg.s86320s86372.Beleg.Substantiv");
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
    // InternalBeleg.g:511:1: entryRuleZiel returns [EObject current=null] : iv_ruleZiel= ruleZiel EOF ;
    public final EObject entryRuleZiel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZiel = null;


        try {
            // InternalBeleg.g:511:45: (iv_ruleZiel= ruleZiel EOF )
            // InternalBeleg.g:512:2: iv_ruleZiel= ruleZiel EOF
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
    // InternalBeleg.g:518:1: ruleZiel returns [EObject current=null] : ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ ) ;
    public final EObject ruleZiel() throws RecognitionException {
        EObject current = null;

        EObject lv_subst_0_0 = null;

        EObject lv_infinit_1_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:524:2: ( ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ ) )
            // InternalBeleg.g:525:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ )
            {
            // InternalBeleg.g:525:2: ( ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+ )
            // InternalBeleg.g:526:3: ( (lv_subst_0_0= ruleSubstantiv ) ) ( (lv_infinit_1_0= ruleInfinit ) )+
            {
            // InternalBeleg.g:526:3: ( (lv_subst_0_0= ruleSubstantiv ) )
            // InternalBeleg.g:527:4: (lv_subst_0_0= ruleSubstantiv )
            {
            // InternalBeleg.g:527:4: (lv_subst_0_0= ruleSubstantiv )
            // InternalBeleg.g:528:5: lv_subst_0_0= ruleSubstantiv
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
            						"de.htwdd.sf.beleg.s86320s86372.Beleg.Substantiv");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:545:3: ( (lv_infinit_1_0= ruleInfinit ) )+
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
            	    // InternalBeleg.g:546:4: (lv_infinit_1_0= ruleInfinit )
            	    {
            	    // InternalBeleg.g:546:4: (lv_infinit_1_0= ruleInfinit )
            	    // InternalBeleg.g:547:5: lv_infinit_1_0= ruleInfinit
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
            	    						"de.htwdd.sf.beleg.s86320s86372.Beleg.Infinit");
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


    // $ANTLR start "entryRuleDoppelPunktBlock"
    // InternalBeleg.g:568:1: entryRuleDoppelPunktBlock returns [EObject current=null] : iv_ruleDoppelPunktBlock= ruleDoppelPunktBlock EOF ;
    public final EObject entryRuleDoppelPunktBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoppelPunktBlock = null;


        try {
            // InternalBeleg.g:568:57: (iv_ruleDoppelPunktBlock= ruleDoppelPunktBlock EOF )
            // InternalBeleg.g:569:2: iv_ruleDoppelPunktBlock= ruleDoppelPunktBlock EOF
            {
             newCompositeNode(grammarAccess.getDoppelPunktBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoppelPunktBlock=ruleDoppelPunktBlock();

            state._fsp--;

             current =iv_ruleDoppelPunktBlock; 
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
    // $ANTLR end "entryRuleDoppelPunktBlock"


    // $ANTLR start "ruleDoppelPunktBlock"
    // InternalBeleg.g:575:1: ruleDoppelPunktBlock returns [EObject current=null] : ( (lv_value_0_0= ':' ) ) ;
    public final EObject ruleDoppelPunktBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:581:2: ( ( (lv_value_0_0= ':' ) ) )
            // InternalBeleg.g:582:2: ( (lv_value_0_0= ':' ) )
            {
            // InternalBeleg.g:582:2: ( (lv_value_0_0= ':' ) )
            // InternalBeleg.g:583:3: (lv_value_0_0= ':' )
            {
            // InternalBeleg.g:583:3: (lv_value_0_0= ':' )
            // InternalBeleg.g:584:4: lv_value_0_0= ':'
            {
            lv_value_0_0=(Token)match(input,12,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDoppelPunktBlockAccess().getValueColonKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDoppelPunktBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ":");
            			

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
    // $ANTLR end "ruleDoppelPunktBlock"


    // $ANTLR start "entryRuleUmBlock"
    // InternalBeleg.g:599:1: entryRuleUmBlock returns [EObject current=null] : iv_ruleUmBlock= ruleUmBlock EOF ;
    public final EObject entryRuleUmBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUmBlock = null;


        try {
            // InternalBeleg.g:599:48: (iv_ruleUmBlock= ruleUmBlock EOF )
            // InternalBeleg.g:600:2: iv_ruleUmBlock= ruleUmBlock EOF
            {
             newCompositeNode(grammarAccess.getUmBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUmBlock=ruleUmBlock();

            state._fsp--;

             current =iv_ruleUmBlock; 
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
    // $ANTLR end "entryRuleUmBlock"


    // $ANTLR start "ruleUmBlock"
    // InternalBeleg.g:606:1: ruleUmBlock returns [EObject current=null] : ( (lv_value_0_0= 'Um' ) ) ;
    public final EObject ruleUmBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:612:2: ( ( (lv_value_0_0= 'Um' ) ) )
            // InternalBeleg.g:613:2: ( (lv_value_0_0= 'Um' ) )
            {
            // InternalBeleg.g:613:2: ( (lv_value_0_0= 'Um' ) )
            // InternalBeleg.g:614:3: (lv_value_0_0= 'Um' )
            {
            // InternalBeleg.g:614:3: (lv_value_0_0= 'Um' )
            // InternalBeleg.g:615:4: lv_value_0_0= 'Um'
            {
            lv_value_0_0=(Token)match(input,13,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getUmBlockAccess().getValueUmKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUmBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "Um");
            			

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
    // $ANTLR end "ruleUmBlock"


    // $ANTLR start "entryRuleKommaBlock"
    // InternalBeleg.g:630:1: entryRuleKommaBlock returns [EObject current=null] : iv_ruleKommaBlock= ruleKommaBlock EOF ;
    public final EObject entryRuleKommaBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKommaBlock = null;


        try {
            // InternalBeleg.g:630:51: (iv_ruleKommaBlock= ruleKommaBlock EOF )
            // InternalBeleg.g:631:2: iv_ruleKommaBlock= ruleKommaBlock EOF
            {
             newCompositeNode(grammarAccess.getKommaBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKommaBlock=ruleKommaBlock();

            state._fsp--;

             current =iv_ruleKommaBlock; 
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
    // $ANTLR end "entryRuleKommaBlock"


    // $ANTLR start "ruleKommaBlock"
    // InternalBeleg.g:637:1: ruleKommaBlock returns [EObject current=null] : ( (lv_value_0_0= ',' ) ) ;
    public final EObject ruleKommaBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:643:2: ( ( (lv_value_0_0= ',' ) ) )
            // InternalBeleg.g:644:2: ( (lv_value_0_0= ',' ) )
            {
            // InternalBeleg.g:644:2: ( (lv_value_0_0= ',' ) )
            // InternalBeleg.g:645:3: (lv_value_0_0= ',' )
            {
            // InternalBeleg.g:645:3: (lv_value_0_0= ',' )
            // InternalBeleg.g:646:4: lv_value_0_0= ','
            {
            lv_value_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getKommaBlockAccess().getValueCommaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKommaBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ",");
            			

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
    // $ANTLR end "ruleKommaBlock"


    // $ANTLR start "entryRuleZuBlock"
    // InternalBeleg.g:661:1: entryRuleZuBlock returns [EObject current=null] : iv_ruleZuBlock= ruleZuBlock EOF ;
    public final EObject entryRuleZuBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZuBlock = null;


        try {
            // InternalBeleg.g:661:48: (iv_ruleZuBlock= ruleZuBlock EOF )
            // InternalBeleg.g:662:2: iv_ruleZuBlock= ruleZuBlock EOF
            {
             newCompositeNode(grammarAccess.getZuBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZuBlock=ruleZuBlock();

            state._fsp--;

             current =iv_ruleZuBlock; 
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
    // InternalBeleg.g:668:1: ruleZuBlock returns [EObject current=null] : ( (lv_value_0_0= 'zu' ) ) ;
    public final EObject ruleZuBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:674:2: ( ( (lv_value_0_0= 'zu' ) ) )
            // InternalBeleg.g:675:2: ( (lv_value_0_0= 'zu' ) )
            {
            // InternalBeleg.g:675:2: ( (lv_value_0_0= 'zu' ) )
            // InternalBeleg.g:676:3: (lv_value_0_0= 'zu' )
            {
            // InternalBeleg.g:676:3: (lv_value_0_0= 'zu' )
            // InternalBeleg.g:677:4: lv_value_0_0= 'zu'
            {
            lv_value_0_0=(Token)match(input,15,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getZuBlockAccess().getValueZuKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getZuBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "zu");
            			

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
    // $ANTLR end "ruleZuBlock"


    // $ANTLR start "entryRuleMoechteBlock"
    // InternalBeleg.g:692:1: entryRuleMoechteBlock returns [EObject current=null] : iv_ruleMoechteBlock= ruleMoechteBlock EOF ;
    public final EObject entryRuleMoechteBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoechteBlock = null;


        try {
            // InternalBeleg.g:692:53: (iv_ruleMoechteBlock= ruleMoechteBlock EOF )
            // InternalBeleg.g:693:2: iv_ruleMoechteBlock= ruleMoechteBlock EOF
            {
             newCompositeNode(grammarAccess.getMoechteBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoechteBlock=ruleMoechteBlock();

            state._fsp--;

             current =iv_ruleMoechteBlock; 
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
    // $ANTLR end "entryRuleMoechteBlock"


    // $ANTLR start "ruleMoechteBlock"
    // InternalBeleg.g:699:1: ruleMoechteBlock returns [EObject current=null] : ( (lv_value_0_0= 'm\\u00F6chte' ) ) ;
    public final EObject ruleMoechteBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:705:2: ( ( (lv_value_0_0= 'm\\u00F6chte' ) ) )
            // InternalBeleg.g:706:2: ( (lv_value_0_0= 'm\\u00F6chte' ) )
            {
            // InternalBeleg.g:706:2: ( (lv_value_0_0= 'm\\u00F6chte' ) )
            // InternalBeleg.g:707:3: (lv_value_0_0= 'm\\u00F6chte' )
            {
            // InternalBeleg.g:707:3: (lv_value_0_0= 'm\\u00F6chte' )
            // InternalBeleg.g:708:4: lv_value_0_0= 'm\\u00F6chte'
            {
            lv_value_0_0=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMoechteBlockAccess().getValueMöchteKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMoechteBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "m\u00F6chte");
            			

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
    // $ANTLR end "ruleMoechteBlock"


    // $ANTLR start "entryRuleIchBlock"
    // InternalBeleg.g:723:1: entryRuleIchBlock returns [EObject current=null] : iv_ruleIchBlock= ruleIchBlock EOF ;
    public final EObject entryRuleIchBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIchBlock = null;


        try {
            // InternalBeleg.g:723:49: (iv_ruleIchBlock= ruleIchBlock EOF )
            // InternalBeleg.g:724:2: iv_ruleIchBlock= ruleIchBlock EOF
            {
             newCompositeNode(grammarAccess.getIchBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIchBlock=ruleIchBlock();

            state._fsp--;

             current =iv_ruleIchBlock; 
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
    // $ANTLR end "entryRuleIchBlock"


    // $ANTLR start "ruleIchBlock"
    // InternalBeleg.g:730:1: ruleIchBlock returns [EObject current=null] : ( (lv_value_0_0= 'ich' ) ) ;
    public final EObject ruleIchBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:736:2: ( ( (lv_value_0_0= 'ich' ) ) )
            // InternalBeleg.g:737:2: ( (lv_value_0_0= 'ich' ) )
            {
            // InternalBeleg.g:737:2: ( (lv_value_0_0= 'ich' ) )
            // InternalBeleg.g:738:3: (lv_value_0_0= 'ich' )
            {
            // InternalBeleg.g:738:3: (lv_value_0_0= 'ich' )
            // InternalBeleg.g:739:4: lv_value_0_0= 'ich'
            {
            lv_value_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIchBlockAccess().getValueIchKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIchBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "ich");
            			

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
    // $ANTLR end "ruleIchBlock"


    // $ANTLR start "entryRuleAlsBlock"
    // InternalBeleg.g:754:1: entryRuleAlsBlock returns [EObject current=null] : iv_ruleAlsBlock= ruleAlsBlock EOF ;
    public final EObject entryRuleAlsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlsBlock = null;


        try {
            // InternalBeleg.g:754:49: (iv_ruleAlsBlock= ruleAlsBlock EOF )
            // InternalBeleg.g:755:2: iv_ruleAlsBlock= ruleAlsBlock EOF
            {
             newCompositeNode(grammarAccess.getAlsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlsBlock=ruleAlsBlock();

            state._fsp--;

             current =iv_ruleAlsBlock; 
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
    // $ANTLR end "entryRuleAlsBlock"


    // $ANTLR start "ruleAlsBlock"
    // InternalBeleg.g:761:1: ruleAlsBlock returns [EObject current=null] : ( (lv_value_0_0= 'als' ) ) ;
    public final EObject ruleAlsBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:767:2: ( ( (lv_value_0_0= 'als' ) ) )
            // InternalBeleg.g:768:2: ( (lv_value_0_0= 'als' ) )
            {
            // InternalBeleg.g:768:2: ( (lv_value_0_0= 'als' ) )
            // InternalBeleg.g:769:3: (lv_value_0_0= 'als' )
            {
            // InternalBeleg.g:769:3: (lv_value_0_0= 'als' )
            // InternalBeleg.g:770:4: lv_value_0_0= 'als'
            {
            lv_value_0_0=(Token)match(input,18,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getAlsBlockAccess().getValueAlsKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAlsBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "als");
            			

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
    // $ANTLR end "ruleAlsBlock"


    // $ANTLR start "entryRulePunktBlock"
    // InternalBeleg.g:785:1: entryRulePunktBlock returns [EObject current=null] : iv_rulePunktBlock= rulePunktBlock EOF ;
    public final EObject entryRulePunktBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePunktBlock = null;


        try {
            // InternalBeleg.g:785:51: (iv_rulePunktBlock= rulePunktBlock EOF )
            // InternalBeleg.g:786:2: iv_rulePunktBlock= rulePunktBlock EOF
            {
             newCompositeNode(grammarAccess.getPunktBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePunktBlock=rulePunktBlock();

            state._fsp--;

             current =iv_rulePunktBlock; 
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
    // $ANTLR end "entryRulePunktBlock"


    // $ANTLR start "rulePunktBlock"
    // InternalBeleg.g:792:1: rulePunktBlock returns [EObject current=null] : ( (lv_value_0_0= '.' ) ) ;
    public final EObject rulePunktBlock() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:798:2: ( ( (lv_value_0_0= '.' ) ) )
            // InternalBeleg.g:799:2: ( (lv_value_0_0= '.' ) )
            {
            // InternalBeleg.g:799:2: ( (lv_value_0_0= '.' ) )
            // InternalBeleg.g:800:3: (lv_value_0_0= '.' )
            {
            // InternalBeleg.g:800:3: (lv_value_0_0= '.' )
            // InternalBeleg.g:801:4: lv_value_0_0= '.'
            {
            lv_value_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getPunktBlockAccess().getValueFullStopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPunktBlockRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, ".");
            			

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
    // $ANTLR end "rulePunktBlock"


    // $ANTLR start "entryRuleSubstantiv"
    // InternalBeleg.g:816:1: entryRuleSubstantiv returns [EObject current=null] : iv_ruleSubstantiv= ruleSubstantiv EOF ;
    public final EObject entryRuleSubstantiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstantiv = null;


        try {
            // InternalBeleg.g:816:51: (iv_ruleSubstantiv= ruleSubstantiv EOF )
            // InternalBeleg.g:817:2: iv_ruleSubstantiv= ruleSubstantiv EOF
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
    // InternalBeleg.g:823:1: ruleSubstantiv returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleSubstantiv() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:829:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:830:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:830:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:831:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:831:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:832:4: lv_value_0_0= RULE_WORT
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
            					"de.htwdd.sf.beleg.s86320s86372.Beleg.WORT");
            			

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
    // InternalBeleg.g:851:1: entryRuleInfinit returns [EObject current=null] : iv_ruleInfinit= ruleInfinit EOF ;
    public final EObject entryRuleInfinit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinit = null;


        try {
            // InternalBeleg.g:851:48: (iv_ruleInfinit= ruleInfinit EOF )
            // InternalBeleg.g:852:2: iv_ruleInfinit= ruleInfinit EOF
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
    // InternalBeleg.g:858:1: ruleInfinit returns [EObject current=null] : ( (lv_value_0_0= RULE_WORT ) ) ;
    public final EObject ruleInfinit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:864:2: ( ( (lv_value_0_0= RULE_WORT ) ) )
            // InternalBeleg.g:865:2: ( (lv_value_0_0= RULE_WORT ) )
            {
            // InternalBeleg.g:865:2: ( (lv_value_0_0= RULE_WORT ) )
            // InternalBeleg.g:866:3: (lv_value_0_0= RULE_WORT )
            {
            // InternalBeleg.g:866:3: (lv_value_0_0= RULE_WORT )
            // InternalBeleg.g:867:4: lv_value_0_0= RULE_WORT
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
            					"de.htwdd.sf.beleg.s86320s86372.Beleg.WORT");
            			

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008012L});

}