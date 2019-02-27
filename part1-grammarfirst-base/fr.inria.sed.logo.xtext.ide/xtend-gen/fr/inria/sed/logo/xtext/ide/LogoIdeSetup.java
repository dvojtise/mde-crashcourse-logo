/**
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.inria.sed.logo.xtext.LogoRuntimeModule;
import fr.inria.sed.logo.xtext.LogoStandaloneSetup;
import fr.inria.sed.logo.xtext.ide.LogoIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LogoIdeSetup extends LogoStandaloneSetup {
  @Override
  public Injector createInjector() {
    LogoRuntimeModule _logoRuntimeModule = new LogoRuntimeModule();
    LogoIdeModule _logoIdeModule = new LogoIdeModule();
    return Guice.createInjector(Modules2.mixin(_logoRuntimeModule, _logoIdeModule));
  }
}