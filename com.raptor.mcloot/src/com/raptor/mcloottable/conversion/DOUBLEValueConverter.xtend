package com.raptor.mcloottable.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class DOUBLEValueConverter extends AbstractLexerBasedConverter<Double> {
    
    override protected toEscapedString(Double value) {
        value.toString
    }
    
    override protected assertValidValue(Double value) {
        super.assertValidValue(value)
        if (value.isNaN || value.isInfinite) {
            throw new ValueConverterException('''«ruleName»-value may not be NaN or infinite.''', null, null)
        }
    }
    
    override toValue(String string, INode node) {
        if (Strings.isEmpty(string)) {
            throw new ValueConverterException("Couldn't convert empty string to a double value.", node, null)
        }
        println("Converting " + string)
        try {
            Double.parseDouble(string)
        } catch (NumberFormatException e) {
            e.printStackTrace()
            throw new ValueConverterException('''Couldn't convert '«string»' to a double value.''', node, e)
        }
    }
    
}