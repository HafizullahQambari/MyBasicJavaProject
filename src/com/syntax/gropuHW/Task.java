package com.syntax.gropuHW;
import java.util.*;
class Main {
  public static void main(String[] args){
    
    List<Boolean> listA=new ArrayList<>();
    listA.add(true);
    listA.add(false);
    listA.add(false);
    
    System.out.println(listA);
    
    List<Boolean> listB=new ArrayList<>(listA);
    Iterator<Boolean> list=listB.iterator();
    while(list.hasNext()){
      Boolean bo=list.next();
      System.out.println(bo);
    }
  }

}