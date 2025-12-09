package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import beans.RegisterBean;
import databaseconnection.ConnectionProvider;

public class RegisterDao {
	public String userRegister(RegisterBean rBean) {
		try {
			Connection c =ConnectionProvider.getConnection();
			PreparedStatement ps =c.prepareStatement("insert into user values(?,?,?)");
			ps.setString(1,rBean.getName());
			ps.setString(2,rBean.getId());
			ps.setString(3,rBean.getPass());
			int i =ps.executeUpdate();
			if(i>0) {
				return "Success";
			}
			else {
				return "Failure";
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		return "Failure";
	}

}
