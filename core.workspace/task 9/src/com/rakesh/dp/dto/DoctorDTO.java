package com.rakesh.dp.dto;

public class DoctorDTO {

	private String name;
	private String specilization;
	private String hospitalName;
	private String gender;
	
	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDTO(String name, String specilization, String hospitalName, String gender) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
