package com.rakesh.task;


public class ArrayAmazonCartDAO  implements AmazonCartDAO{
	
	private CartDTO[] dtos=new CartDTO[10];
	private int loki=0;
	
	
	@Override
	public boolean save(CartDTO cart) {
		System.out.println("INVOKING SAVE METHOD");
		if(this.loki<this.dtos.length && cart!=null) {
			
			this.dtos[this.loki++]=cart;
			return true;
		}
		return false;
	}
	
	@Override
	public CartDTO findByName(String name) {
		System.out.println("INVOKING SEARCH METHOD");
		if(name!=null) {
			for (int kar = 0; kar < dtos.length; kar++) {
				CartDTO dtoRef=dtos[kar];
				if(dtoRef!=null)
				{
					String tempName=dtoRef.getName();
					
					if(name.equals(tempName)) {
						System.out.println("NAME FOUND");
					}else {
						System.out.println("NAME NOT FOUND");
					}
				}
				
			}
		}
		return null;
	}
	
	@Override
	public void displayAllCartDetails() {
	System.out.println("INVOKING DISPLAY METHOD");
	
	for (int index = 0; index < dtos.length; index++) {
		
		CartDTO ref=dtos[index];
		if(ref!=null) {
			
			System.out.println(ref.getPrice());
			System.out.println(ref.getName());
			System.out.println(ref.getItem());
			System.out.println(ref.getQuantity());
			
		}
		else {
			System.out.println("Index Is null");
		}
	}
		
		
	}

}
