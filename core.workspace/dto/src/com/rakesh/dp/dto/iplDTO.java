package com.rakesh.dp.dto;

public class iplDTO {
	
	private String name;
	private Integer noOfPlayers;
	private Integer teamSize;
	private String owner;
	private String sponsor;
	
	public iplDTO() {

	}

	public iplDTO(String name, Integer noOfPlayers, Integer teamSize, String owner, String sponsor) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
	
	
}
