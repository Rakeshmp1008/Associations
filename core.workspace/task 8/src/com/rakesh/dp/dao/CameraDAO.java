package com.rakesh.dp.dao;

import com.rakesh.dp.dto.CameraDTO;

public class CameraDAO {

	private CameraDTO[] dto = new CameraDTO[10];
	private int tag = 0;

	public void addcamera(CameraDTO dto) {
		if (tag < this.dto.length && dto != null) {
			this.dto[this.tag++] = dto;
		} else {
			System.out.println("ADD METHOD IS INVALID");
		}
	}

	public CameraDTO[] getDto() {
		return this.dto;
	}

	public void update(int sky, CameraDTO dto) {
		if (sky >= 0 && sky < this.dto.length && dto != null) {
			this.dto[sky] = dto;
			
		} else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}

	public void deletecamera(int down) {
		if (down >= 0 && down < this.dto.length) {

			this.dto[down] = null;
		} else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}

}
