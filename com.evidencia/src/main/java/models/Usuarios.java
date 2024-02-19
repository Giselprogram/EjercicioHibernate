package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")

public class Usuarios {
	@Id
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "userpassword")
	private String userpassword;
	
	//constructor
	public Usuarios(String username, String userpassword) {
		this.username = username;
		this.userpassword = userpassword;
	}
	
	
	//getters end setters
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	//toString
	@Override
	public String toString() {
		return "Usuarios [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + "]";
	}
	

}
