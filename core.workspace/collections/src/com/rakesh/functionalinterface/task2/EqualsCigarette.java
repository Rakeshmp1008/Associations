package com.rakesh.functionalinterface.task2;

import com.rakesh.functionalinterface.StringMatch;

public class EqualsCigarette implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking Equals Method");
		return ele.equals(value);
	}

}
