
package com.rakesh.crud;

import com.rakesh.crud.operators.CoolDrinks;

public class CoolDrinksOperator {

	public static void main(String[] args) {
		
		CoolDrinks drinks=new CoolDrinks();
		
		drinks.addbrands("SPRITE");
		drinks.addbrands("PEPSI");
		drinks.addbrands("FANTA");
		drinks.addbrands("FROOTI");
		drinks.addbrands("MAZZA");
		drinks.addbrands("RAkesh");
		
		drinks.deleteBrands(1);
		drinks.updateBrands(9, "VANDU");
		
		String[] arrayref=drinks.getBrands();
		for (int a = 0; a < arrayref.length; a++) {
			
			System.out.println(arrayref[a]);
		}
	}

}
