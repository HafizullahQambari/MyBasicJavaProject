package com.syntax.class13;

class Main {
    public static String surround(String s, String a) {
    	return s.replaceAll(a, ("("+a+")"));
    }
    
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"(abc)(abc)(abc)"
        System.out.println(surround("technology", "o")); //"(th)ere, on plane(th) ho(th)"
    }
}