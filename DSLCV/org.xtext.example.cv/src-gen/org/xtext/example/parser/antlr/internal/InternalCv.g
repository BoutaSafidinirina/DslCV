/*
 * generated by Xtext 2.32.0
 */
grammar InternalCv;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='cv'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCvKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='name'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getNameKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='title'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getTitleKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getColonKeyword_6());
		}
		(
			(
				lv_title_7_0=RULE_STRING
				{
					newLeafNode(lv_title_7_0, grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='about'
		{
			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getAboutKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getColonKeyword_9());
		}
		(
			(
				lv_about_10_0=RULE_STRING
				{
					newLeafNode(lv_about_10_0, grammarAccess.getModelAccess().getAboutSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"about",
						lv_about_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='education'
		{
			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getEducationKeyword_11());
		}
		otherlv_12=':'
		{
			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getColonKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getEducationEducationParserRuleCall_13_0());
				}
				lv_education_13_0=ruleEducation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"education",
						lv_education_13_0,
						"org.xtext.example.Cv.Education");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_14='experience'
		{
			newLeafNode(otherlv_14, grammarAccess.getModelAccess().getExperienceKeyword_14());
		}
		otherlv_15=':'
		{
			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getColonKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getExperienceExperienceParserRuleCall_16_0());
				}
				lv_experience_16_0=ruleExperience
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"experience",
						lv_experience_16_0,
						"org.xtext.example.Cv.Experience");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_17='contact'
		{
			newLeafNode(otherlv_17, grammarAccess.getModelAccess().getContactKeyword_17());
		}
		otherlv_18=':'
		{
			newLeafNode(otherlv_18, grammarAccess.getModelAccess().getColonKeyword_18());
		}
		(
			(
				lv_contact_19_0=RULE_STRING
				{
					newLeafNode(lv_contact_19_0, grammarAccess.getModelAccess().getContactSTRINGTerminalRuleCall_19_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"contact",
						lv_contact_19_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_20());
		}
	)
;

// Entry rule entryRuleEducation
entryRuleEducation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEducationRule()); }
	iv_ruleEducation=ruleEducation
	{ $current=$iv_ruleEducation.current; }
	EOF;

// Rule Education
ruleEducation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='edu'
		{
			newLeafNode(otherlv_0, grammarAccess.getEducationAccess().getEduKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getEducationAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='degree'
		{
			newLeafNode(otherlv_2, grammarAccess.getEducationAccess().getDegreeKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getEducationAccess().getColonKeyword_3());
		}
		(
			(
				lv_degree_4_0=RULE_STRING
				{
					newLeafNode(lv_degree_4_0, grammarAccess.getEducationAccess().getDegreeSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEducationRule());
					}
					setWithLastConsumed(
						$current,
						"degree",
						lv_degree_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='university'
		{
			newLeafNode(otherlv_5, grammarAccess.getEducationAccess().getUniversityKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getEducationAccess().getColonKeyword_6());
		}
		(
			(
				lv_university_7_0=RULE_STRING
				{
					newLeafNode(lv_university_7_0, grammarAccess.getEducationAccess().getUniversitySTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEducationRule());
					}
					setWithLastConsumed(
						$current,
						"university",
						lv_university_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='year'
		{
			newLeafNode(otherlv_8, grammarAccess.getEducationAccess().getYearKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getEducationAccess().getColonKeyword_9());
		}
		(
			(
				lv_year_10_0=RULE_INT
				{
					newLeafNode(lv_year_10_0, grammarAccess.getEducationAccess().getYearINTTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEducationRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_10_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getEducationAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleExperience
entryRuleExperience returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExperienceRule()); }
	iv_ruleExperience=ruleExperience
	{ $current=$iv_ruleExperience.current; }
	EOF;

// Rule Experience
ruleExperience returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='exp'
		{
			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExpKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='position'
		{
			newLeafNode(otherlv_2, grammarAccess.getExperienceAccess().getPositionKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getExperienceAccess().getColonKeyword_3());
		}
		(
			(
				lv_position_4_0=RULE_STRING
				{
					newLeafNode(lv_position_4_0, grammarAccess.getExperienceAccess().getPositionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExperienceRule());
					}
					setWithLastConsumed(
						$current,
						"position",
						lv_position_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='company'
		{
			newLeafNode(otherlv_5, grammarAccess.getExperienceAccess().getCompanyKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getExperienceAccess().getColonKeyword_6());
		}
		(
			(
				lv_company_7_0=RULE_STRING
				{
					newLeafNode(lv_company_7_0, grammarAccess.getExperienceAccess().getCompanySTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExperienceRule());
					}
					setWithLastConsumed(
						$current,
						"company",
						lv_company_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='year'
		{
			newLeafNode(otherlv_8, grammarAccess.getExperienceAccess().getYearKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getExperienceAccess().getColonKeyword_9());
		}
		(
			(
				lv_year_10_0=RULE_INT
				{
					newLeafNode(lv_year_10_0, grammarAccess.getExperienceAccess().getYearINTTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExperienceRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_10_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
