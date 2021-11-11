package com.rakesh.overridingmethods;

public class IpodScammer {

	public static void main(String[] args) {

		Ipod ipod1=new Ipod();
		System.out.println(ipod1);
		System.out.println(ipod1.hashCode());
		System.out.println(System.identityHashCode(ipod1));

		Ipod ipod2=new Ipod();
		System.out.println(ipod2);
		System.out.println(System.identityHashCode(ipod2));  
		
		ipod1.setModelNo("143");
		ipod2.setModelNo("143");
		System.out.println(ipod1.equals(ipod2)); 
		
		
		
	}
	
	

}
