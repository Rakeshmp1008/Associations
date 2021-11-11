package com.rakesh.overridemethods;

public class Belt {

	private Float price;
	private String material;
	private Integer size;
	private String gender;
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Belt) {
				Belt cast = (Belt) obj;
				System.out.println("Casted is done");

				Float match = cast.getPrice();
				Integer match1 = cast.getSize();
				if (this.price.equals(match) && this.size.equals(match1)) {
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
