package com.raptor.mcloottable.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class ULONG_RANGE_STARTValueConverter extends AbstractLexerBasedConverter<Long> {
    
    override toValue(String string, INode node) throws ValueConverterException {
        if (Strings.isEmpty(string))
            throw new ValueConverterException("Couldn't convert empty string to a long value.", node, null)
        if (!string.endsWith(".."))
            throw new ValueConverterException('''Couldn't convert '«string»' to a long value.''', node, null)
        try {
            Long.parseLong(string.substring(0, string.length-2))
        } catch (NumberFormatException e) {
            throw new ValueConverterException('''Couldn't convert '«string»' to a long value.''', node, e)
        }
    }
    
    override protected assertValidValue(Long value) {
        super.assertValidValue(value)
        if (value < 0)
            throw new ValueConverterException('''«ruleName»-value may not be negative (value: «value»).''', null, null)
    }
    
    override protected toEscapedString(Long value) '''«value»..'''
    
}