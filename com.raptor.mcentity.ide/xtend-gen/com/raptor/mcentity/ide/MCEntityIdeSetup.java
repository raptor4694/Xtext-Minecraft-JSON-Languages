/**
 * generated by Xtext 2.19.0
 */
package com.raptor.mcentity.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.raptor.mcentity.MCEntityRuntimeModule;
import com.raptor.mcentity.MCEntityStandaloneSetup;
import com.raptor.mcentity.ide.MCEntityIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MCEntityIdeSetup extends MCEntityStandaloneSetup {
  @Override
  public Injector createInjector() {
    MCEntityRuntimeModule _mCEntityRuntimeModule = new MCEntityRuntimeModule();
    MCEntityIdeModule _mCEntityIdeModule = new MCEntityIdeModule();
    return Guice.createInjector(Modules2.mixin(_mCEntityRuntimeModule, _mCEntityIdeModule));
  }
}
