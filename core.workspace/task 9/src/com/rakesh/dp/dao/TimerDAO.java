package com.rakesh.dp.dao;

import com.rakesh.dp.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] dtos = new TimerDTO[10];
	private int tic = 0;

	public void create(TimerDTO dto) {
		if (tic < this.dtos.length && dto!=null) {
			this.dtos[this.tic++] = dto;
		} else {
			System.out.println("CRAETE METHOD IS INVALID");
		}
	}

	public void create(TimerDTO dto, int cap) {
		if (cap >= 0 && cap < this.dtos.length && dtos != null) {
			this.dtos[cap] = dto;
		} else {
			System.out.println("CREATE OVER LOADING METHOD IS INVALID");
		}
	}

	public void indexOccupied() {
		System.out.println("No of Indexes Occupied are : ".concat(String.valueOf(tic)));
	}

	public TimerDTO[] getDtos() {
		return this.dtos;
	}

	public boolean matchByBrand(String brand) {
		System.out.println("brand name Passed : ".concat(brand));

		for (int black = 0; black < dtos.length; black++) {
			TimerDTO ref = this.dtos[black];
			if (ref != null) {
				String tempbrand = ref.getBrand();
				System.out.println("Matching ".concat(tempbrand));
				if (brand.equals(tempbrand)) {
					System.out.println("BRAND IS FOUND");
					return true;
				} else {
					System.out.println("BRAND IS NOT FOUND");
				}
			}
		}
		return false;

	}
}
