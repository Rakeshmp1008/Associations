package com.rakesh.dp;

public class ArmyDTO {

	private String country;
	private String logo;
	private float noOfSoldiers;
	private float noOfTankers;
	private String headQuater;
	private String recentAttack;
	private String role;

	public ArmyDTO() {
		System.out.println("INVOKING NO ARGG CONSTRUCTOR");
	}

	public ArmyDTO(String country, String logo, float noOfSoldiers, float noOfTankers, String headQuater,
			String recentAttack, String role) {
		super();
		this.country = country;
		this.logo = logo;
		this.noOfSoldiers = noOfSoldiers;
		this.noOfTankers = noOfTankers;
		this.headQuater = headQuater;
		this.recentAttack = recentAttack;
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public float getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(float noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public float getNoOfTankers() {
		return noOfTankers;
	}

	public void setNoOfTankers(float noOfTankers) {
		this.noOfTankers = noOfTankers;
	}

	public String getHeadQuater() {
		return headQuater;
	}

	public void setHeadQuater(String headQuater) {
		this.headQuater = headQuater;
	}

	public String getRecentAttack() {
		return recentAttack;
	}

	public void setRecentAttack(String recentAttack) {
		this.recentAttack = recentAttack;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static void main(String[] args) {

		ArmyDTO armyref = new ArmyDTO();

		armyref.setCountry("INDIA");
		armyref.setHeadQuater("NEW DEHLI");
		armyref.setLogo("*-*-*");
		armyref.setNoOfSoldiers(2500000f);
		armyref.setNoOfTankers(4000f);
		armyref.setRecentAttack("BALKOT");
		armyref.setRole("LAND WARFARE");

		ArmyDTO armyref1 = new ArmyDTO("CHINA", "////", 16000000f, 10000f, "BIJING", "INDIA", "LAND WARFARE");
		ArmyDTO armyref2 = new ArmyDTO("ISREL", "//*-*//", 20000000f, 10000f, "ISREL CAPITAL", "AFHANISTAN",
				"LAND WARFARE");
		ArmyDTO armyref3 = new ArmyDTO("USA", "**", 30000000f, 10000f, "WASHINGTON DC", "ISREL", "LAND WARFARE");
		ArmyDTO armyref4 = new ArmyDTO("GERMANY", "/+/+/", 60000000f, 10000f, "BERLIN", "USA", "LAND WARFARE");
		ArmyDTO armyref5 = new ArmyDTO("RUSSIA", "/*/", 15000000f, 10000f, "BIJING", "INDIA", "LAND WARFARE");

		ArmyDTO[] army = new ArmyDTO[10];
		army[0]=armyref;
		army[1]=armyref5;

		for (int gun = 0; gun < army.length; gun++) {
			ArmyDTO attack = army[gun];
			if (attack != null) {
				System.out.println(attack.getCountry());
				System.out.println(attack.getHeadQuater());
				System.out.println(attack.getLogo());
				System.out.println(attack.getNoOfSoldiers());
				System.out.println(attack.getNoOfTankers());
				System.out.println(attack.getRecentAttack());
				System.out.println(attack.getRole());
			} else {
				System.out.println("INDEX IS EMPTY : ".concat(String.valueOf(gun)));
			}
		}

	}
}
