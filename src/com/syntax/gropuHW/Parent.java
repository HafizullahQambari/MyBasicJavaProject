package com.syntax.gropuHW;

interface Outputs{
	  
	  void display(double firstNumber, double secondNumber);
	  
	}
interface Functions extends Outputs{
	  
	  double adding(double firstNumber, double SecondNumber);
	  
	  double subtraction(double firstNumber, double SecondNumber);
	  
	  double multiply(double firstNumber, double SecondNumber);
	  
	  double dividing(double firstNumber, double SecondNumber);
	  
	}
class Main implements Functions{
	  
	  public double adding(double firsNumber, double SecondNumber){
	    
	  double result1=firsNumber+SecondNumber;
	  
	    return result1;
	  }
	  public double subtraction(double firstNumber, double SecondNumber){
	    double result2=firstNumber-SecondNumber;
	    return result2;
	  }
	  public double multiply(double firstNumber, double SecondNumber){
	    double result3=firstNumber*SecondNumber;
	    return result3;
	  }
	  public double dividing(double firstNumber, double SecondNumber){
	    double result4=firstNumber/SecondNumber;
	    return result4;
	  }
	  public void display(double firstNumber, double SecondNumber){
		adding(100.00, 20.00);
		
		
	  }
	  
	  Main m=new Main();
	
	  
	  
	  
	  
	  

	}
	
