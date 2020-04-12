package com.raptor.mcmodel.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import com.raptor.mcmodel.generator.McmodelGenerator;
import com.raptor.mcmodel.mcmodel.Face;
import com.raptor.mcmodel.mcmodel.ItemOverride;
import com.raptor.mcmodel.mcmodel.MCJsonEntry;
import com.raptor.mcmodel.mcmodel.McmodelPackage;
import com.raptor.mcmodel.mcmodel.Model;
import com.raptor.mcmodel.mcmodel.Texture;
import com.raptor.mcmodel.ui.editor.syntaxcoloring.McmodelHighlightingConfiguration;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class McmodelSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  private static final boolean CONTINUE = false;
  
  private static final boolean STOP = true;
  
  private static final int ALL = (-1);
  
  protected boolean _highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    return McmodelSemanticHighlightingCalculator.CONTINUE;
  }
  
  protected boolean _highlightElement(final Model it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _parent = it.getParent();
      boolean _tripleNotEquals = (_parent != null);
      if (_tripleNotEquals) {
        this.highlightNamespacedKey(acceptor, it, McmodelPackage.Literals.MODEL__PARENT);
      }
      _xblockexpression = McmodelSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final Texture it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _switchResult = null;
      String _name = it.getName();
      boolean _matched = false;
      if (Objects.equal(_name, "particle")) {
        _matched=true;
      }
      if (!_matched) {
        boolean _isLayerTextureName = McmodelGenerator.isLayerTextureName(it.getName());
        if (_isLayerTextureName) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = DefaultHighlightingConfiguration.KEYWORD_ID;
      }
      if (!_matched) {
        _switchResult = DefaultHighlightingConfiguration.DEFAULT_ID;
      }
      this.highlightFeature(acceptor, it, McmodelPackage.Literals.TEXTURE__NAME, _switchResult);
      String _value = it.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        boolean _startsWith = it.getValue().startsWith("#");
        if (_startsWith) {
          this.highlightFeature(acceptor, it, McmodelPackage.Literals.TEXTURE__VALUE, DefaultHighlightingConfiguration.DEFAULT_ID);
        } else {
          this.highlightNamespacedKey(acceptor, it, McmodelPackage.Literals.TEXTURE__VALUE);
        }
      }
      _xblockexpression = McmodelSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final Face it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      String _texture = it.getTexture();
      boolean _tripleNotEquals = (_texture != null);
      if (_tripleNotEquals) {
        boolean _startsWith = it.getTexture().startsWith("#");
        if (_startsWith) {
          this.highlightFeature(acceptor, it, McmodelPackage.Literals.FACE__TEXTURE, DefaultHighlightingConfiguration.DEFAULT_ID);
        } else {
          this.highlightNamespacedKey(acceptor, it, McmodelPackage.Literals.FACE__TEXTURE);
        }
      }
      _xblockexpression = McmodelSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final ItemOverride it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNamespacedKey(acceptor, it, McmodelPackage.Literals.ITEM_OVERRIDE__MODEL);
      _xblockexpression = McmodelSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final MCJsonEntry it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, it, McmodelPackage.Literals.MC_JSON_ENTRY__NAME, McmodelHighlightingConfiguration.KEY_ID);
      _xblockexpression = McmodelSemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected void highlightFeature(final IHighlightedPositionAcceptor acceptor, final EObject object, final EStructuralFeature feature, final int index, final String... styleIds) {
    final List<INode> children = NodeModelUtils.findNodesForFeature(object, feature);
    int _size = children.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      if ((index == McmodelSemanticHighlightingCalculator.ALL)) {
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
      if ((index == McmodelSemanticHighlightingCalculator.ALL)) {
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
      acceptor.addPosition(textRegion.getOffset(), textRegion.getLength(), McmodelHighlightingConfiguration.NAMESPACE_KEY_ID);
    } else {
      final Function1<ILeafNode, Boolean> _function = (ILeafNode it) -> {
        boolean _isHidden = it.isHidden();
        return Boolean.valueOf((!_isHidden));
      };
      final List<ILeafNode> leafNodes = IterableExtensions.<ILeafNode>toList(IterableExtensions.<ILeafNode>filter(node.getLeafNodes(), _function));
      int i = 0;
      if (((leafNodes.size() >= 3) && Objects.equal(leafNodes.get(1).getText(), ":"))) {
        for (; (i < 2); i++) {
          {
            final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
            acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), McmodelHighlightingConfiguration.NAMESPACE_ID);
          }
        }
      }
      for (; (i < leafNodes.size()); i++) {
        {
          final ITextRegion textRegion_1 = leafNodes.get(i).getTextRegion();
          acceptor.addPosition(textRegion_1.getOffset(), textRegion_1.getLength(), McmodelHighlightingConfiguration.NAMESPACE_KEY_ID);
        }
      }
    }
  }
  
  protected boolean highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (it instanceof Face) {
      return _highlightElement((Face)it, acceptor, cancelIndicator);
    } else if (it instanceof ItemOverride) {
      return _highlightElement((ItemOverride)it, acceptor, cancelIndicator);
    } else if (it instanceof MCJsonEntry) {
      return _highlightElement((MCJsonEntry)it, acceptor, cancelIndicator);
    } else if (it instanceof Model) {
      return _highlightElement((Model)it, acceptor, cancelIndicator);
    } else if (it instanceof Texture) {
      return _highlightElement((Texture)it, acceptor, cancelIndicator);
    } else if (it != null) {
      return _highlightElement(it, acceptor, cancelIndicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, acceptor, cancelIndicator).toString());
    }
  }
}
