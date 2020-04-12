package com.raptor.mcblockstate.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

import static com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateHighlightingConfiguration.*

class McblockstateAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	override calculateId(String tokenName, int tokenType) {
		switch (tokenName) {
			case "'x'", case '"x"', 
			case "'y'", case '"y"',
			case "'uvlock'", case '"uvlock"': DEFAULT_ID
			case "RULE_ULONG", case "RULE_SLONG", case "RULE_DOUBLE": NUMBER_ID
			default: super.calculateId(tokenName, tokenType)
		}
	}
	
}