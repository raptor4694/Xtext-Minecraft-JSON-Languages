package com.raptor.mcloottable.conversion;

import com.google.inject.Inject;
import com.raptor.mcloottable.conversion.DOUBLEValueConverter;
import com.raptor.mcloottable.conversion.DOUBLE_RANGE_STARTValueConverter;
import com.raptor.mcloottable.conversion.PercentageValueConverter;
import com.raptor.mcloottable.conversion.SLONG_RANGE_STARTValueConverter;
import com.raptor.mcloottable.conversion.ULONG_RANGE_STARTValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class MclootValueConverterService extends DefaultTerminalConverters {
  @Inject
  private PercentageValueConverter percentageValueConverter = new PercentageValueConverter();
  
  @Inject
  private ULONG_RANGE_STARTValueConverter ulongRangeStartValueConverter = new ULONG_RANGE_STARTValueConverter();
  
  @Inject
  private SLONG_RANGE_STARTValueConverter slongRangeStartValueConverter = new SLONG_RANGE_STARTValueConverter();
  
  @Inject
  private DOUBLE_RANGE_STARTValueConverter doubleRangeStartValueConverter = new DOUBLE_RANGE_STARTValueConverter();
  
  @Inject
  private DOUBLEValueConverter doubleValueConverter = new DOUBLEValueConverter();
  
  @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.PERCENTAGE")
  public IValueConverter<Double> PERCENTAGE() {
    return this.percentageValueConverter;
  }
  
  @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.ULONG_RANGE_START")
  public IValueConverter<Long> ULONG_RANGE_START() {
    return this.ulongRangeStartValueConverter;
  }
  
  @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.SLONG_RANGE_START")
  public IValueConverter<Long> SLONG_RANGE_START() {
    return this.slongRangeStartValueConverter;
  }
  
  @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.DOUBLE_RANGE_START")
  public IValueConverter<Double> DOUBLE_RANGE_START() {
    return this.doubleRangeStartValueConverter;
  }
  
  @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.DOUBLE")
  public IValueConverter<Double> DOUBLE() {
    return this.doubleValueConverter;
  }
}
