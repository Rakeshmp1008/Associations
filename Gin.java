package com.rakesh.crud.operator;

public class Gin {
	private float price=5000f;
	private String[] origin=new String[5];
	private int count = 0;
	public Gin()
	{
		this(4000f);
	}

	public Gin(float price)
	{
		this.price=price;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void addorigin(String origin)
	{
		this.origin[this.count]=origin;
		this.count++;
	}
	public void displaycountry()
	{
		for (int juice = 0; juice < origin.length; juice++) {
			
			System.out.println(this.origin[juice]);
		}
	}
}
