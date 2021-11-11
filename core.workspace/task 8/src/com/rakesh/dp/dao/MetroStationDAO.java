package com.rakesh.dp.dao;

import com.rakesh.dp.dto.MetroStationDTO;

public class MetroStationDAO {

	private MetroStationDTO[] dto = new MetroStationDTO[10];
	private int count = 0;

	public void add(MetroStationDTO dto) {
		if (count < this.dto.length && dto != null) {
			this.dto[this.count++] = dto;
		} else {
			System.out.println("CREATE METHOD IS INVALID");
		}
	}

	public MetroStationDTO[] getDto() {
		return this.dto;
	}

	public void update(int kaiga, MetroStationDTO dto) {
		if (kaiga >= 0 && kaiga < this.dto.length && dto != null) {
			this.dto[kaiga] = dto;
		} else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}

	public void delete(int tan) {
		if (tan >= 0 && tan < this.dto.length) {
			this.dto[tan] = null;
		} else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}
}
