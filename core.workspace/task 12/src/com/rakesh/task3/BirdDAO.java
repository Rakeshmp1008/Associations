package com.rakesh.task3;

public interface BirdDAO {

	public boolean save(BirdDTO dto);
	boolean findByName(String name);
	public void displayDetailsOfBird();
}
