package com.syntax.class22;

public class TestAnimal {

	public static void main(String[] args) {
		

		Cat[] d= { new Cat("cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
		
		for(int i=0; i<d.length; i++) {
			d[i].eat();
			d[i].sleep();
		}
		

	}

}
