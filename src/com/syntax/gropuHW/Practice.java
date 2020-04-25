package com.syntax.gropuHW;

import java.util.LinkedList;

class Practice {

		public static void main(String[] args) {
	
	 LinkedList<Integer> primes = new LinkedList<>();
	    for(int p = 2; p <= 100; p++) {
	        int count = 0;
	        for(int i=2; i < p; i++) {

	            if (p%i == 0) {
	                count++;
	            }
	        }

	        if (count == 0) {
	            primes.add(p);
	        }   
	    }
	    System.out.println(primes);
		}
		}