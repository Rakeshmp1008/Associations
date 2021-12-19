package com.rakesh.functionalinterface.task2;

import com.rakesh.functionalinterface.StringMatch;

public class EqualsIgnoreCaseCigarette implements StringMatch{
	
	@Override
	public boolean evaluate(String ele, String value) {
System.out.println("Invoking equalsignorecase method");	
return ele.equalsIgnoreCase(value);
	}

}
