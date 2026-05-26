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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "':'", "'Um'", "','", "'m\\u00F6chte'", "'ich'", "'als'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalBeleg.g:71:1: ruleModel returns [EObject current=null] : ( (lv_story_0_0= ruleS ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_story_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:77:2: ( ( (lv_story_0_0= ruleS ) )* )
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleS ) )*
            {
            // InternalBeleg.g:78:2: ( (lv_story_0_0= ruleS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBeleg.g:79:3: (lv_story_0_0= ruleS )
            	    {
            	    // InternalBeleg.g:79:3: (lv_story_0_0= ruleS )
            	    // InternalBeleg.g:80:4: lv_story_0_0= ruleS
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStorySParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_story_0_0=ruleS();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"story",
            	    					lv_story_0_0,
            	    					"de.htwdd.sf.beleg.s86320.s86372.Beleg.S");
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


    // $ANTLR start "entryRuleS"
    // InternalBeleg.g:100:1: entryRuleS returns [EObject current=null] : iv_ruleS= ruleS EOF ;
    public final EObject entryRuleS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS = null;


        try {
            // InternalBeleg.g:100:42: (iv_ruleS= ruleS EOF )
            // InternalBeleg.g:101:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS; 
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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalBeleg.g:107:1: ruleS returns [EObject current=null] : ( ( (lv_xe_0_0= ruleXPart ) ) ( (lv_ye_1_0= ruleYPart ) ) ( (lv_ze_2_0= ruleZPart ) ) otherlv_3= '.' ) ;
    public final EObject ruleS() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_xe_0_0 = null;

        EObject lv_ye_1_0 = null;

        EObject lv_ze_2_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:113:2: ( ( ( (lv_xe_0_0= ruleXPart ) ) ( (lv_ye_1_0= ruleYPart ) ) ( (lv_ze_2_0= ruleZPart ) ) otherlv_3= '.' ) )
            // InternalBeleg.g:114:2: ( ( (lv_xe_0_0= ruleXPart ) ) ( (lv_ye_1_0= ruleYPart ) ) ( (lv_ze_2_0= ruleZPart ) ) otherlv_3= '.' )
            {
            // InternalBeleg.g:114:2: ( ( (lv_xe_0_0= ruleXPart ) ) ( (lv_ye_1_0= ruleYPart ) ) ( (lv_ze_2_0= ruleZPart ) ) otherlv_3= '.' )
            // InternalBeleg.g:115:3: ( (lv_xe_0_0= ruleXPart ) ) ( (lv_ye_1_0= ruleYPart ) ) ( (lv_ze_2_0= ruleZPart ) ) otherlv_3= '.'
            {
            // InternalBeleg.g:115:3: ( (lv_xe_0_0= ruleXPart ) )
            // InternalBeleg.g:116:4: (lv_xe_0_0= ruleXPart )
            {
            // InternalBeleg.g:116:4: (lv_xe_0_0= ruleXPart )
            // InternalBeleg.g:117:5: lv_xe_0_0= ruleXPart
            {

            					newCompositeNode(grammarAccess.getSAccess().getXeXPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_xe_0_0=ruleXPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRule());
            					}
            					set(
            						current,
            						"xe",
            						lv_xe_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.XPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:134:3: ( (lv_ye_1_0= ruleYPart ) )
            // InternalBeleg.g:135:4: (lv_ye_1_0= ruleYPart )
            {
            // InternalBeleg.g:135:4: (lv_ye_1_0= ruleYPart )
            // InternalBeleg.g:136:5: lv_ye_1_0= ruleYPart
            {

            					newCompositeNode(grammarAccess.getSAccess().getYeYPartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_ye_1_0=ruleYPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRule());
            					}
            					set(
            						current,
            						"ye",
            						lv_ye_1_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.YPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBeleg.g:153:3: ( (lv_ze_2_0= ruleZPart ) )
            // InternalBeleg.g:154:4: (lv_ze_2_0= ruleZPart )
            {
            // InternalBeleg.g:154:4: (lv_ze_2_0= ruleZPart )
            // InternalBeleg.g:155:5: lv_ze_2_0= ruleZPart
            {

            					newCompositeNode(grammarAccess.getSAccess().getZeZPartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ze_2_0=ruleZPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRule());
            					}
            					set(
            						current,
            						"ze",
            						lv_ze_2_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.ZPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSAccess().getFullStopKeyword_3());
            		

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
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleXPart"
    // InternalBeleg.g:180:1: entryRuleXPart returns [EObject current=null] : iv_ruleXPart= ruleXPart EOF ;
    public final EObject entryRuleXPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPart = null;


        try {
            // InternalBeleg.g:180:46: (iv_ruleXPart= ruleXPart EOF )
            // InternalBeleg.g:181:2: iv_ruleXPart= ruleXPart EOF
            {
             newCompositeNode(grammarAccess.getXPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPart=ruleXPart();

            state._fsp--;

             current =iv_ruleXPart; 
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
    // $ANTLR end "entryRuleXPart"


    // $ANTLR start "ruleXPart"
    // InternalBeleg.g:187:1: ruleXPart returns [EObject current=null] : ( ( (lv_ti_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ) ;
    public final EObject ruleXPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ti_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:193:2: ( ( ( (lv_ti_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ) )
            // InternalBeleg.g:194:2: ( ( (lv_ti_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' )
            {
            // InternalBeleg.g:194:2: ( ( (lv_ti_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' )
            // InternalBeleg.g:195:3: ( (lv_ti_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um'
            {
            // InternalBeleg.g:195:3: ( (lv_ti_0_0= ruleTitle ) )
            // InternalBeleg.g:196:4: (lv_ti_0_0= ruleTitle )
            {
            // InternalBeleg.g:196:4: (lv_ti_0_0= ruleTitle )
            // InternalBeleg.g:197:5: lv_ti_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getXPartAccess().getTiTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ti_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXPartRule());
            					}
            					set(
            						current,
            						"ti",
            						lv_ti_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getXPartAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getXPartAccess().getUmKeyword_2());
            		

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
    // $ANTLR end "ruleXPart"


    // $ANTLR start "entryRuleTitle"
    // InternalBeleg.g:226:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalBeleg.g:226:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalBeleg.g:227:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalBeleg.g:233:1: ruleTitle returns [EObject current=null] : ( ( (lv_Titel_0_0= RULE_ID ) ) ( (lv_Titel_1_0= RULE_ID ) )* ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token lv_Titel_0_0=null;
        Token lv_Titel_1_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:239:2: ( ( ( (lv_Titel_0_0= RULE_ID ) ) ( (lv_Titel_1_0= RULE_ID ) )* ) )
            // InternalBeleg.g:240:2: ( ( (lv_Titel_0_0= RULE_ID ) ) ( (lv_Titel_1_0= RULE_ID ) )* )
            {
            // InternalBeleg.g:240:2: ( ( (lv_Titel_0_0= RULE_ID ) ) ( (lv_Titel_1_0= RULE_ID ) )* )
            // InternalBeleg.g:241:3: ( (lv_Titel_0_0= RULE_ID ) ) ( (lv_Titel_1_0= RULE_ID ) )*
            {
            // InternalBeleg.g:241:3: ( (lv_Titel_0_0= RULE_ID ) )
            // InternalBeleg.g:242:4: (lv_Titel_0_0= RULE_ID )
            {
            // InternalBeleg.g:242:4: (lv_Titel_0_0= RULE_ID )
            // InternalBeleg.g:243:5: lv_Titel_0_0= RULE_ID
            {
            lv_Titel_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_Titel_0_0, grammarAccess.getTitleAccess().getTitelIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					addWithLastConsumed(
            						current,
            						"Titel",
            						lv_Titel_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBeleg.g:259:3: ( (lv_Titel_1_0= RULE_ID ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBeleg.g:260:4: (lv_Titel_1_0= RULE_ID )
            	    {
            	    // InternalBeleg.g:260:4: (lv_Titel_1_0= RULE_ID )
            	    // InternalBeleg.g:261:5: lv_Titel_1_0= RULE_ID
            	    {
            	    lv_Titel_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    					newLeafNode(lv_Titel_1_0, grammarAccess.getTitleAccess().getTitelIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTitleRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"Titel",
            	    						lv_Titel_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleYPart"
    // InternalBeleg.g:281:1: entryRuleYPart returns [EObject current=null] : iv_ruleYPart= ruleYPart EOF ;
    public final EObject entryRuleYPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYPart = null;


        try {
            // InternalBeleg.g:281:46: (iv_ruleYPart= ruleYPart EOF )
            // InternalBeleg.g:282:2: iv_ruleYPart= ruleYPart EOF
            {
             newCompositeNode(grammarAccess.getYPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYPart=ruleYPart();

            state._fsp--;

             current =iv_ruleYPart; 
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
    // $ANTLR end "entryRuleYPart"


    // $ANTLR start "ruleYPart"
    // InternalBeleg.g:288:1: ruleYPart returns [EObject current=null] : ( ( (lv_us_0_0= ruleUse ) ) otherlv_1= ',' otherlv_2= 'm\\u00F6chte' otherlv_3= 'ich' otherlv_4= 'als' ) ;
    public final EObject ruleYPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_us_0_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:294:2: ( ( ( (lv_us_0_0= ruleUse ) ) otherlv_1= ',' otherlv_2= 'm\\u00F6chte' otherlv_3= 'ich' otherlv_4= 'als' ) )
            // InternalBeleg.g:295:2: ( ( (lv_us_0_0= ruleUse ) ) otherlv_1= ',' otherlv_2= 'm\\u00F6chte' otherlv_3= 'ich' otherlv_4= 'als' )
            {
            // InternalBeleg.g:295:2: ( ( (lv_us_0_0= ruleUse ) ) otherlv_1= ',' otherlv_2= 'm\\u00F6chte' otherlv_3= 'ich' otherlv_4= 'als' )
            // InternalBeleg.g:296:3: ( (lv_us_0_0= ruleUse ) ) otherlv_1= ',' otherlv_2= 'm\\u00F6chte' otherlv_3= 'ich' otherlv_4= 'als'
            {
            // InternalBeleg.g:296:3: ( (lv_us_0_0= ruleUse ) )
            // InternalBeleg.g:297:4: (lv_us_0_0= ruleUse )
            {
            // InternalBeleg.g:297:4: (lv_us_0_0= ruleUse )
            // InternalBeleg.g:298:5: lv_us_0_0= ruleUse
            {

            					newCompositeNode(grammarAccess.getYPartAccess().getUsUseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_us_0_0=ruleUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getYPartRule());
            					}
            					set(
            						current,
            						"us",
            						lv_us_0_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Use");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getYPartAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getYPartAccess().getMöchteKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getYPartAccess().getIchKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getYPartAccess().getAlsKeyword_4());
            		

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
    // $ANTLR end "ruleYPart"


    // $ANTLR start "entryRuleUse"
    // InternalBeleg.g:335:1: entryRuleUse returns [EObject current=null] : iv_ruleUse= ruleUse EOF ;
    public final EObject entryRuleUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse = null;


        try {
            // InternalBeleg.g:335:44: (iv_ruleUse= ruleUse EOF )
            // InternalBeleg.g:336:2: iv_ruleUse= ruleUse EOF
            {
             newCompositeNode(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUse=ruleUse();

            state._fsp--;

             current =iv_ruleUse; 
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
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // InternalBeleg.g:342:1: ruleUse returns [EObject current=null] : ( ( (lv_Nutzen_0_0= RULE_ID ) ) ( (lv_Nutzen_1_0= RULE_ID ) )* ) ;
    public final EObject ruleUse() throws RecognitionException {
        EObject current = null;

        Token lv_Nutzen_0_0=null;
        Token lv_Nutzen_1_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:348:2: ( ( ( (lv_Nutzen_0_0= RULE_ID ) ) ( (lv_Nutzen_1_0= RULE_ID ) )* ) )
            // InternalBeleg.g:349:2: ( ( (lv_Nutzen_0_0= RULE_ID ) ) ( (lv_Nutzen_1_0= RULE_ID ) )* )
            {
            // InternalBeleg.g:349:2: ( ( (lv_Nutzen_0_0= RULE_ID ) ) ( (lv_Nutzen_1_0= RULE_ID ) )* )
            // InternalBeleg.g:350:3: ( (lv_Nutzen_0_0= RULE_ID ) ) ( (lv_Nutzen_1_0= RULE_ID ) )*
            {
            // InternalBeleg.g:350:3: ( (lv_Nutzen_0_0= RULE_ID ) )
            // InternalBeleg.g:351:4: (lv_Nutzen_0_0= RULE_ID )
            {
            // InternalBeleg.g:351:4: (lv_Nutzen_0_0= RULE_ID )
            // InternalBeleg.g:352:5: lv_Nutzen_0_0= RULE_ID
            {
            lv_Nutzen_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_Nutzen_0_0, grammarAccess.getUseAccess().getNutzenIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseRule());
            					}
            					addWithLastConsumed(
            						current,
            						"Nutzen",
            						lv_Nutzen_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBeleg.g:368:3: ( (lv_Nutzen_1_0= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBeleg.g:369:4: (lv_Nutzen_1_0= RULE_ID )
            	    {
            	    // InternalBeleg.g:369:4: (lv_Nutzen_1_0= RULE_ID )
            	    // InternalBeleg.g:370:5: lv_Nutzen_1_0= RULE_ID
            	    {
            	    lv_Nutzen_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    					newLeafNode(lv_Nutzen_1_0, grammarAccess.getUseAccess().getNutzenIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUseRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"Nutzen",
            	    						lv_Nutzen_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleUse"


    // $ANTLR start "entryRuleZPart"
    // InternalBeleg.g:390:1: entryRuleZPart returns [EObject current=null] : iv_ruleZPart= ruleZPart EOF ;
    public final EObject entryRuleZPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZPart = null;


        try {
            // InternalBeleg.g:390:46: (iv_ruleZPart= ruleZPart EOF )
            // InternalBeleg.g:391:2: iv_ruleZPart= ruleZPart EOF
            {
             newCompositeNode(grammarAccess.getZPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZPart=ruleZPart();

            state._fsp--;

             current =iv_ruleZPart; 
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
    // $ANTLR end "entryRuleZPart"


    // $ANTLR start "ruleZPart"
    // InternalBeleg.g:397:1: ruleZPart returns [EObject current=null] : ( ( (lv_Rolle_0_0= RULE_ID ) ) ( (lv_go_1_0= ruleGoal ) ) ) ;
    public final EObject ruleZPart() throws RecognitionException {
        EObject current = null;

        Token lv_Rolle_0_0=null;
        EObject lv_go_1_0 = null;



        	enterRule();

        try {
            // InternalBeleg.g:403:2: ( ( ( (lv_Rolle_0_0= RULE_ID ) ) ( (lv_go_1_0= ruleGoal ) ) ) )
            // InternalBeleg.g:404:2: ( ( (lv_Rolle_0_0= RULE_ID ) ) ( (lv_go_1_0= ruleGoal ) ) )
            {
            // InternalBeleg.g:404:2: ( ( (lv_Rolle_0_0= RULE_ID ) ) ( (lv_go_1_0= ruleGoal ) ) )
            // InternalBeleg.g:405:3: ( (lv_Rolle_0_0= RULE_ID ) ) ( (lv_go_1_0= ruleGoal ) )
            {
            // InternalBeleg.g:405:3: ( (lv_Rolle_0_0= RULE_ID ) )
            // InternalBeleg.g:406:4: (lv_Rolle_0_0= RULE_ID )
            {
            // InternalBeleg.g:406:4: (lv_Rolle_0_0= RULE_ID )
            // InternalBeleg.g:407:5: lv_Rolle_0_0= RULE_ID
            {
            lv_Rolle_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_Rolle_0_0, grammarAccess.getZPartAccess().getRolleIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Rolle",
            						lv_Rolle_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBeleg.g:423:3: ( (lv_go_1_0= ruleGoal ) )
            // InternalBeleg.g:424:4: (lv_go_1_0= ruleGoal )
            {
            // InternalBeleg.g:424:4: (lv_go_1_0= ruleGoal )
            // InternalBeleg.g:425:5: lv_go_1_0= ruleGoal
            {

            					newCompositeNode(grammarAccess.getZPartAccess().getGoGoalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_go_1_0=ruleGoal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZPartRule());
            					}
            					set(
            						current,
            						"go",
            						lv_go_1_0,
            						"de.htwdd.sf.beleg.s86320.s86372.Beleg.Goal");
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
    // $ANTLR end "ruleZPart"


    // $ANTLR start "entryRuleGoal"
    // InternalBeleg.g:446:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalBeleg.g:446:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalBeleg.g:447:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalBeleg.g:453:1: ruleGoal returns [EObject current=null] : ( ( (lv_Ziel_0_0= RULE_ID ) ) ( (lv_Ziel_1_0= RULE_ID ) )* ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_Ziel_0_0=null;
        Token lv_Ziel_1_0=null;


        	enterRule();

        try {
            // InternalBeleg.g:459:2: ( ( ( (lv_Ziel_0_0= RULE_ID ) ) ( (lv_Ziel_1_0= RULE_ID ) )* ) )
            // InternalBeleg.g:460:2: ( ( (lv_Ziel_0_0= RULE_ID ) ) ( (lv_Ziel_1_0= RULE_ID ) )* )
            {
            // InternalBeleg.g:460:2: ( ( (lv_Ziel_0_0= RULE_ID ) ) ( (lv_Ziel_1_0= RULE_ID ) )* )
            // InternalBeleg.g:461:3: ( (lv_Ziel_0_0= RULE_ID ) ) ( (lv_Ziel_1_0= RULE_ID ) )*
            {
            // InternalBeleg.g:461:3: ( (lv_Ziel_0_0= RULE_ID ) )
            // InternalBeleg.g:462:4: (lv_Ziel_0_0= RULE_ID )
            {
            // InternalBeleg.g:462:4: (lv_Ziel_0_0= RULE_ID )
            // InternalBeleg.g:463:5: lv_Ziel_0_0= RULE_ID
            {
            lv_Ziel_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_Ziel_0_0, grammarAccess.getGoalAccess().getZielIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalRule());
            					}
            					addWithLastConsumed(
            						current,
            						"Ziel",
            						lv_Ziel_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBeleg.g:479:3: ( (lv_Ziel_1_0= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBeleg.g:480:4: (lv_Ziel_1_0= RULE_ID )
            	    {
            	    // InternalBeleg.g:480:4: (lv_Ziel_1_0= RULE_ID )
            	    // InternalBeleg.g:481:5: lv_Ziel_1_0= RULE_ID
            	    {
            	    lv_Ziel_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    					newLeafNode(lv_Ziel_1_0, grammarAccess.getGoalAccess().getZielIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getGoalRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"Ziel",
            	    						lv_Ziel_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "ruleGoal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}