package com.rakesh;

import com.rakesh.overridemethods.IceCream;

public class IceCreamScammer {

	public static void main(String[] args) {

		IceCream ref = new IceCream();
		ref.setName("ADITHYA");
		ref.setPrice(10f);

		IceCream ref1 = new IceCream();
		ref1.setPrice(15f);
		ref1.setName("AMUL");

		System.out.println(ref.equals(ref1));
	}

}
