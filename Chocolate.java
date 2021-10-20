package com.rakesh.crud.operator;

public class Chocolate {
	private float price;
	private String[] brandNames=new String[5];
	private int count=0;
	public Chocolate()
	{
		
	}
	
	public Chocolate(float price)

	{
		this.price=price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void addBrandNames(String brandNames)
	{
		if(count < 5) {
		this.brandNames[this.count]=brandNames;
		this.count++;
		}
		else {
			System.out.println("Array is full");
		}
	}
	
	public void dispalyBrands()
	{
	for (int a = 0; a < brandNames.length; a++) {
		String brandNames=this.brandNames[a];
		 System.out.println(brandNames);
	}
	}
}
