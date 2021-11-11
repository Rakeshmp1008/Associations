package com.rakesh.dp;


public class BusDriverDTO {
	private String name;
	private float salary;
	private boolean dressCode;
	private float height;
	private int kmdrive;
	private String martialStatus;

	public BusDriverDTO() {
		System.out.println("INVOKING NO ARRG CONSTRUCTOR");
	}

	public BusDriverDTO(String name, float salary, boolean dressCode, float height, int kmdrive, String martialStatus) {
		this.name = name;
		this.salary = salary;
		this.dressCode = dressCode;
		this.height = height;
		this.kmdrive = kmdrive;
		this.martialStatus = martialStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isDressCode() {
		return dressCode;
	}

	public void setDressCode(boolean dressCode) {
		this.dressCode = dressCode;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getKmdrive() {
		return kmdrive;
	}

	public void setKmdrive(int kmdrive) {
		this.kmdrive = kmdrive;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public static void main(String[] args) {

		BusDriverDTO busref = new BusDriverDTO();

		busref.setName("VANDANA");
		busref.setSalary(30000f);
		busref.setDressCode(true);
		busref.setKmdrive(500000);
		busref.setHeight(6.0f);
		busref.setMartialStatus("MARRIED");

		BusDriverDTO busref1 = new BusDriverDTO("BASAPPA", 20000f, true, 5.11f, 300000, "UNMARRIED");
		BusDriverDTO busref2 = new BusDriverDTO("MALLAPPA", 25000f, true, 5.9f, 250000, "MARRIED");
		BusDriverDTO busref3 = new BusDriverDTO("VANDAPPA", 35000f, true, 5.10f, 320000, "UNMARRIED");
		BusDriverDTO busref4 = new BusDriverDTO("GOMAPPA", 50000f, true, 5.8f, 500000, "MARRIED");
		BusDriverDTO busref5 = new BusDriverDTO("RAKAPPA", 30000f, true, 6.1f, 150000, "UNMARRIED");
		BusDriverDTO busref6 = new BusDriverDTO("SHIVAPPA", 40000f, true, 5.7f, 450000, "MARRIED");

		BusDriverDTO[] ref = new BusDriverDTO[10];
		
		ref[1]=busref1;
		ref[2]=busref2;

		for (int wund = 0; wund < ref.length; wund++) {
			
			BusDriverDTO driver = ref[wund];
			
			if (driver != null) {

				System.out.println(driver.getHeight());
				System.out.println(driver.isDressCode());
				System.out.println(driver.getKmdrive());
				System.out.println(driver.getSalary());
				System.out.println(driver.getMartialStatus());
				System.out.println(driver.getName());
			} else {
				System.out.println("INDEX IS FULL".concat(String.valueOf(wund)));
			}
		}

	}

}

