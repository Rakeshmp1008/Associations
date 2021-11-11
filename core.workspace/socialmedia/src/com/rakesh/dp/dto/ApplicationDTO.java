package com.rakesh.dp.dto;

public class ApplicationDTO {

	private String name;
	private Float version;
	private String company;
	private String founder;

	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(String name, Float version, String company, String founder) {
		super();
		this.name = name;
		this.version = version;
		this.company = company;
		this.founder = founder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getVersion() {
		return version;
	}

	public void setVersion(Float version) {
		this.version = version;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

}