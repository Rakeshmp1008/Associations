package com.rakesh.day2;

public class TrainStarter {

	public static void main(String[] args) {
		String trainNo="08353";
		trainNo=trainNo.concat("Fav Destination is Chikamagaluru");
		System.out.println(trainNo);
	
		String trainNo1=new String("01227");
		trainNo=trainNo1.concat("Devarmane Place is like heaven");
		System.out.println(trainNo1);
		System.out.println(trainNo);
		System.out.println(trainNo1+null);
		
		String max=null;
		System.out.println(max);
		
		String hospital=new String("Narayan Hrudayalaya");
		hospital=hospital.toUpperCase();
		System.out.println(hospital);
		
		String kidney=hospital.toLowerCase();
		System.out.println(kidney);
		
		String hospitalNew=new String("Narayan Hrudayalaya");
		hospitalNew.toUpperCase();
		System.out.println(hospitalNew);
		if(hospital==hospitalNew) {
			
			System.out.println("Pointing To Same Memory Location");
		}else {
			
			System.out.println("Pointing To Diff Memory Location");
		}
		
		String medicine="DOLO 650";
		String indMedicine=new String("DOLO 650");
		if(medicine==indMedicine) {
			
			System.out.println("Pointing to same memory Location");
			
		}else {
			
			System.out.println("Pointing to diff memory Location");
		}
		
		medicine="45";
		boolean equal=medicine.equals(null);
		System.out.println("both content is" +equal);
		
		medicine=null;
		System.out.println(medicine);
		
		medicine=medicine.toUpperCase();
		System.out.println(medicine);
		
	}
}
