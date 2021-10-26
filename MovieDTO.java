package com.rakesh.dp.dto;

public class MovieDTO {

	private String name;
	private String director;
	private String actor;
	private Float rating;
	
	public MovieDTO() {
		
	}

	public MovieDTO(String name, String director, String actor, Float rating) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}
	
}
