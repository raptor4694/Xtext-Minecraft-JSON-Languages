/**
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable;

import com.raptor.mcloottable.MclootStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MclootStandaloneSetup extends MclootStandaloneSetupGenerated {
  public static void doSetup() {
    new MclootStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}