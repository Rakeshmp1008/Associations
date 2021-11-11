package com.rakesh.overridemethods;

public class HeadSet { 
	
	private String brand;
	enum Type{WIRED,BLUETOOTH;}
	private Type type;
	private Integer battery;
	private Float warranty;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getBattery() {
		return battery;
	}
	public void setBattery(Integer battery) {
		this.battery = battery;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals Method");
		
		if(obj!=null) {
			System.out.println("Value Passing is not null");
			
			if(obj instanceof HeadSet) {
				HeadSet cast=(HeadSet)obj;
				System.out.println("Castin is done");
				
				String match=cast.getBrand();
				Integer match1=cast.getBattery();
				if(this.brand.equals(match) && this.battery.equals(match1)) {
					System.out.println("Matched");
				}else {
					System.out.println("Miss Matched");
				}
			}
		}
		return false;
	}
	
	

}
