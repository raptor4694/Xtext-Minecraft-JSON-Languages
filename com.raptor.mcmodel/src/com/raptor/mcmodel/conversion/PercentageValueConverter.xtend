package com.raptor.mcmodel.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class PercentageValueConverter extends AbstractLexerBasedConverter<Double> {
	
	override protected toEscapedString(Double value) {
		value*100 + '%'
	}
	
//	override protected assertValidValue(Double value) {
//		super.assertValidValue(value)
//		if (value < 0)
//			throw new ValueConverterException('''«ruleName»-value may not be negative (value: «value»).''', null, null)
//		if (value > 100)
//			throw new ValueConverterException('''«ruleName»-value may not be > 100 (value: «value»).''', null, null)
//	}
	
	override toValue(String string, INode node) {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to a percentage value.", node, null)
		if (!string.endsWith("%"))
			throw new ValueConverterException("Couldn't convert string to a percentage as it did not end with '%'", node, null)
		try {
			Double.parseDouble(string.substring(0, string.length-1)) / 100.0
		} catch (NumberFormatException e) {
			throw new ValueConverterException('''Couldn't convert «string» to a percentage value.''', node, e)
		}
	}
	
}