package com.rakesh.overridemethods;

public class Tyre {

	private String brand;
	private String type;
	
	
	public Tyre(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public String getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("INVOKED EQUALS METHOD");
		
		if(obj!=null) {
			System.out.println("PASSING VALUE IS NOT NULL");
			
			if(obj instanceof Tyre) {
				Tyre cast=(Tyre) obj;
				System.out.println("CASTING IS DONE");
				
				String match=cast.getBrand();
				String match1=cast.getType();
				
				if(this.brand.equals(match) && this.type.equals(match1)) {
				System.out.println("MATCHED");
				return true;
			}else {
				System.out.println("MISS MATCHED");
			}
		}
		
	}
		return false;
	}
	
}
