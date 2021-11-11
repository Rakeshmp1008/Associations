package com.rakesh.crud.operator;

public class Restaurant {

	private String place="Bengaluru";
	private String[] names=new String[5];
	private int count = 0;
	public Restaurant()
	{
		this("HUBLI");
	}

	public Restaurant(String place)
	{
		this.place=place;
	}
	
	public String getPlace()
	{
		return place;
	}
	
	public void addnames(String names)
	{
		this.names[this.count]=names;
		this.count++;
	}
	public void displayNames()
	{
		for (int juice = 0; juice < names.length; juice++) {
			
			System.out.println(this.names[juice]);
		}
	}
}


