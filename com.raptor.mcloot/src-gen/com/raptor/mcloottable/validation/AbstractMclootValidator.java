/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcloottable.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMclootValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.raptor.mcloottable.mcloot.MclootPackage.eINSTANCE);
		return result;
	}
}