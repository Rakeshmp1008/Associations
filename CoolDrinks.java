package com.rakesh.crud.operators;

public class CoolDrinks {

	private String[] brands=new String[5];
	private int sad=0;
	//c r u d
	public void addbrands(String brand)
	{
		if(sad<this.brands.length) {
		this.brands[this.sad++]=brand;
		
		}
		else
		{
			System.out.println("ARRAY IS FULL CANT BE ADD ");
		}
	}
	public String[] getBrands()
	{
		return brands;
	}
	
	public void deleteBrands(int dlt)
	{
		if(dlt>=0 && dlt<this.brands.length)
		{
		this.brands[dlt]=null;
		}
		else
		{
			System.out.println("ARRAY IS FULL CAN NOT BE DELETED");
		}
	}
	
	public void updateBrands(int pop,String popup)
	{
		if(pop>=0 && pop<this.brands.length)
		{
			this.brands[pop]=popup;
		}else {
			System.out.println("ARRAY IS FULL CANT BE UPDATE");
		}
	}
	
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
