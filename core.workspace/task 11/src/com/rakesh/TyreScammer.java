package com.rakesh;

import com.rakesh.overridemethods.Tyre;

public class TyreScammer {

	public static void main(String[] args) {

		Tyre ref=new Tyre("MRF","CAR");
		Tyre ref1=new Tyre("MRF","BIKE");
		
		System.out.println(ref.equals(ref1));
	}

}