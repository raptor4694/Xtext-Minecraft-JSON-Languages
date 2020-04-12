package com.raptor.mcmodel.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

@SuppressWarnings("all")
public class McmodelAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    if (tokenName != null) {
      switch (tokenName) {
        case "RULE_PERCENTAGE":
        case "RULE_DOUBLE":
        case "RULE_ULONG":
        case "RULE_SLONG":
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
