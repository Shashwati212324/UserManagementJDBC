package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import beans.RegisterBean;
import dao.RegisterDao;
import gui_forms.RegisterForm;

public class RegisterListener implements ActionListener {
	RegisterForm registerform;

	public RegisterListener(RegisterForm registerForm) {
		// TODO Auto-generated constructor stub
		this.registerform =registerForm;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==registerform.register) {
			String name= registerform.textfield1.getText();
			String pass= registerform.textfield3.getText();
			String id = registerform.textfield2.getText();  // ID as String
			
		
	        // 2. Check empty fields
			if(name.isEmpty() || pass.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Please Fill All Fields");
			}
			
			else {
				RegisterBean r = new RegisterBean();
				r.setName(name);
				r.setId(id);
				r.setPass(pass);
				RegisterDao registerdao = new RegisterDao();
				String msg = registerdao.userRegister(r);
				if(msg.equals("Success")) {
					JOptionPane.showConfirmDialog(null, "Register Success");
				}
				else {
					JOptionPane.showConfirmDialog(null, "Register Failure");
				}
			}
			
		}
		
	}

}
