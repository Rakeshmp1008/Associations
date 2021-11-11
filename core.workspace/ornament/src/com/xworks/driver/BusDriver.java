package com.xworks.driver;

public class BusDriver {
		public  String name="Vandana";
		public  float salary=18000f;
		
	 public String getName()
	{
		return this.name;
	}
	
	public float getSalary()
	{
		return this.salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public static void celebrate()
	{
		System.out.println("INVOKIN METHOD");
		
	}
	
}
