package gui_forms;
import listeners.LoginListener;
import listeners.RegisterListener;

import java.awt.FlowLayout;
import javax.swing.*;

public class RegisterForm  {
	public JFrame frame;
	public JButton register,clear;
	public JTextField textfield1,textfield2,textfield3;
	public JLabel label1, label2, label3;
	
	public RegisterForm(){
		frame = new JFrame("Register");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		
		register = new JButton("Register");
		clear = new JButton("Clear");
		textfield1= new JTextField(10);
		textfield2= new JTextField(10);
		textfield3= new JTextField(10);
		
		label1 = new JLabel("ENTER NAME");
		label2 = new JLabel("ENTER PASSWORD");
		label3 = new JLabel("ENTER ID");
		
		frame.add(label1);
		frame.add(textfield1);
		frame.add(label2);
		frame.add(textfield2);
		frame.add(label3);
		frame.add(textfield3);
		
		frame.add(register);
		frame.add(clear);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		RegisterListener l = new RegisterListener(this);
		register.addActionListener(l);
		clear.addActionListener(l);
		
	}
	


	public static void main(String[] args) {
		new RegisterForm();
	}
	

}
