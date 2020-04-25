package com.syntax.gropuHW;

import java.util.*;

class Student {
	public static void main(String[] args){
	    
	    Map<String, String> map=new LinkedHashMap<>();
	    map.put("1 item", "apple");
	    map.put("2 item", "banana");
	    map.put("3 item", "pear");
	    map.put("4 item", "tomato");
	    map.put("5 item", "mango");
	    map.put("6 item", "kiwi");
	    
	    Set<String> st=map.keySet();
	    Collection<String> v=map.values();
	    
	    Iterator<String> s=st.iterator();
	    while(s.hasNext()) {
	    	String k=s.next();
	    	System.out.println("Key is "+k+ " and value is"+);
	    }
	  }

  
}