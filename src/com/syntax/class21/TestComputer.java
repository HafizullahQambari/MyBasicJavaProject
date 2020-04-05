package com.syntax.class21;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer apple=new Apple("Apple");
		apple.display();// from parent class
		apple.Feature();
		apple.work();
		Computer lenovo=new Lenovo("lenovo");
		lenovo.display();
		lenovo.Feature();
		lenovo.work();
		Computer hp=new HP("HP");
		hp.display();
		hp.Feature();
		hp.work();
		Computer dell=new Dell("Dell");
		dell.display();
		dell.Feature();
		dell.work();
		
		Computer[] com= {new Apple("Apple"), new Lenovo("Lenovo"),new HP("HP"),new Dell("Dell")
	};
		for(Computer c:com) {
			c.display();
			c.Feature();
			c.work();
		}
		for(int i=0; i<com.length; i++) {
			com[i].display();
			com[i].Feature();
			com[i].work();
		}

}
}
