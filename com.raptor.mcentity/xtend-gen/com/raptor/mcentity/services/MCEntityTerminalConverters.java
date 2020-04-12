package com.raptor.mcentity.services;

import com.google.inject.Inject;
import com.raptor.mcentity.conversion.MCEntityByteValueConverter;
import com.raptor.mcentity.conversion.MCEntityDoubleValueConverter;
import com.raptor.mcentity.conversion.MCEntityFloatValueConverter;
import com.raptor.mcentity.conversion.MCEntityIDValueConverter;
import com.raptor.mcentity.conversion.MCEntityIntValueConverter;
import com.raptor.mcentity.conversion.MCEntityLongValueConverter;
import com.raptor.mcentity.conversion.MCEntityShortValueConverter;
import com.raptor.mcentity.conversion.MCEntityStringValueConverter;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;

@SuppressWarnings("all")
public class MCEntityTerminalConverters extends AbstractDeclarativeValueConverterService {
  @Inject
  private MCEntityIDValueConverter idValueConverter;
  
  @Inject
  private MCEntityDoubleValueConverter doubleValueConverter;
  
  @Inject
  private MCEntityFloatValueConverter floatValueConverter;
  
  @Inject
  private MCEntityIntValueConverter intValueConverter;
  
  @Inject
  private MCEntityByteValueConverter byteValueConverter;
  
  @Inject
  private MCEntityShortValueConverter shortValueConverter;
  
  @Inject
  private MCEntityLongValueConverter longValueConverter;
  
  @Inject
  private MCEntityStringValueConverter stringValueConverter;
  
  @ValueConverter(rule = "ID")
  public IValueConverter<String> ID() {
    return this.idValueConverter;
  }
  
  @ValueConverter(rule = "STRING")
  public IValueConverter<String> STRING() {
    return this.stringValueConverter;
  }
  
  @ValueConverter(rule = "LONG")
  public IValueConverter<Long> LONG() {
    return this.longValueConverter;
  }
  
  @ValueConverter(rule = "SHORT")
  public IValueConverter<Short> SHORT() {
    return this.shortValueConverter;
  }
  
  @ValueConverter(rule = "DOUBLE")
  public IValueConverter<Double> DOUBLE() {
    return this.doubleValueConverter;
  }
  
  @ValueConverter(rule = "FLOAT")
  public IValueConverter<Float> FLOAT() {
    return this.floatValueConverter;
  }
  
  @ValueConverter(rule = "INT")
  public IValueConverter<Integer> INT() {
    return this.intValueConverter;
  }
  
  @ValueConverter(rule = "SINGLE_STRING")
  public IValueConverter<String> SINGLE_STRING() {
    return this.stringValueConverter;
  }
  
  @ValueConverter(rule = "BYTE")
  public IValueConverter<Byte> BYTE() {
    return this.byteValueConverter;
  }
}
