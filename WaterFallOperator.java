package com.rakesh.crud;

import com.rakesh.crud.operator.WaterFall;

public class WaterFallOperator {

	public static void main(String[] args) {
		
		WaterFall fallsref=new WaterFall();
		
		System.out.println(fallsref.getSeason());
		
		
		fallsref.displaylocations();
		fallsref.addlocations("HUBLI");
		fallsref.addlocations("BAGALKOT");
		fallsref.addlocations("UDUPI");
		fallsref.addlocations("DAVNGERE");
		fallsref.addlocations("BALLARI");
		fallsref.addlocations("BELAGAVI");
		fallsref.addlocations("BENGALURU");
	}
}


