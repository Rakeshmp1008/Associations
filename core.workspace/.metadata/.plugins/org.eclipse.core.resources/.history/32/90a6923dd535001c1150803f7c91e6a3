package com.rakesh.dp.dao;

import com.rakesh.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] dto = new DressCodeDTO[10];
	private int pin = 0;

	public void addDress(DressCodeDTO dress) {
		if (pin < this.dto.length && dress != null) {
			this.dto[this.pin++] = dress;
		} else {
			System.out.println("CREATE METHOD IS INVALID");
		}
	}

	public DressCodeDTO[] getDto() {
		return this.dto;
	}

	public void updatedress(int india, DressCodeDTO dress) {
		if (india >= 0 && india < this.dto.length && dress != null) {
			this.dto[india] = dress;
		} else {
			System.out.println("UPDATE METHOD IS INVALID");
		}

	}

	public void deletedress(int dlt) {
		if (dlt >= 0 && dlt < this.dto.length) {
			this.dto[dlt] = null;
		} else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}
}
