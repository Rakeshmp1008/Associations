package com.rakesh.task1;

public class AsusComputerStore {
	
	AsusComputerDAO dao;
	
	public AsusComputerStore(AsusComputerDAO dao) {
		this.dao=dao;
	}
	
	public  void save(ComputerDTO cdto) {
		if(cdto!=null) {
			
			boolean found=dao.save(cdto);
			if(found) {
				System.out.println("invoking save method");
			}
			else {
				System.out.println("Not saving");
			}
		}
	}
	
	public void findByOS(String name) {
		if(name!=null) {
			ComputerDTO ref=dao.findByOperatingSystem(name);
			
			if(name!=null) {
				
				System.out.println(ref.getOs());
				System.out.println(ref.getProcessor());
				System.out.println(ref.getPrice());
				
				
			}
			else {
				System.out.println("passing value is null");
			}
			
		}
	}
	
	public void displaydetailsOfcomputer() {
		if(dao!=null) {
			
			dao.displayComputerDetails();
		}
	}

}
