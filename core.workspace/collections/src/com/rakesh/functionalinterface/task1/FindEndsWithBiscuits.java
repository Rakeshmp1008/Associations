package com.rakesh.functionalinterface.task1;

import com.rakesh.functionalinterface.StringMatch;

public class FindEndsWithBiscuits implements StringMatch{
	
	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking EndsWith method");
		return ele.endsWith(value);
	}

}
