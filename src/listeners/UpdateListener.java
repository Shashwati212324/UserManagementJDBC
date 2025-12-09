package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import dao.UpdateDao;
import gui_forms.UpdateForm;

public class UpdateListener implements ActionListener {
    UpdateForm updateForm;

    public UpdateListener(UpdateForm form) {
        this.updateForm = form;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateForm.updateBtn) {
            String name = updateForm.nameField.getText();
            String pass = updateForm.passField.getText();
            String id = updateForm.idField.getText();

            if(name.isEmpty() || pass.isEmpty() || id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            } else {
                UpdateDao dao = new UpdateDao();
                boolean success = dao.updateUser(id, name, pass);
                JOptionPane.showMessageDialog(null, success ? "Update Successful" : "Update Failed");
            }
        } else if(e.getSource() == updateForm.clearBtn) {
            updateForm.nameField.setText("");
            updateForm.passField.setText("");
            updateForm.idField.setText("");
        }
    }
}
