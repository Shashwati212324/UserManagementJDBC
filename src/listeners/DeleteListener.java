package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import dao.DeleteDao;
import gui_forms.DeleteForm;

public class DeleteListener implements ActionListener {
    DeleteForm deleteForm;

    public DeleteListener(DeleteForm form) {
        this.deleteForm = form;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteForm.deleteBtn) {
            String id = deleteForm.idField.getText();
            if(id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter ID to delete");
            } else {
                DeleteDao dao = new DeleteDao();
                boolean success = dao.deleteUser(id);
                JOptionPane.showMessageDialog(null, success ? "Deleted Successfully" : "Delete Failed");
            }
        } else if(e.getSource() == deleteForm.clearBtn) {
            deleteForm.idField.setText("");
        }
    }
}
