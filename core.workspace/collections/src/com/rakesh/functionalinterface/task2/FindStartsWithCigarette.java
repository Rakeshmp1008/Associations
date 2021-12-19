package com.rakesh.functionalinterface.task2;

import com.rakesh.functionalinterface.StringMatch;

public class FindStartsWithCigarette implements StringMatch{
	
	@Override
	public boolean evaluate(String ele, String value) {
System.out.println("Invoking Strats with method");	
return ele.startsWith(value);
	}

}
