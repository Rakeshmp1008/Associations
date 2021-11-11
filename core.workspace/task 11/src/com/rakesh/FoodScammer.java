package com.rakesh;

import com.rakesh.overridemethods.Food;

public class FoodScammer {

	public static void main(String[] args) {

		
		Food ref = new Food();
		ref.setName("GOBI");
		ref.setPrice(40f);

		Food ref1 = new Food();
		ref1.setName("GOBI");
		ref1.setPrice(50f);

		System.out.println(ref.equals(ref1));
	}

}
