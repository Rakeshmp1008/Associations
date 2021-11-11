package com.rakesh;

import com.rakesh.overridemethods.Stadium;

public class StadiumScammer {

	public static void main(String[] args) {

		Stadium ref=new Stadium("CHINNA SWAMY","CRICKET");
		Stadium ref1=new Stadium("CHINNA SWAMY","FOOTBALL");
		
		System.out.println(ref.equals(ref1)); 
	}

}
