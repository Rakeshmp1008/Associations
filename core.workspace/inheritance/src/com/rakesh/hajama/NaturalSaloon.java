package com.rakesh.hajama;

public class NaturalSaloon extends Saloon {

	public String name ;
	public int noOfHajamas;

	public NaturalSaloon() {
		
		this("VANDANA",2);
		System.out.println("INVOKING NO ARG CONSTROCTOR---->2");
	}

	public NaturalSaloon(String name,int noOfHajamas) {
		
		this.name=name;
		this.noOfHajamas=noOfHajamas;
		System.out.println("STRING CONSTRUCTOR---->2");
	}
}
