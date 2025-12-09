package beans;

public class LoginBean {
	private String uname,pass;
	
	public LoginBean(String name, String pass2) {
		this.setUname(name);
		this.setPass(pass2);
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
