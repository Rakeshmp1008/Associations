package com.rakesh;
        
import com.rakesh.task1.AsusComputerDAO;
import com.rakesh.task1.AsusComputerStore;
import com.rakesh.task1.ComputerDTO;
import com.rakesh.task1.CrudAsusComputerDAO;

public class ComputerScammer {

	public static void main(String[] args) {

		ComputerDTO dtoref=new ComputerDTO("Windows 7","I5",45000f); 
		AsusComputerDAO computerdao=new CrudAsusComputerDAO();
		
		AsusComputerStore store=new AsusComputerStore(computerdao);
		store.save(dtoref);
		store.findByOS("Windows 7");
		store.displaydetailsOfcomputer();
	}

}
