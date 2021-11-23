package com.rakesh.task;

public interface AmazonCartDAO {

	boolean save(CartDTO cart);
	
	CartDTO findByName(String name);
	
	void displayAllCartDetails();
}
