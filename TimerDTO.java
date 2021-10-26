package com.rakesh.dp.dto;

public class TimerDTO {
	private Boolean working;
	private String brand;
	private Boolean digital;
	private Boolean bell;
	
	public TimerDTO() {
		// TODO Auto-generated constructor stub
	}

	public TimerDTO(Boolean working, String brand, Boolean digital, Boolean bell) {
		super();
		this.working = working;
		this.brand= brand;
		this.digital = digital;
		this.bell = bell;
	}

	public Boolean getWorking() {
		return working;
	}

	public void setWorking(Boolean working) {
		this.working = working;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getDigital() {
		return digital;
	}

	public void setDigital(Boolean digital) {
		this.digital = digital;
	}

	public Boolean getBell() {
		return bell;
	}

	public void setBell(Boolean bell) {
		this.bell = bell;
	}
	
}
