package com.rakesh.dp.dao;

import com.rakesh.dp.dto.MilkCanDTO;

public class MilkCanDAO {

	private MilkCanDTO[] dtos = new MilkCanDTO[10];
	private int tic = 0;

	public void create(MilkCanDTO dto) {
		if (tic < this.dtos.length && dto!=null) {
			this.dtos[this.tic++] = dto;
		} else {
			System.out.println("CRAETE METHOD IS INVALID");
		}
	}

	public void create(MilkCanDTO dto, int cap) {
		if (cap >= 0 && cap < this.dtos.length && dtos != null) {
			this.dtos[cap] = dto;
		} else {
			System.out.println("CREATE OVER LOADING METHOD IS INVALID");
		}
	}

	public void indexOccupied() {
		System.out.println("No of Indexes Occupied are : ".concat(String.valueOf(tic)));
	}

	public MilkCanDTO[] getDtos() {
		return this.dtos;
	}

	public boolean matchByColor(String color) {
		System.out.println("Color name Passed : ".concat(color));

		for (int black = 0; black < dtos.length; black++) {
			MilkCanDTO ref = this.dtos[black];
			if (ref != null) {
				String tempcolor = ref.getColor();
				System.out.println("Matching ".concat(tempcolor));
				if (color.equals(tempcolor)) {
					System.out.println("COLOR IS FOUND");
					return true;
				} else {
					System.out.println("COLOR IS NOT FOUND");
				}
			}
		}
		return false;

	}
}
