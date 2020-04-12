package com.raptor.mcloottable.util;

import com.google.common.base.Objects;
import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.util.Property;

@SuppressWarnings("all")
public class BooleanProperty implements Property {
  @Override
  public boolean isValid(final String str) {
    return (Objects.equal(str, "true") || Objects.equal(str, "false"));
  }
  
  @Override
  public boolean isValid(final LongRange range) {
    return false;
  }
}
