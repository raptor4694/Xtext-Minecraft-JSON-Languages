package com.raptor.mcmodel.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class McmodelHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String KEY_ID = "key";
  
  public static final String NAMESPACE_ID = "namespace";
  
  public static final String NAMESPACE_KEY_ID = "namespace_key";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor it) {
    super.configure(it);
    it.acceptDefaultHighlighting(McmodelHighlightingConfiguration.KEY_ID, "Key", this.keyTextStyle());
    it.acceptDefaultHighlighting(McmodelHighlightingConfiguration.NAMESPACE_ID, "Namespace", this.namespaceTextStyle());
    it.acceptDefaultHighlighting(McmodelHighlightingConfiguration.NAMESPACE_KEY_ID, "Key (Namespace)", this.namespaceKeyTextStyle());
  }
  
  public TextStyle keyTextStyle() {
    TextStyle _copy = this.keywordTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      it.setStyle(SWT.NONE);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle namespaceTextStyle() {
    TextStyle _copy = this.defaultTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      RGB _rGB = new RGB(100, 100, 100);
      it.setColor(_rGB);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle namespaceKeyTextStyle() {
    return this.defaultTextStyle();
  }
}
