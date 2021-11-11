package com.rakesh.crud.operators;

public class BeachOperators {
	private String country;
	private String[] names = new String[5];
	private int count = 0;

	public BeachOperators()
	{
		this("INDIA");
	}

	public BeachOperators(String country)
	{
		this.country = country;
	}

	public String getCountry() 
	{
		return country;
	}

	public void addBeachName(String name) {
		if (count < 5) {
			this.names[this.count] = name;
			this.count++;
		} else {
			System.err.println("Array is Full ");
		}
	}

	public void displayNames() {

		for (int idli = 0; idli < names.length; idli++) {
			String name = this.names[idli];
			System.out.println(name);
		}
	}
}
