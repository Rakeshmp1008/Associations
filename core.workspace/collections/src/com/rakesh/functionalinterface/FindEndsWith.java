package com.rakesh.functionalinterface;

public class FindEndsWith implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking ends with method");
		return ele.endsWith(value);
	}

}
