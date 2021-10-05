class Currency{
	String name;
	float rupeesvalue;
	Country cont=new Country();
	
	void displaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.rupeesvalue);
	}
	
public static void main(String[] kadakchais){

	Currency curref=new Currency();
	curref.name="Brazilian real";
	curref.rupeesvalue=13.23f;
	curref.cont=new Country();
	curref.cont.name="Brazil";
	curref.cont.dialcode=+91;
	curref.displaydetails();
	curref.cont.displaydetails();
}
}