package com.rakesh.dp;

import com.rakesh.dp.dao.TimerDAO;
import com.rakesh.dp.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {

		TimerDTO dtoref = new TimerDTO(false,"SONATA",true,false);
		TimerDTO dtoref1 = new TimerDTO(true,"ROLEX",false,true);
		
		TimerDAO daoref = new TimerDAO();
		daoref.create(dtoref);
		daoref.create(new TimerDTO(true,"TITAN",true,false), 2);
		daoref.create(dtoref1);
		
		daoref.indexOccupied();
		daoref.matchByBrand("TITAN");

		TimerDTO[] refdto = daoref.getDtos();

		for (int click = 0; click < refdto.length; click++) {
			TimerDTO ref = refdto[click];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getBrand());
				System.out.println(ref.getBell());
				System.out.println(ref.getDigital());
				System.out.println(ref.getWorking());

			}else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(click)));
			}
		}

	}
}
