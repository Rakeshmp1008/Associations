package com.rakesh.crud;

import com.rakesh.crud.operators.BeachOperators;

public class CrudStarter {

	public static void main(String[] args) {
		
		BeachOperators beachref=new BeachOperators();
		
		String cname=beachref.getCountry();
		System.out.println(cname);
		
		beachref.addBeachName("om Beach");
		beachref.addBeachName("baga Beach");
		beachref.addBeachName("Coco Beach");
		beachref.addBeachName("Palermo Beach");
		beachref.addBeachName("Karwar Beach");
		beachref.addBeachName("Palermo 1 Beach");
		beachref.addBeachName("Karwar  1 Beach");
		beachref.addBeachName("Palermo 2 Beach");
		beachref.addBeachName("Karwar  2 Beach");
		beachref.displayNames();
		
	

	}

}
