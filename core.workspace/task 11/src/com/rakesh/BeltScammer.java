package com.rakesh;

import com.rakesh.overridemethods.Belt;

public class BeltScammer {

	public static void main(String[] args) {

		Belt ref = new Belt();
		ref.setPrice(500f);
		ref.setSize(5);

		Belt ref1 = new Belt();
		ref1.setPrice(200f);
		ref1.setSize(1);

		System.out.println(ref.equals(ref1));
	}

}
