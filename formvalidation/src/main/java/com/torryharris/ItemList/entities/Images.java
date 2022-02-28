package com.torryharris.ItemList.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Images {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="SNo.")
	private int sno;
	private String userName;
	private String city;
	
	@Column(name="Postal_Code")
	private String pincode;
	
	private String price;
	private String type;
	private String image;
	
	
	public Images() {
		super();
	}


	public Images(int sno, String userName, String city, String pincode, String price, String type, String image) {
		super();
		this.sno = sno;
		this.userName = userName;
		this.city = city;
		this.pincode = pincode;
		this.price = price;
		this.type = type;
		this.image = image;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Images [sno=" + sno + ", userName=" + userName + ", city=" + city + ", pincode=" + pincode + ", price="
				+ price + ", type=" + type + ", image=" + image + "]";
	}
	

}
