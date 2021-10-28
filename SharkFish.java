package com.rakesh.aquarium;

public class SharkFish extends Fish {
	public float height;
	public float weight;

	public SharkFish() {
		this(4.2f,35f);
		System.out.println("NO ARG CONST---->2");
	}
	
	public SharkFish(float height,float weight) {
		this.height=height;
		this.weight=weight;
		System.out.println("PARAMTERISED CONST---->2");
	}
}
