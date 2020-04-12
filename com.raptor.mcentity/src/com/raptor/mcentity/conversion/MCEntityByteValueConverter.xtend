package com.raptor.mcentity.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class MCEntityByteValueConverter extends AbstractLexerBasedConverter<Byte> {
	
	override toValue(String string, INode node) throws ValueConverterException {
		var str = string
		if(str === null || str.isEmpty)
			throw new ValueConverterException("invalid byte: " + string, node, null)
		
		var base = 10
			
		if(str.startsWith("0x") || str.startsWith("0X")) {
			base = 16
			str = str.substring(2)
		} else if(str.startsWith("0b") || str.startsWith("0B")) {
			base = 2
			str = str.substring(2)
		}
			
		try {
			Byte.parseByte(str.substring(0, str.length-1), base)
		} catch(NumberFormatException e) {
			throw new ValueConverterException("invalid byte: " + string, node, e)
		}
	}
	
	override toString(Byte value) {
		return value + "b"
	}
	
}