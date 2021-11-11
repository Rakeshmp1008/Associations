package com.rakesh.crud;

import com.rakesh.crud.operator.Gin;

public class GinOperator {

	public static void main(String[] args) {
		
		Gin ginref=new Gin();
		
		System.out.println(ginref.getPrice());
		
		
		ginref.displaycountry();
		ginref.addorigin("US");
		ginref.addorigin("INDIA");
		ginref.addorigin("PAKISTAN");
		ginref.addorigin("CHINA");
		ginref.addorigin("SOUTH AFRICA");
		ginref.addorigin("NEW ZELAND");
		ginref.addorigin("NEPAL");
		
		
	}

}
