package com.syntax.class22;

public abstract class Phone {
	void text() {
		System.out.println("phone can text");
	}
	void call() {
		System.out.println("phone can make call");
	}
	public abstract void takePicture();
	public abstract void playMusic();

}
class Iphone extends Phone{
	
	public void takePicture() {
		System.out.println("Iphone can take pictur");
	}
	public void playMusic() {
		System.out.println("Iphone can play music");
	}
	
}
class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung can take pictur");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play music");
		
	}
	
}