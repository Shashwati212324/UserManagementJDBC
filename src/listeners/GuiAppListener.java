package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui_forms.DeleteForm;
import gui_forms.GuiApp;
import gui_forms.LoginForm;
import gui_forms.SelectForm;
import gui_forms.UpdateForm;

public class GuiAppListener implements ActionListener {
	GuiApp guiApp;

	public GuiAppListener(GuiApp guiApp) {
		this.guiApp = guiApp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o =e.getSource();
		
		if(o==guiApp.login) {
			LoginForm l = new LoginForm();
		}
		else if(o == guiApp.update) {
			new UpdateForm();
		}
		else if(o == guiApp.delete) {
			new DeleteForm();
		}
		else if(o == guiApp.select) {
			 new SelectForm();
		}
		
		
		
		
	}

	
}
