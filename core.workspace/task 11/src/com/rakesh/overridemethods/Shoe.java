package com.rakesh.overridemethods;

public class Shoe {
	private String brand;
	private Integer size;
	private String color;
	private String gender;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Shoe) {
				Shoe cast = (Shoe) obj;
				System.out.println("Casted is done");

				String match = cast.getBrand();
				String match1 = cast.getGender();
				if (this.brand.equals(match) && this.gender.equals(match1)) {
					System.out.println("Matched");
					return true;
				} else {
					System.out.println("Miss Matched");
				}
			}
		}
		return false;
	}


	
	
}
