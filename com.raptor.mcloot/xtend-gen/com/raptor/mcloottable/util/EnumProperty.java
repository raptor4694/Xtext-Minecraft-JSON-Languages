package com.raptor.mcloottable.util;

import com.raptor.mcloottable.mcloot.LongRange;
import com.raptor.mcloottable.util.Property;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

@FinalFieldsConstructor
@SuppressWarnings("all")
public class EnumProperty implements Property {
  private final Set<String> options;
  
  @Override
  public boolean isValid(final String str) {
    return this.options.contains(str);
  }
  
  @Override
  public boolean isValid(final LongRange range) {
    return false;
  }
  
  public Set<String> getOptions() {
    return Collections.<String>unmodifiableSet(this.options);
  }
  
  public EnumProperty(final Set<String> options) {
    super();
    this.options = options;
  }
}
