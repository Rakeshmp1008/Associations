package com.rakesh.hajama;

public class SaloonStarter {

	public static void main(String[] args) {
		
		/*Saloon saloon=new NaturalSaloon();
		System.out.println(saloon.name);*/
		
		Saloon naturalref=new Saloon();
		System.out.println(naturalref.name);
		System.out.println(naturalref.noOfHajamas + "\n");
		
		NaturalSaloon ref=new NaturalSaloon();
		System.out.println(ref.name);
		System.out.println(ref.noOfHajamas+ "\n");
		
		Saloon ref1=new NaturalSaloon();
		System.out.println(ref1.name);
		System.out.println(ref1.noOfHajamas+ "\n");
		
		

		

	}

}