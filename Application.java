class Application{
	String name;
	 String version;
	Company comp=new Company();
	
	void displaydetails()
	{
		System.out.println(name);
		System.out.println(version);
	}

	
public static void main(String[] masalateas){
	
	Application app=new Application();
	app.name="PUBG";
	app.version="Android";
	app.displaydetails();
	
	app.comp=new Company();
	app.comp.name="Tencent";
	app.comp.country="China";
	app.comp.ceo="Ma huateng";
	app.comp.cfo="Tony Zhang";
	app.comp.displaydetails();
}
}