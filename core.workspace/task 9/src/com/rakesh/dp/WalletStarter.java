package com.rakesh.dp;

import com.rakesh.dp.dao.WalletDAO;
import com.rakesh.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {

		WalletDTO dtoref=new WalletDTO("PUMA","CLOTH",550f,true);
		WalletDTO dtoref1=new WalletDTO("WOOD LAND","LEATHER",1000f,true);
		
		WalletDAO daoref=new WalletDAO();
		daoref.create(dtoref);
		daoref.create(2, dtoref1);
		daoref.create(new WalletDTO("ALLEN SOLY","LEATHER",800f,false));
		
		daoref.indexOccupied();
		daoref.matchByBrand("PUMA");
		
		WalletDTO[] refdto=daoref.getDtos();
		
		for (int map = 0; map < refdto.length; map++) {
			WalletDTO ref=refdto[map];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if(ref!=null) {
				System.out.println(ref.getBrand());
				System.out.println(ref.getMaterial());
				System.out.println(ref.getCoinCompartment());
				System.out.println(ref.getPrice());
			}
			else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(map)));
			}
		}
		
		
		
	}

}
