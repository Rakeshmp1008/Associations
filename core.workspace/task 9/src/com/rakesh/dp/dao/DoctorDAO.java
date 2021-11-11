package com.rakesh.dp.dao;

import com.rakesh.dp.dto.DoctorDTO;

public class DoctorDAO {

	private DoctorDTO[] dtos = new DoctorDTO[10];
	private int tic = 0;

	public void create(DoctorDTO dto) {
		if (tic < this.dtos.length && dto!=null) {
			this.dtos[this.tic++] = dto;
		} else {
			System.out.println("CRAETE METHOD IS INVALID");
		}
	}

	public void create(DoctorDTO dto, int cap) {
		if (cap >= 0 && cap < this.dtos.length && dtos != null) {
			this.dtos[cap] = dto;
		} else {
			System.out.println("CREATE OVER LOADING METHOD IS INVALID");
		}
	}

	public void indexOccupied() {
		System.out.println("No of Indexes Occupied are : ".concat(String.valueOf(tic)));
	}

	public DoctorDTO[] getDtos() {
		return this.dtos;
	}

	public boolean matchByName(String name) {
		System.out.println("Name name Passed : ".concat(name));

		for (int black = 0; black < dtos.length; black++) {
			DoctorDTO ref = this.dtos[black];
			if (ref != null) {
				String tempname = ref.getName();
				System.out.println("Matching ".concat(tempname));
				if (name.equals(tempname)) {
					System.out.println("NAME IS FOUND");
					return true;
				} else {
					System.out.println("NAME IS NOT FOUND");
				}
			}
		}
		return false;

	}
}
