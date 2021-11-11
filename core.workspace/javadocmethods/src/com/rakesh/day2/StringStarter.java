package com.rakesh.day2;

public class StringStarter {

	public static void main(String[] args) {

		String noise="NOISE";
		String boat=new String("BOAT");
		if(noise==boat) {
			
			System.out.println("Pointing to same memory location");
		}else {
			
			System.out.println("Pointing to diff memory location");
		}
		
		String boat1="BOAT";
		if(boat1==boat) {
			
			System.out.println("Pointing to same memory location");
		}else {
			
			System.out.println("Pointing to diff memory location");
		}
		
		boat1="CHERRY";
		System.out.println(boat1);
		
		boat1="Masala Papad";
		System.out.println(boat1);
		
		boat1=boat;
		System.out.println(boat1);
		if(boat1==boat) {
			
			System.out.println("Pointing to same memory location");
		}
		else {
			
			System.out.println("Pointing to different memory location");
		}
	}

}
