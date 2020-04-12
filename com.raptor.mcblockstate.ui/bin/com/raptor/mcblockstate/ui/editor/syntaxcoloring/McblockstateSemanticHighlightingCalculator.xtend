package com.raptor.mcblockstate.ui.editor.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import com.raptor.mcblockstate.mcblockstate.*
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.emf.ecore.EObject
import static com.raptor.mcblockstate.ui.editor.syntaxcoloring.McblockstateHighlightingConfiguration.*
import static com.raptor.mcblockstate.mcblockstate.McblockstatePackage.Literals.*
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import java.util.regex.Pattern
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode

class McblockstateSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	public static val CONTINUE = false
	public static val STOP = true
	public static val ALL = -1 
	
	def protected dispatch boolean highlightElement(
		EObject it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		BlockstateProperty it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightFeature(it, BLOCKSTATE_PROPERTY__NAME, DEFAULT_ID)
		if (!value.isNumber && value != "true" && value != "false") {
			acceptor.highlightFeature(it, BLOCKSTATE_PROPERTY__VALUE, STRING_ID)
		}
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		NormalBlockstatePropertyPredicate it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightFeature(it, BLOCKSTATE_PROPERTY_PREDICATE__NAME, DEFAULT_ID)
		if (!values.isEmpty) {
			val children = NodeModelUtils.findNodesForFeature(it, NORMAL_BLOCKSTATE_PROPERTY_PREDICATE__VALUES)
			if (children.size == values.size) {
				for (var i = 0; i < values.size; i++) {
					switch value: values.get(i) {
						case value.isNumber, case "true", case "false": {}
						default:
							acceptor.highlightNode(children.get(i), STRING_ID)
					}
				}
			} else {
				throw new AssertionError("children.size != values.size")
			}
		}
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		Model it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightNamespacedKey(it, MODEL__LOCATION)
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		MCJsonEntry it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightFeature(it, MC_JSON_ENTRY__NAME, KEY_ID)
		CONTINUE
	}
	
	static val NUMBER_REGEX = Pattern.compile('''[-+]?(\.[0-9]+([eE][-+]?[0-9]+)?|[0-9]+(\.[0-9]+([eE][-+]?[0-9]+)?|[eE][-+]?[0-9]+)?)''')
	
	def protected isNumber(String str) { NUMBER_REGEX.matcher(str).matches() }
	
	def protected void highlightFeature(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature, int index, String... styleIds) {
		val children = NodeModelUtils.findNodesForFeature(object, feature)
		if (children.size > 0) {
			if (index == ALL) {
				for (child : children) {
					acceptor.highlightNode(child, styleIds)
				}
			} else if (index >= 0 && index < children.size) {
				acceptor.highlightNode(children.get(index), styleIds)
			}
		}
	}
	
	def protected void highlightNamespacedKey(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature) {
		val children = NodeModelUtils.findNodesForFeature(object, feature)
		if (children.size > 0) {
			acceptor.highlightNamespacedKeyNode(children.get(0))
		}
	}
	
	def protected void highlightNamespacedKey(IHighlightedPositionAcceptor acceptor, EObject object, EStructuralFeature feature, int index) {
		val children = NodeModelUtils.findNodesForFeature(object, feature)
		if (children.size > 0) {
			if (index == ALL) {
				for (child : children) {
					acceptor.highlightNamespacedKeyNode(child)
				}
			} else if (index >= 0 && index < children.size) {
				acceptor.highlightNamespacedKeyNode(children.get(index))
			}
		}
	}
	
	def protected void highlightNamespacedKeyNode(IHighlightedPositionAcceptor acceptor, INode node) {
		if (node === null) return;
		if (node instanceof ILeafNode) {
			val textRegion = node.textRegion
			acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_KEY_ID)
		} else {
			val leafNodes = node.leafNodes.toList
			var i = 0
			if (leafNodes.size >= 3 && leafNodes.get(1).text == ':') {
				for (; i < 2; i++) {
					val textRegion = leafNodes.get(i).textRegion
					acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_ID)
				}
			}
			for (; i < leafNodes.size; i++) {
				val textRegion = leafNodes.get(i).textRegion
				acceptor.addPosition(textRegion.offset, textRegion.length, NAMESPACE_KEY_ID)
			}
		}
	}
	
}