package com.torryharris.ItemList.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="UserDetails")
public class Details {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="SNo.")
	private int sno;
	private String userName;
	private String name;
	
	@Column(name="Email")
	private String email;
	
	private String password;
	
	
	public Details() {
		super();
	}
	
	public Details(String userName, String email,String name, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.name=name;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "userDetails [UserName=" + userName + ", Email=" + email + ", Name=" + name + ", Password=" + password
				+ "]";
	}
	
	

}


