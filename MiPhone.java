class MiPhone{
	String brand;
	float price;
	String color;
	long imeicode;
	Phonepay phonepay;
	
void setBrand(String brand)
	{
	this.brand=brand;
	}

void setPrice(float price)
	{
	this.price=price;
	}
	
void setColor(String color)
	{
	this.color=color;
	}
	
void setImeicode(long imeicode)
	{
	this.imeicode=imeicode;
	}
	
void setPhonepay(Phonepay phonepay)
	{
	this.phonepay=phonepay;
	}
	
public static void main(String[] magas){
	
	MiPhone phoneref=new MiPhone();
	phoneref.setBrand("Xiomi");
	phoneref.setPrice(15000f);
	phoneref.setColor("Black");
	phoneref.setImeicode(26548512484544412l);
	Phonepay phonepay=new Phonepay();
	phoneref.setPhonepay(phonepay);
	phonepay.setCompany("PHONE PE");
	phonepay.setVersion("4.1.12");
	phonepay.setArchitect("John");
	phonepay.setWorking(true);
	System.out.println(phoneref.brand);
	System.out.println(phoneref.price);
	System.out.println(phoneref.color);
	System.out.println(phoneref.imeicode +"\n");
	System.out.println(phonepay.company);
	System.out.println(phonepay.version);
	System.out.println(phonepay.architect);
	System.out.println(phonepay.working);
}
}