package com.rakesh.dp.dto;

public class DressCodeDTO {

	enum Size {
		S, M, L, XL, XXL
	};

	private Size size;
	private String material;
	private String color;
	private float price;
	private String gender;

	public DressCodeDTO() {

	}

	public DressCodeDTO(String material, String color, float price, String gender) {

		this.material = material;
		this.color = color;
		this.price = price;
		this.gender = gender;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
