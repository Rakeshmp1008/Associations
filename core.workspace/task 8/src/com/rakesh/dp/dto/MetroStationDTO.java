package com.rakesh.dp.dto;

public class MetroStationDTO {

	private String name;
	private String route;
	private boolean elevator;
	private float openTime;
	private float closeTime;

	public MetroStationDTO() {

	}

	public MetroStationDTO(String name, String route, boolean elevator, float openTime, float closeTime) {
		super();
		this.name = name;
		this.route = route;
		this.elevator = elevator;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	public float getOpenTime() {
		return openTime;
	}

	public void setOpenTime(float openTime) {
		this.openTime = openTime;
	}

	public float getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(float closeTime) {
		this.closeTime = closeTime;
	}

}
