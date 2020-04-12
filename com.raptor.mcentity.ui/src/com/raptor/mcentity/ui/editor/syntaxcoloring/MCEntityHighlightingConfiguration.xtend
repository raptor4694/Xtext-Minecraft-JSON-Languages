package com.raptor.mcentity.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.swt.graphics.RGB

class MCEntityHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static val KEY_ID = "key"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(KEY_ID, "Key", keyTextStyle())
	}
	
	def keyTextStyle() {
		val textStyle = defaultTextStyle().copy()
		textStyle.color = new RGB(127, 0, 85)
		return textStyle
	}
	
}