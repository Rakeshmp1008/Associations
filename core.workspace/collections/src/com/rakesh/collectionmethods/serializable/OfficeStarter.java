package com.rakesh.collectionmethods.serializable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OfficeStarter {

	public static void main(String[] args) {

		OfficeDTO dtos1=new OfficeDTO("Mico Layout",4f);
		OfficeDTO dtos2=new OfficeDTO("Jaynagar",10f);
		OfficeDTO dtos3=new OfficeDTO("JP nagar",8f);
		OfficeDTO dtos4=new OfficeDTO("JP nagar",8f);

		Set<OfficeDTO> setref=new HashSet<OfficeDTO>();
		setref.add(dtos1);
		setref.add(dtos2);
		setref.add(dtos3);
		setref.add(dtos4);
		
		
		System.out.println(setref.size());
		
		Iterator<OfficeDTO> itrref=setref.iterator();
		while(itrref.hasNext()) {
			
		OfficeDTO things=	itrref.next();
		
		System.out.println(things);
		}

		
	}

}
