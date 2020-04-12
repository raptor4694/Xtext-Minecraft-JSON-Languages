package com.raptor.mcblockstate.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import com.raptor.mcblockstate.mcblockstate.BlockstateProperty;
import com.raptor.mcblockstate.mcblockstate.MCJsonEntry;
import com.raptor.mcblockstate.mcblockstate.McblockstatePackage;
import com.raptor.mcblockstate.mcblockstate.Model;
import com.raptor.mcblockstate.mcblockstate.NormalBlockstatePropertyPredicate;
import com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateHighlightingConfiguration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class McblockstateSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  public static final boolean CONTINUE = false;
  
  public static final boolean STOP = true;
  
  public static final int ALL = (-1);
  
  protected boolean _highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    return McblockstateSemanticHighlightingCalculator.CONTINUE;
  }
  
  protected boolean _highlightElement(final BlockstateProperty it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, McblockstatePackage.Literals.BLOCKSTATE_PROPERTY__NAME, DefaultHighlightingConfiguration.DEFAULT_ID);
      if ((((!this.isNumber(it.getValue())) && (!Objects.equal(it.getValue(), "true"))) && (!Objects.equal(it.getValue(), "false")))) {
        this.highlightFeature(acceptor, it, McblockstatePackage.Literals.BLOCKSTATE_PROPERTY__VALUE, DefaultHighlightingConfiguration.STRING_ID);
      }
      _xblockexpression = McblockstateSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final NormalBlockstatePropertyPredicate it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, McblockstatePackage.Literals.BLOCKSTATE_PROPERTY_PREDICATE__NAME, DefaultHighlightingConfiguration.DEFAULT_ID);
      boolean _isEmpty = it.getValues().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final List<INode> children = NodeModelUtils.findNodesForFeature(it, McblockstatePackage.Literals.NORMAL_BLOCKSTATE_PROPERTY_PREDICATE__VALUES);
        int _size = children.size();
        int _size_1 = it.getValues().size();
        boolean _equals = (_size == _size_1);
        if (_equals) {
          for (int i = 0; (i < it.getValues().size()); i++) {
            String _get = it.getValues().get(i);
            final String value = _get;
            boolean _matched = false;
            boolean _isNumber = this.isNumber(value);
            if (_isNumber) {
              _matched=true;
            }
            if (!_matched) {
              if (Objects.equal(value, "true")) {
                _matched=true;
              }
            }
            if (!_matched) {
              if (Objects.equal(value, "false")) {
                _matched=true;
              }
            }
            if (_matched) {
            }
            if (!_matched) {
              this.highlightNode(acceptor, children.get(i), DefaultHighlightingConfiguration.STRING_ID);
            }
          }
        } else {
          throw new AssertionError("children.size != values.size");
        }
      }
      _xblockexpression = McblockstateSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final Model it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, McblockstatePackage.Literals.MODEL__LOCATION);
      _xblockexpression = McblockstateSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final MCJsonEntry it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, McblockstatePackage.Literals.MC_JSON_ENTRY__NAME, McblockstateHighlightingConfiguration.KEY_ID);
      _xblockexpression = McblockstateSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  private static final Pattern NUMBER_REGEX = new Function0<Pattern>() {
    @Override
    public Pattern apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[-+]?(\\.[0-9]+([eE][-+]?[0-9]+)?|[0-9]+(\\.[0-9]+([eE][-+]?[0-9]+)?|[eE][-+]?[0-9]+)?)");
      Pattern _compile = Pattern.compile(_builder.toString());
      return _compile;
    }
  }.apply();
  
  protected boolean isNumber(final String str) {
    return McblockstateSemanticHighlightingCalculator.NUMBER_REGEX.matcher(str).matches();
  }
  
  protected void highlightFeature(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature, final int index, final String... styleIds) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      if ((index == McblockstateSemanticHighlightingCalculator.ALL)) {
        for (final INode child : children) {
          this.highlightNode(acceptor, child, styleIds);
        }
      } else {
        if (((index >= 0) && (index < children.size()))) {
          this.highlightNode(acceptor, children.get(index), styleIds);
        }
      }
    }
  }
  
  protected void highlightNamespacedKey(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      this.highlightNamespacedKeyNode(acceptor, children.get(0));
    }
  }
  
  protected void highlightNamespacedKey(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature, final int index) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      if ((index == McblockstateSemanticHighlightingCalculator.ALL)) {
        for (final INode child : children) {
          this.highlightNamespacedKeyNode(acceptor, child);
        }
      } else {
        if (((index >= 0) && (index < children.size()))) {
          this.highlightNamespacedKeyNode(acceptor, children.get(index));
        }
      }
    }
  }
  
  protected void highlightNamespacedKeyNode(final IHighlightedPositionAcceptor acceptor, final INode node) {
    if ((node == null)) {
      return;
    }
    if ((node instanceof ILeafNode)) {
      final ITextRegion textRegion = ((ILeafNode)node).getTextRegion();
      acceptor.addPosition(textRegion.getOffset(), textRegion.getLength(), McblockstateHighlightingConfiguration.NAMESPACE_KEY_ID);
    } else {
      final List<ILeafNode> leafNodes = IterableExtensions.<ILeafNode>toList(node.getLeafNodes());
      int i = 0;
      if (((leafNodes.size() >= 3) && Objects.equal(leafNodes.get(1).getText(), ":"))) {
        for (; (i < 2); i++) {
          {
            final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
            acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), McblockstateHighlightingConfiguration.NAMESPACE_ID);
          }
        }
      }
      for (; (i < leafNodes.size()); i++) {
        {
          final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
          acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), McblockstateHighlightingConfiguration.NAMESPACE_KEY_ID);
        }
      }
    }
  }
  
  protected boolean highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (it instanceof NormalBlockstatePropertyPredicate) {
      return _highlightElement((NormalBlockstatePropertyPredicate)it, acceptor, cancelIndicator);
    } else if (it instanceof BlockstateProperty) {
      return _highlightElement((BlockstateProperty)it, acceptor, cancelIndicator);
    } else if (it instanceof MCJsonEntry) {
      return _highlightElement((MCJsonEntry)it, acceptor, cancelIndicator);
    } else if (it instanceof Model) {
      return _highlightElement((Model)it, acceptor, cancelIndicator);
    } else if (it != null) {
      return _highlightElement(it, acceptor, cancelIndicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, acceptor, cancelIndicator).toString());
    }
  }
}
