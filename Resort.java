package com.rakesh.crud.operator;

public class Resort {
	private float openTime=10.00f;
	private String[] locations=new String[5];
	private int count = 0;
	public Resort()
	{
	
	}

	public Resort(float openTime)
	{
		this.openTime=openTime;
	}
	
	public float getOpenTime()
	{
		return openTime;
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
