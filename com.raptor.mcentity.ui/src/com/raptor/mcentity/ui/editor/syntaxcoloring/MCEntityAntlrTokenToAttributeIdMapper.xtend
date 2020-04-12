package com.raptor.mcentity.ui.editor.syntaxcoloring

import static org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles.*
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

class MCEntityAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
	
	override protected calculateId(String tokenName, int tokenType) {
		switch(tokenName) {
			case 'RULE_ML_COMMENT', case 'RULE_SL_COMMENT': COMMENT_ID
			case 'RULE_STRING', case 'RULE_SINGLE_STRING': STRING_ID
			case "'true'", case '"true"', case "'false'", case '"false"': KEYWORD_ID
			case 'RULE_INT', case 'RULE_LONG', case 'RULE_FLOAT', case 'RULE_DOUBLE', case 'RULE_SHORT', case 'RULE_BYTE': NUMBER_ID
			default: DEFAULT_ID
		}
	}
	
}