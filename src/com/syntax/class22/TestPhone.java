package com.syntax.class22;

public class TestPhone {
	public static void main(String[] args) {
		
		Iphone iphon=new Iphone();
		iphon.call();
		iphon.text();
		iphon.takePicture();
		iphon.playMusic();
		Samsung sam=new Samsung();
		sam.call();
		sam.text();
		sam.playMusic();
		sam.takePicture();
		sam.playMusic();
	}

}
