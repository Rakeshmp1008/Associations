package com.rakesh;

import com.rakesh.overridemethods.AiroPlane;

public class AiroPlaneScammer {

	public static void main(String[] args) {

		AiroPlane ref1=new AiroPlane("AIR INDIA","KARNATAKA");
		AiroPlane ref2=new AiroPlane("AIR INDIA","KARNATAKA");

		System.out.println(ref1.equals(ref2)); 
	}

}