package com.raptor.mcloottable.conversion;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DOUBLEValueConverter extends AbstractLexerBasedConverter<Double> {
  @Override
  protected String toEscapedString(final Double value) {
    return value.toString();
  }
  
  @Override
  protected void assertValidValue(final Double value) {
    super.assertValidValue(value);
    if ((value.isNaN() || value.isInfinite())) {
      StringConcatenation _builder = new StringConcatenation();
      String _ruleName = this.getRuleName();
      _builder.append(_ruleName);
      _builder.append("-value may not be NaN or infinite.");
      throw new ValueConverterException(_builder.toString(), null, null);
    }
  }
  
  @Override
  public Double toValue(final String string, final INode node) {
    double _xblockexpression = (double) 0;
    {
      boolean _isEmpty = Strings.isEmpty(string);
      if (_isEmpty) {
        throw new ValueConverterException("Couldn\'t convert empty string to a double value.", node, null);
      }
      InputOutput.<String>println(("Converting " + string));
      double _xtrycatchfinallyexpression = (double) 0;
      try {
        _xtrycatchfinallyexpression = Double.parseDouble(string);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          e.printStackTrace();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Couldn\'t convert \'");
          _builder.append(string);
          _builder.append("\' to a double value.");
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
