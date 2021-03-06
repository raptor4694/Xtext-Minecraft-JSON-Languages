package com.raptor.mcmodel.tests

import java.io.File
import java.io.FileNotFoundException
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.NoSuchElementException
import java.util.Scanner
import java.util.function.Predicate
import java.util.regex.Pattern

import static extension org.eclipse.xtext.util.Strings.convertToJavaString

class KeywordExtractor {
    
    static final String MCLOOT_FILE = '''C:\Users\flyin\Documents\Xtext\com.raptor.mcloot\src\com\raptor\mcloottable\Mcloot.xtext'''
    static final String MCBLOCKSTATE_FILE = '''C:\Users\flyin\Documents\Xtext\com.raptor.mcblockstate\src\com\raptor\mcblockstate\Mcblockstate.xtext'''
    static final String MCMODEL_FILE = '''C:\Users\flyin\Documents\Xtext\com.raptor.mcmodel\src\com\raptor\mcmodel\Mcmodel.xtext''' 
	
	def static void main(String[] args) {
		val source = readFile(MCLOOT_FILE)
		val keywords = extractKeywords(source, 2, '''[a-zA-Z_][a-zA-Z_0-9]*''')
		println(formatKeywords('Keyword', keywords, 122))
	}
	
	def static String formatKeywords(String ruleName, Collection<String> keywordsIn, int maxLength) {
		if (maxLength <= 2) {
			throw new IllegalArgumentException('''Invalid max length: «maxLength»''')
		}
		
		val keywords = keywordsIn.map['''"«convertToJavaString»"'''].sort()
		
		val keywordLines = new ArrayList<List<String>>
		var currentLine = new ArrayList<String>
		var length = 0
		for (keyword : keywords) {
			if (length > 0) {
				length += 3 // for the ' | ' separator
			}
			
			if (length + keyword.length >= maxLength) {
				keywordLines += currentLine
				currentLine = newArrayList(keyword)
				length = keyword.length
			} else {
				length += keyword.length
				currentLine += keyword
			}
		}
		
		if (!currentLine.isEmpty) {
		    keywordLines += currentLine
		}
		
		'''
		«ruleName»:
			«FOR keywordLine : keywordLines SEPARATOR ' |'»
				«FOR keyword : keywordLine SEPARATOR ' | '»«keyword»«ENDFOR»
			«ENDFOR»
		;
		'''
	}
	
	static final char DOUBLE_QUOTE = '"'
	static final char SINGLE_QUOTE = "'"
	static final char BACKSLASH    = '\\'
	static final char NEWLINE      = '\n'
	static final char CARRIAGE_RET = '\r'
	
	static val PUNCTUATION_OR_SPACE = Pattern.compile('''[\p{Punct}\s]*''')
	
	static final (CharSequence)=>boolean DEFAULT_KEYWORD_PREDICATE = [ !PUNCTUATION_OR_SPACE.matcher(it).matches() ]
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source) { extractKeywords(source, 0) }
	
	def static extractKeywords(CharSequence source) { extractKeywords(source, 0) }
	
//	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, (int, int)=>OutStr splicer) { extractKeywords(source, 0, [$0,$1,$2 | splicer.apply($1, $2) ]) }
//	
//	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, (InStr, int, int)=>OutStr splicer) { extractKeywords(source, 0, splicer) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, int minLength) { extractKeywords(source, minLength, DEFAULT_KEYWORD_PREDICATE) }
	
	def static extractKeywords(CharSequence source, int minLength) { extractKeywords(source, minLength, DEFAULT_KEYWORD_PREDICATE) }
	
//	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, int minLength, (int, int)=>OutStr splicer) { extractKeywords(source, minLength, DEFAULT_KEYWORD_PREDICATE, [$0,$1,$2 | splicer.apply($1, $2) ]) }
//	
//	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, int minLength, (InStr, int, int)=>OutStr splicer) { extractKeywords(source, minLength, DEFAULT_KEYWORD_PREDICATE, splicer) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, String validKeywordRegex) { extractKeywords(source, 0, Pattern.compile(validKeywordRegex)) }
	
	def static extractKeywords(CharSequence source, String validKeywordRegex) { extractKeywords(source, 0, Pattern.compile(validKeywordRegex)) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, String validKeywordRegex, (int, int)=>OutStr splicer) { extractKeywords(source, 0, Pattern.compile(validKeywordRegex), [$0,$1,$2 | splicer.apply($1, $2) ]) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, String validKeywordRegex, (InStr, int, int)=>OutStr splicer) { extractKeywords(source, 0, Pattern.compile(validKeywordRegex), splicer) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, Pattern validKeywordPattern) { extractKeywords(source, 0, validKeywordPattern) }
	
	def static extractKeywords(CharSequence source, Pattern validKeywordPattern) { extractKeywords(source, 0, validKeywordPattern) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, Pattern validKeywordPattern, (int, int)=>OutStr splicer) { extractKeywords(source, 0, validKeywordPattern, [$0,$1,$2 | splicer.apply($1, $2) ]) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, Pattern validKeywordPattern, (InStr, int, int)=>OutStr splicer) { extractKeywords(source, 0, validKeywordPattern, splicer) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, int minLength, String validKeywordRegex) { extractKeywords(source, minLength, Pattern.compile(validKeywordRegex)) }
	
	def static extractKeywords(CharSequence source, int minLength, String validKeywordRegex) { extractKeywords(source, minLength, Pattern.compile(validKeywordRegex)) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, int minLength, String validKeywordRegex, (int, int)=>OutStr splicer) { extractKeywords(source, minLength, Pattern.compile(validKeywordRegex), [$0,$1,$2 | splicer.apply($1, $2) ]) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, int minLength, String validKeywordRegex, (InStr, int, int)=>OutStr splicer) { extractKeywords(source, minLength, Pattern.compile(validKeywordRegex), splicer) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, int minLength, Pattern validKeywordPattern) { extractKeywords(source, minLength, [ validKeywordPattern.matcher(it).matches() ]) }
	
	def static extractKeywords(CharSequence source, int minLength, Pattern validKeywordPattern) { extractKeywords(source, minLength, [ validKeywordPattern.matcher(it).matches() ]) }
	
	def static <InStr extends CharSequence, OutStr extends CharSequence> extractKeywords(InStr source, int minLength, Pattern validKeywordPattern, (InStr, int, int)=>OutStr splicer) {
		if (minLength < 0) {
			throw new IllegalArgumentException('''Invalid min length: «minLength»''')
		}
		extractKeywords(source, [ length >= minLength && validKeywordPattern.matcher(it).matches() ], splicer)
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, (CharSequence)=>boolean validKeywordPredicate) { extractKeywords(source, 0, validKeywordPredicate) }
	
	def static extractKeywords(CharSequence source, (CharSequence)=>boolean validKeywordPredicate) { extractKeywords(source, 0, validKeywordPredicate) }
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static extractKeywords(String source, int minLength, (CharSequence)=>boolean validKeywordPredicate) {
		if (minLength < 0) {
			throw new IllegalArgumentException('''Invalid min length: «minLength»''')
		}
		extractKeywords(source, [String it | length >= minLength && validKeywordPredicate.apply(it) ], [ $0.substring($1, $2) ])
	}
	
	def static extractKeywords(CharSequence source, int minLength, (CharSequence)=>boolean validKeywordPredicate) {
		if (minLength < 0) {
			throw new IllegalArgumentException('''Invalid min length: «minLength»''')
		}
		extractKeywords(source, [CharSequence it | length >= minLength && validKeywordPredicate.apply(it) ], [ $0.subSequence($1, $2) ])
	}
	
	def static <InStr extends CharSequence, OutStr> extractKeywords(InStr source, int minLength, (OutStr)=>boolean validKeywordPredicate, (InStr, int, int)=>OutStr splicer, (OutStr)=>int lengthGetter) {
		if (minLength < 0) {
			throw new IllegalArgumentException('''Invalid min length: «minLength»''')
		}
		extractKeywords(source, [ lengthGetter.apply(it) >= minLength && validKeywordPredicate.apply(it) ], splicer)
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	def static <InStr extends CharSequence, OutStr> extractKeywords(InStr source, (OutStr)=>boolean validKeywordPredicateIn, (InStr, int, int)=>OutStr splicer) {
		val validKeywordPredicate = validKeywordPredicateIn ?: [ true ]
		
		val keywords = new HashSet<OutStr>
		
		for (var i = 0; i < source.length; i++) {
			switch ch: source.charAt(i) {
				case DOUBLE_QUOTE, case SINGLE_QUOTE: {
					val start = i
					
					var escape = false
					for (i++; i < source.length && (escape || source.charAt(i) != ch); i++) {
						if (escape) {
							escape = false
						} else {
							switch (source.charAt(i)) {
								case BACKSLASH: escape = true
							}
						}
					}
					if (i < source.length) {
						val str = splicer.apply(source, start+1, escape? i+1 : i)
						if (validKeywordPredicate.apply(str)) {
							keywords += str
						}
					}
				}
			}
		}
		
		return keywords
	}
	
	def private static readFile(String filename) throws FileNotFoundException {
		readFile(new File(filename))
	}
	
	def private static readFile(File file) throws FileNotFoundException {
		try (val scan = new Scanner(file)) {
			scan.useDelimiter('''\A''')
			try {
				scan.next()
			} catch (NoSuchElementException e) {
				""
			}
		}
	}
	
}