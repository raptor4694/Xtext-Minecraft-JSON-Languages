package com.raptor.mcloottable.conversion

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class MclootValueConverterService extends DefaultTerminalConverters {
	
	@Inject
	PercentageValueConverter percentageValueConverter = new PercentageValueConverter
	
	@Inject
	ULONG_RANGE_STARTValueConverter ulongRangeStartValueConverter = new ULONG_RANGE_STARTValueConverter
	
	@Inject
    SLONG_RANGE_STARTValueConverter slongRangeStartValueConverter = new SLONG_RANGE_STARTValueConverter
	
	@Inject
    DOUBLE_RANGE_STARTValueConverter doubleRangeStartValueConverter = new DOUBLE_RANGE_STARTValueConverter
    
    @Inject
    DOUBLEValueConverter doubleValueConverter = new DOUBLEValueConverter
	
	@ValueConverter(rule = "com.raptor.mcloottable.Mcloot.PERCENTAGE")
	def IValueConverter<Double> PERCENTAGE() { percentageValueConverter }
	
	@ValueConverter(rule = "com.raptor.mcloottable.Mcloot.ULONG_RANGE_START")
	def IValueConverter<Long> ULONG_RANGE_START() { ulongRangeStartValueConverter }
	
	@ValueConverter(rule = "com.raptor.mcloottable.Mcloot.SLONG_RANGE_START")
	def IValueConverter<Long> SLONG_RANGE_START() { slongRangeStartValueConverter }
	
	@ValueConverter(rule = "com.raptor.mcloottable.Mcloot.DOUBLE_RANGE_START")
    def IValueConverter<Double> DOUBLE_RANGE_START() { doubleRangeStartValueConverter }
    
    @ValueConverter(rule = "com.raptor.mcloottable.Mcloot.DOUBLE")
    def IValueConverter<Double> DOUBLE() { doubleValueConverter }
	
}