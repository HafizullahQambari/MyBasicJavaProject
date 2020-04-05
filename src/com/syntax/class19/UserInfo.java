package com.syntax.class19;


	public class UserInfo extends User{
		String add;
		UserInfo(String name, int mobileNumber, String add){
			super(name, mobileNumber);
			this.add=add;
			
		}
		void userDetails(){
			System.out.println(" Student userName is "+name+" and his phone number is "+mobileNumber+" and his address is "+add);
		}
		public static void main(String[] args) {
			
		UserInfo ob=new UserInfo("Hafiz", 2022858336, "15004 LutzCourt");
		ob.userDetails();
		
		
			
		}
	}
