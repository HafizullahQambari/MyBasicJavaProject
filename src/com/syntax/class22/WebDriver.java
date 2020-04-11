package com.syntax.class22;

interface TakesScreenShot{
	void TakePicture();
	// features below were added from java 
}
public interface WebDriver extends TakesScreenShot{
	void openBrowser();
	
	void closeBrowser();
	
	void maximaizeWindow();
	void findElement();
	
}
class ChromeDriver implements WebDriver{
	
	@Override
	public void openBrowser() {
		System.out.println("open the chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close the chrome browser");
		
	}

	@Override
	public void maximaizeWindow() {
		System.out.println("maximaiz the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("find the elements");
		
	}

	@Override
	public void TakePicture() {
		System.out.println("phone can take screen shot");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("open firfox driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close the browser");
		
	}

	@Override
	public void maximaizeWindow() {
		System.out.println("maximaize the window");
		
	}

	@Override
	public void findElement() {
		System.out.println("find the elements");
		
	}

	@Override
	public void TakePicture() {
		System.out.println("can take pictures");
		
	}
	
}

