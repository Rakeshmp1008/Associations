package com.rakesh;

import com.rakesh.implement.AmenityRules;
import com.rakesh.implement.CompanyRule;
import com.rakesh.implement.HostelRule;

public class RuleScammer {

	public static void main(String[] args) {

		AmenityRules rule1=new AmenityRules();
		rule1.inTime();
		System.out.println(rule1.inTiming());
		
		CompanyRule rule2=new AmenityRules();
		rule2.inTime();
		rule2.inTiming();
		
		HostelRule rule3=new AmenityRules();
		rule3.inTime();
	
	 Object rule4=new AmenityRules();
	 if(rule4 instanceof AmenityRules) {
		 AmenityRules rule6=(AmenityRules)rule4;
		 
		 System.out.println(rule6.inTime());
		 System.out.println(rule6.inTiming());
	 }
	}

}
