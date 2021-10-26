package com.rakesh.dp.dao;

import com.rakesh.dp.dto.TempleDTO;

public class TempleDAO {

	private TempleDTO[] dto=new TempleDTO[10];
	private int bell=0;
	public void addTemple(TempleDTO dto) {
		if(bell<this.dto.length && dto!=null) {
		this.dto[this.bell++]=dto;
		}
		else {
			System.out.println("ADD METHOD IS INVALID");
		}
	}
	
	public TempleDTO[] getDto() {
		return this.dto;
	}
	
	public void updateTemple(int box,TempleDTO dto) {
		if(box>=0 && box<this.dto.length && dto!=null) {
		this.dto[box]=dto;
		}
		else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}
	
	public void deleteTemple(int tap) {
		if(tap>=0 && tap<this.dto.length) {
		this.dto[tap]=null;
		}
		else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}
	
	
}
