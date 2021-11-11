package com.rakesh.crud.operator;

public class Rocket {
	private float speed=11.38f;
	private String[] spaceStations=new String[5];
	private int count = 0;
	public Rocket()
	{
	
	}

	public Rocket(float speed)
	{
		this.speed=speed;
	}
	
	public float getSpeed()
	{
		return speed;
	}
	
	public void addspaceStations(String spaceStations)
	{
		this.spaceStations[this.count]=spaceStations;
		this.count++;
	}
	public void displayspaceStations()
	{
		for (int juice = 0; juice < spaceStations.length; juice++) {
			
			System.out.println(this.spaceStations[juice]);
		}
	}
}

