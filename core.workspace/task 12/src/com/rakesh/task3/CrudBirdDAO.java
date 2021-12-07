package com.rakesh.task3;

public class CrudBirdDAO implements BirdDAO {

	private BirdDTO[] dtos=new BirdDTO[5];
	private int kill=0;
	
	@Override
	public void save(BirdDTO dto) {
		if(this.kill<this.dtos.length && dto!=null) {
			this.dtos[this.kill++]=dto;
		}
	}
	
	@Override
	public boolean findByName(String name) {
	if(name!=null) {
		for (int bomb = 0; bomb < dtos.length; bomb++) {
			BirdDTO ref=this.dtos[bomb];
			if(ref!=null) {
				
				String tempname=ref.getName();
				
				if(name.equals(tempname)) {
					System.out.println("Name Found" .concat(tempname));
					return true;
				}
				else {
					System.out.println("Name is Not Found");
				}
			}
		}
		
	}
		return false;
	}
	
	@Override
	public void displayDetailsOfBird() {
		for (int match = 0; match < dtos.length; match++) {
			BirdDTO ref=this.dtos[match];
			
			if(ref!=null) {
				System.out.println(ref.getName());
				System.out.println(ref.getOrigin());
				System.out.println(ref.isCanFly());
				System.out.println(ref.getBreed());
				System.out.println(ref.getAge());
				
			}
			else {
				System.out.println("Index value is null ");
			}
		}
		
	}
	
	
}
