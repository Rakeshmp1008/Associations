package com.rakesh.crud;

import com.rakesh.crud.operator.Resort;

public class ResortOperator {

	public static void main(String[] args) {

		Resort resortref=new Resort();
		
		System.out.println(resortref.getOpenTime());
		
		
		
		resortref.addlocations("HUBLI");
		resortref.addlocations("BAGALKOT");
		resortref.addlocations("UDUPI");
		resortref.addlocations("DAVNGERE");
		resortref.addlocations("BALLARI");
		//resortref.displaylocations();
		resortref.addlocations("BELAGAVI");
		resortref.addlocations("BENGALURU");
		resortref.displaylocations();
	}

}
