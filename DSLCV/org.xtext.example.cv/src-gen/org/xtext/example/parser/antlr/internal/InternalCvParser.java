package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.CvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cv'", "'{'", "'name'", "':'", "'title'", "'about'", "'education'", "'experience'", "'contact'", "'}'", "'edu'", "'degree'", "'university'", "'year'", "'exp'", "'position'", "'company'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCvParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCv.g"; }



     	private CvGrammarAccess grammarAccess;

        public InternalCvParser(TokenStream input, CvGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CvGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCv.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCv.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCv.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalCv.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'cv' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'title' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'about' otherlv_9= ':' ( (lv_about_10_0= RULE_STRING ) ) otherlv_11= 'education' otherlv_12= ':' ( (lv_education_13_0= ruleEducation ) )* otherlv_14= 'experience' otherlv_15= ':' ( (lv_experience_16_0= ruleExperience ) )* otherlv_17= 'contact' otherlv_18= ':' ( (lv_contact_19_0= RULE_STRING ) ) otherlv_20= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_title_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_about_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_contact_19_0=null;
        Token otherlv_20=null;
        EObject lv_education_13_0 = null;

        EObject lv_experience_16_0 = null;



        	enterRule();

        try {
            // InternalCv.g:77:2: ( (otherlv_0= 'cv' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'title' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'about' otherlv_9= ':' ( (lv_about_10_0= RULE_STRING ) ) otherlv_11= 'education' otherlv_12= ':' ( (lv_education_13_0= ruleEducation ) )* otherlv_14= 'experience' otherlv_15= ':' ( (lv_experience_16_0= ruleExperience ) )* otherlv_17= 'contact' otherlv_18= ':' ( (lv_contact_19_0= RULE_STRING ) ) otherlv_20= '}' ) )
            // InternalCv.g:78:2: (otherlv_0= 'cv' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'title' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'about' otherlv_9= ':' ( (lv_about_10_0= RULE_STRING ) ) otherlv_11= 'education' otherlv_12= ':' ( (lv_education_13_0= ruleEducation ) )* otherlv_14= 'experience' otherlv_15= ':' ( (lv_experience_16_0= ruleExperience ) )* otherlv_17= 'contact' otherlv_18= ':' ( (lv_contact_19_0= RULE_STRING ) ) otherlv_20= '}' )
            {
            // InternalCv.g:78:2: (otherlv_0= 'cv' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'title' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'about' otherlv_9= ':' ( (lv_about_10_0= RULE_STRING ) ) otherlv_11= 'education' otherlv_12= ':' ( (lv_education_13_0= ruleEducation ) )* otherlv_14= 'experience' otherlv_15= ':' ( (lv_experience_16_0= ruleExperience ) )* otherlv_17= 'contact' otherlv_18= ':' ( (lv_contact_19_0= RULE_STRING ) ) otherlv_20= '}' )
            // InternalCv.g:79:3: otherlv_0= 'cv' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'title' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'about' otherlv_9= ':' ( (lv_about_10_0= RULE_STRING ) ) otherlv_11= 'education' otherlv_12= ':' ( (lv_education_13_0= ruleEducation ) )* otherlv_14= 'experience' otherlv_15= ':' ( (lv_experience_16_0= ruleExperience ) )* otherlv_17= 'contact' otherlv_18= ':' ( (lv_contact_19_0= RULE_STRING ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCvKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
            		
            // InternalCv.g:95:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCv.g:96:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCv.g:96:4: (lv_name_4_0= RULE_STRING )
            // InternalCv.g:97:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getTitleKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getColonKeyword_6());
            		
            // InternalCv.g:121:3: ( (lv_title_7_0= RULE_STRING ) )
            // InternalCv.g:122:4: (lv_title_7_0= RULE_STRING )
            {
            // InternalCv.g:122:4: (lv_title_7_0= RULE_STRING )
            // InternalCv.g:123:5: lv_title_7_0= RULE_STRING
            {
            lv_title_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_7_0, grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getAboutKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getColonKeyword_9());
            		
            // InternalCv.g:147:3: ( (lv_about_10_0= RULE_STRING ) )
            // InternalCv.g:148:4: (lv_about_10_0= RULE_STRING )
            {
            // InternalCv.g:148:4: (lv_about_10_0= RULE_STRING )
            // InternalCv.g:149:5: lv_about_10_0= RULE_STRING
            {
            lv_about_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_about_10_0, grammarAccess.getModelAccess().getAboutSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"about",
            						lv_about_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getEducationKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getColonKeyword_12());
            		
            // InternalCv.g:173:3: ( (lv_education_13_0= ruleEducation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCv.g:174:4: (lv_education_13_0= ruleEducation )
            	    {
            	    // InternalCv.g:174:4: (lv_education_13_0= ruleEducation )
            	    // InternalCv.g:175:5: lv_education_13_0= ruleEducation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEducationEducationParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_education_13_0=ruleEducation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"education",
            	    						lv_education_13_0,
            	    						"org.xtext.example.Cv.Education");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getModelAccess().getExperienceKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getColonKeyword_15());
            		
            // InternalCv.g:200:3: ( (lv_experience_16_0= ruleExperience ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCv.g:201:4: (lv_experience_16_0= ruleExperience )
            	    {
            	    // InternalCv.g:201:4: (lv_experience_16_0= ruleExperience )
            	    // InternalCv.g:202:5: lv_experience_16_0= ruleExperience
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getExperienceExperienceParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_experience_16_0=ruleExperience();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"experience",
            	    						lv_experience_16_0,
            	    						"org.xtext.example.Cv.Experience");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getModelAccess().getContactKeyword_17());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getModelAccess().getColonKeyword_18());
            		
            // InternalCv.g:227:3: ( (lv_contact_19_0= RULE_STRING ) )
            // InternalCv.g:228:4: (lv_contact_19_0= RULE_STRING )
            {
            // InternalCv.g:228:4: (lv_contact_19_0= RULE_STRING )
            // InternalCv.g:229:5: lv_contact_19_0= RULE_STRING
            {
            lv_contact_19_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_contact_19_0, grammarAccess.getModelAccess().getContactSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contact",
            						lv_contact_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEducation"
    // InternalCv.g:253:1: entryRuleEducation returns [EObject current=null] : iv_ruleEducation= ruleEducation EOF ;
    public final EObject entryRuleEducation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducation = null;


        try {
            // InternalCv.g:253:50: (iv_ruleEducation= ruleEducation EOF )
            // InternalCv.g:254:2: iv_ruleEducation= ruleEducation EOF
            {
             newCompositeNode(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEducation=ruleEducation();

            state._fsp--;

             current =iv_ruleEducation; 
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
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalCv.g:260:1: ruleEducation returns [EObject current=null] : (otherlv_0= 'edu' otherlv_1= '{' otherlv_2= 'degree' otherlv_3= ':' ( (lv_degree_4_0= RULE_STRING ) ) otherlv_5= 'university' otherlv_6= ':' ( (lv_university_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) ;
    public final EObject ruleEducation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_degree_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_university_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_year_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalCv.g:266:2: ( (otherlv_0= 'edu' otherlv_1= '{' otherlv_2= 'degree' otherlv_3= ':' ( (lv_degree_4_0= RULE_STRING ) ) otherlv_5= 'university' otherlv_6= ':' ( (lv_university_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) )
            // InternalCv.g:267:2: (otherlv_0= 'edu' otherlv_1= '{' otherlv_2= 'degree' otherlv_3= ':' ( (lv_degree_4_0= RULE_STRING ) ) otherlv_5= 'university' otherlv_6= ':' ( (lv_university_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            {
            // InternalCv.g:267:2: (otherlv_0= 'edu' otherlv_1= '{' otherlv_2= 'degree' otherlv_3= ':' ( (lv_degree_4_0= RULE_STRING ) ) otherlv_5= 'university' otherlv_6= ':' ( (lv_university_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            // InternalCv.g:268:3: otherlv_0= 'edu' otherlv_1= '{' otherlv_2= 'degree' otherlv_3= ':' ( (lv_degree_4_0= RULE_STRING ) ) otherlv_5= 'university' otherlv_6= ':' ( (lv_university_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEducationAccess().getEduKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEducationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEducationAccess().getDegreeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEducationAccess().getColonKeyword_3());
            		
            // InternalCv.g:284:3: ( (lv_degree_4_0= RULE_STRING ) )
            // InternalCv.g:285:4: (lv_degree_4_0= RULE_STRING )
            {
            // InternalCv.g:285:4: (lv_degree_4_0= RULE_STRING )
            // InternalCv.g:286:5: lv_degree_4_0= RULE_STRING
            {
            lv_degree_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_degree_4_0, grammarAccess.getEducationAccess().getDegreeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degree",
            						lv_degree_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEducationAccess().getUniversityKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getEducationAccess().getColonKeyword_6());
            		
            // InternalCv.g:310:3: ( (lv_university_7_0= RULE_STRING ) )
            // InternalCv.g:311:4: (lv_university_7_0= RULE_STRING )
            {
            // InternalCv.g:311:4: (lv_university_7_0= RULE_STRING )
            // InternalCv.g:312:5: lv_university_7_0= RULE_STRING
            {
            lv_university_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_university_7_0, grammarAccess.getEducationAccess().getUniversitySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"university",
            						lv_university_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getEducationAccess().getYearKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getEducationAccess().getColonKeyword_9());
            		
            // InternalCv.g:336:3: ( (lv_year_10_0= RULE_INT ) )
            // InternalCv.g:337:4: (lv_year_10_0= RULE_INT )
            {
            // InternalCv.g:337:4: (lv_year_10_0= RULE_INT )
            // InternalCv.g:338:5: lv_year_10_0= RULE_INT
            {
            lv_year_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_year_10_0, grammarAccess.getEducationAccess().getYearINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEducationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleExperience"
    // InternalCv.g:362:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalCv.g:362:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalCv.g:363:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
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
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalCv.g:369:1: ruleExperience returns [EObject current=null] : (otherlv_0= 'exp' otherlv_1= '{' otherlv_2= 'position' otherlv_3= ':' ( (lv_position_4_0= RULE_STRING ) ) otherlv_5= 'company' otherlv_6= ':' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_position_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_company_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_year_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalCv.g:375:2: ( (otherlv_0= 'exp' otherlv_1= '{' otherlv_2= 'position' otherlv_3= ':' ( (lv_position_4_0= RULE_STRING ) ) otherlv_5= 'company' otherlv_6= ':' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) )
            // InternalCv.g:376:2: (otherlv_0= 'exp' otherlv_1= '{' otherlv_2= 'position' otherlv_3= ':' ( (lv_position_4_0= RULE_STRING ) ) otherlv_5= 'company' otherlv_6= ':' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            {
            // InternalCv.g:376:2: (otherlv_0= 'exp' otherlv_1= '{' otherlv_2= 'position' otherlv_3= ':' ( (lv_position_4_0= RULE_STRING ) ) otherlv_5= 'company' otherlv_6= ':' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            // InternalCv.g:377:3: otherlv_0= 'exp' otherlv_1= '{' otherlv_2= 'position' otherlv_3= ':' ( (lv_position_4_0= RULE_STRING ) ) otherlv_5= 'company' otherlv_6= ':' ( (lv_company_7_0= RULE_STRING ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExpKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExperienceAccess().getPositionKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExperienceAccess().getColonKeyword_3());
            		
            // InternalCv.g:393:3: ( (lv_position_4_0= RULE_STRING ) )
            // InternalCv.g:394:4: (lv_position_4_0= RULE_STRING )
            {
            // InternalCv.g:394:4: (lv_position_4_0= RULE_STRING )
            // InternalCv.g:395:5: lv_position_4_0= RULE_STRING
            {
            lv_position_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_position_4_0, grammarAccess.getExperienceAccess().getPositionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getExperienceAccess().getCompanyKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getExperienceAccess().getColonKeyword_6());
            		
            // InternalCv.g:419:3: ( (lv_company_7_0= RULE_STRING ) )
            // InternalCv.g:420:4: (lv_company_7_0= RULE_STRING )
            {
            // InternalCv.g:420:4: (lv_company_7_0= RULE_STRING )
            // InternalCv.g:421:5: lv_company_7_0= RULE_STRING
            {
            lv_company_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_company_7_0, grammarAccess.getExperienceAccess().getCompanySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getExperienceAccess().getYearKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getExperienceAccess().getColonKeyword_9());
            		
            // InternalCv.g:445:3: ( (lv_year_10_0= RULE_INT ) )
            // InternalCv.g:446:4: (lv_year_10_0= RULE_INT )
            {
            // InternalCv.g:446:4: (lv_year_10_0= RULE_INT )
            // InternalCv.g:447:5: lv_year_10_0= RULE_INT
            {
            lv_year_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_year_10_0, grammarAccess.getExperienceAccess().getYearINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleExperience"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});

}