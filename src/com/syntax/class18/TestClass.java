package com.syntax.class18;

public class TestClass {
		public static void main(String[] args) {
			
			Dog dog=new Dog();
			//access variable from own class
			dog.breed="Husky";
			// access variables form parent class
			dog.color="Grey";
			dog.fur="Too Much";
			dog.size="Big";
		// access methods form oown class
			dog.bark();
			// access methods from another class
			dog.beWild();
			dog.eat();
			dog.sleep();
			dog.age=2;
			dog.display();
			
			Animals animals=new Animals();
			animals.color="Any";
			animals.size="Any";
			animals.fur="Any";
			
			animals.sleep();
			animals.eat();
			animals.beWild();
			
			
			
			
			
	
}
}
