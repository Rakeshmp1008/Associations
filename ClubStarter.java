package com.rakesh.dp;

import com.rakesh.dp.dao.ClubDAO;
import com.rakesh.dp.dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {

		ClubDTO dtoref = new ClubDTO();

		dtoref.setEntryPrice(2000f);
		dtoref.setNoOfBottels(200);
		dtoref.setNoOfPeople(60);
		dtoref.setNoOfStaff(15);
		dtoref.setRating(9.5f);

		ClubDTO dtoref1 = new ClubDTO(80,300,9.9f,3000f,20);
		ClubDTO dtoref2 = new ClubDTO(100,400,9.7f,4000f,25);
		ClubDTO dtoref3 = new ClubDTO(50,250,9.8f,3500f,21);
		
		ClubDAO daoref = new ClubDAO();
		daoref.add(dtoref);
		daoref.add(dtoref1);
		daoref.add(dtoref3);

		daoref.delete(2);
		daoref.update(2, dtoref2);

		ClubDTO[] refdto = daoref.getDto();

		for (int key = 0; key < refdto.length; key++) {
			ClubDTO ref = refdto[key];
			System.out.println("*************************************************************************************");
			if (ref != null) {
				System.out.println(ref.getEntryPrice());
				System.out.println(ref.getNoOfBottels());
				System.out.println(ref.getNoOfPeople());
				System.out.println(ref.getNoOfStaff());
				System.out.println(ref.getRating());

			} else {
				System.out.println("EMPTY INDEX");
			}
		}

	}

}