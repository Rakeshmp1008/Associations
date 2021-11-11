package com.rakesh.overridemethods;

public class Plant {

	private String name;
	private Boolean alive;
	private Float lifeSpan;

	private enum Type {
		ROSE, JASMINE, HABISCUS
	}

	Type type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(Float lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj != null) {
			System.out.println("Passing value is not null");

			if (obj instanceof Plant) {
				Plant cast = (Plant) obj;
				System.out.println("Casted is done");

				String match = cast.getName();
				Float match1 = cast.getLifeSpan();
				if (this.name.equals(match) && this.lifeSpan.equals(match1)) {
					System.out.println("Matched");
					return true;
				} else {
					System.out.println("Miss Matched");
				}
			}
		}
		return false;
	}

}
