package com.syntax.class21;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car bmw=new BMW("BMW");
		bmw.display();
		bmw.start();
		// bmw.navigate() not accessible because not included in parent class
		
		Car merc=new Mercedes("Mercedes");
		merc.display();
		merc.start();
		
		Car honda=new Honda("Honda");
		honda.display();
		honda.start();
		
		Car[] cars= {new BMW("BMW"), new Mercedes("mercedes"), new Honda("honda")
	};
		for(Car c:cars) {
			c.display();
			c.start();
			System.out.println("==================");
		}
		System.out.println("=================================");
		for(int i=0; i<cars.length; i++) {
			cars[i].display();
			cars[i].start();
		}
}
}