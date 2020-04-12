package com.raptor.mcentity.conversion

import java.util.regex.Pattern
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class MCEntityIntValueConverter extends AbstractLexerBasedConverter<Integer> {
	
	static val regex = Pattern.compile('''rgb\s*\((0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\s*,\s*(0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\s*,\s*(0[xX][0-9a-fA-F]+|0[bB][01]+|0|[1-9][0-9]*)\)''').matcher("")
	
	override toValue(String string, INode node) throws ValueConverterException {
		var str = string
		if(str === null || str.isEmpty)
			throw new ValueConverterException("invalid int: " + string, node, null)
		
		if(regex.reset(str).matches()) {
			try {
				return (parseByte(regex.group(1)) << 16) + (parseByte(regex.group(2)) << 8) + (parseByte(regex.group(3)))
			} catch(NumberFormatException e) {
				throw new ValueConverterException("invalid int: " + string, node, e)
			}
		}
		
		var base = 10
			
		if(str.startsWith("0x") || str.startsWith("0X")) {
			base = 16
			str = str.substring(2)
		} else if(str.startsWith("0b") || str.startsWith("0B")) {
			base = 2
			str = str.substring(2)
		}
			
		try {
			Integer.parseInt(str, base)
		} catch(NumberFormatException e) {
			throw new ValueConverterException("invalid int: " + string, node, e)
		}
	}
	
	protected def parseByte(String string) {
		var str = string
		var base = 10
			
		if(str.startsWith("0x") || str.startsWith("0X")) {
			base = 16
			str = str.substring(2)
		} else if(str.startsWith("0b") || str.startsWith("0B")) {
			base = 2
			str = str.substring(2)
		}
		
		val i = Integer.parseInt(str, base)
		if(i < 0 || i > 255)
			throw new NumberFormatException('For input string "' + str + '"')
		return i
	}
	
	override toString(Integer value) {
		return value.toString() 
	}
	
}