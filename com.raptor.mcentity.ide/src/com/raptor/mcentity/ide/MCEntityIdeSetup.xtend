/*
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.ide

import com.google.inject.Guice
import com.raptor.mcentity.MCEntityRuntimeModule
import com.raptor.mcentity.MCEntityStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MCEntityIdeSetup extends MCEntityStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MCEntityRuntimeModule, new MCEntityIdeModule))
	}
	
}
