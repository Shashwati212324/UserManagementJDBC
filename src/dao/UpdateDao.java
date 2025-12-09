package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import databaseconnection.ConnectionProvider;

public class UpdateDao {
    public boolean updateUser(String id, String name, String pass) {
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE user SET name=?, pass=? WHERE id=?"
            );
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, id);

            int rows = ps.executeUpdate();
            return rows > 0;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
