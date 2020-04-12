package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MCEntityLongValueConverter extends AbstractLexerBasedConverter<Long> {
  @Override
  public Long toValue(final String string, final INode node) throws ValueConverterException {
    long _xblockexpression = (long) 0;
    {
      String str = string;
      if (((str == null) || str.isEmpty())) {
        throw new ValueConverterException(("invalid long: " + string), node, null);
      }
      int base = 10;
      if ((str.startsWith("0x") || str.startsWith("0X"))) {
        base = 16;
        str = str.substring(2);
      } else {
        if ((str.startsWith("0b") || str.startsWith("0B"))) {
          base = 2;
          str = str.substring(2);
        }
      }
      long _xtrycatchfinallyexpression = (long) 0;
      try {
        int _length = str.length();
        int _minus = (_length - 1);
        _xtrycatchfinallyexpression = Long.parseLong(str.substring(0, _minus), base);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException(("invalid long: " + string), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Long.valueOf(_xblockexpression);
  }
  
  @Override
  public String toString(final Long value) {
    return (value + "L");
  }
}
