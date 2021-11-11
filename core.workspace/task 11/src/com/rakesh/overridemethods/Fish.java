package com.rakesh.overridemethods;

public class Fish {

	 private String name;
	private Float price;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Fish) {
				Fish cast = (Fish) obj;
				System.out.println("Casted is done");

				String match = cast.getName();
				String match1 = cast.getColor();
				if (this.name.equals(match) && this.color.equals(match1)) {
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
