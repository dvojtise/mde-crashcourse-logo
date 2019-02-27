/*
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.ide

import com.google.inject.Guice
import fr.inria.sed.logo.xtext.LogoRuntimeModule
import fr.inria.sed.logo.xtext.LogoStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LogoIdeSetup extends LogoStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LogoRuntimeModule, new LogoIdeModule))
	}
	
}