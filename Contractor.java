class Contractor{
	 private String name;
	 private String type;
	 private int licenceno;
	 private String contclass;
	 private int bondyear;
	 
	 String getName()
	 {
		 return this.name;
	 }
	String getType()
	{
		return this.type;
	}
	int getLicenceno()
	{
		return this.licenceno;
	}
	String getContclass()
	{
		return this.contclass;
	}
	int getBondyear()
	{
		return this.bondyear;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void setType(String type)
	{
		this.type=type;
	}
	void setLicenceno(int licenceno)
	{
		this.licenceno=licenceno;
	}
	void setContclass(String contclass)
	{
		this.contclass=contclass;
	}
	void setBondyear(int bondyear)
	{
		this.bondyear=bondyear;
	}
	
public static void main(String[] Earth){
	Contractor contref=new Contractor();
	contref.setName("Rakesh");
	String name=contref.getName();
	System.out.println(name);
	
	contref.setType("Civil");
	String type=contref.getType();
	
	contref.setLicenceno(027);
	int licenceno=contref.getLicenceno();
	
	contref.setContclass("CLASS 1A");
	String contclass=contref.getContclass();
	
	contref.setBondyear(2019);
	int bondyear=contref.getBondyear();
	
	
}
}