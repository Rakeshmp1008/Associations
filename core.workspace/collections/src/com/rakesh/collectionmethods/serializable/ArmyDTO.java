package com.rakesh.collectionmethods.serializable;

import java.io.Serializable;

public class ArmyDTO implements Serializable{

	private String country;
	private int noOfSoldiers;
	
	public ArmyDTO(String country, int noOfSoldiers) {
		super();
		this.country = country;
		this.noOfSoldiers = noOfSoldiers;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}
	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}
	@Override
	public int hashCode() {

		return 27;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			
			if (obj instanceof ArmyDTO) {
				ArmyDTO ref = (ArmyDTO) obj;
				
				String tempcountry=ref.getCountry();
				
				if(country.equals(tempcountry)) {
					return true;
				}
				
			}
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "ArmyDTO [country=" + country + ", noOfSoldiers=" + noOfSoldiers + "]";
	}
	
}
