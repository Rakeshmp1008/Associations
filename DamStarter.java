package com.xworkz.pack2;
import static com.xworkz.pack1.Dam.*;
import com.xworkz.pack1.Dam;

public class DamStarter {

	public static void main(String[] args) {
		
		damOpen();
		
		Dam damref=new Dam();
		damref.setLocation("ALAMATTI");
		String location=damref.getLocation();
		System.out.println(damref.location);

		damref.setCapacity(75);
		float capacity=damref.getCapacity();
		System.out.println(damref.capacity);
		
		
	}
	

}
