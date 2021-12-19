package com.rakesh.functionalinterface.task1;

import com.rakesh.functionalinterface.StringMatch;

public class FindStartsWithBiscuits implements StringMatch {
	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking starts with method");
		return ele.startsWith(value);
	}

}
