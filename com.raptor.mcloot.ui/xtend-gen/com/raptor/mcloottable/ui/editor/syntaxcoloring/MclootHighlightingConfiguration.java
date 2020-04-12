package com.raptor.mcloottable.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MclootHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String KEY_ID = "key";
  
  public static final String NAMESPACE_ID = "namespace";
  
  public static final String NAMESPACE_KEY_ID = "namespace_key";
  
  public static final String FUNCTION_ID = "function";
  
  public static final String CONDITION_ID = "condition";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor it) {
    super.configure(it);
    it.acceptDefaultHighlighting(MclootHighlightingConfiguration.KEY_ID, "Key", this.keyTextStyle());
    it.acceptDefaultHighlighting(MclootHighlightingConfiguration.NAMESPACE_ID, "Namespace", this.namespaceTextStyle());
    it.acceptDefaultHighlighting(MclootHighlightingConfiguration.NAMESPACE_KEY_ID, "Key (Namespace)", this.namespaceKeyTextStyle());
    it.acceptDefaultHighlighting(MclootHighlightingConfiguration.FUNCTION_ID, "Function", this.functionTextStyle());
    it.acceptDefaultHighlighting(MclootHighlightingConfiguration.CONDITION_ID, "Condition", this.conditionTextStyle());
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
  
  public TextStyle functionTextStyle() {
    TextStyle _copy = this.defaultTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      it.setStyle(SWT.BOLD);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle conditionTextStyle() {
    TextStyle _copy = this.defaultTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      it.setStyle(SWT.ITALIC);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
}
