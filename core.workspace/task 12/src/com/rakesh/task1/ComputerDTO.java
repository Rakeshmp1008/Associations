package com.rakesh.task1;

public class ComputerDTO {
	
	private String os;
	private String Processor;
	private Float price;
	
	public ComputerDTO(String os, String processor, Float price) {
		super();
		this.os = os;
		Processor = processor;
		this.price = price;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	
	
	

}
