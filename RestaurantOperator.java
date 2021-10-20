package com.rakesh.crud;

import com.rakesh.crud.operator.Restaurant;

public class RestaurantOperator {

	public static void main(String[] args) {
		Restaurant foodref=new Restaurant();
		
		System.out.println(foodref.getPlace());
		
		
		foodref.displayNames();
		foodref.addnames("UDUPI HOTEL");
		foodref.addnames("BASVESHWAR");
		foodref.addnames("NIYAZ");
		foodref.addnames("CHINESE");
		foodref.addnames("NORTH INDIAN");
		foodref.addnames("SOUTH INDIAN");
		foodref.addnames("NAVAMI");
		
	}

}
