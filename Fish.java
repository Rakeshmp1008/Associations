package com.rakesh.aquarium;

public class Fish {
	String region;
	public boolean alive;

	public Fish() {
		this("MANGALORE",true);
		System.out.println("NO ARG CONST---->1");
	}

	public Fish(String region, boolean alive) {
		this.region = region;
		this.alive = alive;
		System.out.println("PARAMTERISED CONST---->1");

	}
}
