package com.rakesh.overridemethods;

public class Bag {

	private Float price;

	 enum Color {BLACK, ORANGE,;}

	private Color color;
	private Integer sections;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getSections() {
		return sections;
	}

	public void setSections(Integer sections) {
		this.sections = sections;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Bag) {
				Bag cast = (Bag) obj;
				System.out.println("Casted is done");

				Float match = cast.getPrice();
				Integer match1 = cast.getSections();
				if (this.price.equals(match) && this.sections.equals(match1)) {
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