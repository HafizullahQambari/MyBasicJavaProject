package com.syntax.gropup23;

public class Doctor {
	private long licenceID;
	private long phoneNumber;
	private String Email;
	
	public long getlicenceID() {
		return licenceID;
		
	}
	public long getphoneNumber() {
		return phoneNumber;
		
	}
	public String getEmail() {
		return Email;
	}
	
	public void setlicenceID(long licenceID) {
		if(!Email.isEmpty()) {
			if(Email.contains("gmail")) {
				this.Email=Email;
			}
		}
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setlincenceID(long licenceID) {
		this.licenceID=licenceID;
	}
}
