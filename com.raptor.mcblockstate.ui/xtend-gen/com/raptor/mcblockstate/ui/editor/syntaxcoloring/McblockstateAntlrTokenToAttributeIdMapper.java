package com.raptor.mcblockstate.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

@SuppressWarnings("all")
public class McblockstateAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  public String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    if (tokenName != null) {
      switch (tokenName) {
        case "\'x\'":
        case "\"x\"":
        case "\'y\'":
        case "\"y\"":
        case "\'uvlock\'":
        case "\"uvlock\"":
          _switchResult = DefaultHighlightingConfiguration.DEFAULT_ID;
          break;
        case "RULE_ULONG":
        case "RULE_SLONG":
        case "RULE_DOUBLE":
          _switchResult = DefaultHighlightingConfiguration.NUMBER_ID;
          break;
        default:
          _switchResult = super.calculateId(tokenName, tokenType);
          break;
      }
    } else {
      _switchResult = super.calculateId(tokenName, tokenType);
    }
    return _switchResult;
  }
}
