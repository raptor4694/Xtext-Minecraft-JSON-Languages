package com.raptor.mcmodel.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.Functions.Function3;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class KeywordExtractor {
  private static final String MCLOOT_FILE = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("C:\\Users\\flyin\\Documents\\Xtext\\com.raptor.mcloot\\src\\com\\raptor\\mcloottable\\Mcloot.xtext");
      return _builder.toString();
    }
  }.apply();
  
  private static final String MCBLOCKSTATE_FILE = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("C:\\Users\\flyin\\Documents\\Xtext\\com.raptor.mcblockstate\\src\\com\\raptor\\mcblockstate\\Mcblockstate.xtext");
      return _builder.toString();
    }
  }.apply();
  
  private static final String MCMODEL_FILE = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("C:\\Users\\flyin\\Documents\\Xtext\\com.raptor.mcmodel\\src\\com\\raptor\\mcmodel\\Mcmodel.xtext");
      return _builder.toString();
    }
  }.apply();
  
  public static void main(final String[] args) {
    try {
      final String source = KeywordExtractor.readFile(KeywordExtractor.MCLOOT_FILE);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[a-zA-Z_][a-zA-Z_0-9]*");
      final HashSet<String> keywords = KeywordExtractor.extractKeywords(source, 2, _builder.toString());
      InputOutput.<String>println(KeywordExtractor.formatKeywords("Keyword", keywords, 122));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String formatKeywords(final String ruleName, final Collection<String> keywordsIn, final int maxLength) {
    String _xblockexpression = null;
    {
      if ((maxLength <= 2)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid max length: ");
        _builder.append(maxLength);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Function1<String, String> _function = (String it) -> {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"");
        String _convertToJavaString = Strings.convertToJavaString(it);
        _builder_1.append(_convertToJavaString);
        _builder_1.append("\"");
        return _builder_1.toString();
      };
      final List<String> keywords = IterableExtensions.<String>sort(IterableExtensions.<String, String>map(keywordsIn, _function));
      final ArrayList<List<String>> keywordLines = new ArrayList<List<String>>();
      ArrayList<String> currentLine = new ArrayList<String>();
      int length = 0;
      for (final String keyword : keywords) {
        {
          if ((length > 0)) {
            int _length = length;
            length = (_length + 3);
          }
          int _length_1 = keyword.length();
          int _plus = (length + _length_1);
          boolean _greaterEqualsThan = (_plus >= maxLength);
          if (_greaterEqualsThan) {
            keywordLines.add(currentLine);
            currentLine = CollectionLiterals.<String>newArrayList(keyword);
            length = keyword.length();
          } else {
            int _length_2 = length;
            int _length_3 = keyword.length();
            length = (_length_2 + _length_3);
            currentLine.add(keyword);
          }
        }
      }
      boolean _isEmpty = currentLine.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        keywordLines.add(currentLine);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(ruleName);
      _builder_1.append(":");
      _builder_1.newLineIfNotEmpty();
      {
        boolean _hasElements = false;
        for(final List<String> keywordLine : keywordLines) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder_1.appendImmediate(" |", "\t");
          }
          _builder_1.append("\t");
          {
            boolean _hasElements_1 = false;
            for(final String keyword_1 : keywordLine) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
              } else {
                _builder_1.appendImmediate(" | ", "\t");
              }
              _builder_1.append(keyword_1, "\t");
            }
          }
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append(";");
      _builder_1.newLine();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  private static final char DOUBLE_QUOTE = '\"';
  
  private static final char SINGLE_QUOTE = '\'';
  
  private static final char BACKSLASH = '\\';
  
  private static final char NEWLINE = '\n';
  
  private static final char CARRIAGE_RET = '\r';
  
  private static final Pattern PUNCTUATION_OR_SPACE = new Function0<Pattern>() {
    @Override
    public Pattern apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[\\p{Punct}\\s]*");
      Pattern _compile = Pattern.compile(_builder.toString());
      return _compile;
    }
  }.apply();
  
  private static final Function1<? super CharSequence, ? extends Boolean> DEFAULT_KEYWORD_PREDICATE = ((Function1<CharSequence, Boolean>) (CharSequence it) -> {
    boolean _matches = KeywordExtractor.PUNCTUATION_OR_SPACE.matcher(it).matches();
    return Boolean.valueOf((!_matches));
  });
  
  public static HashSet<String> extractKeywords(final String source) {
    return KeywordExtractor.extractKeywords(source, 0);
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source) {
    return KeywordExtractor.extractKeywords(source, 0);
  }
  
  public static HashSet<String> extractKeywords(final String source, final int minLength) {
    return KeywordExtractor.extractKeywords(source, minLength, KeywordExtractor.DEFAULT_KEYWORD_PREDICATE);
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final int minLength) {
    return KeywordExtractor.extractKeywords(source, minLength, KeywordExtractor.DEFAULT_KEYWORD_PREDICATE);
  }
  
  public static HashSet<String> extractKeywords(final String source, final String validKeywordRegex) {
    return KeywordExtractor.extractKeywords(source, 0, Pattern.compile(validKeywordRegex));
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final String validKeywordRegex) {
    return KeywordExtractor.extractKeywords(source, 0, Pattern.compile(validKeywordRegex));
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final String validKeywordRegex, final Function2<? super Integer, ? super Integer, ? extends OutStr> splicer) {
    final Function3<InStr, Integer, Integer, OutStr> _function = (InStr $0, Integer $1, Integer $2) -> {
      return splicer.apply($1, $2);
    };
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, 0, Pattern.compile(validKeywordRegex), _function);
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final String validKeywordRegex, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer) {
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, 0, Pattern.compile(validKeywordRegex), splicer);
  }
  
  public static HashSet<String> extractKeywords(final String source, final Pattern validKeywordPattern) {
    return KeywordExtractor.extractKeywords(source, 0, validKeywordPattern);
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final Pattern validKeywordPattern) {
    return KeywordExtractor.extractKeywords(source, 0, validKeywordPattern);
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final Pattern validKeywordPattern, final Function2<? super Integer, ? super Integer, ? extends OutStr> splicer) {
    final Function3<InStr, Integer, Integer, OutStr> _function = (InStr $0, Integer $1, Integer $2) -> {
      return splicer.apply($1, $2);
    };
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, 0, validKeywordPattern, _function);
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final Pattern validKeywordPattern, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer) {
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, 0, validKeywordPattern, splicer);
  }
  
  public static HashSet<String> extractKeywords(final String source, final int minLength, final String validKeywordRegex) {
    return KeywordExtractor.extractKeywords(source, minLength, Pattern.compile(validKeywordRegex));
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final int minLength, final String validKeywordRegex) {
    return KeywordExtractor.extractKeywords(source, minLength, Pattern.compile(validKeywordRegex));
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final int minLength, final String validKeywordRegex, final Function2<? super Integer, ? super Integer, ? extends OutStr> splicer) {
    final Function3<InStr, Integer, Integer, OutStr> _function = (InStr $0, Integer $1, Integer $2) -> {
      return splicer.apply($1, $2);
    };
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, minLength, Pattern.compile(validKeywordRegex), _function);
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final int minLength, final String validKeywordRegex, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer) {
    return KeywordExtractor.<InStr, OutStr>extractKeywords(source, minLength, Pattern.compile(validKeywordRegex), splicer);
  }
  
  public static HashSet<String> extractKeywords(final String source, final int minLength, final Pattern validKeywordPattern) {
    final Function1<CharSequence, Boolean> _function = (CharSequence it) -> {
      return Boolean.valueOf(validKeywordPattern.matcher(it).matches());
    };
    return KeywordExtractor.extractKeywords(source, minLength, _function);
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final int minLength, final Pattern validKeywordPattern) {
    final Function1<CharSequence, Boolean> _function = (CharSequence it) -> {
      return Boolean.valueOf(validKeywordPattern.matcher(it).matches());
    };
    return KeywordExtractor.extractKeywords(source, minLength, _function);
  }
  
  public static <InStr extends CharSequence, OutStr extends CharSequence> HashSet<OutStr> extractKeywords(final InStr source, final int minLength, final Pattern validKeywordPattern, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer) {
    HashSet<OutStr> _xblockexpression = null;
    {
      if ((minLength < 0)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid min length: ");
        _builder.append(minLength);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Function1<OutStr, Boolean> _function = (OutStr it) -> {
        return Boolean.valueOf(((it.length() >= minLength) && validKeywordPattern.matcher(it).matches()));
      };
      _xblockexpression = KeywordExtractor.<InStr, OutStr>extractKeywords(source, _function, splicer);
    }
    return _xblockexpression;
  }
  
  public static HashSet<String> extractKeywords(final String source, final Function1<? super CharSequence, ? extends Boolean> validKeywordPredicate) {
    return KeywordExtractor.extractKeywords(source, 0, validKeywordPredicate);
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final Function1<? super CharSequence, ? extends Boolean> validKeywordPredicate) {
    return KeywordExtractor.extractKeywords(source, 0, validKeywordPredicate);
  }
  
  public static HashSet<String> extractKeywords(final String source, final int minLength, final Function1<? super CharSequence, ? extends Boolean> validKeywordPredicate) {
    HashSet<String> _xblockexpression = null;
    {
      if ((minLength < 0)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid min length: ");
        _builder.append(minLength);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(((it.length() >= minLength) && (validKeywordPredicate.apply(it)).booleanValue()));
      };
      final Function3<String, Integer, Integer, String> _function_1 = (String $0, Integer $1, Integer $2) -> {
        return $0.substring(($1).intValue(), ($2).intValue());
      };
      _xblockexpression = KeywordExtractor.<String, String>extractKeywords(source, _function, _function_1);
    }
    return _xblockexpression;
  }
  
  public static HashSet<CharSequence> extractKeywords(final CharSequence source, final int minLength, final Function1<? super CharSequence, ? extends Boolean> validKeywordPredicate) {
    HashSet<CharSequence> _xblockexpression = null;
    {
      if ((minLength < 0)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid min length: ");
        _builder.append(minLength);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Function1<CharSequence, Boolean> _function = (CharSequence it) -> {
        return Boolean.valueOf(((it.length() >= minLength) && (validKeywordPredicate.apply(it)).booleanValue()));
      };
      final Function3<CharSequence, Integer, Integer, CharSequence> _function_1 = (CharSequence $0, Integer $1, Integer $2) -> {
        return $0.subSequence(($1).intValue(), ($2).intValue());
      };
      _xblockexpression = KeywordExtractor.<CharSequence, CharSequence>extractKeywords(source, _function, _function_1);
    }
    return _xblockexpression;
  }
  
  public static <InStr extends CharSequence, OutStr extends Object> HashSet<OutStr> extractKeywords(final InStr source, final int minLength, final Function1<? super OutStr, ? extends Boolean> validKeywordPredicate, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer, final Function1<? super OutStr, ? extends Integer> lengthGetter) {
    HashSet<OutStr> _xblockexpression = null;
    {
      if ((minLength < 0)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid min length: ");
        _builder.append(minLength);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Function1<OutStr, Boolean> _function = (OutStr it) -> {
        return Boolean.valueOf((((lengthGetter.apply(it)).intValue() >= minLength) && (validKeywordPredicate.apply(it)).booleanValue()));
      };
      _xblockexpression = KeywordExtractor.<InStr, OutStr>extractKeywords(source, _function, splicer);
    }
    return _xblockexpression;
  }
  
  public static <InStr extends CharSequence, OutStr extends Object> HashSet<OutStr> extractKeywords(final InStr source, final Function1<? super OutStr, ? extends Boolean> validKeywordPredicateIn, final Function3<? super InStr, ? super Integer, ? super Integer, ? extends OutStr> splicer) {
    Function1<? super OutStr, ? extends Boolean> _elvis = null;
    if (validKeywordPredicateIn != null) {
      _elvis = validKeywordPredicateIn;
    } else {
      final Function1<OutStr, Boolean> _function = (OutStr it) -> {
        return Boolean.valueOf(true);
      };
      _elvis = _function;
    }
    final Function1<? super OutStr, ? extends Boolean> validKeywordPredicate = _elvis;
    final HashSet<OutStr> keywords = new HashSet<OutStr>();
    for (int i = 0; (i < source.length()); i++) {
      char _charAt = source.charAt(i);
      final char ch = _charAt;
      switch (ch) {
        case KeywordExtractor.DOUBLE_QUOTE:
        case KeywordExtractor.SINGLE_QUOTE:
          final int start = i;
          boolean escape = false;
          for (i++; ((i < source.length()) && (escape || (source.charAt(i) != ch))); i++) {
            if (escape) {
              escape = false;
            } else {
              char _charAt_1 = source.charAt(i);
              switch (_charAt_1) {
                case KeywordExtractor.BACKSLASH:
                  escape = true;
                  break;
              }
            }
          }
          int _length = source.length();
          boolean _lessThan = (i < _length);
          if (_lessThan) {
            int _xifexpression = (int) 0;
            if (escape) {
              _xifexpression = (i + 1);
            } else {
              _xifexpression = i;
            }
            final OutStr str = splicer.apply(source, Integer.valueOf((start + 1)), Integer.valueOf(_xifexpression));
            Boolean _apply = validKeywordPredicate.apply(str);
            if ((_apply).booleanValue()) {
              keywords.add(str);
            }
          }
          break;
      }
    }
    return keywords;
  }
  
  private static String readFile(final String filename) throws FileNotFoundException {
    File _file = new File(filename);
    return KeywordExtractor.readFile(_file);
  }
  
  private static String readFile(final File file) throws FileNotFoundException {
    String _xtrycatchfinallyexpression = null;
    try (final Scanner scan = new Function0<Scanner>() {
      @Override
      public Scanner apply() {
        try {
          return new Scanner(file);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }.apply()) {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\A");
        scan.useDelimiter(_builder.toString());
        String _xtrycatchfinallyexpression_1 = null;
        try {
          _xtrycatchfinallyexpression_1 = scan.next();
        } catch (final Throwable _t) {
          if (_t instanceof NoSuchElementException) {
            _xtrycatchfinallyexpression_1 = "";
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = _xtrycatchfinallyexpression_1;
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    }
    return _xtrycatchfinallyexpression;
  }
}
