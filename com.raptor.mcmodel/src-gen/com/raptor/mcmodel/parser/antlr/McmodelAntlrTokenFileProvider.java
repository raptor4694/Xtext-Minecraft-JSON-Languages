/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class McmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/raptor/mcmodel/parser/antlr/internal/InternalMcmodel.tokens");
	}
}
