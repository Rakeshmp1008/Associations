package com.rakesh;

import com.rakesh.overridemethods.Plant;

public class PlantScammer {

	public static void main(String[] args) {

		Plant plantRef = new Plant();
		plantRef.setName("FLOWER PLANT");
		plantRef.setLifeSpan(100f);

		Plant plantRef1 = new Plant();
		plantRef1.setLifeSpan(200f);
		plantRef1.setName("FRUIT PLANT");
		
		System.out.println(plantRef.equals(plantRef1));

	}

}
