package com.torryharris.ItemList.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class houses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	private String oname;
	private String phno;
	private String city;
	private String price;
	private String address;
	private String pincode;
	
	@Column(name="Type")
	private String typeOfRoom;

	
	public houses() {
		super();
		
	}


	public houses(String oname, String phno, String city, String price, String address, String pincode,
			String typeOfRoom) {
		super();
		this.oname = oname;
		this.phno = phno;
		this.city = city;
		this.price = price;
		this.address = address;
		this.pincode = pincode;
		this.typeOfRoom = typeOfRoom;
	}


	public String getOname() {
		return oname;
	}


	public void setOname(String oname) {
		this.oname = oname;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getTypeOfRoom() {
		return typeOfRoom;
	}


	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}


	@Override
	public String toString() {
		return "houses [oname=" + oname + ", phno=" + phno + ", city=" + city + ", price=" + price + ", address="
				+ address + ", pincode=" + pincode + ", typeOfRoom=" + typeOfRoom + "]";
	} 
	
	

}
