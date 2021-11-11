package com.rakesh.overridemethods;

public class Sock {

	private Character size;
	private Float price;
	
	public Character getSize() {
		return size;
	}
	public void setSize(Character size) {
		this.size = size;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Sock) {
				Sock cast = (Sock) obj;
				System.out.println("Casted is done");

				Character match = cast.getSize();
				Float match1 = cast.getPrice();
				if (this.size.equals(match) && this.price.equals(match1)) {
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
