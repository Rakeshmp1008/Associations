package com.rakesh.collectionmethods.serializable;

import java.io.Serializable;

public class OfficeDTO implements Serializable{

	private String location;
	private float distanceFromBtm;
	
	public OfficeDTO(String location, float distanceFromBtm) {
		super();
		this.location = location;
		distanceFromBtm = distanceFromBtm;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getDistanceFromBtm() {
		return distanceFromBtm;
	}
	public void setDistanceFromBtm(float distanceFromBtm) {
                     distanceFromBtm = distanceFromBtm;
	}
	
	@Override
	public int hashCode() {
		return 27;
	}
	                                   
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			                               
			if(obj instanceof OfficeDTO) {
				OfficeDTO casted=(OfficeDTO)obj;
				
				String tempLocation=casted.getLocation();
				
				if(this.location.equals(tempLocation)) {
					return true;
				}
			}
		}
		
		return false;
	}
	@Override
	public String toString() {
		return "OfficeDTO [location=" + location + ", distanceFromBtm=" + distanceFromBtm + "]";
	}
	
	
	
	
	
	
}
