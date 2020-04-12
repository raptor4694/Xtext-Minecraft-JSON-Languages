/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcblockstate.generator;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.raptor.mcblockstate.mcblockstate.BaseCaseCondition;
import com.raptor.mcblockstate.mcblockstate.Blockstate;
import com.raptor.mcblockstate.mcblockstate.BlockstateProperty;
import com.raptor.mcblockstate.mcblockstate.BlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.BooleanBlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.Case;
import com.raptor.mcblockstate.mcblockstate.CaseCondition;
import com.raptor.mcblockstate.mcblockstate.CustomBlockstate;
import com.raptor.mcblockstate.mcblockstate.MCJsonArray;
import com.raptor.mcblockstate.mcblockstate.MCJsonBoolean;
import com.raptor.mcblockstate.mcblockstate.MCJsonEntry;
import com.raptor.mcblockstate.mcblockstate.MCJsonFloatingPoint;
import com.raptor.mcblockstate.mcblockstate.MCJsonIntegral;
import com.raptor.mcblockstate.mcblockstate.MCJsonNull;
import com.raptor.mcblockstate.mcblockstate.MCJsonObject;
import com.raptor.mcblockstate.mcblockstate.MCJsonString;
import com.raptor.mcblockstate.mcblockstate.MCJsonValue;
import com.raptor.mcblockstate.mcblockstate.Model;
import com.raptor.mcblockstate.mcblockstate.ModelList;
import com.raptor.mcblockstate.mcblockstate.MultipartBlockstate;
import com.raptor.mcblockstate.mcblockstate.NormalBlockstatePropertyPredicate;
import com.raptor.mcblockstate.mcblockstate.OrCaseCondition;
import com.raptor.mcblockstate.mcblockstate.Variant;
import com.raptor.mcblockstate.mcblockstate.VariantsBlockstate;
import java.util.Arrays;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class McblockstateGenerator extends AbstractGenerator {
  @Inject
  private STRINGValueConverter stringValueConverter;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(resource.getURI().trimFileExtension().appendFileExtension("json").lastSegment(), 
      this.formatBlockstate(Iterators.<Blockstate>filter(resource.getAllContents(), Blockstate.class).next()));
  }
  
  protected CharSequence _formatBlockstate(final CustomBlockstate it) {
    return this.formatJson(it.getJson());
  }
  
  protected CharSequence _formatBlockstate(final VariantsBlockstate it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"variants\": {");
    _builder.newLine();
    {
      EList<Variant> _variants = it.getVariants();
      boolean _hasElements = false;
      for(final Variant variant : _variants) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t");
        }
        _builder.append("\t\t");
        String _asLiteral = this.asLiteral(McblockstateGenerator.getPropertyString(variant));
        _builder.append(_asLiteral, "\t\t");
        _builder.append(": ");
        CharSequence _formatModelList = this.formatModelList(variant.getModels());
        _builder.append(_formatModelList, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _formatBlockstate(final MultipartBlockstate it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"multipart\": [");
    _builder.newLine();
    {
      EList<Case> _cases = it.getCases();
      boolean _hasElements = false;
      for(final Case acase : _cases) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t");
        }
        _builder.append("\t\t");
        CharSequence _formatCase = this.formatCase(acase);
        _builder.append(_formatCase, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence formatCase(final Case it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      CaseCondition _condition = it.getCondition();
      boolean _tripleNotEquals = (_condition != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("\"when\": ");
        CharSequence _formatCondition = this.formatCondition(it.getCondition());
        _builder.append(_formatCondition, "\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("\"apply\": ");
    CharSequence _formatModelList = this.formatModelList(it.getModels());
    _builder.append(_formatModelList, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _formatCondition(final BaseCaseCondition it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<BlockstatePropertyPredicate> _properties = it.getProperties();
      boolean _hasElements = false;
      for(final BlockstatePropertyPredicate property : _properties) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        String _asLiteral = this.asLiteral(property.getName());
        _builder.append(_asLiteral, "\t");
        _builder.append(": ");
        {
          if ((property instanceof NormalBlockstatePropertyPredicate)) {
            String _asLiteral_1 = this.asLiteral(IterableExtensions.join(((NormalBlockstatePropertyPredicate)property).getValues(), "|"));
            _builder.append(_asLiteral_1, "\t");
          } else {
            if ((property instanceof BooleanBlockstatePropertyPredicate)) {
              {
                boolean _isInverted = ((BooleanBlockstatePropertyPredicate)property).isInverted();
                if (_isInverted) {
                  _builder.append("false");
                } else {
                  _builder.append("true");
                }
              }
            }
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _formatCondition(final OrCaseCondition it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"OR\": [");
    _builder.newLine();
    {
      EList<CaseCondition> _options = it.getOptions();
      boolean _hasElements = false;
      for(final CaseCondition option : _options) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t");
        }
        _builder.append("\t\t");
        Object _formatCondition = this.formatCondition(option);
        _builder.append(_formatCondition, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence formatModelList(final ModelList it) {
    CharSequence _xifexpression = null;
    int _size = it.getModels().size();
    boolean _equals = (_size == 1);
    if (_equals) {
      _xifexpression = this.formatModel(it.getModels().get(0));
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isEmpty = it.getModels().isEmpty();
      if (_isEmpty) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[]");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("[");
        _builder_1.newLine();
        {
          EList<Model> _models = it.getModels();
          boolean _hasElements = false;
          for(final Model model : _models) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder_1.appendImmediate(",", "\t");
            }
            _builder_1.append("\t");
            CharSequence _formatModel = this.formatModel(model);
            _builder_1.append(_formatModel, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("]");
        _builder_1.newLine();
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence formatModel(final Model it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ \"model\": ");
    String _asLiteral = this.asLiteral(it.getLocation());
    _builder.append(_asLiteral);
    {
      boolean _isWeightDefined = it.isWeightDefined();
      if (_isWeightDefined) {
        _builder.append(", \"weight\": ");
        long _weight = it.getWeight();
        _builder.append(_weight);
      }
    }
    {
      boolean _isXDefined = it.isXDefined();
      if (_isXDefined) {
        _builder.append(", \"x\": ");
        long _x = it.getX();
        _builder.append(_x);
      }
    }
    {
      boolean _isYDefined = it.isYDefined();
      if (_isYDefined) {
        _builder.append(", \"y\": ");
        long _y = it.getY();
        _builder.append(_y);
      }
    }
    {
      boolean _isUvlockDefined = it.isUvlockDefined();
      if (_isUvlockDefined) {
        _builder.append(", \"uvlock\": ");
        boolean _isUvlock = it.isUvlock();
        _builder.append(_isUvlock);
      }
    }
    _builder.append(" }");
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonString it) {
    StringConcatenation _builder = new StringConcatenation();
    String _asLiteral = this.asLiteral(it.getValue());
    _builder.append(_asLiteral);
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonBoolean it) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isValue = it.isValue();
    _builder.append(_isValue);
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonIntegral it) {
    StringConcatenation _builder = new StringConcatenation();
    long _value = it.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonFloatingPoint it) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = it.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonNull it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder;
  }
  
  protected CharSequence _formatJson(final MCJsonArray it) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = it.getElements().isEmpty();
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[]");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      final Predicate<MCJsonValue> _function = (MCJsonValue it_1) -> {
        return this.isComplicated(it_1);
      };
      boolean _anyMatch = it.getElements().stream().anyMatch(_function);
      if (_anyMatch) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("[");
        _builder_1.newLine();
        {
          EList<MCJsonValue> _elements = it.getElements();
          boolean _hasElements = false;
          for(final MCJsonValue element : _elements) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder_1.appendImmediate(",", "\t");
            }
            _builder_1.append("\t");
            Object _formatJson = this.formatJson(element);
            _builder_1.append(_formatJson, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("]");
        _builder_1.newLine();
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("[");
        {
          EList<MCJsonValue> _elements_1 = it.getElements();
          boolean _hasElements_1 = false;
          for(final MCJsonValue element_1 : _elements_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder_2.appendImmediate(", ", "");
            }
            Object _formatJson_1 = this.formatJson(element_1);
            _builder_2.append(_formatJson_1);
          }
        }
        _builder_2.append("]");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _formatJson(final MCJsonObject it) {
    CharSequence _xifexpression = null;
    boolean _isEmpty = it.getEntries().isEmpty();
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{}");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{");
      _builder_1.newLine();
      {
        EList<MCJsonEntry> _entries = it.getEntries();
        boolean _hasElements = false;
        for(final MCJsonEntry entry : _entries) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder_1.appendImmediate(",", "\t");
          }
          _builder_1.append("\t");
          String _asLiteral = this.asLiteral(entry.getName());
          _builder_1.append(_asLiteral, "\t");
          _builder_1.append(": ");
          Object _formatJson = this.formatJson(entry.getValue());
          _builder_1.append(_formatJson, "\t");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected boolean _isComplicated(final MCJsonObject it) {
    int _size = it.getEntries().size();
    return (_size > 0);
  }
  
  protected boolean _isComplicated(final MCJsonArray it) {
    int _size = it.getElements().size();
    return (_size > 0);
  }
  
  protected boolean _isComplicated(final MCJsonValue it) {
    return false;
  }
  
  public static String getPropertyString(final Variant it) {
    final Function1<BlockstateProperty, String> _function = (BlockstateProperty it_1) -> {
      StringConcatenation _builder = new StringConcatenation();
      String _name = it_1.getName();
      _builder.append(_name);
      _builder.append("=");
      String _value = it_1.getValue();
      _builder.append(_value);
      return _builder.toString();
    };
    return IterableExtensions.join(IterableExtensions.<String>sort(ListExtensions.<BlockstateProperty, String>map(it.getProperties(), _function)), ",");
  }
  
  public String asLiteral(final String str) {
    return this.stringValueConverter.toString(str);
  }
  
  public CharSequence formatBlockstate(final Blockstate it) {
    if (it instanceof CustomBlockstate) {
      return _formatBlockstate((CustomBlockstate)it);
    } else if (it instanceof MultipartBlockstate) {
      return _formatBlockstate((MultipartBlockstate)it);
    } else if (it instanceof VariantsBlockstate) {
      return _formatBlockstate((VariantsBlockstate)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence formatCondition(final CaseCondition it) {
    if (it instanceof BaseCaseCondition) {
      return _formatCondition((BaseCaseCondition)it);
    } else if (it instanceof OrCaseCondition) {
      return _formatCondition((OrCaseCondition)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence formatJson(final MCJsonValue it) {
    if (it instanceof MCJsonFloatingPoint) {
      return _formatJson((MCJsonFloatingPoint)it);
    } else if (it instanceof MCJsonIntegral) {
      return _formatJson((MCJsonIntegral)it);
    } else if (it instanceof MCJsonArray) {
      return _formatJson((MCJsonArray)it);
    } else if (it instanceof MCJsonBoolean) {
      return _formatJson((MCJsonBoolean)it);
    } else if (it instanceof MCJsonNull) {
      return _formatJson((MCJsonNull)it);
    } else if (it instanceof MCJsonObject) {
      return _formatJson((MCJsonObject)it);
    } else if (it instanceof MCJsonString) {
      return _formatJson((MCJsonString)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public boolean isComplicated(final MCJsonValue it) {
    if (it instanceof MCJsonArray) {
      return _isComplicated((MCJsonArray)it);
    } else if (it instanceof MCJsonObject) {
      return _isComplicated((MCJsonObject)it);
    } else if (it != null) {
      return _isComplicated(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}