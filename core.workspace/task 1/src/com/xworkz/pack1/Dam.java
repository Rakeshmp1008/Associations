package com.xworkz.pack1;

public class Dam {
	public String location;
	public float capacity;
	
	public String getLocation()
	{
		return this.location;
	}
	public float getCapacity()
	{
		return this.capacity;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setCapacity(float capacity)
	{
		this.capacity=capacity;
	}
	
	public static void damOpen()
	{
		System.out.println("DAM OPENTIME IS = 6 PM");
	}
}
