class TubeLight{
	
	String name="Harshita";
	int wats;
	
	String getName()
	{
		return this.name;
	}
	int getWats()
	{
		return this.wats;
	}
	void setWats(int wats)
	{
		this.wats=wats;
	}
	
public static void main(String[] mars){
	
	TubeLight lightref=new TubeLight();
	String name=lightref.getName();
	System.out.println("Tube light is "+name);
	lightref.setWats(25);
	int wats=lightref.getWats();
	System.out.println("Tube light is "+wats);
	
	
	
	
	
}
}