package com.rakesh.crud;

import com.rakesh.crud.operator.Chocolate;

public class ChocolateOperator {

	public static void main(String[] args) {
		
		Chocolate chocoref=new Chocolate();
		
		float bname=chocoref.getPrice();
		bname=100.00f;
		System.out.println(bname);
		
		
		chocoref.dispalyBrands();
		chocoref.addBrandNames("CADBURY");
		chocoref.addBrandNames("PARLE");
		chocoref.addBrandNames("HARSHIS KISSES");
		chocoref.addBrandNames("BRUICKSITES");
		chocoref.addBrandNames("LOCAL CHOCOLATES");
		chocoref.addBrandNames("BRUICKSITES 1");
	
	}
}
