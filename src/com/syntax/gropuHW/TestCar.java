package com.syntax.gropuHW;

public class TestCar {

	public static void main(String[] args) {
		
		Truck c=new Truck(20000, "white", 20);
		double TrucksalesPrice=c.calculateSalePrice(12000, 1200);
		System.out.println("the truck sales price is equal to "+TrucksalesPrice);
		Sedan s=new Sedan(20000, "red", 20);
		double sedanSalesPrice=s.calculateSalePrice(200000, 15);
		System.out.println("The sedan Sales Price is equalt to "+sedanSalesPrice);
		

	}

}
