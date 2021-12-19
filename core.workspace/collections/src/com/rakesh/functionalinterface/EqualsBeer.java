package com.rakesh.functionalinterface;

public class EqualsBeer implements StringMatch{
	
	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking equal method");
		return ele.equals(value);
	}

}
