package com.rakesh.collectionmethods;

import java.util.Comparator;

public class PhoneNumber implements Comparator<Long>{
	
	@Override
	public int compare(Long o1, Long o2) {
		return o2.compareTo(o1);

	}

}

