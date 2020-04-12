package com.raptor.mcentity.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class MCEntityFloatValueConverter extends AbstractLexerBasedConverter<Float> {
	
	override toValue(String string, INode node) throws ValueConverterException {
		if(string === null || string.isEmpty || !string.endsWith("f") && !string.endsWith("F"))
			throw new ValueConverterException("invalid float: " + string, node, null)
			
		try {
			Float.parseFloat(string.substring(0, string.length-1))
		} catch(NumberFormatException e) {
			throw new ValueConverterException("invalid float: " + string, node, e)
		}
	}
	
	override toString(Float value) {
		return value + "f"
	}
	
}