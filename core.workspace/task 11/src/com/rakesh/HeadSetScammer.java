package com.rakesh;

import com.rakesh.overridemethods.HeadSet;

public class HeadSetScammer {

	public static void main(String[] args) {

		HeadSet headSetRef=new HeadSet();
		System.out.println(headSetRef.toString());
		System.out.println(headSetRef.hashCode());
		System.out.println(System.identityHashCode(headSetRef));
		headSetRef.setBrand("JBL");
		headSetRef.setBattery(2500);
	
		HeadSet headSetRef1=new HeadSet();
		headSetRef.setBrand("ZEBRONICS");
		headSetRef.setBattery(3000);
		
		System.out.println(headSetRef.equals(headSetRef1));
		
	
	}

}
