class Curtain{
	private String color;
	private String clothtype;
	private String designtype;
	private String size;
	private String purpose;
	
	String getColor()
	{
		return this.color;
	}
	String getClothtype()
	{
		return this.clothtype;
	}
	String getDesigntype()
	{
		return this.designtype;
	}
	String getSize()
	{
		return this.size;
	}
	String getPurpose()
	{
		return this.purpose;
	}
	
	void setColor(String color)
	{
		this.color=color;
	}
	void setClothtype(String clothtype)
	{
		this.clothtype=clothtype;
	}
	void setDesigntype(String designtype)
	{
		this.designtype=designtype;
	}
	void setSize(String size)
	{
		this.size=size;
	}
	void setPurpose(String Purpose)
	{
		this.purpose=purpose;
	}
	
public static void main(String[] venus){
	Curtain refofcurtain=new Curtain();
	refofcurtain.setColor("VOILET");
	String color=refofcurtain.getColor();
	System.out.println("Curtain Color is "+color);
	
	refofcurtain.setClothtype("Cotton");
	String clothtype=refofcurtain.getClothtype();
	System.out.println("Curtain Cloth is "+clothtype);
	
	refofcurtain.setDesigntype("Flower Design");
	String designtype=refofcurtain.getDesigntype();
	System.out.println("Curtain Design is "+designtype);
	
	refofcurtain.setSize("6 x 6");
	String size=refofcurtain.getSize();
	System.out.println("Curtain Size is "+size);
	
	refofcurtain.setPurpose("Windows");
	String purpose=refofcurtain.getPurpose();
	System.out.println("Curtain Purpose is "+purpose);
	
	
	
}
}