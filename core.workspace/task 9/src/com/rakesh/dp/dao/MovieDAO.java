package com.rakesh.dp.dao;

import com.rakesh.dp.dto.MovieDTO;

public class MovieDAO {

	private MovieDTO[] dtos = new MovieDTO[10];
	private int tic = 0;

	public void create(MovieDTO dto) {
		if (tic < this.dtos.length && dto!=null) {
			this.dtos[this.tic++] = dto;
		} else {
			System.out.println("CRAETE METHOD IS INVALID");
		}
	}

	public void create(MovieDTO dto, int cap) {
		if (cap >= 0 && cap < this.dtos.length && dtos != null) {
			this.dtos[cap] = dto;
		} else {
			System.out.println("CREATE OVER LOADING METHOD IS INVALID");
		}
	}

	public void indexOccupied() {
		System.out.println("No of Indexes Occupied are : ".concat(String.valueOf(tic)));
	}

	public MovieDTO[] getDtos() {
		return this.dtos;
	}

	public boolean matchByActor(String actor) {
		System.out.println("Actor name Passed : ".concat(actor));

		for (int black = 0; black < dtos.length; black++) {
			MovieDTO ref = this.dtos[black];
			if (ref != null) {
				String tempactor = ref.getActor();
				System.out.println("Matching ".concat(tempactor));
				if (actor.equals(tempactor)) {
					System.out.println("ACTOR IS FOUND");
					return true;
				} else {
					System.out.println("ACTOR IS NOT FOUND");
				}
			}
		}
		return false;

	}
}
