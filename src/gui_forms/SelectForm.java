package gui_forms;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import databaseconnection.ConnectionProvider;

public class SelectForm {
    public JFrame frame;
    public JTextArea textArea;

    public SelectForm() {
        frame = new JFrame("All Users");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        textArea = new JTextArea(15, 30);
        textArea.setEditable(false);

        frame.add(new JScrollPane(textArea));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        loadUsers();
    }

    private void loadUsers() {
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            StringBuilder sb = new StringBuilder();
            while(rs.next()) {
                sb.append("ID: ").append(rs.getString("id"))
                  .append(", Name: ").append(rs.getString("name"))
                  .append(", Pass: ").append(rs.getString("pass"))
                  .append("\n");
            }
            textArea.setText(sb.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SelectForm();
    }
}
