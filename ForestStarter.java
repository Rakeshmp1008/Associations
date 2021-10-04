class ForestStarter{

public static void main(String[] kundas){

	Forest foresrref=new Forest("Bandipur","Tiger");
	System.out.println(foresrref.name);
	System.out.println(foresrref.location);
	System.out.println(foresrref.reserved+"\n");
	
	foresrref.state=new State();
	State state=foresrref.state;
	state.name="Karnataka";
	state.noofdistricts=30;
	
	System.out.println(state.name);
	System.out.println(state.noofdistricts+"\n");
	
	state.capital.name="Bengaluru";
	state.capital.population=23568412l;
	state.capital.famousfor="Vidhan Soudh";
	
	System.out.println(state.capital.name);
	System.out.println(state.capital.population);
	System.out.println(state.capital.famousfor);
	
	String fname=foresrref.name;
	System.out.println(fname);
	
	
	
}

}
