package com.raptor.mcentity.ui.editor.syntaxcoloring

import com.raptor.mcentity.mcentity.JSONEntry
import com.raptor.mcentity.mcentity.NBTEntry
import com.raptor.mcentity.mcentity.NBTString
import com.raptor.mcentity.mcentity.NamespacedKey
import com.raptor.mcentity.mcentity.SelectorFilter
import com.raptor.mcentity.mcentity.StringSelectorValue
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator

import static com.raptor.mcentity.mcentity.McentityPackage.Literals.*
import static com.raptor.mcentity.ui.editor.syntaxcoloring.MCEntityHighlightingConfiguration.*
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.*

class MCEntitySemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	static val CONTINUE = false
	static val STOP = true

	def dispatch boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		CONTINUE
	}
	
	def dispatch boolean highlightElement(NBTEntry entry, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(entry, NBT_ENTRY__KEY, KEY_ID)
//		if(entry.value instanceof NBTString) {
//			acceptor.highlightFeature(entry, NBT_ENTRY__VALUE, STRING_ID)
//			return true
//		} else {
//			return false
//		}
		if(entry.value instanceof NamespacedKey) {
			acceptor.highlightFeature(entry, NBT_ENTRY__VALUE, STRING_ID)
			STOP
		} else {
			CONTINUE
		}
	}
	
	def dispatch boolean highlightElement(JSONEntry entry, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(entry, JSON_ENTRY__KEY, KEY_ID)
		CONTINUE
	}
	
	def dispatch boolean highlightElement(NamespacedKey nskey, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightNode(NodeModelUtils.findActualNodeFor(nskey), STRING_ID)
		STOP
	}
	
	def dispatch boolean highlightElement(StringSelectorValue sel, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(sel, STRING_SELECTOR_VALUE__VALUE, STRING_ID)
		STOP
	}
	
	def dispatch boolean highlightElement(NBTString nbt, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(nbt, NBT_STRING__VALUE, STRING_ID)
		STOP
	}
	
	def dispatch boolean highlightElement(SelectorFilter filter, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(filter, SELECTOR_FILTER__NAME, KEY_ID)
//		if(filter.value instanceof NamespacedKey) {
//			acceptor.highlightFeature(filter, SELECTOR_FILTER__VALUE, STRING_ID)
//			return STOP
//		} else {
//			return CONTINUE
//		}
		if(filter.name == "type" && filter.value instanceof StringSelectorValue) {
			acceptor.highlightFeature(filter, SELECTOR_FILTER__VALUE, DEFAULT_ID)
			STOP
		} else {
			CONTINUE
		}
	}
	
}