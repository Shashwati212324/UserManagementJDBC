package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import beans.LoginBean;
import dao.LoginDao;
import gui_forms.LoginForm;
import gui_forms.RegisterForm;

public class LoginListener implements  ActionListener{
	LoginForm loginform;
	RegisterForm registerForm;
	public LoginListener(LoginForm loginform) {
		this.loginform= loginform;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginform.login) {
			String name =loginform.textfield1.getText();
			String pass =loginform.textfield2.getText();
			LoginBean loginBean = new LoginBean(name,pass);
			LoginDao dao = new LoginDao();
			dao.useLogin(loginBean);
			
		}else if(e.getSource()==loginform.newuser) {
			loginform.frame.dispose(); // ✅ close login form
            new RegisterForm();        // ✅ open register form
		}
		else if(e.getSource()==loginform.cancel) {
			loginform.textfield1.setText("");
			loginform.textfield2.setText("");
			System.out.println("cancel");
			
		}
	
	}
}
