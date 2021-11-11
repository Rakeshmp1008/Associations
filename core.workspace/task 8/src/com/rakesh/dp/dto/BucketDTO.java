package com.rakesh.dp.dto;

public class BucketDTO {
	
	private String color;
	private String size;
	private float quantity;
	private float price;
	private float weight;
	private boolean company;
	
	public BucketDTO() {
		
	}

	public BucketDTO(String color, String size, float quantity, float price, float weight, boolean company) {
		super();
		this.color = color;
		this.size = size;
		this.quantity = quantity;
		this.price = price;
		this.weight = weight;
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isCompany() {
		return company;
	}

	public void setCompany(boolean company) {
		this.company = company;
	}
	
	
	

}
