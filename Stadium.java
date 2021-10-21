package com.rakesh.crud;

public class Stadium {

	private String[] types = new String[4];
	private int play=0;

	public void addtypes(String types) {
		if (play < this.types.length) {
			this.types[this.play++] = types;
		} else {
			System.out.println("ARRAY IS FULL CAN NOT ADD");
		}
	}

	public String[] getTypes() {
		return this.types;
	}

	public void updatetypes(int sport, String sports) {
		if (sport >= 0 && sport < this.types.length) {
			this.types[sport] = sports;
		} else {

			System.out.println("ARRAY IS FULL CAN NOT BE UPDATE");
		}
	}

	public void deletetypes(int sport) {
		if (sport >= 0 && sport < this.types.length) {
			this.types[sport] = null;
		} else {

			System.out.println("ARRAY IS FULL CAN NOT BE DELETED");
		}
	}

	public static void main(String[] args) {

		Stadium game=new Stadium();
		
		
		game.addtypes("CRICKET");
		game.addtypes("FOOTBALL");
		game.addtypes("BASEBALL");
		game.addtypes("HOCKEY");
		game.addtypes("ATHLETICS");
		
		game.deletetypes(0);
		game.updatetypes(2, "RUGBY");
		
		String[] sports=game.getTypes();
		
		for (int S = 0; S < sports.length; S++) {
			String list=sports[S];
			System.out.println(list);
		}
		

	}

}
