package com.rakesh.task3;

public class BirdDTO {
	
	private String name;
	private String breed;
	private Integer age;
	private String origin;
	private boolean canFly;
	
	public BirdDTO(String name, String breed, Integer age, String origin, boolean canFly) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	
	

}
