package com.rakesh.functionalinterface.lambda.product;

public class ProductScammer {
	public static void main(String[] args) {

		ProductDAO dao=new ProductDAO();
		
		ProductDTO dtoCompare=new ProductDTO("TeaPowder","TajMahal",800f);
		
		ProductDTO found=dao.find((p1,p2)->{
			if(p1.getName().equals(p2.getName()) && p1.getProduct().equalsIgnoreCase(p2.getProduct())){
				return p1;
			}
			return null;
		},dtoCompare);
		
		System.out.println(found);
	}
}
