package com.rakesh.hajama;

public class Saloon {

	public String name="GURU";
	public int noOfHajamas;

	
	
	public Saloon() {
		this("Rakesh",4);
		System.out.println("INVOKING NO ARG CONSTRUCTOR OF CLASS SALOON---->1");
	}

	public Saloon(String name,int noOfHajamas) 
	{
		this.name=name;
		this.noOfHajamas=noOfHajamas;
		System.out.println("INVOKING STRING ARG CONSTRUCTOR----1"); 
	}
	
}
