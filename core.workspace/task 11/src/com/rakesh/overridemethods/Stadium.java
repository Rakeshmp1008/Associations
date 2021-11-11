package com.rakesh.overridemethods;

public class Stadium { // city tyre newspaper

	private String name;
	private String type;

	public Stadium(String name, String type) {
		this.name = name;
		this.type = type;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("INVOKED EQUALS METHOD");
		
		if(obj!=null) {
			System.out.println("PASSING VALUE IS NOT NULL");
			
			if(obj instanceof Stadium) {
				Stadium cast=(Stadium) obj;
				System.out.println("CASTING IS DONE");
				
				String match=cast.getName();
				String match1=cast.getType();
				
			if(this.name.equals(match) && this.type.equals(match1)){
				System.out.println("MATCHED");
				return true;
			} else {
				System.out.println("MISS MATCHED");
			}
		}
		}
		return false;
	
	}
}