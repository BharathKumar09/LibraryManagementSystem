package usermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="userlogin")
public class Loginuser {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Userlogin [userid=" + userid + ", password=" + password + "]";
	}

}

}
