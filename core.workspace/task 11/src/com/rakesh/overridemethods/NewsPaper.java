package com.rakesh.overridemethods;

public class NewsPaper {

	private String owner;
	private String name;
	
	
	public NewsPaper(String owner, String name) {
		this.owner = owner;
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}


	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("INVOKED EQUALS METHOD");
		
		if(obj!=null) {
			System.out.println("PASSING VALUE IS NOT NULL");
			
			if(obj instanceof NewsPaper) {
				NewsPaper cast=(NewsPaper) obj;
				System.out.println("CASTING IS DONE");
				
				String match=cast.getOwner();
				String match1=cast.getName();
				
				if(this.owner.equals(match) && this.name.equals(match1)) {
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
