package com.rakesh.dp;

import com.rakesh.dp.dao.MovieDAO;
import com.rakesh.dp.dto.MovieDTO;

public class MovieStarter {


	public static void main(String[] args) {

		MovieDTO dtoref = new MovieDTO("KGF","NEEL","YASH",10f);
		MovieDTO dtoref1 = new MovieDTO("YAJAMANA","HARIKRISHNA","DARSHAN",8f);
		
		MovieDAO daoref = new MovieDAO();
		daoref.create(dtoref);
		daoref.create(new MovieDTO("KOTIGOBBA-3","SHIVA","KICCHA SUDEEP",9f), 2);
		daoref.create(dtoref1);
		
		daoref.indexOccupied();
		daoref.matchByActor("KICCHA SUDEEP");

		MovieDTO[] refdto = daoref.getDtos();

		for (int click = 0; click < refdto.length; click++) {
			MovieDTO ref = refdto[click];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getDirector());
				System.out.println(ref.getActor());
				System.out.println(ref.getRating());

			}else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(click)));
			}
		}

	}
}
