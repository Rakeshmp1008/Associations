package com.rakesh.crud;

public class Labour {
	private String[] names = new String[3];
	private int count = 0;
//Create Read Update Delete

	public void addnames(String names) {
		if (count < this.names.length) {
			this.names[this.count] = names;
			this.count++;
		} else {

			System.out.println("ARRAY IS FULL CAN NOT ADD");
		}
	}

	public String[] getNames() {
		return this.names;
	}

	public void updateNames(int dlt, String name) {
		if (dlt >= 0 && dlt < this.names.length) {
			this.names[dlt] = name;
		} else {
			System.out.println("ARRAY IS FULL CAN NOT BE UPDATE");
		}
	}

	public void deleteNames(int dlt) {
		if (dlt >= 0 && dlt < this.names.length) {
			this.names[dlt] = null;
		} else {
			System.out.println("ARRAY IS FULL ,CAN NOT BE DELETE ");
		}
	}

	public static void main(String[] args) {

		Labour labref = new Labour();

		labref.addnames("VANDU11");
		labref.addnames("RAKESH");
		labref.addnames("GOMATESH");
		labref.addnames("VANDU");
		
		labref.deleteNames(2);
		labref.updateNames(1, "rakesh");
		
		String[] array = labref.getNames();
		for (int arr = 0; arr < array.length; arr++) {

			System.out.println(array[arr]);
		}

		

	}
}
