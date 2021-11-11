package com.rakesh.dp.dto;

public class CircusDTO {
	private String owner;
	private Float ticketPrice;
	private Integer noOfAnimals;
	private Integer noOfShows;
	
	public CircusDTO() {
	
	}

	public CircusDTO(String owner, Float ticketPrice, Integer noOfAnimals, Integer noOfShows) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(Integer noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	
	
}

