package com.rakesh.dp.dto;

public class MilkCanDTO {
	private Float quantity;
	private String shape;
	private String color;
	private Float price;
	
	public MilkCanDTO() {
		// TODO Auto-generated constructor stub
	}

	public MilkCanDTO(Float quantity, String shape, String color, Float price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.color = color;
		this.price = price;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
}
