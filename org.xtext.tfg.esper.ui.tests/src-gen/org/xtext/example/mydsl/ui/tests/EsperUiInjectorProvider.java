/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.tfg.esper.ui.internal.EsperActivator;

public class EsperUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EsperActivator.getInstance().getInjector("org.xtext.example.mydsl.Esper");
	}

}
