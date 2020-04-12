package com.raptor.mcentity.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MCEntityShortValueConverter extends AbstractLexerBasedConverter<Short> {
  @Override
  public Short toValue(final String string, final INode node) throws ValueConverterException {
    short _xblockexpression = (short) 0;
    {
      String str = string;
      if (((str == null) || str.isEmpty())) {
        throw new ValueConverterException(("invalid short: " + string), node, null);
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
      short _xtrycatchfinallyexpression = (short) 0;
      try {
        int _length = str.length();
        int _minus = (_length - 1);
        _xtrycatchfinallyexpression = Short.parseShort(str.substring(0, _minus), base);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException(("invalid short: " + string), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Short.valueOf(_xblockexpression);
  }
  
  @Override
  public String toString(final Short value) {
    return (value + "s");
  }
}
