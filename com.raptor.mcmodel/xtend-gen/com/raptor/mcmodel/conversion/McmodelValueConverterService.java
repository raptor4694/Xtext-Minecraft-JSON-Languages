package com.raptor.mcmodel.conversion;

import com.raptor.mcmodel.conversion.PercentageValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class McmodelValueConverterService extends DefaultTerminalConverters {
  private PercentageValueConverter percentageValueConverter = new PercentageValueConverter();
  
  @ValueConverter(rule = "PERCENTAGE")
  public IValueConverter<Double> PERCENTAGE() {
    return this.percentageValueConverter;
  }
}
