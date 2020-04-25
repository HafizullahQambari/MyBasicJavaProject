package com.syntax.gropuHW;
import java.util.*;
public class Test {
	
		  
		  public static void main(String[] args) {
				
				Set<Student> st=new LinkedHashSet<>();
				
				st.add(new Student("Samir", "Jawaid", 101));
				st.add(new Student("Asel", "Umurzakova", 102));
				st.add(new Student("Diego", "Juarez", 103));
				st.add(new Student("Sohil", "Aryan", 104));
				st.add(new Student("Alijon", "Nazarov", 105));
				
				
				for(Student s:st) {
					s.display();
				}
					
				}
				
			}

