package com.raptor.mcentity.conversion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class MCEntityIntValueConverter extends AbstractLexerBasedConverter<Integer> {
  private static final Matcher regex = new Function0<Matcher>() {
    @Override
    public Matcher apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rgb\\s*\\((0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\\s*,\\s*(0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\\s*,\\s*(0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\\)");
      Matcher _matcher = Pattern.compile(_builder.toString()).matcher("");
      return _matcher;
    }
  }.apply();
  
  @Override
  public Integer toValue(final String string, final INode node) throws ValueConverterException {
    int _xblockexpression = (int) 0;
    {
      String str = string;
      if (((str == null) || str.isEmpty())) {
        throw new ValueConverterException(("invalid int: " + string), node, null);
      }
      boolean _matches = MCEntityIntValueConverter.regex.reset(str).matches();
      if (_matches) {
        try {
          int _parseByte = this.parseByte(MCEntityIntValueConverter.regex.group(1));
          int _doubleLessThan = (_parseByte << 16);
          int _parseByte_1 = this.parseByte(MCEntityIntValueConverter.regex.group(2));
          int _doubleLessThan_1 = (_parseByte_1 << 8);
          int _plus = (_doubleLessThan + _doubleLessThan_1);
          int _parseByte_2 = this.parseByte(MCEntityIntValueConverter.regex.group(3));
          return Integer.valueOf((_plus + _parseByte_2));
        } catch (final Throwable _t) {
          if (_t instanceof NumberFormatException) {
            final NumberFormatException e = (NumberFormatException)_t;
            throw new ValueConverterException(("invalid int: " + string), node, e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
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
      int _xtrycatchfinallyexpression = (int) 0;
      try {
        _xtrycatchfinallyexpression = Integer.parseInt(str, base);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException(("invalid int: " + string), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  protected int parseByte(final String string) {
    String str = string;
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
    final int i = Integer.parseInt(str, base);
    if (((i < 0) || (i > 255))) {
      throw new NumberFormatException((("For input string \"" + str) + "\""));
    }
    return i;
  }
  
  @Override
  public String toString(final Integer value) {
    return value.toString();
  }
}
