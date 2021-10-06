class MovieTicket{
	String moviename;
	String theater;
	float ticketprice;
	int noofseats;
	enum TypeOfTicket{ONLINE,OFFLINE;} 
	TypeOfTicket type;
	
MovieTicket(String moviename,String theater,float ticketprice,int noofseats,
			TypeOfTicket type)
	{
		this.moviename=moviename;
		this.theater=theater;
		this.ticketprice=ticketprice;
		this.noofseats=noofseats;
		this.type=type;
	}
	
void dispalyDetails()
	{
	System.out.println("Invoking Details of MovieTicket");
		System.out.println(this.moviename);
		System.out.println(this.theater);
		System.out.println(this.ticketprice);
		System.out.println(this.noofseats);
		System.out.println(this.type +"\n");
	}
	
void printtTotalPrice()
	{
	System.out.println("Invoking Total Price Of Tickets");
		float totalticketprice=this.ticketprice*this.noofseats;
		System.out.println("Total Price Of Tickets="+totalticketprice +"\n");
	}
	
public static void main(String[] shuntiteas){
	
	MovieTicket ticketref=new MovieTicket("Kotigobba 3","PVR Cinemas",300f,5,TypeOfTicket.ONLINE);
	ticketref.dispalyDetails();
	ticketref.printtTotalPrice();
}
}