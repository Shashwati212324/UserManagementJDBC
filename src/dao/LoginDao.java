package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.LoginBean;
import databaseconnection.ConnectionProvider;

public class LoginDao {
	public void useLogin(LoginBean loginBean) {
		try {
			Connection c =ConnectionProvider.getConnection();
			PreparedStatement ps =c.prepareStatement("select*from user where name =? and pass =?");
			ps.setString(1,loginBean.getUname());
			ps.setString(2,loginBean.getPass());
			ResultSet rs =ps.executeQuery();
			if(rs.next()) {
				System.out.println("valid");
			}
			else {
				System.out.println("Invalid");
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
	}

}
