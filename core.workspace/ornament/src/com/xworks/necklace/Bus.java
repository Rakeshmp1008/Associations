package com.xworks.necklace;
import static com.xworks.driver.BusDriver.*;
import com.xworks.driver.BusDriver;

public class Bus{

	public static void main(String[] args) {
	
		BusDriver driverref=new BusDriver();
		driverref.setName("Tom Cruise");
		String name=driverref.getName();
		System.out.println(driverref.name); 
		
		driverref.setSalary(100000f);
		float salary=driverref.getSalary();
		System.out.println(driverref.salary);
		celebrate();
	}

}
