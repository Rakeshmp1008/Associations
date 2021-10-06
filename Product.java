class Product{
	String name;
	String type;
	float price;
	int quantity;
	Vendor vendor=new Vendor();
	
	void displaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	
public static void main(String[] masalachai){

	Product proref=new Product();
	proref.name="HairDryer";
	proref.type="Electronics";
	proref.price=1800f;
	proref.quantity=1;
	proref.displaydetails();
	
	proref.vendor=new Vendor();
	proref.vendor.name="Kattappa";
	proref.vendor.salary=4.5f;
	proref.vendor.displaydetails();
	
	
	
}	
}
