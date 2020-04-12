package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class MCEntityIDValueConverter extends AbstractLexerBasedConverter<String> {
  @Override
  public String toValue(final String string, final INode node) throws ValueConverterException {
    return string;
  }
}
