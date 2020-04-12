package com.raptor.mcloottable.ui.editor.syntaxcoloring

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor

class MclootHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static val KEY_ID = "key"
	public static val NAMESPACE_ID = "namespace"
	public static val NAMESPACE_KEY_ID = "namespace_key"
	public static val FUNCTION_ID = "function"
	public static val CONDITION_ID = "condition"
	
	override configure(IHighlightingConfigurationAcceptor it) {
		super.configure(it)
		acceptDefaultHighlighting(KEY_ID, "Key", keyTextStyle)
		acceptDefaultHighlighting(NAMESPACE_ID, "Namespace", namespaceTextStyle)
		acceptDefaultHighlighting(NAMESPACE_KEY_ID, "Key (Namespace)", namespaceKeyTextStyle)
		acceptDefaultHighlighting(FUNCTION_ID, "Function", functionTextStyle)
		acceptDefaultHighlighting(CONDITION_ID, "Condition", conditionTextStyle)
	}
	
	def keyTextStyle() {
		keywordTextStyle.copy() => [
			style = SWT.NONE
		]
	}
	
	def namespaceTextStyle() {
		defaultTextStyle.copy() => [
			color = new RGB(100, 100, 100)
		]
	}
	
	def namespaceKeyTextStyle() {
        defaultTextStyle
    }
	
	def functionTextStyle() {
	    defaultTextStyle.copy() => [
	        style = SWT.BOLD
	    ]
	}
	
	def conditionTextStyle() {
	    defaultTextStyle.copy() => [
	        style = SWT.ITALIC
	    ]
	}
	
}