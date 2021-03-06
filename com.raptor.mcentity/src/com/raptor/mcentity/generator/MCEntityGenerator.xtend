/*
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.generator

import com.raptor.mcentity.mcentity.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.util.Strings

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MCEntityGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		fsa.generateFile(resource.URI.lastSegment + '.txt', format((resource.contents.get(0) as EntityData).nbt))
	}
	
	def dispatch String format(NBTCompound nbt) '''{«FOR entry : nbt.entries SEPARATOR ','»«formatString(entry.key)»:«format(entry.value)»«ENDFOR»}'''
	
	def dispatch String format(NamespacedKey it) '''"«namespace»:«key»"'''
	
	def dispatch String format(NBTArray nbt) '''[«FOR element : nbt.elements SEPARATOR ','»«format(element)»«ENDFOR»]'''
	
	def dispatch String format(NBTString nbt) '''«formatString(nbt.value)»'''
	
	def dispatch String format(NBTByteArray nbt) '''[B;«FOR element : nbt.elements SEPARATOR ','»«element»«ENDFOR»]'''
	
	def dispatch String format(NBTLongArray nbt) '''[L;«FOR element : nbt.elements SEPARATOR ','»«element»«ENDFOR»]'''
	
	def dispatch String format(NBTIntArray nbt) '''[I;«FOR element : nbt.elements SEPARATOR ','»«element»«ENDFOR»]'''
	
	def dispatch String format(NBTJSONTextComponent text) '''«"'"»«formatJSONText(text.value).replace("'", "\\'").replace('\\"', '"')»«"'"»'''
	
	def dispatch String format(NBTBool nbt) '''«IF nbt.value»1b«ELSE»0b«ENDIF»'''
	
	def dispatch String format(NBTByte nbt) '''«nbt.value»b'''
	
	def dispatch String format(NBTShort nbt) '''«nbt.value»s'''
	
	def dispatch String format(NBTInt nbt) '''«nbt.value»'''
	
	def dispatch String format(NBTLong nbt) '''«nbt.value»L'''
	
	def dispatch String format(NBTFloat nbt) '''«nbt.value»f'''
	
	def dispatch String format(NBTDouble nbt) '''«nbt.value»'''
	
	def dispatch String formatJSONText(JSONObject json) { _formatJSON(json) }
	
	def dispatch String formatJSONText(JSONArray json) { _formatJSON(json) }
	
	def dispatch String formatJSONText(JSONString json) { _formatJSON(json) }
	
	def dispatch String formatJSON(JSONObject json) '''{«FOR entry : json.entries SEPARATOR ','»"«Strings.convertToJavaString(entry.key, false)»":«formatJSON(entry.value)»«ENDFOR»}'''
	
	def dispatch String formatJSON(JSONArray json) '''[«FOR element : json.entries SEPARATOR ','»«formatJSON(element)»«ENDFOR»]'''
		
	def dispatch String formatJSON(JSONString json) '''"«json.value.replace('"', '\\"')»"'''
	
	def dispatch String formatJSON(JSONBool json) '''«json.value»'''
	
	def dispatch String formatJSON(JSONDouble json) '''«json.value»'''
	
	def dispatch String formatJSON(JSONLong json) '''«json.value»'''
	
	def dispatch String formatJSON(Selector selector) '''"«Strings.convertToJavaString('''«selector.type.literal»«IF selector.arguments !== null»[«FOR arg : selector.arguments.filters SEPARATOR ','»«formatSelectorValue(arg.value)»«ENDFOR»]«ENDIF»''')»"'''
	
	def dispatch String formatSelectorValue(NBTCompound nbt) { format(nbt) }
	
	def dispatch String formatSelectorValue(NamespacedKey nskey) '''«IF nskey.namespace !== null»«nskey.namespace»:«ENDIF»«nskey.key»'''
	
	def dispatch String formatSelectorValue(ClosedIntRange range) '''«range.begin»..«range.end»'''
	
	def dispatch String formatSelectorValue(OpenEndedIntRange range) '''«range.begin»..'''
	
	def dispatch String formatSelectorValue(OpenBeginningIntRange range) '''..«range.end»'''
	
	def dispatch String formatSelectorValue(ClosedDoubleRange range) '''«range.begin»..«range.end»'''
	
	def dispatch String formatSelectorValue(OpenEndedDoubleRange range) '''«range.begin»..'''
	
	def dispatch String formatSelectorValue(OpenBeginningDoubleRange range) '''..«range.end»'''
	
	def dispatch String formatSelectorValue(IntSelectorValue sel) '''«sel.value»'''
	
	def dispatch String formatSelectorValue(DoubleSelectorValue sel) '''«sel.value»'''
	
	def dispatch String formatSelectorValue(StringSelectorValue sel) '''«IF sel.value.matches('''[-.+a-zA-Z_0-9]+''')»«sel.value»«ELSE»"«Strings.convertToJavaString(sel.value, false)»"«ENDIF»'''
	
	def dispatch String formatSelectorValue(BoolSelectorValue sel) '''«sel.value»'''
		
	def formatString(String str) {
		/*if(str.contains('"')) {
			return "'" + Strings.convertToJavaString(str.replaceAll('''(?<!\\)((\\\\)*)\\"''', '$1"'), false).replace('''\\"''', '"').replace("'", "\\'") + "'"
		} else*/ if(str.matches('''[-.+a-zA-Z_0-9]+''')) {
			return str
		} else {
			return '"' + Strings.convertToJavaString(str, false) + '"'
		}
	}
}
