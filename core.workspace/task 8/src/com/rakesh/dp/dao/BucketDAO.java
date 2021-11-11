package com.rakesh.dp.dao;

import com.rakesh.dp.dto.BucketDTO;

public class BucketDAO {

	private BucketDTO[] dto =new BucketDTO[10];
	private int tag=0;
	
	public void addbucket(BucketDTO dto) {
		if(tag<this.dto.length && dto!=null) 
		{
		this.dto[this.tag++]=dto;
		}
		else {
			System.out.println("ADD METHOD IS INVALID");
		}
	}
	
	public BucketDTO[] getDto() {
		return this.dto;
	}
	
	public void update(int sky,BucketDTO dto) {
		if(sky>=0 && sky<this.dto.length && dto!=null)
		{
			this.dto[sky]=dto;
		}
		else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}
	
	public void deleteBucket(int down) {
		if(down>=0 && down< this.dto.length) {
			
		this.dto[down]=null;
		}
		else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}
	
}
