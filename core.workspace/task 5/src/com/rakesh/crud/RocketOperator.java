package com.rakesh.crud;

import com.rakesh.crud.operator.Rocket;

public class RocketOperator {

	public static void main(String[] args) {
		
		
			Rocket rocketref=new Rocket();
			
			System.out.println(rocketref.getSpeed());
			
			
			rocketref.displayspaceStations();
			rocketref.addspaceStations("ISRO");
			rocketref.addspaceStations("ROSS");
			rocketref.addspaceStations("NASA");
			rocketref.addspaceStations("TIANGONG");
			rocketref.addspaceStations("SLARI");
			rocketref.addspaceStations("SPACELAB");
			rocketref.addspaceStations("SKYLAB");
			
		
	}

}
