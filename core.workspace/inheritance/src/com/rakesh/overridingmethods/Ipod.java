package com.rakesh.overridingmethods;

public class Ipod {

	private String modelNo;

	@Override
	public String toString() {
		System.out.println("Invoke to string method");
		return "100";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoke HashCode Method");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if (obj != null) {
			System.out.println("value passing is not null");

			if (obj instanceof Ipod) {
				Ipod casted = (Ipod) obj;
				System.out.println("Casting is done");
				
				String checkWith = casted.getModelNo();
				if (this.modelNo.equals(checkWith)) {
					System.out.println("Matched");
					return true;
				} else {
					System.err.println("Missmatched");
				}
			}
		}
		return false;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
