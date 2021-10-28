package com.rakesh.aquarium;

public class GoldFish extends Fish {

	public String color;
	public String size;
	
	public GoldFish() {
		this("GOLD","SMALL");
		System.out.println("NO ARG CONST---->3");
	}
	
	public GoldFish(String color,String size) {
		this.color=color;
		this.size=size;
		System.out.println("PARAMTERISED CONST---->3");
	}
}
