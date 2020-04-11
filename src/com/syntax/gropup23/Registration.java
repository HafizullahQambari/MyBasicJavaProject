package com.syntax.gropup23;

public class Registration {
	private String email;
	private String userName;
	private String password;
	

	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
			this.email=email;
		}
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
			this.userName=userName;
		}
	}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6) {
			this.password=password;
		}
	}
}
