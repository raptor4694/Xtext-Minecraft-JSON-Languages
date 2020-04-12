package com.raptor.mcentity.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class MCEntityDoubleValueConverter extends AbstractLexerBasedConverter<Double> {
	
	override toValue(String string, INode node) throws ValueConverterException {
		if(string === null || string.isEmpty)
			throw new ValueConverterException("invalid double: " + string, node, null)
			
		try {
			Double.parseDouble(
				if(string.endsWith("d") || string.endsWith("D"))
					string.substring(0, string.length-1)
				else
					string
			)
		} catch(NumberFormatException e) {
			throw new ValueConverterException("invalid double: " + string, node, e)
		}
	}
	
	override toString(Double value) {
		return value + "f"
	}
	
}