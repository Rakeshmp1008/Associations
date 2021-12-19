package com.rakesh.functionalinterface;

public class FindStartsWith implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking starts with method");
		return ele.startsWith(value);
	}

}
