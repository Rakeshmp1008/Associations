package com.rakesh.dp;

import com.rakesh.dp.dao.iplDAO;
import com.rakesh.dp.dto.iplDTO;

public class iplStarter {

	public static void main(String[] args) {

		iplDTO dtoref = new iplDTO();

		dtoref.setName("RCB");
		dtoref.setNoOfPlayers(24);
		dtoref.setOwner("VANDANA");
		dtoref.setSponsor("KING FISHER");
		dtoref.setTeamSize(11);

		iplDAO deoref = new iplDAO();

		deoref.create(dtoref);
		deoref.create(new iplDTO("RR", 24, 11, "GOMATESH", "JIO"));

		deoref.create(dtoref, 99);
		deoref.occupied();
		deoref.matchByName("RR");

		iplDTO[] refdto = deoref.getDtos();
		

		for (int cover = 0; cover < refdto.length; cover++) {
			iplDTO ref = refdto[cover];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getNoOfPlayers());
				System.out.println(ref.getTeamSize());
				System.out.println(ref.getSponsor());
				System.out.println(ref.getOwner());
			} else {
				System.out.println("EMPTY INDEX  : ".concat(String.valueOf(cover)));
			}
			
		}

	}

}
