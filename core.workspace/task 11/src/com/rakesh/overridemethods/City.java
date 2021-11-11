package com.rakesh.overridemethods;

public class City {

	private String name;
	private String state;
	
	
	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}


	public String getName() {
		return name;
	}


	public String getState() {
		return state;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("INVOKED EQUALS METHOD");
		
		if(obj!=null) {
			System.out.println("PASSING VALUE IS NOT NULL");
			
			if(obj instanceof City) {
				City cast=(City) obj;
				System.out.println("CASTING IS DONE");
				
				String match=cast.getName();
				String match1=cast.getState();
				
				if(this.name.equals(match) && this.state.equals(match1)) {
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
