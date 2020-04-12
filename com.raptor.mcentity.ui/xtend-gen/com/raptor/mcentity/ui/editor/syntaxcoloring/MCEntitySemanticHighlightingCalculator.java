package com.raptor.mcentity.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import com.raptor.mcentity.mcentity.JSONEntry;
import com.raptor.mcentity.mcentity.McentityPackage;
import com.raptor.mcentity.mcentity.NBTEntry;
import com.raptor.mcentity.mcentity.NBTString;
import com.raptor.mcentity.mcentity.NBTValue;
import com.raptor.mcentity.mcentity.NamespacedKey;
import com.raptor.mcentity.mcentity.SelectorFilter;
import com.raptor.mcentity.mcentity.StringSelectorValue;
import com.raptor.mcentity.ui.editor.syntaxcoloring.MCEntityHighlightingConfiguration;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class MCEntitySemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  private static final boolean CONTINUE = false;
  
  private static final boolean STOP = true;
  
  protected boolean _highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    return MCEntitySemanticHighlightingCalculator.CONTINUE;
  }
  
  protected boolean _highlightElement(final NBTEntry entry, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, entry, McentityPackage.Literals.NBT_ENTRY__KEY, MCEntityHighlightingConfiguration.KEY_ID);
      boolean _xifexpression = false;
      NBTValue _value = entry.getValue();
      if ((_value instanceof NamespacedKey)) {
        boolean _xblockexpression_1 = false;
        {
          this.highlightFeature(acceptor, entry, McentityPackage.Literals.NBT_ENTRY__VALUE, DefaultHighlightingConfiguration.STRING_ID);
          _xblockexpression_1 = MCEntitySemanticHighlightingCalculator.STOP;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = MCEntitySemanticHighlightingCalculator.CONTINUE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final JSONEntry entry, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, entry, McentityPackage.Literals.JSON_ENTRY__KEY, MCEntityHighlightingConfiguration.KEY_ID);
      _xblockexpression = MCEntitySemanticHighlightingCalculator.CONTINUE;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final NamespacedKey nskey, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightNode(acceptor, NodeModelUtils.findActualNodeFor(nskey), DefaultHighlightingConfiguration.STRING_ID);
      _xblockexpression = MCEntitySemanticHighlightingCalculator.STOP;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final StringSelectorValue sel, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, sel, McentityPackage.Literals.STRING_SELECTOR_VALUE__VALUE, DefaultHighlightingConfiguration.STRING_ID);
      _xblockexpression = MCEntitySemanticHighlightingCalculator.STOP;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final NBTString nbt, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, nbt, McentityPackage.Literals.NBT_STRING__VALUE, DefaultHighlightingConfiguration.STRING_ID);
      _xblockexpression = MCEntitySemanticHighlightingCalculator.STOP;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final SelectorFilter filter, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, filter, McentityPackage.Literals.SELECTOR_FILTER__NAME, MCEntityHighlightingConfiguration.KEY_ID);
      boolean _xifexpression = false;
      if ((Objects.equal(filter.getName(), "type") && (filter.getValue() instanceof StringSelectorValue))) {
        boolean _xblockexpression_1 = false;
        {
          this.highlightFeature(acceptor, filter, McentityPackage.Literals.SELECTOR_FILTER__VALUE, DefaultHighlightingConfiguration.DEFAULT_ID);
          _xblockexpression_1 = MCEntitySemanticHighlightingCalculator.STOP;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = MCEntitySemanticHighlightingCalculator.CONTINUE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean highlightElement(final EObject nbt, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (nbt instanceof NBTString) {
      return _highlightElement((NBTString)nbt, acceptor, cancelIndicator);
    } else if (nbt instanceof NamespacedKey) {
      return _highlightElement((NamespacedKey)nbt, acceptor, cancelIndicator);
    } else if (nbt instanceof StringSelectorValue) {
      return _highlightElement((StringSelectorValue)nbt, acceptor, cancelIndicator);
    } else if (nbt instanceof JSONEntry) {
      return _highlightElement((JSONEntry)nbt, acceptor, cancelIndicator);
    } else if (nbt instanceof NBTEntry) {
      return _highlightElement((NBTEntry)nbt, acceptor, cancelIndicator);
    } else if (nbt instanceof SelectorFilter) {
      return _highlightElement((SelectorFilter)nbt, acceptor, cancelIndicator);
    } else if (nbt != null) {
      return _highlightElement(nbt, acceptor, cancelIndicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(nbt, acceptor, cancelIndicator).toString());
    }
  }
}
