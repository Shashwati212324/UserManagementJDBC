package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import databaseconnection.ConnectionProvider;

public class DeleteDao {
    public boolean deleteUser(String id) {
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM user WHERE id=?");
            ps.setString(1, id);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

