package com.raptor.mcentity.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

@SuppressWarnings("all")
public class MCEntityAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    if (tokenName != null) {
      switch (tokenName) {
        case "RULE_ML_COMMENT":
        case "RULE_SL_COMMENT":
          _switchResult = HighlightingStyles.COMMENT_ID;
          break;
        case "RULE_STRING":
        case "RULE_SINGLE_STRING":
          _switchResult = HighlightingStyles.STRING_ID;
          break;
        case "\'true\'":
        case "\"true\"":
        case "\'false\'":
        case "\"false\"":
          _switchResult = HighlightingStyles.KEYWORD_ID;
          break;
        case "RULE_INT":
        case "RULE_LONG":
        case "RULE_FLOAT":
        case "RULE_DOUBLE":
        case "RULE_SHORT":
        case "RULE_BYTE":
          _switchResult = HighlightingStyles.NUMBER_ID;
          break;
        default:
          _switchResult = HighlightingStyles.DEFAULT_ID;
          break;
      }
    } else {
      _switchResult = HighlightingStyles.DEFAULT_ID;
    }
    return _switchResult;
  }
}
