package com.raptor.mcloottable.conversion;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ULONG_RANGE_STARTValueConverter extends AbstractLexerBasedConverter<Long> {
  @Override
  public Long toValue(final String string, final INode node) throws ValueConverterException {
    long _xblockexpression = (long) 0;
    {
      boolean _isEmpty = Strings.isEmpty(string);
      if (_isEmpty) {
        throw new ValueConverterException("Couldn\'t convert empty string to a long value.", node, null);
      }
      boolean _endsWith = string.endsWith("..");
      boolean _not = (!_endsWith);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Couldn\'t convert \'");
        _builder.append(string);
        _builder.append("\' to a long value.");
        throw new ValueConverterException(_builder.toString(), node, null);
      }
      long _xtrycatchfinallyexpression = (long) 0;
      try {
        int _length = string.length();
        int _minus = (_length - 2);
        _xtrycatchfinallyexpression = Long.parseLong(string.substring(0, _minus));
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Couldn\'t convert \'");
          _builder_1.append(string);
          _builder_1.append("\' to a long value.");
          throw new ValueConverterException(_builder_1.toString(), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Long.valueOf(_xblockexpression);
  }
  
  @Override
  protected void assertValidValue(final Long value) {
    super.assertValidValue(value);
    if (((value).longValue() < 0)) {
      StringConcatenation _builder = new StringConcatenation();
      String _ruleName = this.getRuleName();
      _builder.append(_ruleName);
      _builder.append("-value may not be negative (value: ");
      _builder.append(value);
      _builder.append(").");
      throw new ValueConverterException(_builder.toString(), null, null);
    }
  }
  
  @Override
  protected String toEscapedString(final Long value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(value);
    _builder.append("..");
    return _builder.toString();
  }
}
