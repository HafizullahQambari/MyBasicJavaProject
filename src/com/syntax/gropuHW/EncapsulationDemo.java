package com.syntax.gropuHW;


class Person{
		  
		  private String firstName;
		  private String lastName;
		  private int  birthMonth;
		  private int birthday;
		  private int birthyear;
		  private String ssn;
		  
		  Person(String firstName, String lastName, int birthMonth, int birthday, int birthyear, String ssn){
			  this.firstName=firstName;
			  this.lastName=lastName;
			  this.birthMonth=birthMonth;
			  this.birthday=birthday;
			  this.birthyear=birthyear;
			  this.ssn=ssn;
			  
		  }

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getBirthMonth() {
			return birthMonth;
		}

		public int getBirthday() {
			return birthday;
		}

		public String getSsn() {
			return ssn;
		}

		public int getBirthyear() {
			return birthyear;
		}
//		Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
//		For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

		  public int formatBirthday() {
			  return birthMonth;
			  
		  }
		}
class Main{
	
	
	public static void main(String[] args) {

	Person p=new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
	p.getBirthyear();
	}
	
}