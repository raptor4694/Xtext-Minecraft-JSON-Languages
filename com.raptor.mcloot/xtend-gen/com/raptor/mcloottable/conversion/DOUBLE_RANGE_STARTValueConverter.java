package com.raptor.mcloottable.conversion;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DOUBLE_RANGE_STARTValueConverter extends AbstractLexerBasedConverter<Double> {
  @Override
  public Double toValue(final String string, final INode node) throws ValueConverterException {
    double _xblockexpression = (double) 0;
    {
      boolean _isEmpty = Strings.isEmpty(string);
      if (_isEmpty) {
        throw new ValueConverterException("Couldn\'t convert empty string to a double value.", node, null);
      }
      InputOutput.<String>println(("Parsing " + string));
      boolean _endsWith = string.endsWith("...");
      boolean _not = (!_endsWith);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Couldn\'t convert \'");
        _builder.append(string);
        _builder.append("\' to a double value.");
        throw new ValueConverterException(_builder.toString(), node, null);
      }
      double _xtrycatchfinallyexpression = (double) 0;
      try {
        int _length = string.length();
        int _minus = (_length - 3);
        _xtrycatchfinallyexpression = Double.parseDouble(string.substring(0, _minus));
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Couldn\'t convert \'");
          _builder_1.append(string);
          _builder_1.append("\' to a double value.");
          throw new ValueConverterException(_builder_1.toString(), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Double.valueOf(_xblockexpression);
  }
  
  @Override
  protected String toEscapedString(final Double value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(value);
    _builder.append("..");
    return _builder.toString();
  }
}
