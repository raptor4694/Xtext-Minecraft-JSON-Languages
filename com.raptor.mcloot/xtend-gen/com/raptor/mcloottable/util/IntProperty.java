package com.raptor.mcloottable.util;

import com.raptor.mcloottable.mcloot.ExactLongRange;
import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.mcloot.NormalLongRange;
import com.raptor.mcloottable.util.MclootUtils;
import com.raptor.mcloottable.util.Property;
import java.util.Arrays;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@FinalFieldsConstructor
@SuppressWarnings("all")
public class IntProperty implements Property {
  public final int min;
  
  public final int max;
  
  @Override
  public boolean isValid(final String str) {
    boolean _xtrycatchfinallyexpression = false;
    try {
      boolean _xblockexpression = false;
      {
        final int value = Integer.parseInt(str);
        _xblockexpression = ((value >= this.min) && (value <= this.max));
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        _xtrycatchfinallyexpression = false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected boolean _isValid(final ExactLongRange range) {
    return ((range.getValue() >= this.min) && (range.getValue() <= this.max));
  }
  
  protected boolean _isValid(final NormalLongRange range) {
    return (((!MclootUtils.isMinDefined(range)) || (range.getMin() >= this.min)) && ((!MclootUtils.isMaxDefined(range)) || (range.getMax() <= this.max)));
  }
  
  public boolean isValid(final LongRange range) {
    if (range instanceof ExactLongRange) {
      return _isValid((ExactLongRange)range);
    } else if (range instanceof NormalLongRange) {
      return _isValid((NormalLongRange)range);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(range).toString());
    }
  }
  
  public IntProperty(final int min, final int max) {
    super();
    this.min = min;
    this.max = max;
  }
}
