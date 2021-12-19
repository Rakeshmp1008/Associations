package com.rakesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.rakesh.collectionmethods.PhoneNumber;

public class PhoneNumberStarter {

	public static void main(String[] args) {

		List<Long> phoneNos = new ArrayList<Long>();
		phoneNos.add(8051681546l);
		phoneNos.add(7287451484l);
		phoneNos.add(8511845152l);
		phoneNos.add(9451586454l);
		phoneNos.add(9488945155l);
		phoneNos.add(8461513124l);
		phoneNos.add(8974563450l);
		phoneNos.add(9845484514l);
		phoneNos.add(9525541515l);
		phoneNos.add(7859655655l);
		System.out.println("LIST");
		System.out.println(phoneNos.size());
		Collections.sort(phoneNos);
		System.out.println("acending order....");

		Iterator<Long> itr = phoneNos.iterator();
		while (itr.hasNext()) {
			Long type = itr.next();
			System.out.println(type);
		}

		System.out.println("----------------------------");
		System.out.println("descending...........");

		// Collections.sort(collection, Collections.reverseOrder());
		Comparator<Long> comparator = new PhoneNumber();
		Collections.sort(phoneNos, comparator);

		Iterator<Long> itr1 = phoneNos.iterator();

		while (itr1.hasNext()) {
			Long type = itr1.next();
			System.out.println(type);

		}

	System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("SET");
		Set<Long> set1 = new TreeSet<Long>();
		set1.add(8050058473l);
		set1.add(7204735375l);
		set1.add(9380674362l);
		set1.add(9449435637l);
		set1.add(9483764412l);
		set1.add(9483764424l);
		set1.add(9483764433l);
		set1.add(9886288519l);
		set1.add(7202238563l);
		set1.add(7852369456l);

		System.out.println(set1.size());
		System.out.println("ascending order....");

		Iterator<Long> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("----------------------------");
		System.out.println("descending order....");

		// Collections.sort(collection, Collections.reverseOrder());

		Comparator<Long> comparator1 = new PhoneNumber();
		Collections.sort(phoneNos, comparator1);
		Iterator<Long> itr3 = phoneNos.iterator();
		while (itr3.hasNext()) {
			Long type1 = itr3.next();
			System.out.println(type1);
		}

	}


	}


