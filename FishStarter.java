package com.rakesh.aquarium;

public class FishStarter {

	public static void main(String[] args) {

		Fish ref1=new Fish();
		System.out.println(ref1.region);
		System.out.println(ref1.alive);
		
		Fish ref4=new GoldFish();
		System.out.println(ref4.region);
		System.out.println(ref4.alive);
		
		GoldFish ref2=new GoldFish();
		System.out.println(ref2.color);
		System.out.println(ref2.size);
		
		SharkFish ref3=new SharkFish();
		System.out.println(ref3.height);
		System.out.println(ref2.size);
		
		
		
		
		
			}

}