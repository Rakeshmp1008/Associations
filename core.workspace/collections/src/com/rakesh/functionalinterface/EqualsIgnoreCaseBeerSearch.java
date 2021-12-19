package com.rakesh.functionalinterface;

public class EqualsIgnoreCaseBeerSearch implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking ignorecase");
		return ele.equalsIgnoreCase(value);
	}

}
