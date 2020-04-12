package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MCEntityFloatValueConverter extends AbstractLexerBasedConverter<Float> {
  @Override
  public Float toValue(final String string, final INode node) throws ValueConverterException {
    float _xblockexpression = (float) 0;
    {
      if ((((string == null) || string.isEmpty()) || ((!string.endsWith("f")) && (!string.endsWith("F"))))) {
        throw new ValueConverterException(("invalid float: " + string), node, null);
      }
      float _xtrycatchfinallyexpression = (float) 0;
      try {
        int _length = string.length();
        int _minus = (_length - 1);
        _xtrycatchfinallyexpression = Float.parseFloat(string.substring(0, _minus));
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException(("invalid float: " + string), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Float.valueOf(_xblockexpression);
  }
  
  @Override
  public String toString(final Float value) {
    return (value + "f");
  }
}
