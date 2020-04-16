package com.syntax.class24;
public abstract class Insurance {
	String InsuranceName;
	Insurance(String InsuranceName){
		this.InsuranceName=InsuranceName;
	}
	abstract void getQuote();
	
	abstract void cancelInsurance();
}
class Car extends Insurance{
	String carModel;
	Car(String InsuranceName, String carModel){
		super(InsuranceName);
		this.carModel=carModel;
	}
	void getQuote() {
		System.out.println("to get insurence for "+carModel+" call "+InsuranceName+" 800 568 6545");
	}
	void cancelInsurance() {
		System.out.println("to cancel inscurance of your "+carModel+" call "+InsuranceName+" 703 456 1234");
	}
}
class Pet extends Insurance{
	String petType;
	Pet(String InsruanceName, String petType){
		super(InsruanceName);
		this.petType=petType;
	}
	@Override
	void getQuote() {
		System.out.println("to get insurence for "+petType+" call "+InsuranceName+" 703 456 1234");
		
	}
	@Override
	void cancelInsurance() {
		System.out.println("to cancel inscurance of your "+petType+" call "+InsuranceName+" 800 456 8997");
		
	}
}
class Health extends Insurance{

	Health(String InsuranceName) {
		super(InsuranceName);
	}

	@Override
	void getQuote() {
		System.out.println("to get a quote for health insurance call "+InsuranceName+" at 800 231 5648");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("to cancel your health insurance call "+InsuranceName+" at 800 231 5648 ");
		
	}
	   
}
