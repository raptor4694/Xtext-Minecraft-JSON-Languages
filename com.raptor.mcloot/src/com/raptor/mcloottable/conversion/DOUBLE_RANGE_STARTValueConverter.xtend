package com.raptor.mcloottable.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class DOUBLE_RANGE_STARTValueConverter extends AbstractLexerBasedConverter<Double> {
    
    override toValue(String string, INode node) throws ValueConverterException {
        if (Strings.isEmpty(string))
            throw new ValueConverterException("Couldn't convert empty string to a double value.", node, null)
        println("Parsing " + string)
        if (!string.endsWith("..."))
            throw new ValueConverterException('''Couldn't convert '«string»' to a double value.''', node, null)
        try {
            Double.parseDouble(string.substring(0, string.length-3))
        } catch (NumberFormatException e) {
            throw new ValueConverterException('''Couldn't convert '«string»' to a double value.''', node, e)
        }
    }
    
    override protected toEscapedString(Double value) '''«value»..'''
    
}