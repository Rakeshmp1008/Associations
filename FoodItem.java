class FoodItem{
	String name;
	float price;
	String hotelname;
	float quantity;
	enum Type{SPICY,SWEET,TASTY;}
	Type foodtype;
	int rating;
	enum OrderType{ONLINE,OFFLINE;}
	OrderType ordertype;
	
FoodItem(String name,float price,String hotelname,float quantity,Type foodtype,
         int rating,OrderType ordertype)
	{
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
		this.quantity=quantity;
		this.foodtype=foodtype;
		this.rating=rating;
		this.ordertype=ordertype;
	}

void displayDetails()
	{
	System.out.println("Invoking All Details Of FoodItem");
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.hotelname);
		System.out.println(this.quantity);
		System.out.println(this.foodtype);
		System.out.println(this.rating);
		System.out.println(this.ordertype+"\n");
	}
	
void printTotalPrice()
	{
	System.out.println("Invoking Total Price");
		System.out.println("Total Price="+this.price +"\n");
	}
	
void printTotalFoodItemsPrice()
	{
	System.out.println("Invoking Total Food Items Price");
		float totalfooditemsprice=this.price*this.quantity;
		System.out.println("Total Food Items Price="+totalfooditemsprice +"\n");
		
	}
	
void printHotelName()
	{
	System.out.println("Invoking Hotel Name");
		System.out.println(this.hotelname +"\n");
	}
	
void printNameAndPrice()
	{
	System.out.println("Invoking Name And Price");
		System.out.println(this.name);
		System.out.println(this.price +"\n");
	}
	
public static void main(String[] pineapplecakes){
	
	FoodItem foodref=new FoodItem("GheeRice",120f,"Ayodhya",2,Type.TASTY,5,OrderType.OFFLINE);
	foodref.displayDetails();
	foodref.printTotalPrice();
	foodref.printTotalFoodItemsPrice();
	foodref.printHotelName();
	foodref.printNameAndPrice();
}
}