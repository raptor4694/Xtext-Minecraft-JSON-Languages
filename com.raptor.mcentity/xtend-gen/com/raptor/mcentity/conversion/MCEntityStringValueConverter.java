package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

@SuppressWarnings("all")
public class MCEntityStringValueConverter extends AbstractLexerBasedConverter<String> {
  @Override
  public String toValue(final String string, final INode node) throws ValueConverterException {
    if ((((string == null) || string.isEmpty()) || ((!string.startsWith("\'")) && (!string.startsWith("\""))))) {
      throw new ValueConverterException(("invalid string: " + string), node, null);
    }
    final char first = string.charAt(0);
    int _length = string.length();
    int _minus = (_length - 1);
    final char last = string.charAt(_minus);
    if ((first != last)) {
      throw new ValueConverterException(("invalid string: " + string), node, null);
    }
    int _length_1 = string.length();
    int _minus_1 = (_length_1 - 1);
    return Strings.convertFromJavaString(string.substring(1, _minus_1), true);
  }
  
  @Override
  public String toString(final String value) {
    String _convertToJavaString = Strings.convertToJavaString(value, false);
    String _plus = ("\"" + _convertToJavaString);
    return (_plus + "\"");
  }
}
