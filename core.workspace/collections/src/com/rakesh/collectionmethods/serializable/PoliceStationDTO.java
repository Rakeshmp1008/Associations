package com.rakesh.collectionmethods.serializable;

import java.io.Serializable;

public class PoliceStationDTO implements Serializable {

	private String name, type, location;
	private int noOfStaffs;

	public PoliceStationDTO(String name, String type, String location, int noOfStaffs) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.noOfStaffs = noOfStaffs;
	}

	public String getName() {
		return name;

	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getLocation() {
		return location;
	}

	protected void setLocation(String location) {
		this.location = location;
	}

	protected int getNoOfStaffs() {
		return noOfStaffs;
	}

	protected void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public int hashCode() {
		return 27;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", type=" + type + ", location=" + location + ", noOfStaffs="
				+ noOfStaffs + ", getName()=" + getName() + ", getType()=" + getType() + ", getLocation()="
				+ getLocation() + ", getNoOfStaffs()=" + getNoOfStaffs() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof PoliceStationDTO) {
				PoliceStationDTO casted = (PoliceStationDTO) obj;

				String sameName = casted.getName();
				String sameLocation = casted.getLocation();
				if (this.name.equals(sameName) && this.location.equals(sameLocation)) {

					return true;
				}
			}
		}
		return false;
	}

}
