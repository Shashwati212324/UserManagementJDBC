package gui_forms;

import listeners.DeleteListener;
import javax.swing.*;
import java.awt.*;

public class DeleteForm {
    public JFrame frame;
    public JTextField idField;
    public JButton deleteBtn, clearBtn;
    public JLabel idLabel;

    public DeleteForm() {
        frame = new JFrame("Delete User");
        frame.setSize(250, 150);
        frame.setLayout(new FlowLayout());

        idLabel = new JLabel("Enter ID to Delete:");
        idField = new JTextField(10);
        deleteBtn = new JButton("Delete");
        clearBtn = new JButton("Clear");

        frame.add(idLabel); frame.add(idField);
        frame.add(deleteBtn); frame.add(clearBtn);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        DeleteListener listener = new DeleteListener(this);
        deleteBtn.addActionListener(listener);
        clearBtn.addActionListener(listener);
    }

    public static void main(String[] args) {
        new DeleteForm();
    }
}
