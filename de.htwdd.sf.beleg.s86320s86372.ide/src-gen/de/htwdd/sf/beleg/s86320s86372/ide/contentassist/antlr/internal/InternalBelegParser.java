package de.htwdd.sf.beleg.s86320s86372.ide.contentassist.antlr.internal;

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
import de.htwdd.sf.beleg.s86320s86372.services.BelegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBelegParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BelegGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalBeleg.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBeleg.g:54:1: ( ruleModel EOF )
            // InternalBeleg.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBeleg.g:62:1: ruleModel : ( ( ( rule__Model__StoryAssignment ) ) ( ( rule__Model__StoryAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:66:2: ( ( ( ( rule__Model__StoryAssignment ) ) ( ( rule__Model__StoryAssignment )* ) ) )
            // InternalBeleg.g:67:2: ( ( ( rule__Model__StoryAssignment ) ) ( ( rule__Model__StoryAssignment )* ) )
            {
            // InternalBeleg.g:67:2: ( ( ( rule__Model__StoryAssignment ) ) ( ( rule__Model__StoryAssignment )* ) )
            // InternalBeleg.g:68:3: ( ( rule__Model__StoryAssignment ) ) ( ( rule__Model__StoryAssignment )* )
            {
            // InternalBeleg.g:68:3: ( ( rule__Model__StoryAssignment ) )
            // InternalBeleg.g:69:4: ( rule__Model__StoryAssignment )
            {
             before(grammarAccess.getModelAccess().getStoryAssignment()); 
            // InternalBeleg.g:70:4: ( rule__Model__StoryAssignment )
            // InternalBeleg.g:70:5: rule__Model__StoryAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__StoryAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStoryAssignment()); 

            }

            // InternalBeleg.g:73:3: ( ( rule__Model__StoryAssignment )* )
            // InternalBeleg.g:74:4: ( rule__Model__StoryAssignment )*
            {
             before(grammarAccess.getModelAccess().getStoryAssignment()); 
            // InternalBeleg.g:75:4: ( rule__Model__StoryAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBeleg.g:75:5: rule__Model__StoryAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StoryAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStoryAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUser_Story_Um"
    // InternalBeleg.g:85:1: entryRuleUser_Story_Um : ruleUser_Story_Um EOF ;
    public final void entryRuleUser_Story_Um() throws RecognitionException {
        try {
            // InternalBeleg.g:86:1: ( ruleUser_Story_Um EOF )
            // InternalBeleg.g:87:1: ruleUser_Story_Um EOF
            {
             before(grammarAccess.getUser_Story_UmRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_Story_Um();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_Story_Um"


    // $ANTLR start "ruleUser_Story_Um"
    // InternalBeleg.g:94:1: ruleUser_Story_Um : ( ( rule__User_Story_Um__Group__0 ) ) ;
    public final void ruleUser_Story_Um() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:98:2: ( ( ( rule__User_Story_Um__Group__0 ) ) )
            // InternalBeleg.g:99:2: ( ( rule__User_Story_Um__Group__0 ) )
            {
            // InternalBeleg.g:99:2: ( ( rule__User_Story_Um__Group__0 ) )
            // InternalBeleg.g:100:3: ( rule__User_Story_Um__Group__0 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getGroup()); 
            // InternalBeleg.g:101:3: ( rule__User_Story_Um__Group__0 )
            // InternalBeleg.g:101:4: rule__User_Story_Um__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_Story_Um"


    // $ANTLR start "entryRuleTitel"
    // InternalBeleg.g:110:1: entryRuleTitel : ruleTitel EOF ;
    public final void entryRuleTitel() throws RecognitionException {
        try {
            // InternalBeleg.g:111:1: ( ruleTitel EOF )
            // InternalBeleg.g:112:1: ruleTitel EOF
            {
             before(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getTitelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalBeleg.g:119:1: ruleTitel : ( ( ( rule__Titel__TextpartAssignment ) ) ( ( rule__Titel__TextpartAssignment )* ) ) ;
    public final void ruleTitel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:123:2: ( ( ( ( rule__Titel__TextpartAssignment ) ) ( ( rule__Titel__TextpartAssignment )* ) ) )
            // InternalBeleg.g:124:2: ( ( ( rule__Titel__TextpartAssignment ) ) ( ( rule__Titel__TextpartAssignment )* ) )
            {
            // InternalBeleg.g:124:2: ( ( ( rule__Titel__TextpartAssignment ) ) ( ( rule__Titel__TextpartAssignment )* ) )
            // InternalBeleg.g:125:3: ( ( rule__Titel__TextpartAssignment ) ) ( ( rule__Titel__TextpartAssignment )* )
            {
            // InternalBeleg.g:125:3: ( ( rule__Titel__TextpartAssignment ) )
            // InternalBeleg.g:126:4: ( rule__Titel__TextpartAssignment )
            {
             before(grammarAccess.getTitelAccess().getTextpartAssignment()); 
            // InternalBeleg.g:127:4: ( rule__Titel__TextpartAssignment )
            // InternalBeleg.g:127:5: rule__Titel__TextpartAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Titel__TextpartAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getTextpartAssignment()); 

            }

            // InternalBeleg.g:130:3: ( ( rule__Titel__TextpartAssignment )* )
            // InternalBeleg.g:131:4: ( rule__Titel__TextpartAssignment )*
            {
             before(grammarAccess.getTitelAccess().getTextpartAssignment()); 
            // InternalBeleg.g:132:4: ( rule__Titel__TextpartAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBeleg.g:132:5: rule__Titel__TextpartAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Titel__TextpartAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTitelAccess().getTextpartAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleText"
    // InternalBeleg.g:142:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalBeleg.g:143:1: ( ruleText EOF )
            // InternalBeleg.g:144:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalBeleg.g:151:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:155:2: ( ( ( rule__Text__ValueAssignment ) ) )
            // InternalBeleg.g:156:2: ( ( rule__Text__ValueAssignment ) )
            {
            // InternalBeleg.g:156:2: ( ( rule__Text__ValueAssignment ) )
            // InternalBeleg.g:157:3: ( rule__Text__ValueAssignment )
            {
             before(grammarAccess.getTextAccess().getValueAssignment()); 
            // InternalBeleg.g:158:3: ( rule__Text__ValueAssignment )
            // InternalBeleg.g:158:4: rule__Text__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNutzen"
    // InternalBeleg.g:167:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalBeleg.g:168:1: ( ruleNutzen EOF )
            // InternalBeleg.g:169:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalBeleg.g:176:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:180:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalBeleg.g:181:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalBeleg.g:181:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalBeleg.g:182:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalBeleg.g:183:3: ( rule__Nutzen__Group__0 )
            // InternalBeleg.g:183:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "entryRuleRolle"
    // InternalBeleg.g:192:1: entryRuleRolle : ruleRolle EOF ;
    public final void entryRuleRolle() throws RecognitionException {
        try {
            // InternalBeleg.g:193:1: ( ruleRolle EOF )
            // InternalBeleg.g:194:1: ruleRolle EOF
            {
             before(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getRolleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalBeleg.g:201:1: ruleRolle : ( ( rule__Rolle__SubstAssignment ) ) ;
    public final void ruleRolle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:205:2: ( ( ( rule__Rolle__SubstAssignment ) ) )
            // InternalBeleg.g:206:2: ( ( rule__Rolle__SubstAssignment ) )
            {
            // InternalBeleg.g:206:2: ( ( rule__Rolle__SubstAssignment ) )
            // InternalBeleg.g:207:3: ( rule__Rolle__SubstAssignment )
            {
             before(grammarAccess.getRolleAccess().getSubstAssignment()); 
            // InternalBeleg.g:208:3: ( rule__Rolle__SubstAssignment )
            // InternalBeleg.g:208:4: rule__Rolle__SubstAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__SubstAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getSubstAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalBeleg.g:217:1: entryRuleZiel : ruleZiel EOF ;
    public final void entryRuleZiel() throws RecognitionException {
        try {
            // InternalBeleg.g:218:1: ( ruleZiel EOF )
            // InternalBeleg.g:219:1: ruleZiel EOF
            {
             before(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getZielRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalBeleg.g:226:1: ruleZiel : ( ( rule__Ziel__Group__0 ) ) ;
    public final void ruleZiel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:230:2: ( ( ( rule__Ziel__Group__0 ) ) )
            // InternalBeleg.g:231:2: ( ( rule__Ziel__Group__0 ) )
            {
            // InternalBeleg.g:231:2: ( ( rule__Ziel__Group__0 ) )
            // InternalBeleg.g:232:3: ( rule__Ziel__Group__0 )
            {
             before(grammarAccess.getZielAccess().getGroup()); 
            // InternalBeleg.g:233:3: ( rule__Ziel__Group__0 )
            // InternalBeleg.g:233:4: rule__Ziel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleDoppelPunktBlock"
    // InternalBeleg.g:242:1: entryRuleDoppelPunktBlock : ruleDoppelPunktBlock EOF ;
    public final void entryRuleDoppelPunktBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:243:1: ( ruleDoppelPunktBlock EOF )
            // InternalBeleg.g:244:1: ruleDoppelPunktBlock EOF
            {
             before(grammarAccess.getDoppelPunktBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleDoppelPunktBlock();

            state._fsp--;

             after(grammarAccess.getDoppelPunktBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoppelPunktBlock"


    // $ANTLR start "ruleDoppelPunktBlock"
    // InternalBeleg.g:251:1: ruleDoppelPunktBlock : ( ( rule__DoppelPunktBlock__ValueAssignment ) ) ;
    public final void ruleDoppelPunktBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:255:2: ( ( ( rule__DoppelPunktBlock__ValueAssignment ) ) )
            // InternalBeleg.g:256:2: ( ( rule__DoppelPunktBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:256:2: ( ( rule__DoppelPunktBlock__ValueAssignment ) )
            // InternalBeleg.g:257:3: ( rule__DoppelPunktBlock__ValueAssignment )
            {
             before(grammarAccess.getDoppelPunktBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:258:3: ( rule__DoppelPunktBlock__ValueAssignment )
            // InternalBeleg.g:258:4: rule__DoppelPunktBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DoppelPunktBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoppelPunktBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoppelPunktBlock"


    // $ANTLR start "entryRuleUmBlock"
    // InternalBeleg.g:267:1: entryRuleUmBlock : ruleUmBlock EOF ;
    public final void entryRuleUmBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:268:1: ( ruleUmBlock EOF )
            // InternalBeleg.g:269:1: ruleUmBlock EOF
            {
             before(grammarAccess.getUmBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleUmBlock();

            state._fsp--;

             after(grammarAccess.getUmBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUmBlock"


    // $ANTLR start "ruleUmBlock"
    // InternalBeleg.g:276:1: ruleUmBlock : ( ( rule__UmBlock__ValueAssignment ) ) ;
    public final void ruleUmBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:280:2: ( ( ( rule__UmBlock__ValueAssignment ) ) )
            // InternalBeleg.g:281:2: ( ( rule__UmBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:281:2: ( ( rule__UmBlock__ValueAssignment ) )
            // InternalBeleg.g:282:3: ( rule__UmBlock__ValueAssignment )
            {
             before(grammarAccess.getUmBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:283:3: ( rule__UmBlock__ValueAssignment )
            // InternalBeleg.g:283:4: rule__UmBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UmBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUmBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUmBlock"


    // $ANTLR start "entryRuleKommaBlock"
    // InternalBeleg.g:292:1: entryRuleKommaBlock : ruleKommaBlock EOF ;
    public final void entryRuleKommaBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:293:1: ( ruleKommaBlock EOF )
            // InternalBeleg.g:294:1: ruleKommaBlock EOF
            {
             before(grammarAccess.getKommaBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleKommaBlock();

            state._fsp--;

             after(grammarAccess.getKommaBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKommaBlock"


    // $ANTLR start "ruleKommaBlock"
    // InternalBeleg.g:301:1: ruleKommaBlock : ( ( rule__KommaBlock__ValueAssignment ) ) ;
    public final void ruleKommaBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:305:2: ( ( ( rule__KommaBlock__ValueAssignment ) ) )
            // InternalBeleg.g:306:2: ( ( rule__KommaBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:306:2: ( ( rule__KommaBlock__ValueAssignment ) )
            // InternalBeleg.g:307:3: ( rule__KommaBlock__ValueAssignment )
            {
             before(grammarAccess.getKommaBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:308:3: ( rule__KommaBlock__ValueAssignment )
            // InternalBeleg.g:308:4: rule__KommaBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__KommaBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKommaBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKommaBlock"


    // $ANTLR start "entryRuleZuBlock"
    // InternalBeleg.g:317:1: entryRuleZuBlock : ruleZuBlock EOF ;
    public final void entryRuleZuBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:318:1: ( ruleZuBlock EOF )
            // InternalBeleg.g:319:1: ruleZuBlock EOF
            {
             before(grammarAccess.getZuBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleZuBlock();

            state._fsp--;

             after(grammarAccess.getZuBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZuBlock"


    // $ANTLR start "ruleZuBlock"
    // InternalBeleg.g:326:1: ruleZuBlock : ( ( rule__ZuBlock__ValueAssignment ) ) ;
    public final void ruleZuBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:330:2: ( ( ( rule__ZuBlock__ValueAssignment ) ) )
            // InternalBeleg.g:331:2: ( ( rule__ZuBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:331:2: ( ( rule__ZuBlock__ValueAssignment ) )
            // InternalBeleg.g:332:3: ( rule__ZuBlock__ValueAssignment )
            {
             before(grammarAccess.getZuBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:333:3: ( rule__ZuBlock__ValueAssignment )
            // InternalBeleg.g:333:4: rule__ZuBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ZuBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getZuBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZuBlock"


    // $ANTLR start "entryRuleMoechteBlock"
    // InternalBeleg.g:342:1: entryRuleMoechteBlock : ruleMoechteBlock EOF ;
    public final void entryRuleMoechteBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:343:1: ( ruleMoechteBlock EOF )
            // InternalBeleg.g:344:1: ruleMoechteBlock EOF
            {
             before(grammarAccess.getMoechteBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleMoechteBlock();

            state._fsp--;

             after(grammarAccess.getMoechteBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoechteBlock"


    // $ANTLR start "ruleMoechteBlock"
    // InternalBeleg.g:351:1: ruleMoechteBlock : ( ( rule__MoechteBlock__ValueAssignment ) ) ;
    public final void ruleMoechteBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:355:2: ( ( ( rule__MoechteBlock__ValueAssignment ) ) )
            // InternalBeleg.g:356:2: ( ( rule__MoechteBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:356:2: ( ( rule__MoechteBlock__ValueAssignment ) )
            // InternalBeleg.g:357:3: ( rule__MoechteBlock__ValueAssignment )
            {
             before(grammarAccess.getMoechteBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:358:3: ( rule__MoechteBlock__ValueAssignment )
            // InternalBeleg.g:358:4: rule__MoechteBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MoechteBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMoechteBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoechteBlock"


    // $ANTLR start "entryRuleIchBlock"
    // InternalBeleg.g:367:1: entryRuleIchBlock : ruleIchBlock EOF ;
    public final void entryRuleIchBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:368:1: ( ruleIchBlock EOF )
            // InternalBeleg.g:369:1: ruleIchBlock EOF
            {
             before(grammarAccess.getIchBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleIchBlock();

            state._fsp--;

             after(grammarAccess.getIchBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIchBlock"


    // $ANTLR start "ruleIchBlock"
    // InternalBeleg.g:376:1: ruleIchBlock : ( ( rule__IchBlock__ValueAssignment ) ) ;
    public final void ruleIchBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:380:2: ( ( ( rule__IchBlock__ValueAssignment ) ) )
            // InternalBeleg.g:381:2: ( ( rule__IchBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:381:2: ( ( rule__IchBlock__ValueAssignment ) )
            // InternalBeleg.g:382:3: ( rule__IchBlock__ValueAssignment )
            {
             before(grammarAccess.getIchBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:383:3: ( rule__IchBlock__ValueAssignment )
            // InternalBeleg.g:383:4: rule__IchBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IchBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIchBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIchBlock"


    // $ANTLR start "entryRuleAlsBlock"
    // InternalBeleg.g:392:1: entryRuleAlsBlock : ruleAlsBlock EOF ;
    public final void entryRuleAlsBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:393:1: ( ruleAlsBlock EOF )
            // InternalBeleg.g:394:1: ruleAlsBlock EOF
            {
             before(grammarAccess.getAlsBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleAlsBlock();

            state._fsp--;

             after(grammarAccess.getAlsBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlsBlock"


    // $ANTLR start "ruleAlsBlock"
    // InternalBeleg.g:401:1: ruleAlsBlock : ( ( rule__AlsBlock__ValueAssignment ) ) ;
    public final void ruleAlsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:405:2: ( ( ( rule__AlsBlock__ValueAssignment ) ) )
            // InternalBeleg.g:406:2: ( ( rule__AlsBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:406:2: ( ( rule__AlsBlock__ValueAssignment ) )
            // InternalBeleg.g:407:3: ( rule__AlsBlock__ValueAssignment )
            {
             before(grammarAccess.getAlsBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:408:3: ( rule__AlsBlock__ValueAssignment )
            // InternalBeleg.g:408:4: rule__AlsBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AlsBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAlsBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlsBlock"


    // $ANTLR start "entryRulePunktBlock"
    // InternalBeleg.g:417:1: entryRulePunktBlock : rulePunktBlock EOF ;
    public final void entryRulePunktBlock() throws RecognitionException {
        try {
            // InternalBeleg.g:418:1: ( rulePunktBlock EOF )
            // InternalBeleg.g:419:1: rulePunktBlock EOF
            {
             before(grammarAccess.getPunktBlockRule()); 
            pushFollow(FOLLOW_1);
            rulePunktBlock();

            state._fsp--;

             after(grammarAccess.getPunktBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePunktBlock"


    // $ANTLR start "rulePunktBlock"
    // InternalBeleg.g:426:1: rulePunktBlock : ( ( rule__PunktBlock__ValueAssignment ) ) ;
    public final void rulePunktBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:430:2: ( ( ( rule__PunktBlock__ValueAssignment ) ) )
            // InternalBeleg.g:431:2: ( ( rule__PunktBlock__ValueAssignment ) )
            {
            // InternalBeleg.g:431:2: ( ( rule__PunktBlock__ValueAssignment ) )
            // InternalBeleg.g:432:3: ( rule__PunktBlock__ValueAssignment )
            {
             before(grammarAccess.getPunktBlockAccess().getValueAssignment()); 
            // InternalBeleg.g:433:3: ( rule__PunktBlock__ValueAssignment )
            // InternalBeleg.g:433:4: rule__PunktBlock__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PunktBlock__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPunktBlockAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePunktBlock"


    // $ANTLR start "entryRuleSubstantiv"
    // InternalBeleg.g:442:1: entryRuleSubstantiv : ruleSubstantiv EOF ;
    public final void entryRuleSubstantiv() throws RecognitionException {
        try {
            // InternalBeleg.g:443:1: ( ruleSubstantiv EOF )
            // InternalBeleg.g:444:1: ruleSubstantiv EOF
            {
             before(grammarAccess.getSubstantivRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstantiv();

            state._fsp--;

             after(grammarAccess.getSubstantivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstantiv"


    // $ANTLR start "ruleSubstantiv"
    // InternalBeleg.g:451:1: ruleSubstantiv : ( ( rule__Substantiv__ValueAssignment ) ) ;
    public final void ruleSubstantiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:455:2: ( ( ( rule__Substantiv__ValueAssignment ) ) )
            // InternalBeleg.g:456:2: ( ( rule__Substantiv__ValueAssignment ) )
            {
            // InternalBeleg.g:456:2: ( ( rule__Substantiv__ValueAssignment ) )
            // InternalBeleg.g:457:3: ( rule__Substantiv__ValueAssignment )
            {
             before(grammarAccess.getSubstantivAccess().getValueAssignment()); 
            // InternalBeleg.g:458:3: ( rule__Substantiv__ValueAssignment )
            // InternalBeleg.g:458:4: rule__Substantiv__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Substantiv__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSubstantivAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstantiv"


    // $ANTLR start "entryRuleInfinit"
    // InternalBeleg.g:467:1: entryRuleInfinit : ruleInfinit EOF ;
    public final void entryRuleInfinit() throws RecognitionException {
        try {
            // InternalBeleg.g:468:1: ( ruleInfinit EOF )
            // InternalBeleg.g:469:1: ruleInfinit EOF
            {
             before(grammarAccess.getInfinitRule()); 
            pushFollow(FOLLOW_1);
            ruleInfinit();

            state._fsp--;

             after(grammarAccess.getInfinitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfinit"


    // $ANTLR start "ruleInfinit"
    // InternalBeleg.g:476:1: ruleInfinit : ( ( rule__Infinit__ValueAssignment ) ) ;
    public final void ruleInfinit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:480:2: ( ( ( rule__Infinit__ValueAssignment ) ) )
            // InternalBeleg.g:481:2: ( ( rule__Infinit__ValueAssignment ) )
            {
            // InternalBeleg.g:481:2: ( ( rule__Infinit__ValueAssignment ) )
            // InternalBeleg.g:482:3: ( rule__Infinit__ValueAssignment )
            {
             before(grammarAccess.getInfinitAccess().getValueAssignment()); 
            // InternalBeleg.g:483:3: ( rule__Infinit__ValueAssignment )
            // InternalBeleg.g:483:4: rule__Infinit__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Infinit__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInfinitAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfinit"


    // $ANTLR start "rule__User_Story_Um__Group__0"
    // InternalBeleg.g:491:1: rule__User_Story_Um__Group__0 : rule__User_Story_Um__Group__0__Impl rule__User_Story_Um__Group__1 ;
    public final void rule__User_Story_Um__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:495:1: ( rule__User_Story_Um__Group__0__Impl rule__User_Story_Um__Group__1 )
            // InternalBeleg.g:496:2: rule__User_Story_Um__Group__0__Impl rule__User_Story_Um__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User_Story_Um__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__0"


    // $ANTLR start "rule__User_Story_Um__Group__0__Impl"
    // InternalBeleg.g:503:1: rule__User_Story_Um__Group__0__Impl : ( ( rule__User_Story_Um__TitleAssignment_0 ) ) ;
    public final void rule__User_Story_Um__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:507:1: ( ( ( rule__User_Story_Um__TitleAssignment_0 ) ) )
            // InternalBeleg.g:508:1: ( ( rule__User_Story_Um__TitleAssignment_0 ) )
            {
            // InternalBeleg.g:508:1: ( ( rule__User_Story_Um__TitleAssignment_0 ) )
            // InternalBeleg.g:509:2: ( rule__User_Story_Um__TitleAssignment_0 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getTitleAssignment_0()); 
            // InternalBeleg.g:510:2: ( rule__User_Story_Um__TitleAssignment_0 )
            // InternalBeleg.g:510:3: rule__User_Story_Um__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__0__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__1"
    // InternalBeleg.g:518:1: rule__User_Story_Um__Group__1 : rule__User_Story_Um__Group__1__Impl rule__User_Story_Um__Group__2 ;
    public final void rule__User_Story_Um__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:522:1: ( rule__User_Story_Um__Group__1__Impl rule__User_Story_Um__Group__2 )
            // InternalBeleg.g:523:2: rule__User_Story_Um__Group__1__Impl rule__User_Story_Um__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__User_Story_Um__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__1"


    // $ANTLR start "rule__User_Story_Um__Group__1__Impl"
    // InternalBeleg.g:530:1: rule__User_Story_Um__Group__1__Impl : ( ( rule__User_Story_Um__DoppelpunktAssignment_1 ) ) ;
    public final void rule__User_Story_Um__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:534:1: ( ( ( rule__User_Story_Um__DoppelpunktAssignment_1 ) ) )
            // InternalBeleg.g:535:1: ( ( rule__User_Story_Um__DoppelpunktAssignment_1 ) )
            {
            // InternalBeleg.g:535:1: ( ( rule__User_Story_Um__DoppelpunktAssignment_1 ) )
            // InternalBeleg.g:536:2: ( rule__User_Story_Um__DoppelpunktAssignment_1 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getDoppelpunktAssignment_1()); 
            // InternalBeleg.g:537:2: ( rule__User_Story_Um__DoppelpunktAssignment_1 )
            // InternalBeleg.g:537:3: rule__User_Story_Um__DoppelpunktAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__DoppelpunktAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getDoppelpunktAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__1__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__2"
    // InternalBeleg.g:545:1: rule__User_Story_Um__Group__2 : rule__User_Story_Um__Group__2__Impl rule__User_Story_Um__Group__3 ;
    public final void rule__User_Story_Um__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:549:1: ( rule__User_Story_Um__Group__2__Impl rule__User_Story_Um__Group__3 )
            // InternalBeleg.g:550:2: rule__User_Story_Um__Group__2__Impl rule__User_Story_Um__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__User_Story_Um__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__2"


    // $ANTLR start "rule__User_Story_Um__Group__2__Impl"
    // InternalBeleg.g:557:1: rule__User_Story_Um__Group__2__Impl : ( ( rule__User_Story_Um__UmAssignment_2 ) ) ;
    public final void rule__User_Story_Um__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:561:1: ( ( ( rule__User_Story_Um__UmAssignment_2 ) ) )
            // InternalBeleg.g:562:1: ( ( rule__User_Story_Um__UmAssignment_2 ) )
            {
            // InternalBeleg.g:562:1: ( ( rule__User_Story_Um__UmAssignment_2 ) )
            // InternalBeleg.g:563:2: ( rule__User_Story_Um__UmAssignment_2 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getUmAssignment_2()); 
            // InternalBeleg.g:564:2: ( rule__User_Story_Um__UmAssignment_2 )
            // InternalBeleg.g:564:3: rule__User_Story_Um__UmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__UmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getUmAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__2__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__3"
    // InternalBeleg.g:572:1: rule__User_Story_Um__Group__3 : rule__User_Story_Um__Group__3__Impl rule__User_Story_Um__Group__4 ;
    public final void rule__User_Story_Um__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:576:1: ( rule__User_Story_Um__Group__3__Impl rule__User_Story_Um__Group__4 )
            // InternalBeleg.g:577:2: rule__User_Story_Um__Group__3__Impl rule__User_Story_Um__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__User_Story_Um__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__3"


    // $ANTLR start "rule__User_Story_Um__Group__3__Impl"
    // InternalBeleg.g:584:1: rule__User_Story_Um__Group__3__Impl : ( ( rule__User_Story_Um__UseAssignment_3 ) ) ;
    public final void rule__User_Story_Um__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:588:1: ( ( ( rule__User_Story_Um__UseAssignment_3 ) ) )
            // InternalBeleg.g:589:1: ( ( rule__User_Story_Um__UseAssignment_3 ) )
            {
            // InternalBeleg.g:589:1: ( ( rule__User_Story_Um__UseAssignment_3 ) )
            // InternalBeleg.g:590:2: ( rule__User_Story_Um__UseAssignment_3 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getUseAssignment_3()); 
            // InternalBeleg.g:591:2: ( rule__User_Story_Um__UseAssignment_3 )
            // InternalBeleg.g:591:3: rule__User_Story_Um__UseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__UseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getUseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__3__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__4"
    // InternalBeleg.g:599:1: rule__User_Story_Um__Group__4 : rule__User_Story_Um__Group__4__Impl rule__User_Story_Um__Group__5 ;
    public final void rule__User_Story_Um__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:603:1: ( rule__User_Story_Um__Group__4__Impl rule__User_Story_Um__Group__5 )
            // InternalBeleg.g:604:2: rule__User_Story_Um__Group__4__Impl rule__User_Story_Um__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__User_Story_Um__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__4"


    // $ANTLR start "rule__User_Story_Um__Group__4__Impl"
    // InternalBeleg.g:611:1: rule__User_Story_Um__Group__4__Impl : ( ( rule__User_Story_Um__KommaAssignment_4 ) ) ;
    public final void rule__User_Story_Um__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:615:1: ( ( ( rule__User_Story_Um__KommaAssignment_4 ) ) )
            // InternalBeleg.g:616:1: ( ( rule__User_Story_Um__KommaAssignment_4 ) )
            {
            // InternalBeleg.g:616:1: ( ( rule__User_Story_Um__KommaAssignment_4 ) )
            // InternalBeleg.g:617:2: ( rule__User_Story_Um__KommaAssignment_4 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getKommaAssignment_4()); 
            // InternalBeleg.g:618:2: ( rule__User_Story_Um__KommaAssignment_4 )
            // InternalBeleg.g:618:3: rule__User_Story_Um__KommaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__KommaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getKommaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__4__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__5"
    // InternalBeleg.g:626:1: rule__User_Story_Um__Group__5 : rule__User_Story_Um__Group__5__Impl rule__User_Story_Um__Group__6 ;
    public final void rule__User_Story_Um__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:630:1: ( rule__User_Story_Um__Group__5__Impl rule__User_Story_Um__Group__6 )
            // InternalBeleg.g:631:2: rule__User_Story_Um__Group__5__Impl rule__User_Story_Um__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__User_Story_Um__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__5"


    // $ANTLR start "rule__User_Story_Um__Group__5__Impl"
    // InternalBeleg.g:638:1: rule__User_Story_Um__Group__5__Impl : ( ( rule__User_Story_Um__MoechteAssignment_5 ) ) ;
    public final void rule__User_Story_Um__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:642:1: ( ( ( rule__User_Story_Um__MoechteAssignment_5 ) ) )
            // InternalBeleg.g:643:1: ( ( rule__User_Story_Um__MoechteAssignment_5 ) )
            {
            // InternalBeleg.g:643:1: ( ( rule__User_Story_Um__MoechteAssignment_5 ) )
            // InternalBeleg.g:644:2: ( rule__User_Story_Um__MoechteAssignment_5 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getMoechteAssignment_5()); 
            // InternalBeleg.g:645:2: ( rule__User_Story_Um__MoechteAssignment_5 )
            // InternalBeleg.g:645:3: rule__User_Story_Um__MoechteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__MoechteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getMoechteAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__5__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__6"
    // InternalBeleg.g:653:1: rule__User_Story_Um__Group__6 : rule__User_Story_Um__Group__6__Impl rule__User_Story_Um__Group__7 ;
    public final void rule__User_Story_Um__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:657:1: ( rule__User_Story_Um__Group__6__Impl rule__User_Story_Um__Group__7 )
            // InternalBeleg.g:658:2: rule__User_Story_Um__Group__6__Impl rule__User_Story_Um__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__User_Story_Um__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__6"


    // $ANTLR start "rule__User_Story_Um__Group__6__Impl"
    // InternalBeleg.g:665:1: rule__User_Story_Um__Group__6__Impl : ( ( rule__User_Story_Um__IchAssignment_6 ) ) ;
    public final void rule__User_Story_Um__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:669:1: ( ( ( rule__User_Story_Um__IchAssignment_6 ) ) )
            // InternalBeleg.g:670:1: ( ( rule__User_Story_Um__IchAssignment_6 ) )
            {
            // InternalBeleg.g:670:1: ( ( rule__User_Story_Um__IchAssignment_6 ) )
            // InternalBeleg.g:671:2: ( rule__User_Story_Um__IchAssignment_6 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getIchAssignment_6()); 
            // InternalBeleg.g:672:2: ( rule__User_Story_Um__IchAssignment_6 )
            // InternalBeleg.g:672:3: rule__User_Story_Um__IchAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__IchAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getIchAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__6__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__7"
    // InternalBeleg.g:680:1: rule__User_Story_Um__Group__7 : rule__User_Story_Um__Group__7__Impl rule__User_Story_Um__Group__8 ;
    public final void rule__User_Story_Um__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:684:1: ( rule__User_Story_Um__Group__7__Impl rule__User_Story_Um__Group__8 )
            // InternalBeleg.g:685:2: rule__User_Story_Um__Group__7__Impl rule__User_Story_Um__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__User_Story_Um__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__7"


    // $ANTLR start "rule__User_Story_Um__Group__7__Impl"
    // InternalBeleg.g:692:1: rule__User_Story_Um__Group__7__Impl : ( ( rule__User_Story_Um__AlsAssignment_7 ) ) ;
    public final void rule__User_Story_Um__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:696:1: ( ( ( rule__User_Story_Um__AlsAssignment_7 ) ) )
            // InternalBeleg.g:697:1: ( ( rule__User_Story_Um__AlsAssignment_7 ) )
            {
            // InternalBeleg.g:697:1: ( ( rule__User_Story_Um__AlsAssignment_7 ) )
            // InternalBeleg.g:698:2: ( rule__User_Story_Um__AlsAssignment_7 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getAlsAssignment_7()); 
            // InternalBeleg.g:699:2: ( rule__User_Story_Um__AlsAssignment_7 )
            // InternalBeleg.g:699:3: rule__User_Story_Um__AlsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__AlsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getAlsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__7__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__8"
    // InternalBeleg.g:707:1: rule__User_Story_Um__Group__8 : rule__User_Story_Um__Group__8__Impl rule__User_Story_Um__Group__9 ;
    public final void rule__User_Story_Um__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:711:1: ( rule__User_Story_Um__Group__8__Impl rule__User_Story_Um__Group__9 )
            // InternalBeleg.g:712:2: rule__User_Story_Um__Group__8__Impl rule__User_Story_Um__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__User_Story_Um__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__8"


    // $ANTLR start "rule__User_Story_Um__Group__8__Impl"
    // InternalBeleg.g:719:1: rule__User_Story_Um__Group__8__Impl : ( ( rule__User_Story_Um__RoleAssignment_8 ) ) ;
    public final void rule__User_Story_Um__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:723:1: ( ( ( rule__User_Story_Um__RoleAssignment_8 ) ) )
            // InternalBeleg.g:724:1: ( ( rule__User_Story_Um__RoleAssignment_8 ) )
            {
            // InternalBeleg.g:724:1: ( ( rule__User_Story_Um__RoleAssignment_8 ) )
            // InternalBeleg.g:725:2: ( rule__User_Story_Um__RoleAssignment_8 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getRoleAssignment_8()); 
            // InternalBeleg.g:726:2: ( rule__User_Story_Um__RoleAssignment_8 )
            // InternalBeleg.g:726:3: rule__User_Story_Um__RoleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__RoleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getRoleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__8__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__9"
    // InternalBeleg.g:734:1: rule__User_Story_Um__Group__9 : rule__User_Story_Um__Group__9__Impl rule__User_Story_Um__Group__10 ;
    public final void rule__User_Story_Um__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:738:1: ( rule__User_Story_Um__Group__9__Impl rule__User_Story_Um__Group__10 )
            // InternalBeleg.g:739:2: rule__User_Story_Um__Group__9__Impl rule__User_Story_Um__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__User_Story_Um__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__9"


    // $ANTLR start "rule__User_Story_Um__Group__9__Impl"
    // InternalBeleg.g:746:1: rule__User_Story_Um__Group__9__Impl : ( ( rule__User_Story_Um__GoalAssignment_9 ) ) ;
    public final void rule__User_Story_Um__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:750:1: ( ( ( rule__User_Story_Um__GoalAssignment_9 ) ) )
            // InternalBeleg.g:751:1: ( ( rule__User_Story_Um__GoalAssignment_9 ) )
            {
            // InternalBeleg.g:751:1: ( ( rule__User_Story_Um__GoalAssignment_9 ) )
            // InternalBeleg.g:752:2: ( rule__User_Story_Um__GoalAssignment_9 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getGoalAssignment_9()); 
            // InternalBeleg.g:753:2: ( rule__User_Story_Um__GoalAssignment_9 )
            // InternalBeleg.g:753:3: rule__User_Story_Um__GoalAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__GoalAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getGoalAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__9__Impl"


    // $ANTLR start "rule__User_Story_Um__Group__10"
    // InternalBeleg.g:761:1: rule__User_Story_Um__Group__10 : rule__User_Story_Um__Group__10__Impl ;
    public final void rule__User_Story_Um__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:765:1: ( rule__User_Story_Um__Group__10__Impl )
            // InternalBeleg.g:766:2: rule__User_Story_Um__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__10"


    // $ANTLR start "rule__User_Story_Um__Group__10__Impl"
    // InternalBeleg.g:772:1: rule__User_Story_Um__Group__10__Impl : ( ( rule__User_Story_Um__PunktAssignment_10 ) ) ;
    public final void rule__User_Story_Um__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:776:1: ( ( ( rule__User_Story_Um__PunktAssignment_10 ) ) )
            // InternalBeleg.g:777:1: ( ( rule__User_Story_Um__PunktAssignment_10 ) )
            {
            // InternalBeleg.g:777:1: ( ( rule__User_Story_Um__PunktAssignment_10 ) )
            // InternalBeleg.g:778:2: ( rule__User_Story_Um__PunktAssignment_10 )
            {
             before(grammarAccess.getUser_Story_UmAccess().getPunktAssignment_10()); 
            // InternalBeleg.g:779:2: ( rule__User_Story_Um__PunktAssignment_10 )
            // InternalBeleg.g:779:3: rule__User_Story_Um__PunktAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__User_Story_Um__PunktAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUser_Story_UmAccess().getPunktAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__Group__10__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalBeleg.g:788:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:792:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalBeleg.g:793:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalBeleg.g:800:1: rule__Nutzen__Group__0__Impl : ( ( rule__Nutzen__SubstAssignment_0 ) ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:804:1: ( ( ( rule__Nutzen__SubstAssignment_0 ) ) )
            // InternalBeleg.g:805:1: ( ( rule__Nutzen__SubstAssignment_0 ) )
            {
            // InternalBeleg.g:805:1: ( ( rule__Nutzen__SubstAssignment_0 ) )
            // InternalBeleg.g:806:2: ( rule__Nutzen__SubstAssignment_0 )
            {
             before(grammarAccess.getNutzenAccess().getSubstAssignment_0()); 
            // InternalBeleg.g:807:2: ( rule__Nutzen__SubstAssignment_0 )
            // InternalBeleg.g:807:3: rule__Nutzen__SubstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__SubstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getSubstAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalBeleg.g:815:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2 ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:819:1: ( rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2 )
            // InternalBeleg.g:820:2: rule__Nutzen__Group__1__Impl rule__Nutzen__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalBeleg.g:827:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__ZuAssignment_1 )? ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:831:1: ( ( ( rule__Nutzen__ZuAssignment_1 )? ) )
            // InternalBeleg.g:832:1: ( ( rule__Nutzen__ZuAssignment_1 )? )
            {
            // InternalBeleg.g:832:1: ( ( rule__Nutzen__ZuAssignment_1 )? )
            // InternalBeleg.g:833:2: ( rule__Nutzen__ZuAssignment_1 )?
            {
             before(grammarAccess.getNutzenAccess().getZuAssignment_1()); 
            // InternalBeleg.g:834:2: ( rule__Nutzen__ZuAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBeleg.g:834:3: rule__Nutzen__ZuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Nutzen__ZuAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNutzenAccess().getZuAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__Nutzen__Group__2"
    // InternalBeleg.g:842:1: rule__Nutzen__Group__2 : rule__Nutzen__Group__2__Impl ;
    public final void rule__Nutzen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:846:1: ( rule__Nutzen__Group__2__Impl )
            // InternalBeleg.g:847:2: rule__Nutzen__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__2"


    // $ANTLR start "rule__Nutzen__Group__2__Impl"
    // InternalBeleg.g:853:1: rule__Nutzen__Group__2__Impl : ( ( ( rule__Nutzen__InfinitAssignment_2 ) ) ( ( rule__Nutzen__InfinitAssignment_2 )* ) ) ;
    public final void rule__Nutzen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:857:1: ( ( ( ( rule__Nutzen__InfinitAssignment_2 ) ) ( ( rule__Nutzen__InfinitAssignment_2 )* ) ) )
            // InternalBeleg.g:858:1: ( ( ( rule__Nutzen__InfinitAssignment_2 ) ) ( ( rule__Nutzen__InfinitAssignment_2 )* ) )
            {
            // InternalBeleg.g:858:1: ( ( ( rule__Nutzen__InfinitAssignment_2 ) ) ( ( rule__Nutzen__InfinitAssignment_2 )* ) )
            // InternalBeleg.g:859:2: ( ( rule__Nutzen__InfinitAssignment_2 ) ) ( ( rule__Nutzen__InfinitAssignment_2 )* )
            {
            // InternalBeleg.g:859:2: ( ( rule__Nutzen__InfinitAssignment_2 ) )
            // InternalBeleg.g:860:3: ( rule__Nutzen__InfinitAssignment_2 )
            {
             before(grammarAccess.getNutzenAccess().getInfinitAssignment_2()); 
            // InternalBeleg.g:861:3: ( rule__Nutzen__InfinitAssignment_2 )
            // InternalBeleg.g:861:4: rule__Nutzen__InfinitAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Nutzen__InfinitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getInfinitAssignment_2()); 

            }

            // InternalBeleg.g:864:2: ( ( rule__Nutzen__InfinitAssignment_2 )* )
            // InternalBeleg.g:865:3: ( rule__Nutzen__InfinitAssignment_2 )*
            {
             before(grammarAccess.getNutzenAccess().getInfinitAssignment_2()); 
            // InternalBeleg.g:866:3: ( rule__Nutzen__InfinitAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WORT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBeleg.g:866:4: rule__Nutzen__InfinitAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Nutzen__InfinitAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNutzenAccess().getInfinitAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__2__Impl"


    // $ANTLR start "rule__Ziel__Group__0"
    // InternalBeleg.g:876:1: rule__Ziel__Group__0 : rule__Ziel__Group__0__Impl rule__Ziel__Group__1 ;
    public final void rule__Ziel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:880:1: ( rule__Ziel__Group__0__Impl rule__Ziel__Group__1 )
            // InternalBeleg.g:881:2: rule__Ziel__Group__0__Impl rule__Ziel__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Ziel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0"


    // $ANTLR start "rule__Ziel__Group__0__Impl"
    // InternalBeleg.g:888:1: rule__Ziel__Group__0__Impl : ( ( rule__Ziel__SubstAssignment_0 ) ) ;
    public final void rule__Ziel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:892:1: ( ( ( rule__Ziel__SubstAssignment_0 ) ) )
            // InternalBeleg.g:893:1: ( ( rule__Ziel__SubstAssignment_0 ) )
            {
            // InternalBeleg.g:893:1: ( ( rule__Ziel__SubstAssignment_0 ) )
            // InternalBeleg.g:894:2: ( rule__Ziel__SubstAssignment_0 )
            {
             before(grammarAccess.getZielAccess().getSubstAssignment_0()); 
            // InternalBeleg.g:895:2: ( rule__Ziel__SubstAssignment_0 )
            // InternalBeleg.g:895:3: rule__Ziel__SubstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__SubstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getSubstAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0__Impl"


    // $ANTLR start "rule__Ziel__Group__1"
    // InternalBeleg.g:903:1: rule__Ziel__Group__1 : rule__Ziel__Group__1__Impl ;
    public final void rule__Ziel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:907:1: ( rule__Ziel__Group__1__Impl )
            // InternalBeleg.g:908:2: rule__Ziel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1"


    // $ANTLR start "rule__Ziel__Group__1__Impl"
    // InternalBeleg.g:914:1: rule__Ziel__Group__1__Impl : ( ( ( rule__Ziel__InfinitAssignment_1 ) ) ( ( rule__Ziel__InfinitAssignment_1 )* ) ) ;
    public final void rule__Ziel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:918:1: ( ( ( ( rule__Ziel__InfinitAssignment_1 ) ) ( ( rule__Ziel__InfinitAssignment_1 )* ) ) )
            // InternalBeleg.g:919:1: ( ( ( rule__Ziel__InfinitAssignment_1 ) ) ( ( rule__Ziel__InfinitAssignment_1 )* ) )
            {
            // InternalBeleg.g:919:1: ( ( ( rule__Ziel__InfinitAssignment_1 ) ) ( ( rule__Ziel__InfinitAssignment_1 )* ) )
            // InternalBeleg.g:920:2: ( ( rule__Ziel__InfinitAssignment_1 ) ) ( ( rule__Ziel__InfinitAssignment_1 )* )
            {
            // InternalBeleg.g:920:2: ( ( rule__Ziel__InfinitAssignment_1 ) )
            // InternalBeleg.g:921:3: ( rule__Ziel__InfinitAssignment_1 )
            {
             before(grammarAccess.getZielAccess().getInfinitAssignment_1()); 
            // InternalBeleg.g:922:3: ( rule__Ziel__InfinitAssignment_1 )
            // InternalBeleg.g:922:4: rule__Ziel__InfinitAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__Ziel__InfinitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getInfinitAssignment_1()); 

            }

            // InternalBeleg.g:925:2: ( ( rule__Ziel__InfinitAssignment_1 )* )
            // InternalBeleg.g:926:3: ( rule__Ziel__InfinitAssignment_1 )*
            {
             before(grammarAccess.getZielAccess().getInfinitAssignment_1()); 
            // InternalBeleg.g:927:3: ( rule__Ziel__InfinitAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WORT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBeleg.g:927:4: rule__Ziel__InfinitAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Ziel__InfinitAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getZielAccess().getInfinitAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1__Impl"


    // $ANTLR start "rule__Model__StoryAssignment"
    // InternalBeleg.g:937:1: rule__Model__StoryAssignment : ( ruleUser_Story_Um ) ;
    public final void rule__Model__StoryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:941:1: ( ( ruleUser_Story_Um ) )
            // InternalBeleg.g:942:2: ( ruleUser_Story_Um )
            {
            // InternalBeleg.g:942:2: ( ruleUser_Story_Um )
            // InternalBeleg.g:943:3: ruleUser_Story_Um
            {
             before(grammarAccess.getModelAccess().getStoryUser_Story_UmParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUser_Story_Um();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStoryUser_Story_UmParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StoryAssignment"


    // $ANTLR start "rule__User_Story_Um__TitleAssignment_0"
    // InternalBeleg.g:952:1: rule__User_Story_Um__TitleAssignment_0 : ( ruleTitel ) ;
    public final void rule__User_Story_Um__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:956:1: ( ( ruleTitel ) )
            // InternalBeleg.g:957:2: ( ruleTitel )
            {
            // InternalBeleg.g:957:2: ( ruleTitel )
            // InternalBeleg.g:958:3: ruleTitel
            {
             before(grammarAccess.getUser_Story_UmAccess().getTitleTitelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getTitleTitelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__TitleAssignment_0"


    // $ANTLR start "rule__User_Story_Um__DoppelpunktAssignment_1"
    // InternalBeleg.g:967:1: rule__User_Story_Um__DoppelpunktAssignment_1 : ( ruleDoppelPunktBlock ) ;
    public final void rule__User_Story_Um__DoppelpunktAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:971:1: ( ( ruleDoppelPunktBlock ) )
            // InternalBeleg.g:972:2: ( ruleDoppelPunktBlock )
            {
            // InternalBeleg.g:972:2: ( ruleDoppelPunktBlock )
            // InternalBeleg.g:973:3: ruleDoppelPunktBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getDoppelpunktDoppelPunktBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoppelPunktBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getDoppelpunktDoppelPunktBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__DoppelpunktAssignment_1"


    // $ANTLR start "rule__User_Story_Um__UmAssignment_2"
    // InternalBeleg.g:982:1: rule__User_Story_Um__UmAssignment_2 : ( ruleUmBlock ) ;
    public final void rule__User_Story_Um__UmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:986:1: ( ( ruleUmBlock ) )
            // InternalBeleg.g:987:2: ( ruleUmBlock )
            {
            // InternalBeleg.g:987:2: ( ruleUmBlock )
            // InternalBeleg.g:988:3: ruleUmBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getUmUmBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUmBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getUmUmBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__UmAssignment_2"


    // $ANTLR start "rule__User_Story_Um__UseAssignment_3"
    // InternalBeleg.g:997:1: rule__User_Story_Um__UseAssignment_3 : ( ruleNutzen ) ;
    public final void rule__User_Story_Um__UseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1001:1: ( ( ruleNutzen ) )
            // InternalBeleg.g:1002:2: ( ruleNutzen )
            {
            // InternalBeleg.g:1002:2: ( ruleNutzen )
            // InternalBeleg.g:1003:3: ruleNutzen
            {
             before(grammarAccess.getUser_Story_UmAccess().getUseNutzenParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getUseNutzenParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__UseAssignment_3"


    // $ANTLR start "rule__User_Story_Um__KommaAssignment_4"
    // InternalBeleg.g:1012:1: rule__User_Story_Um__KommaAssignment_4 : ( ruleKommaBlock ) ;
    public final void rule__User_Story_Um__KommaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1016:1: ( ( ruleKommaBlock ) )
            // InternalBeleg.g:1017:2: ( ruleKommaBlock )
            {
            // InternalBeleg.g:1017:2: ( ruleKommaBlock )
            // InternalBeleg.g:1018:3: ruleKommaBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getKommaKommaBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKommaBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getKommaKommaBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__KommaAssignment_4"


    // $ANTLR start "rule__User_Story_Um__MoechteAssignment_5"
    // InternalBeleg.g:1027:1: rule__User_Story_Um__MoechteAssignment_5 : ( ruleMoechteBlock ) ;
    public final void rule__User_Story_Um__MoechteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1031:1: ( ( ruleMoechteBlock ) )
            // InternalBeleg.g:1032:2: ( ruleMoechteBlock )
            {
            // InternalBeleg.g:1032:2: ( ruleMoechteBlock )
            // InternalBeleg.g:1033:3: ruleMoechteBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getMoechteMoechteBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMoechteBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getMoechteMoechteBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__MoechteAssignment_5"


    // $ANTLR start "rule__User_Story_Um__IchAssignment_6"
    // InternalBeleg.g:1042:1: rule__User_Story_Um__IchAssignment_6 : ( ruleIchBlock ) ;
    public final void rule__User_Story_Um__IchAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1046:1: ( ( ruleIchBlock ) )
            // InternalBeleg.g:1047:2: ( ruleIchBlock )
            {
            // InternalBeleg.g:1047:2: ( ruleIchBlock )
            // InternalBeleg.g:1048:3: ruleIchBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getIchIchBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIchBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getIchIchBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__IchAssignment_6"


    // $ANTLR start "rule__User_Story_Um__AlsAssignment_7"
    // InternalBeleg.g:1057:1: rule__User_Story_Um__AlsAssignment_7 : ( ruleAlsBlock ) ;
    public final void rule__User_Story_Um__AlsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1061:1: ( ( ruleAlsBlock ) )
            // InternalBeleg.g:1062:2: ( ruleAlsBlock )
            {
            // InternalBeleg.g:1062:2: ( ruleAlsBlock )
            // InternalBeleg.g:1063:3: ruleAlsBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getAlsAlsBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAlsBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getAlsAlsBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__AlsAssignment_7"


    // $ANTLR start "rule__User_Story_Um__RoleAssignment_8"
    // InternalBeleg.g:1072:1: rule__User_Story_Um__RoleAssignment_8 : ( ruleRolle ) ;
    public final void rule__User_Story_Um__RoleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1076:1: ( ( ruleRolle ) )
            // InternalBeleg.g:1077:2: ( ruleRolle )
            {
            // InternalBeleg.g:1077:2: ( ruleRolle )
            // InternalBeleg.g:1078:3: ruleRolle
            {
             before(grammarAccess.getUser_Story_UmAccess().getRoleRolleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getRoleRolleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__RoleAssignment_8"


    // $ANTLR start "rule__User_Story_Um__GoalAssignment_9"
    // InternalBeleg.g:1087:1: rule__User_Story_Um__GoalAssignment_9 : ( ruleZiel ) ;
    public final void rule__User_Story_Um__GoalAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1091:1: ( ( ruleZiel ) )
            // InternalBeleg.g:1092:2: ( ruleZiel )
            {
            // InternalBeleg.g:1092:2: ( ruleZiel )
            // InternalBeleg.g:1093:3: ruleZiel
            {
             before(grammarAccess.getUser_Story_UmAccess().getGoalZielParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getGoalZielParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__GoalAssignment_9"


    // $ANTLR start "rule__User_Story_Um__PunktAssignment_10"
    // InternalBeleg.g:1102:1: rule__User_Story_Um__PunktAssignment_10 : ( rulePunktBlock ) ;
    public final void rule__User_Story_Um__PunktAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1106:1: ( ( rulePunktBlock ) )
            // InternalBeleg.g:1107:2: ( rulePunktBlock )
            {
            // InternalBeleg.g:1107:2: ( rulePunktBlock )
            // InternalBeleg.g:1108:3: rulePunktBlock
            {
             before(grammarAccess.getUser_Story_UmAccess().getPunktPunktBlockParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePunktBlock();

            state._fsp--;

             after(grammarAccess.getUser_Story_UmAccess().getPunktPunktBlockParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story_Um__PunktAssignment_10"


    // $ANTLR start "rule__Titel__TextpartAssignment"
    // InternalBeleg.g:1117:1: rule__Titel__TextpartAssignment : ( ruleText ) ;
    public final void rule__Titel__TextpartAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1121:1: ( ( ruleText ) )
            // InternalBeleg.g:1122:2: ( ruleText )
            {
            // InternalBeleg.g:1122:2: ( ruleText )
            // InternalBeleg.g:1123:3: ruleText
            {
             before(grammarAccess.getTitelAccess().getTextpartTextParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTitelAccess().getTextpartTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__TextpartAssignment"


    // $ANTLR start "rule__Text__ValueAssignment"
    // InternalBeleg.g:1132:1: rule__Text__ValueAssignment : ( RULE_WORT ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1136:1: ( ( RULE_WORT ) )
            // InternalBeleg.g:1137:2: ( RULE_WORT )
            {
            // InternalBeleg.g:1137:2: ( RULE_WORT )
            // InternalBeleg.g:1138:3: RULE_WORT
            {
             before(grammarAccess.getTextAccess().getValueWORTTerminalRuleCall_0()); 
            match(input,RULE_WORT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getValueWORTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ValueAssignment"


    // $ANTLR start "rule__Nutzen__SubstAssignment_0"
    // InternalBeleg.g:1147:1: rule__Nutzen__SubstAssignment_0 : ( ruleSubstantiv ) ;
    public final void rule__Nutzen__SubstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1151:1: ( ( ruleSubstantiv ) )
            // InternalBeleg.g:1152:2: ( ruleSubstantiv )
            {
            // InternalBeleg.g:1152:2: ( ruleSubstantiv )
            // InternalBeleg.g:1153:3: ruleSubstantiv
            {
             before(grammarAccess.getNutzenAccess().getSubstSubstantivParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstantiv();

            state._fsp--;

             after(grammarAccess.getNutzenAccess().getSubstSubstantivParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__SubstAssignment_0"


    // $ANTLR start "rule__Nutzen__ZuAssignment_1"
    // InternalBeleg.g:1162:1: rule__Nutzen__ZuAssignment_1 : ( ruleZuBlock ) ;
    public final void rule__Nutzen__ZuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1166:1: ( ( ruleZuBlock ) )
            // InternalBeleg.g:1167:2: ( ruleZuBlock )
            {
            // InternalBeleg.g:1167:2: ( ruleZuBlock )
            // InternalBeleg.g:1168:3: ruleZuBlock
            {
             before(grammarAccess.getNutzenAccess().getZuZuBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleZuBlock();

            state._fsp--;

             after(grammarAccess.getNutzenAccess().getZuZuBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__ZuAssignment_1"


    // $ANTLR start "rule__Nutzen__InfinitAssignment_2"
    // InternalBeleg.g:1177:1: rule__Nutzen__InfinitAssignment_2 : ( ruleInfinit ) ;
    public final void rule__Nutzen__InfinitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1181:1: ( ( ruleInfinit ) )
            // InternalBeleg.g:1182:2: ( ruleInfinit )
            {
            // InternalBeleg.g:1182:2: ( ruleInfinit )
            // InternalBeleg.g:1183:3: ruleInfinit
            {
             before(grammarAccess.getNutzenAccess().getInfinitInfinitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInfinit();

            state._fsp--;

             after(grammarAccess.getNutzenAccess().getInfinitInfinitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__InfinitAssignment_2"


    // $ANTLR start "rule__Rolle__SubstAssignment"
    // InternalBeleg.g:1192:1: rule__Rolle__SubstAssignment : ( ruleSubstantiv ) ;
    public final void rule__Rolle__SubstAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1196:1: ( ( ruleSubstantiv ) )
            // InternalBeleg.g:1197:2: ( ruleSubstantiv )
            {
            // InternalBeleg.g:1197:2: ( ruleSubstantiv )
            // InternalBeleg.g:1198:3: ruleSubstantiv
            {
             before(grammarAccess.getRolleAccess().getSubstSubstantivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstantiv();

            state._fsp--;

             after(grammarAccess.getRolleAccess().getSubstSubstantivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__SubstAssignment"


    // $ANTLR start "rule__Ziel__SubstAssignment_0"
    // InternalBeleg.g:1207:1: rule__Ziel__SubstAssignment_0 : ( ruleSubstantiv ) ;
    public final void rule__Ziel__SubstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1211:1: ( ( ruleSubstantiv ) )
            // InternalBeleg.g:1212:2: ( ruleSubstantiv )
            {
            // InternalBeleg.g:1212:2: ( ruleSubstantiv )
            // InternalBeleg.g:1213:3: ruleSubstantiv
            {
             before(grammarAccess.getZielAccess().getSubstSubstantivParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstantiv();

            state._fsp--;

             after(grammarAccess.getZielAccess().getSubstSubstantivParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__SubstAssignment_0"


    // $ANTLR start "rule__Ziel__InfinitAssignment_1"
    // InternalBeleg.g:1222:1: rule__Ziel__InfinitAssignment_1 : ( ruleInfinit ) ;
    public final void rule__Ziel__InfinitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1226:1: ( ( ruleInfinit ) )
            // InternalBeleg.g:1227:2: ( ruleInfinit )
            {
            // InternalBeleg.g:1227:2: ( ruleInfinit )
            // InternalBeleg.g:1228:3: ruleInfinit
            {
             before(grammarAccess.getZielAccess().getInfinitInfinitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfinit();

            state._fsp--;

             after(grammarAccess.getZielAccess().getInfinitInfinitParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__InfinitAssignment_1"


    // $ANTLR start "rule__DoppelPunktBlock__ValueAssignment"
    // InternalBeleg.g:1237:1: rule__DoppelPunktBlock__ValueAssignment : ( ( ':' ) ) ;
    public final void rule__DoppelPunktBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1241:1: ( ( ( ':' ) ) )
            // InternalBeleg.g:1242:2: ( ( ':' ) )
            {
            // InternalBeleg.g:1242:2: ( ( ':' ) )
            // InternalBeleg.g:1243:3: ( ':' )
            {
             before(grammarAccess.getDoppelPunktBlockAccess().getValueColonKeyword_0()); 
            // InternalBeleg.g:1244:3: ( ':' )
            // InternalBeleg.g:1245:4: ':'
            {
             before(grammarAccess.getDoppelPunktBlockAccess().getValueColonKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDoppelPunktBlockAccess().getValueColonKeyword_0()); 

            }

             after(grammarAccess.getDoppelPunktBlockAccess().getValueColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoppelPunktBlock__ValueAssignment"


    // $ANTLR start "rule__UmBlock__ValueAssignment"
    // InternalBeleg.g:1256:1: rule__UmBlock__ValueAssignment : ( ( 'Um' ) ) ;
    public final void rule__UmBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1260:1: ( ( ( 'Um' ) ) )
            // InternalBeleg.g:1261:2: ( ( 'Um' ) )
            {
            // InternalBeleg.g:1261:2: ( ( 'Um' ) )
            // InternalBeleg.g:1262:3: ( 'Um' )
            {
             before(grammarAccess.getUmBlockAccess().getValueUmKeyword_0()); 
            // InternalBeleg.g:1263:3: ( 'Um' )
            // InternalBeleg.g:1264:4: 'Um'
            {
             before(grammarAccess.getUmBlockAccess().getValueUmKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUmBlockAccess().getValueUmKeyword_0()); 

            }

             after(grammarAccess.getUmBlockAccess().getValueUmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UmBlock__ValueAssignment"


    // $ANTLR start "rule__KommaBlock__ValueAssignment"
    // InternalBeleg.g:1275:1: rule__KommaBlock__ValueAssignment : ( ( ',' ) ) ;
    public final void rule__KommaBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1279:1: ( ( ( ',' ) ) )
            // InternalBeleg.g:1280:2: ( ( ',' ) )
            {
            // InternalBeleg.g:1280:2: ( ( ',' ) )
            // InternalBeleg.g:1281:3: ( ',' )
            {
             before(grammarAccess.getKommaBlockAccess().getValueCommaKeyword_0()); 
            // InternalBeleg.g:1282:3: ( ',' )
            // InternalBeleg.g:1283:4: ','
            {
             before(grammarAccess.getKommaBlockAccess().getValueCommaKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getKommaBlockAccess().getValueCommaKeyword_0()); 

            }

             after(grammarAccess.getKommaBlockAccess().getValueCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KommaBlock__ValueAssignment"


    // $ANTLR start "rule__ZuBlock__ValueAssignment"
    // InternalBeleg.g:1294:1: rule__ZuBlock__ValueAssignment : ( ( 'zu' ) ) ;
    public final void rule__ZuBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1298:1: ( ( ( 'zu' ) ) )
            // InternalBeleg.g:1299:2: ( ( 'zu' ) )
            {
            // InternalBeleg.g:1299:2: ( ( 'zu' ) )
            // InternalBeleg.g:1300:3: ( 'zu' )
            {
             before(grammarAccess.getZuBlockAccess().getValueZuKeyword_0()); 
            // InternalBeleg.g:1301:3: ( 'zu' )
            // InternalBeleg.g:1302:4: 'zu'
            {
             before(grammarAccess.getZuBlockAccess().getValueZuKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getZuBlockAccess().getValueZuKeyword_0()); 

            }

             after(grammarAccess.getZuBlockAccess().getValueZuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZuBlock__ValueAssignment"


    // $ANTLR start "rule__MoechteBlock__ValueAssignment"
    // InternalBeleg.g:1313:1: rule__MoechteBlock__ValueAssignment : ( ( 'm\\u00F6chte' ) ) ;
    public final void rule__MoechteBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1317:1: ( ( ( 'm\\u00F6chte' ) ) )
            // InternalBeleg.g:1318:2: ( ( 'm\\u00F6chte' ) )
            {
            // InternalBeleg.g:1318:2: ( ( 'm\\u00F6chte' ) )
            // InternalBeleg.g:1319:3: ( 'm\\u00F6chte' )
            {
             before(grammarAccess.getMoechteBlockAccess().getValueMöchteKeyword_0()); 
            // InternalBeleg.g:1320:3: ( 'm\\u00F6chte' )
            // InternalBeleg.g:1321:4: 'm\\u00F6chte'
            {
             before(grammarAccess.getMoechteBlockAccess().getValueMöchteKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoechteBlockAccess().getValueMöchteKeyword_0()); 

            }

             after(grammarAccess.getMoechteBlockAccess().getValueMöchteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoechteBlock__ValueAssignment"


    // $ANTLR start "rule__IchBlock__ValueAssignment"
    // InternalBeleg.g:1332:1: rule__IchBlock__ValueAssignment : ( ( 'ich' ) ) ;
    public final void rule__IchBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1336:1: ( ( ( 'ich' ) ) )
            // InternalBeleg.g:1337:2: ( ( 'ich' ) )
            {
            // InternalBeleg.g:1337:2: ( ( 'ich' ) )
            // InternalBeleg.g:1338:3: ( 'ich' )
            {
             before(grammarAccess.getIchBlockAccess().getValueIchKeyword_0()); 
            // InternalBeleg.g:1339:3: ( 'ich' )
            // InternalBeleg.g:1340:4: 'ich'
            {
             before(grammarAccess.getIchBlockAccess().getValueIchKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIchBlockAccess().getValueIchKeyword_0()); 

            }

             after(grammarAccess.getIchBlockAccess().getValueIchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IchBlock__ValueAssignment"


    // $ANTLR start "rule__AlsBlock__ValueAssignment"
    // InternalBeleg.g:1351:1: rule__AlsBlock__ValueAssignment : ( ( 'als' ) ) ;
    public final void rule__AlsBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1355:1: ( ( ( 'als' ) ) )
            // InternalBeleg.g:1356:2: ( ( 'als' ) )
            {
            // InternalBeleg.g:1356:2: ( ( 'als' ) )
            // InternalBeleg.g:1357:3: ( 'als' )
            {
             before(grammarAccess.getAlsBlockAccess().getValueAlsKeyword_0()); 
            // InternalBeleg.g:1358:3: ( 'als' )
            // InternalBeleg.g:1359:4: 'als'
            {
             before(grammarAccess.getAlsBlockAccess().getValueAlsKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlsBlockAccess().getValueAlsKeyword_0()); 

            }

             after(grammarAccess.getAlsBlockAccess().getValueAlsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlsBlock__ValueAssignment"


    // $ANTLR start "rule__PunktBlock__ValueAssignment"
    // InternalBeleg.g:1370:1: rule__PunktBlock__ValueAssignment : ( ( '.' ) ) ;
    public final void rule__PunktBlock__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1374:1: ( ( ( '.' ) ) )
            // InternalBeleg.g:1375:2: ( ( '.' ) )
            {
            // InternalBeleg.g:1375:2: ( ( '.' ) )
            // InternalBeleg.g:1376:3: ( '.' )
            {
             before(grammarAccess.getPunktBlockAccess().getValueFullStopKeyword_0()); 
            // InternalBeleg.g:1377:3: ( '.' )
            // InternalBeleg.g:1378:4: '.'
            {
             before(grammarAccess.getPunktBlockAccess().getValueFullStopKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPunktBlockAccess().getValueFullStopKeyword_0()); 

            }

             after(grammarAccess.getPunktBlockAccess().getValueFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PunktBlock__ValueAssignment"


    // $ANTLR start "rule__Substantiv__ValueAssignment"
    // InternalBeleg.g:1389:1: rule__Substantiv__ValueAssignment : ( RULE_WORT ) ;
    public final void rule__Substantiv__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1393:1: ( ( RULE_WORT ) )
            // InternalBeleg.g:1394:2: ( RULE_WORT )
            {
            // InternalBeleg.g:1394:2: ( RULE_WORT )
            // InternalBeleg.g:1395:3: RULE_WORT
            {
             before(grammarAccess.getSubstantivAccess().getValueWORTTerminalRuleCall_0()); 
            match(input,RULE_WORT,FOLLOW_2); 
             after(grammarAccess.getSubstantivAccess().getValueWORTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substantiv__ValueAssignment"


    // $ANTLR start "rule__Infinit__ValueAssignment"
    // InternalBeleg.g:1404:1: rule__Infinit__ValueAssignment : ( RULE_WORT ) ;
    public final void rule__Infinit__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeleg.g:1408:1: ( ( RULE_WORT ) )
            // InternalBeleg.g:1409:2: ( RULE_WORT )
            {
            // InternalBeleg.g:1409:2: ( RULE_WORT )
            // InternalBeleg.g:1410:3: RULE_WORT
            {
             before(grammarAccess.getInfinitAccess().getValueWORTTerminalRuleCall_0()); 
            match(input,RULE_WORT,FOLLOW_2); 
             after(grammarAccess.getInfinitAccess().getValueWORTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinit__ValueAssignment"

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