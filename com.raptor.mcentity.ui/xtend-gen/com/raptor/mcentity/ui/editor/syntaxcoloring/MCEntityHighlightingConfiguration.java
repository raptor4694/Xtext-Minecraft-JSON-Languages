package com.raptor.mcentity.ui.editor.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class MCEntityHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String KEY_ID = "key";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(MCEntityHighlightingConfiguration.KEY_ID, "Key", this.keyTextStyle());
  }
  
  public TextStyle keyTextStyle() {
    final TextStyle textStyle = this.defaultTextStyle().copy();
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
