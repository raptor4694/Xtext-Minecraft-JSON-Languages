package com.raptor.mcmodel.ui.editor.syntaxcoloring

import com.raptor.mcmodel.mcmodel.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator

import static com.raptor.mcmodel.ui.editor.syntaxcoloring.McmodelHighlightingConfiguration.*
import static com.raptor.mcmodel.mcmodel.McmodelPackage.Literals.*
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.ILeafNode
import com.raptor.mcmodel.generator.McmodelGenerator

class McmodelSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	static val CONTINUE = false
	static val STOP = true
	static val ALL = -1
	
	def protected dispatch boolean highlightElement(
		EObject it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		Model it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		if (parent !== null) {
			acceptor.highlightNamespacedKey(it, MODEL__PARENT)
		}
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		Texture it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
//		var nameColor = DEFAULT_ID
//		if (eContainer instanceof Model) {
//			val model = eContainer as Model
//			val uri = model.eResource.URI
//			var i = uri.segmentCount - 1
//			while (i >= 0 && uri.segment(i) != "models") i--
//			if (i >= 0 && uri.segment(i) == "models" && i + 1 < uri.segmentCount) {
//				if (
//					switch (uri.segment(i + 1)) {
//						case "item", case "items": McmodelGenerator.isLayerTextureName(name)
//						case "block", case "blocks": name == "particle"
//					}
//				) {
//					nameColor = KEYWORD_ID
//				}
//			}
//		}
//		acceptor.highlightFeature(it, TEXTURE__NAME, nameColor)
		acceptor.highlightFeature(it, TEXTURE__NAME, 
			switch (name) {
				case 'particle', case McmodelGenerator.isLayerTextureName(name): KEYWORD_ID
				default: DEFAULT_ID
			}
		)
		
		if (value !== null) {
			if (value.startsWith('#')) {
				acceptor.highlightFeature(it, TEXTURE__VALUE, DEFAULT_ID)
			} else {
				acceptor.highlightNamespacedKey(it, TEXTURE__VALUE)
			}
		}
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		Face it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		if (texture !== null) {
			if (texture.startsWith('#')) {
				acceptor.highlightFeature(it, FACE__TEXTURE, DEFAULT_ID)
			} else {
				acceptor.highlightNamespacedKey(it, FACE__TEXTURE)
			}
		}
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		ItemOverride it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightNamespacedKey(it, ITEM_OVERRIDE__MODEL)
		CONTINUE
	}
	
	def protected dispatch boolean highlightElement(
		MCJsonEntry it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator
	) {
		acceptor.highlightFeature(it, MC_JSON_ENTRY__NAME, KEY_ID)
		CONTINUE
	}
	
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
			val leafNodes = node.leafNodes.filter[!isHidden].toList
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