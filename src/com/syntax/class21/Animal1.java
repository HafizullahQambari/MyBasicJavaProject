package com.syntax.class21;

class Animal1{
	  
	  String cat;
	  String eats;
	  Animal1(String cat, String eats){
	    
	    System.out.println(cat+" "+"eats "+eats);
	  }
	  void eat(){
	    System.out.println(cat+" "+"eats "+eats);
	  }
	  void sleep(){
	    System.out.println("animal sleep everynight");
	  }
	}
	class Cat extends Animal1{
	  Cat(String cat, String eats ){
	    super(cat, eats);
	  }
	  void sleep(){
	    System.out.println("cats sleep don't like to sleep during the day");
	  }
	}
	class Kitten extends Cat{
		Kitten(String cat, String eat){
			super(cat, eat);
		}
	  void eat(){
	    System.out.println("Kitten1 eats milk");
	  }
	}
	class Kitten2 extends Cat{
		Kitten2(String cat, String eat){
			super(cat, eat);
		}
	  void eat(){
	    System.out.println("Kitten2 eats snack");
	  }
	}
	class Kitten3 extends Cat{
		Kitten3(String cat, String eat){
			super(cat, eat);
		}
	  void eat(){
	    System.out.println("kitten3 eats everything");
	  }
	}
	class Main {
		static final String URL="https://syntaxtechs.com";
		  public static void main(String[] args){
		    
		    System.out.println(URL);
		  }
		}