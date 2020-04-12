package com.raptor.mcloottable.conversion;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class PercentageValueConverter extends AbstractLexerBasedConverter<Double> {
  @Override
  protected String toEscapedString(final Double value) {
    return (Double.valueOf(((value).doubleValue() * 100)) + "%");
  }
  
  @Override
  public Double toValue(final String string, final INode node) {
    double _xblockexpression = (double) 0;
    {
      boolean _isEmpty = Strings.isEmpty(string);
      if (_isEmpty) {
        throw new ValueConverterException("Couldn\'t convert empty string to a percentage value.", node, null);
      }
      InputOutput.<String>println(("Parsing " + string));
      boolean _endsWith = string.endsWith("%");
      boolean _not = (!_endsWith);
      if (_not) {
        throw new ValueConverterException("Couldn\'t convert string to a percentage as it did not end with \'%\'", node, null);
      }
      double _xtrycatchfinallyexpression = (double) 0;
      try {
        int _length = string.length();
        int _minus = (_length - 1);
        double _parseDouble = Double.parseDouble(string.substring(0, _minus));
        _xtrycatchfinallyexpression = (_parseDouble / 100.0);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Couldn\'t convert ");
          _builder.append(string);
          _builder.append(" to a percentage value.");
          throw new ValueConverterException(_builder.toString(), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Double.valueOf(_xblockexpression);
  }
}
