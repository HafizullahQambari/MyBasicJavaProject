package com.syntax.class24;

import java.util.Iterator;
import java.util.LinkedList;

public class TestCard {
	
	public static void main(String[] args) {
		
		LinkedList<Card> list=new LinkedList<>();
		
		list.add(new DebitCard("DebitCard"));
		list.add(new MasterCard("Master Card"));
		list.add(new CitiBank("CitiBank"));
		System.out.println("======using iterator=======");
		
		Iterator<Card> card=list.iterator();
		
		while(card.hasNext()) {
			Card c=card.next();
			c.apply();
			c.getCridetCard();
		}
		System.out.println("=====using for loop====");
		for(int i=0; i<list.size(); i++) {
			list.get(i).apply();
			list.get(i).getCridetCard();
		}
		System.out.println("========using enhanced loop===");
		for(Card l:list) {
			l.apply();
			l.getCridetCard();
		}
	}

}
