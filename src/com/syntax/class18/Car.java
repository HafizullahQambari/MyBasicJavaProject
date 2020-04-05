package com.syntax.class18;



class Car{
	  String make;
	  String model;
	  int numberOfDoors;
	  int topSpeed;
	  double price;
	       
	  
	  Car(String make, String model, int numberOfDoors, int topSpeed, double price){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	    this.make=make;
	    this.model=model;
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;
	  }
	  Car(String make, String model, int topSpeed, double price){
	    
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	  }
	  Car( int numberOfDoors, int topSpeed, double price){
	    
	   System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price); 
	  }
	  Car(String make, String model, int numberOfDoors, int topSpeed){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	  }
	  public static void main(String[] args) {
		  Car car1=new Car("Toyota", "Prius", 4, 120, 300000.0);
		  Car car2=new Car("Toyota", "Prius", 4, 120, 300000.0);
		  Car car3=new Car(4, 120, 300000.0);
		  Car car4=new Car("Toyota", "Prius", 4, 90);
	  }
	}
    
	    
	   
	    
	    
	    
	    
	  
	  
	  




