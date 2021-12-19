package com.rakesh.collectionmethods.serializable;

import java.util.HashSet;    
import java.util.Iterator;
import java.util.Set;


public class PoliceStationStarter  {
	
	//office,hospital,choco,army
	
	public static void main(String[] args) {

	PoliceStationDTO dtos=new PoliceStationDTO("MADIVALA PS","CRIME","MADIVALA",15);
	PoliceStationDTO dtos1=new PoliceStationDTO("MADIVALA PS","CRIME","MADIVALA",15);
	PoliceStationDTO dtos2=new PoliceStationDTO("BANASAVADI PS","CRIME","BANASAVADI",35);
	PoliceStationDTO dtos3=new PoliceStationDTO("BTM PS","TRAFFIC","MICO LAYOUT",56);
	   
	Set<PoliceStationDTO> setref=new HashSet();
	
	setref.add(dtos);
	setref.add(dtos1);
	setref.add(dtos2);
	setref.add(dtos3);
	setref.add(dtos1);

	
	System.out.println(setref.size());
	
	Iterator<PoliceStationDTO> itrref=setref.iterator();
	
	while(itrref.hasNext()) {
		PoliceStationDTO elements=itrref.next();
		System.out.println(elements);
		System.out.println(elements.hashCode());
		
		
		
	}
	

	
	
	

	}

}
