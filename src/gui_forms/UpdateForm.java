package gui_forms;

import listeners.UpdateListener;
import javax.swing.*;
import java.awt.*;

public class UpdateForm {
    public JFrame frame;
    public JTextField nameField, idField, passField;
    public JButton updateBtn, clearBtn;
    public JLabel nameLabel, idLabel, passLabel;

    public UpdateForm() {
        frame = new JFrame("Update User");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        nameLabel = new JLabel("Name:");
        idLabel = new JLabel("ID:");
        passLabel = new JLabel("Password:");

        nameField = new JTextField(10);
        idField = new JTextField(10);
        passField = new JTextField(10);

        updateBtn = new JButton("Update");
        clearBtn = new JButton("Clear");

        frame.add(nameLabel); frame.add(nameField);
        frame.add(idLabel); frame.add(idField);
        frame.add(passLabel); frame.add(passField);

        frame.add(updateBtn); frame.add(clearBtn);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        UpdateListener listener = new UpdateListener(this);
        updateBtn.addActionListener(listener);
        clearBtn.addActionListener(listener);
    }

    public static void main(String[] args) {
        new UpdateForm();
    }
}

