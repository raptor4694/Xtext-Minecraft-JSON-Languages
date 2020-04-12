package com.raptor.mcentity.services

import com.google.inject.Inject
import com.raptor.mcentity.conversion.*
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
import org.eclipse.xtext.conversion.impl.STRINGValueConverter

class MCEntityTerminalConverters extends AbstractDeclarativeValueConverterService {
	
	@Inject MCEntityIDValueConverter idValueConverter
	@Inject MCEntityDoubleValueConverter doubleValueConverter
	@Inject MCEntityFloatValueConverter floatValueConverter
	@Inject MCEntityIntValueConverter intValueConverter
	@Inject MCEntityByteValueConverter byteValueConverter
	@Inject MCEntityShortValueConverter shortValueConverter
	@Inject MCEntityLongValueConverter longValueConverter
	@Inject MCEntityStringValueConverter stringValueConverter
	
	@ValueConverter(rule = "ID")
	def IValueConverter<String> ID() { idValueConverter }
	
	@ValueConverter(rule = "STRING")
	def IValueConverter<String> STRING() { stringValueConverter }
	
	@ValueConverter(rule = "LONG")
	def IValueConverter<Long> LONG() { longValueConverter }
	
	@ValueConverter(rule = "SHORT")
	def IValueConverter<Short> SHORT() { shortValueConverter }
	
	@ValueConverter(rule = "DOUBLE")
	def IValueConverter<Double> DOUBLE() { doubleValueConverter }
	
	@ValueConverter(rule = "FLOAT")
	def IValueConverter<Float> FLOAT() { floatValueConverter }
	
	@ValueConverter(rule = "INT")
	def IValueConverter<Integer> INT() { intValueConverter }
	
	@ValueConverter(rule = "SINGLE_STRING")
	def IValueConverter<String> SINGLE_STRING() { stringValueConverter }
	
	@ValueConverter(rule = "BYTE")
	def IValueConverter<Byte> BYTE() { byteValueConverter }
	
}