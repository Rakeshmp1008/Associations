package com.rakesh.crud.operator;

public class WaterFall {
	private String season ="Rainy";
	private String[] locations=new String[5];
	private int count = 0;
	public WaterFall()
	{
	
	}

	public WaterFall(String season)
	{
		this.season=season;
	}
	
	public String getSeason()
	{
		return season;
	}
	
	public void addlocations(String locations)
	{
		this.locations[this.count]=locations;
		this.count++;
	}
	public void displaylocations()
	{
		for (int juice = 0; juice < locations.length; juice++) {
			
			System.out.println(this.locations[juice]);
		}
	}
}
