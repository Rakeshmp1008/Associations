package com.rakesh.collectionmethods.serializable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChocoStarter {

	public static void main(String[] args) {

		ChocoDTO dtos1=new ChocoDTO("CADBURY", 10f);
		ChocoDTO dtos2=new ChocoDTO("HARSEYS", 20f);
		ChocoDTO dtos3=new ChocoDTO("PARLE", 50f);
		ChocoDTO dtos4=new ChocoDTO("BRITANIA", 10f);
		ChocoDTO dtos5=new ChocoDTO("BRITANIA", 10f);
		ChocoDTO dtos6=new ChocoDTO("BRITANIA", 10f);
		ChocoDTO dtos7=new ChocoDTO("BRITANIA", 10f);
		
		Set<ChocoDTO> setref=new HashSet<ChocoDTO>();
		setref.add(dtos1);
		setref.add(dtos2);
		setref.add(dtos3);
		setref.add(dtos4);
		setref.add(dtos5);
		setref.add(dtos6);
		setref.add(dtos7);
		
		System.out.println(setref.size());
		
		Iterator<ChocoDTO> itrref=setref.iterator();
		while(itrref.hasNext()) {
			
		ChocoDTO element=itrref.next();
		System.out.println(element);
		}

		

		

	}

}
