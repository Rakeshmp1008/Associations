package com.rakesh.dp;

public class ParkDTO {

	 String location;
	private float area;
	private String parkName;
	private int noOfEntries;

	public ParkDTO() {
		System.out.println("INVOKING NO ARG CONSTRUCTOR");

	}

	public String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		location = location;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public int getNoOfEntries() {
		return noOfEntries;
	}

	public void setNoOfEntries(int noOfEntries) {
		this.noOfEntries = noOfEntries;
	}

	public ParkDTO(String location, float area, String parkName, int noOfEntries) {
		this.location = location;
		this.area = area;
		this.parkName = parkName;
		this.noOfEntries = noOfEntries;
	}

	public static void main(String[] args) {

		ParkDTO parkref = new ParkDTO();

		ParkDTO.setLocation("BTM");
		parkref.setParkName("NANDANVANA");
		parkref.setArea(12f);
		parkref.setNoOfEntries(4);

		ParkDTO parkref1 = new ParkDTO("JP NAGAR", 8f, "SARAKKI PARK", 2);
		ParkDTO parkref2 = new ParkDTO("VIJAY NAGAR", 5f, "VIJAY PARK", 1);
		ParkDTO parkref3 = new ParkDTO("JP NAGAR", 10f, "GANDHI PARK", 3);
		ParkDTO parkref4 = new ParkDTO("JAYANAGAR", 11f, "THIMMAKKA PARK", 2);

		ParkDTO[] trees = new ParkDTO[10];
		trees[0] = parkref1;

		for (int leaf = 0; leaf < trees.length; leaf++) {

			ParkDTO root = trees[leaf];
			if (root != null) {
				System.out.println(root.getParkName());
				System.out.println(root.getLocation());
				System.out.println(root.getArea());
				System.out.println(root.getNoOfEntries());

			} else {

				System.out.println("INDEX IS FULL : ".concat(String.valueOf(leaf)));
			}
		}

	}
}
