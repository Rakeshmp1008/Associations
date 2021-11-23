package com.rakesh.implement;

public class AmenityRules implements CompanyRule,HostelRule{

	@Override
	public int inTime() {
		System.out.println("  overriding/implementation to in Time() ");
		return 10;
	}

	@Override
	public int inTiming() {
 System.out.println("OverRiding the inTime");
		return 20;
	}
	

}
