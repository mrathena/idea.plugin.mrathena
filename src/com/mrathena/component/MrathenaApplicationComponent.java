package com.mrathena.component;

import com.intellij.openapi.components.ApplicationComponent;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.jetbrains.annotations.NotNull;

/**
 * @author mrathena
 */
public class MrathenaApplicationComponent implements ApplicationComponent {

	private static final String COMPONENT = "MRATHENA";

	public static final SAXBuilder saxBuilder = new SAXBuilder();
	public static final XMLOutputter xmlOutputter = new XMLOutputter();

	public MrathenaApplicationComponent() {}

	@Override
	public void initComponent() {}

	@Override
	public void disposeComponent() {}

	@Override
	@NotNull
	public String getComponentName() {
		return COMPONENT;
	}

}
