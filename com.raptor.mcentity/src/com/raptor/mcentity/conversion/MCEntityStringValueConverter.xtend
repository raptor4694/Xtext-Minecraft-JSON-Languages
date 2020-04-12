package com.raptor.mcentity.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class MCEntityStringValueConverter extends AbstractLexerBasedConverter<String> {
	
	override toValue(String string, INode node) throws ValueConverterException {
		if(string === null || string.isEmpty || !string.startsWith("'") && !string.startsWith('"'))
			throw new ValueConverterException("invalid string: " + string, node, null)
		
		val first = string.charAt(0)	
		val last = string.charAt(string.length-1)
		
		if(first !== last)
			throw new ValueConverterException("invalid string: " + string, node, null)
		
		return Strings.convertFromJavaString(string.substring(1, string.length-1), true)
	}
	
	override toString(String value) {
		return '"' + Strings.convertToJavaString(value, false) + '"'
	}
	
}