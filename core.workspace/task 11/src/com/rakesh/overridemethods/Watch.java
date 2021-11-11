package com.rakesh.overridemethods;

public class Watch {

	private String brand;

	enum Type {
		ANLOG, DIGITAL;
	}

	Type type;

	private Float price;

	public Float getPrice() {

		return price;
	}

	public String getBrand() {

		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Invoking To String Method");
		return "E SALA CUP NAMDE";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking HashCode Method");
		return 14;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals Method");
		if (obj != null) {

			System.out.println("Passing value is not null");

			if (obj instanceof Watch) {
				Watch temp = (Watch) obj;
				System.out.println("Casting is done");

				String match = temp.getBrand();
				Float match1=temp.getPrice();
				if (brand.equals(match) && this.price.equals(match1)) {
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
