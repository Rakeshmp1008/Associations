package com.rakesh;

import com.rakesh.overridemethods.City;


public class CityScammer {

	public static void main(String[] args) {
		

			City ref=new City("EC","BNG");
			City ref1=new City("EC","BNG");
			
			System.out.println(ref.equals(ref1)); 
		}

	
}
