package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MCEntityDoubleValueConverter extends AbstractLexerBasedConverter<Double> {
  @Override
  public Double toValue(final String string, final INode node) throws ValueConverterException {
    double _xblockexpression = (double) 0;
    {
      if (((string == null) || string.isEmpty())) {
        throw new ValueConverterException(("invalid double: " + string), node, null);
      }
      double _xtrycatchfinallyexpression = (double) 0;
      try {
        String _xifexpression = null;
        if ((string.endsWith("d") || string.endsWith("D"))) {
          int _length = string.length();
          int _minus = (_length - 1);
          _xifexpression = string.substring(0, _minus);
        } else {
          _xifexpression = string;
        }
        _xtrycatchfinallyexpression = Double.parseDouble(_xifexpression);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException(("invalid double: " + string), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Double.valueOf(_xblockexpression);
  }
  
  @Override
  public String toString(final Double value) {
    return (value + "f");
  }
}
