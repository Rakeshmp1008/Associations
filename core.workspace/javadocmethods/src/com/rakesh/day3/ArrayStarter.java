package com.rakesh.day3;

public class ArrayStarter {

	public static void main(String[] args) {
		
		String vandu="KA 14 E 5684";
		String yeradu="KA 25 R 5874";
		String muru="KA 48 R 6895";
		
		String[] vehicleNo=new String[5];
		vehicleNo[3]=vandu;
		vehicleNo[1]=muru;
		vehicleNo[0]=yeradu;
		for (int i = 0; i < vehicleNo.length; i++) {
			
			System.out.println(i);
			String temp=vehicleNo[i];
		}
	}

}
