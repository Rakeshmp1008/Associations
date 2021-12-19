package com.rakesh.functionalinterface.lambda;

public class AmusementParkDTO {
	
	private String name;
	private String ticketPrice;
	private String type;
	
	public AmusementParkDTO() {
			
	}
	
	public AmusementParkDTO(String name, String ticketPrice, String type) {
		super();
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AmusementParkDTO [name=" + name + ", ticketPrice=" + ticketPrice + ", type=" + type + "]";
	}
	
	
	
	
	

}
