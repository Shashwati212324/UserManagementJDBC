package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import listeners.GuiAppListener;

public class GuiApp {
	JFrame frame;
	public JButton login;
	public JButton update;
	public JButton delete;
	public JButton select;
	JTextField textfield1,textfield2;
	JLabel label1, label2;
	
	GuiApp(){
		frame = new JFrame("GuiApp");
		frame.setSize(600,600);
		frame.setLocation(200,200);
		frame.setLayout(new FlowLayout());
		
		login = new JButton("LOGIN");
		update = new JButton("UPDATE");
		delete = new JButton("DELETE");
		select = new JButton("SELECT");
		
		frame.add(login);
		frame.add(update);
		frame.add(delete);
		frame.add(select);

        // ✅ Make frame visible
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        GuiAppListener g = new GuiAppListener(this);
        login.addActionListener(g);
        update.addActionListener(g);
        delete.addActionListener(g);
        select.addActionListener(g);        
	}	
		
		
	public static void main(String[] args) {
		GuiApp g = new GuiApp();
	}


}

