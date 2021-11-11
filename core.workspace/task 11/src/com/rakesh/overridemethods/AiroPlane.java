package com.rakesh.overridemethods;

public class AiroPlane {
	
	private String company;
	private String government;
	
	public AiroPlane(String company,String government) {
		this.company=company;
		this.government=government;
	}

	public String getCompany() {
		return company;
	}

	public String getGovernment() {
		return government;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("INVOKED EQUALS METHOD");
		
		if(obj!=null) {
			System.out.println("PASSING VALUE IS NOT NULL");
			
			if(obj instanceof AiroPlane) {
				AiroPlane cast=(AiroPlane) obj;
				System.out.println("CASTING IS DONE");
				
				String match=cast.getCompany();
				String match1=cast.getGovernment();
				
				if(this.company.equals(match) && this.government.equals(match1)) {
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