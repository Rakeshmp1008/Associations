package com.rakesh.crud;

public class Coffee {

	private String[] prices = new String[6];
	private int push;

	// c r u d
	public void addprice(String price) {
		if (push < this.prices.length) {
			this.prices[this.push++] = price;
		} else {
			System.out.println("ARRAY IS FULL CAN NOT ADD MORE THAN ");
		}
	}

	public String[] getPrices() {

		return this.prices;
	}

	public void updateprices(int sil, String cost) {
		if (sil >= 0 && sil < this.prices.length) {
			this.prices[sil] = cost;
		} else {
			System.out.println("ARRAY IS FULL CAN BE UPDATE");
		}
	}

	public void deleteprices(int sil) {
		if (sil >= 0 && sil < this.prices.length) {
			this.prices[sil] = null;
		} else {
			System.out.println("ARRAY IS FULL CAN NOT BE DELETE");
		}
	}

	public static void main(String[] args) {

		Coffee cup = new Coffee();

		cup.addprice("5.0");
		cup.addprice("10.0");
		cup.addprice("15.0");
		cup.addprice("20.0");
		cup.addprice("25.0");
		cup.addprice("50.0");

		cup.deleteprices(4);
		cup.updateprices(1, "12.5");

		String[] array = cup.getPrices();
		for (int sip = 0; sip <array.length; sip++) {

			System.out.println(array[sip]);
		}

	}
}