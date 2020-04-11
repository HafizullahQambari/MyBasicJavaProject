package com.syntax.class22;

public class Animal {
	String type;
	  Animal(String type){
	    this.type=type;
	    
	  }
	  void eat(){
	    System.out.println(type+" eats");
	  }
	  void sleep(){
	    System.out.println("sleeps a lot");
	  }
		}
		
		class Cat extends Animal{
		  Cat(String type){
		    super(type);
		  }
		  void sleep(){
		    System.out.println(type+" sleeps a lot");
		  }
		}
		class Kitten1 extends Cat{
		  
		  Kitten1(String type){
		    super(type);
		  }
		  void eat(){
		  System.out.println(type+" eats milk");
		}
		
		}
		class Kitten2 extends Cat{
		  Kitten2(String type){
		    super(type);
		  }
		  void eat(){
		    System.out.println(type+" eats snack");
		  }
		}
		class Kitten3 extends Cat{
		  Kitten3(String type){
		    super(type);
		  }
		  void eat(){
		    System.out.println(type+" eats everything");
		  }
		}
		
		


