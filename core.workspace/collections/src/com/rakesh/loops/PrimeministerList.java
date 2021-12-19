package com.rakesh.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeministerList {

	public static void main(String[] args) {

		List<String> listref=new ArrayList<String>();
		
		listref.add("Jawaharlal Neharu");
		listref.add("Indira Ghandi");
		listref.add("Rajeev Ghandi");
		listref.add("Manmohan Singh");
		listref.add("Narendra Modi");

		System.err.println("========"+ "FOR EACH LOOP"+ "=========");
		for (String elements : listref) {
			System.out.println(elements);
		}
		System.err.println("========"+ "FOR EACH METHOD"+ "=========");
		
		listref.forEach((e)->{
			System.out.println(e);
		});
		
		System.err.println("========"+ "FOR LOOP"+ "=========");
		for (int i = 0; i < listref.size(); i++) {
			String thing=listref.get(i);
			System.out.println(thing);
		}
		
		System.err.println("========"+ "REVERSE ORDER"+ "=========");
		ListIterator<String> itrref=listref.listIterator(listref.size());
		
		while(itrref.hasPrevious()) {
			String elements=itrref.previous();
			System.out.println(elements);
			
		}
	}

}
