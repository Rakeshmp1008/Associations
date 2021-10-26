package com.rakesh.dp.dao;

import com.rakesh.dp.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] dtos = new WalletDTO[20];
	private int pin = 0;

	public void create(WalletDTO dto) {
		if (pin < this.dtos.length && dto != null) {
			this.dtos[this.pin++] = dto;
		} else {
			System.out.println("CREATE METHOD IS INVALID");
		}
	}

	public WalletDTO[] getDtos() {
		return this.dtos;
	}

	public void create(int fat, WalletDTO dto) {
		if (fat >= 0 && fat < this.dtos.length && dto != null) {
			this.dtos[fat] = dto;
		} else {
			System.out.println("CREATE METHOD OVER LOADING IS INVALID");
		}
	}

	public void indexOccupied() {

		System.out.println("No of Occupied Indexes are : ".concat(String.valueOf(pin)).concat("\n"));

	}

	public boolean matchByBrand(String brand) {
		System.out.println("Brand Passed : ".concat(brand));

		for (int key = 0; key < dtos.length; key++) {
			WalletDTO ref = this.dtos[key];
			if (ref != null) {

				String tempBrand = ref.getBrand();
				System.out.println("Matching  ".concat(tempBrand));
				if (brand.equals(tempBrand)) {
					System.out.println("Brand is found");
					return true;
				} else {
					System.out.println("Brand is not found");
				}

			}
		}

		return false;
	}
}
