
package com.example.demo.pojo;
public class User {
	
	private String name;
	private String phoneNo;
	
	private Address address;
	
	public User(String name, String phoneNo) {
		this.name= name;
		this.phoneNo= phoneNo;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}
