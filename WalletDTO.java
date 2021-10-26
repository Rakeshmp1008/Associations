package com.rakesh.dp.dto;

public class WalletDTO {
	private String brand;
	private String material;
	private Float price;
	private Boolean coinCompartment;
	
	public WalletDTO() {
		
	}
	
	public WalletDTO(String brand, String material, Float price, Boolean coinCompartment) {
		
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(Boolean coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
	
	
	

}
