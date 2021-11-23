package com.rakesh.task1;

public class CrudAsusComputerDAO implements AsusComputerDAO{
	
	private ComputerDTO[] dtos=new ComputerDTO[5];
	private int kind=0;
	
	@Override
	public boolean save(ComputerDTO dto) {
		System.out.println("Invoking Save Method");
		if(this.kind<this.dtos.length && dto!=null) {
		this.dtos[this.kind++]=dto;
		return true;
		}
		return false;
	}
	
	@Override
	public ComputerDTO findByOperatingSystem(String os) {
		System.out.println("Invoking search method");
		if(os!=null) {
			for (int match = 0; match < dtos.length; match++) {
				ComputerDTO ref=this.dtos[match];
				if(ref!=null) {
					String tempOS=ref.getOs();
					
					if(tempOS.equals(os)) {
						System.out.println("Operating System is Found");
					}
					else {
						System.out.println("Operating System is not found");
					}
					
				}
			}
		}
		return null;
	}
	
	@Override
	public void displayComputerDetails() {
		System.out.println("Invoking Dispaly Method");
		for (int nut = 0; nut < dtos.length; nut++) {
			ComputerDTO ref=this.dtos[nut];
			if(ref!=null) {
				System.out.println(ref.getOs());
				System.out.println(ref.getProcessor());
				System.out.println(ref.getPrice());
			}
			else {
				System.out.println("Index is value is null");
			}
		}
		
	}


}