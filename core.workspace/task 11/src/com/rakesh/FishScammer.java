package com.rakesh;

import com.rakesh.overridemethods.Fish;

public class FishScammer {

	public static void main(String[] args) {

		 Fish ref = new  Fish();
		ref.setName("BHOOTAYI");
		ref.setColor("GRAY");

		 Fish ref1 = new  Fish();
		ref1.setName("BHOOTAYI");
		ref1.setColor("GRAY");

		System.out.println(ref.equals(ref1));
	}

}