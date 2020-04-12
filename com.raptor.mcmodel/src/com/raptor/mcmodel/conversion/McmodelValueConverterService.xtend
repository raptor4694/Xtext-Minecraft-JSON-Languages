package com.raptor.mcmodel.conversion

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class McmodelValueConverterService extends DefaultTerminalConverters {
	
	PercentageValueConverter percentageValueConverter = new PercentageValueConverter
	
	@ValueConverter(rule = "PERCENTAGE")
	def IValueConverter<Double> PERCENTAGE() { percentageValueConverter }
	
}