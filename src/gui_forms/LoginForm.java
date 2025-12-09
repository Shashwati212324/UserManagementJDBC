package gui_forms;
import listeners.LoginListener;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginForm  {
	public JFrame frame;
	public JButton login,cancel,newuser;
	public JTextField textfield1,textfield2;
	public JLabel label1, label2;
	
	public LoginForm(){
		frame = new JFrame("LOGIN");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		
		login = new JButton("Login");
		cancel = new JButton("Cancel");
		textfield1= new JTextField(10);
		textfield2= new JTextField(10);
		label1 = new JLabel("ENTER NAME");
		label2 = new JLabel("ENTER PASSWORD");
		newuser = new JButton("Click here for new user");
		
		frame.add(label1);
		frame.add(textfield1);
		frame.add(label2);
		frame.add(textfield2);
		
		frame.add(login);
		frame.add(cancel);
		
		frame.add(newuser);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		LoginListener l = new LoginListener(this);
		login.addActionListener(l);
		cancel.addActionListener(l);
		newuser.addActionListener(l);
		
		frame.setVisible(true);
		
	}
	


	public static void main(String[] args) {
		new LoginForm();
	}
	

}
