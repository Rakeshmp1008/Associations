package com.rakesh.dp;

import com.rakesh.dp.dao.CircusDAO;
import com.rakesh.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {

		CircusDTO dtoref = new CircusDTO("VANDANA", 100f, 10, 5);
		CircusDTO dtoref1 = new CircusDTO("GOMATESH", 80f, 12, 4);
		CircusDTO dtoref2 = new CircusDTO("RAKESH", 100f, 11, 5);

		CircusDAO daoref = new CircusDAO();
		daoref.create(dtoref);
		daoref.create(dtoref1, 2);

		daoref.indexOccupied();
		daoref.matchByOwner("GOMATESH");

		CircusDTO[] refdto = daoref.getDtos();

		for (int click = 0; click < refdto.length; click++) {
			CircusDTO ref = refdto[click];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getOwner());
				System.out.println(ref.getTicketPrice());
				System.out.println(ref.getNoOfAnimals());
				System.out.println(ref.getNoOfShows());

			}else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(click)));
			}
		}

	}

}
