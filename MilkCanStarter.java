package com.rakesh.dp;

import com.rakesh.dp.dao.MilkCanDAO;
import com.rakesh.dp.dto.MilkCanDTO;

public class MilkCanStarter {

	public static void main(String[] args) {

		MilkCanDTO dtoref = new MilkCanDTO(2.5f,"ROUND","WHITE",100f);
		MilkCanDTO dtoref1 = new MilkCanDTO(3.0f,"SQAURE","BLACK",150f);
		
		MilkCanDAO daoref = new MilkCanDAO();
		daoref.create(dtoref);
		daoref.create(new MilkCanDTO(3.5f,"RECTANGLE","BLUE",200f), 2);
		daoref.create(dtoref1);
		
		daoref.indexOccupied();
		daoref.matchByColor("BLACK");

		MilkCanDTO[] refdto = daoref.getDtos();

		for (int click = 0; click < refdto.length; click++) {
			MilkCanDTO ref = refdto[click];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getShape());
				System.out.println(ref.getPrice());
				System.out.println(ref.getQuantity());

			}else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(click)));
			}
		}

	}

}
