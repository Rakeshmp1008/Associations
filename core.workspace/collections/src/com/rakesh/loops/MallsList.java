package com.rakesh.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MallsList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Central Mall");
		list.add("Orion Mall");
		list.add("Garuda Mall");
		list.add("U-Mall");
		list.add("Lulu Mall");
		list.add("Vega Mall");

		System.err.println("========"+ "FOR EACH LOOP"+ "=========");
		for (String element : list) {
			System.out.println(element);
		}

		System.err.println("========"+ "FOR EACH METHOD"+ "=========");
		list.forEach((e) -> {
			System.out.println(e);
		});

		System.err.println("========"+ "FOR LOOP"+ "=========");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);

		}
		System.err.println("========"+ "REVERSE ORDER"+ "=========");
		ListIterator<String> itrref = list.listIterator(list.size());
		while (itrref.hasPrevious()) {
			String lists = itrref.previous();
			System.out.println(lists);
		}    

	}
}
