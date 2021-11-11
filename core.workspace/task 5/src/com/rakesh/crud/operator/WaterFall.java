package com.rakesh.crud.operator;

public class WaterFall {
	private String season;
	private String[] locations = new String[5];
	private int count = 0;
	
	public String[] getLocations() {
		return locations;
	}
	
	public void addlocations(String locations) {
		if (this.count < 5) {
			this.locations[this.count] = locations;
			this.count++;
		} else {
			System.out.println("ARRAY IS FULL");
		}
	}

	public void deletelocations(int wand) {
		if (wand >= 0 && wand < locations.length) {
			this.locations[wand] = null;
		} else {
			System.out.println("Array cant be deleted");
		}
	}

	public void updatelocations(int man, String loc) {
		if (man >= 0 && man < locations.length) {
			this.locations[man] = loc;
		} else {
			System.out.println("CANT UPDATE ARRAY");
		}

	}

}
