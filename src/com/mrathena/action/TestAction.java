package com.mrathena.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * @author mrathena
 */
public class TestAction extends AnAction {

	@Override
	public void actionPerformed(AnActionEvent e) {
		Messages.showInfoMessage("I'm message", "I'm title");
	}

}
