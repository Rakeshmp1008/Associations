package com.rakesh.dp;

public class CraneDTO {

	private String company;
	private float weightCarry;
	private String useing;
	private boolean wheelsContain;

	public CraneDTO() {
		System.out.println("INVOKING NO ARGG CONSTRUCTOR");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getWeightCarry() {
		return weightCarry;
	}

	public void setWeightCarry(float weightCarry) {
		this.weightCarry = weightCarry;
	}

	public String getUseing() {
		return useing;
	}

	public void setUseing(String useing) {
		this.useing = useing;
	}

	public boolean isWheelsContain() {
		return wheelsContain;
	}

	public void setWheelsContain(boolean wheelsContain) {
		this.wheelsContain = wheelsContain;
	}

	public CraneDTO(String company, float weightCarry, String useing, boolean wheelsContain) {
		super();
		this.company = company;
		this.weightCarry = weightCarry;
		this.useing = useing;
		this.wheelsContain = wheelsContain;
	}

	public static void main(String[] args) {

		CraneDTO craneref = new CraneDTO();

		craneref.setCompany("L&T");
		craneref.setUseing("CONSTRUCTION");
		craneref.setWeightCarry(10f);
		craneref.setWheelsContain(true);

		CraneDTO craneref1 = new CraneDTO("HITACHI", 8f, "CONSTRUCTION", true);
		CraneDTO craneref2 = new CraneDTO("ACE", 12f, "CONSTRUCTION", false);
		CraneDTO craneref3 = new CraneDTO("ELESTAR", 7f, "CONSTRUCTION", true);
		CraneDTO craneref4 = new CraneDTO("REVA", 9f, "CONSTRUCTION", false);

		CraneDTO[] material = new CraneDTO[8];
		material[0]=craneref1;
		material[1]=craneref2;

		for (int lift = 0; lift < material.length; lift++) {
			CraneDTO carry = material[lift];
			if (carry != null) {
				System.out.println(carry.getCompany());
				System.out.println(carry.getUseing());
				System.out.println(carry.getWeightCarry());
				System.out.println(carry.isWheelsContain());
			} else {
				System.out.println("INDEX IS EMPTY : ".concat(String.valueOf(lift)));
			}
		}

	}
}
