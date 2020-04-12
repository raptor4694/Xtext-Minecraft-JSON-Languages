package com.raptor.mcloottable.util;

import com.raptor.mcloottable.mcloot.LongRange;

@SuppressWarnings("all")
public interface Property {
  boolean isValid(final String str);
  
  boolean isValid(final LongRange range);
}
