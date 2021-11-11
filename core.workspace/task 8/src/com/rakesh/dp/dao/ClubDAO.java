package com.rakesh.dp.dao;

import com.rakesh.dp.dto.ClubDTO;

public class ClubDAO {
	private ClubDTO[] dto = new ClubDTO[10];
	private int tag = 0;

	public void add(ClubDTO dto) {
		if (tag < this.dto.length && dto != null) {
			this.ClubDTO[this.tag++] = dto;
		} else {
			System.out.println("ADD METHOD IS INVALID");
		}
	}

	public ClubDTO[] getDto() {
		return this.dto;
	}

	public void update(int sky, ClubDTO dto) {
		if (sky >= 0 && sky < this.dto.length && dto != null) {
			this.dto[sky] = dto;
		} else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}

	public void delete(int down) {
		if (down >= 0 && down < this.dto.length) {

			this.dto[down] = null;
		} else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}

}
