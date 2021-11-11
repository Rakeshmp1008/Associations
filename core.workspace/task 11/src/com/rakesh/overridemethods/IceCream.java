package com.rakesh.overridemethods;

public class IceCream {

	private String name;
	enum Flavour{VANILA,BUTTERSCOTCH,MANGOE,ORANGE;}
	private Flavour flavour;
	private Float price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

			if (obj instanceof IceCream) {
				IceCream cast = (IceCream) obj;
				System.out.println("Casted is done");

				String match = cast.getName();
				Float match1 = cast.getPrice();
				if (this.name.equals(match) && this.price.equals(match1)) {
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
