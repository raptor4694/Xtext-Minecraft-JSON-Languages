package com.raptor.mcmodel.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

import static com.raptor.mcmodel.ui.editor.syntaxcoloring.McmodelHighlightingConfiguration.*

class McmodelAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	override protected calculateId(String tokenName, int tokenType) {
		switch (tokenName) {
			case 'RULE_PERCENTAGE', case 'RULE_DOUBLE', case 'RULE_ULONG', case 'RULE_SLONG': NUMBER_ID
			default: super.calculateId(tokenName, tokenType)
		}
	}
	
}