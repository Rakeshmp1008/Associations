package com.rakesh.functionalinterface.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.rakesh.functionalinterface.StringMatch;

public class BiscuitDAO {
	
	private Collection<String> brands=new ArrayList();
	
	public BiscuitDAO() {
		
		this.brands.add("Parle");
		this.brands.add("Britania");
		this.brands.add("Oreo");
		this.brands.add("MarieGold");
		this.brands.add("Tiger");
	}
	
	public boolean findBiscuits(StringMatch match,String value) {
		Iterator<String> itrref=brands.iterator();
		while(itrref.hasNext()) {
			
			String elements=itrref.next();
			if(match.evaluate(elements, value)) {
				return true;
			}
		}
		return false;
	}

}
