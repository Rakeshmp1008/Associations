package com.xworkz.pack2;

import static com.xworkz.pack1.Excavators.* ;
import com.xworkz.pack1.Excavators ;

public class ExcavatorsStarter {

	public static void main(String[] args) {
			
		Excavators exref=new Excavators("JCB");
		exref.hp=12;
		System.out.println(Excavators.name);
		System.out.println(exref.hp);
		Move();
	}

}
