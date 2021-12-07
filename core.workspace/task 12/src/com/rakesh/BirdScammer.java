package com.rakesh;

import com.rakesh.task3.BirdCage;
import com.rakesh.task3.BirdDAO;
import com.rakesh.task3.BirdDTO;
import com.rakesh.task3.CrudBirdDAO;

public class BirdScammer {

	public static void main(String[] args) {
		
		BirdDTO dtoref=new BirdDTO("KingFisher","KF",2,"England",true);
		BirdDAO daoref=new CrudBirdDAO();
		
		BirdCage cage=new BirdCage(daoref);
		
		daoref.save(dtoref);
		daoref.findByName("Heming Bird");
		daoref.displayDetailsOfBird();

	}

}
