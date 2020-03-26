package com.syntax.class13;

class Main{
	  
	  String censorLetter(String Letter1, char Character){
	  Letter1=Letter1.replace(Character, '*');
	  
	  return Letter1;
	  }
	  public static void main(String[] args){
	    
	     Main obj= new Main();
	     String word=obj.censorLetter("computer science", 'c');
	     String word1=obj.censorLetter("trick or treat", 't');
	     System.out.println(word);
	     System.out.println(word1);
	     
	     
	  }
	}