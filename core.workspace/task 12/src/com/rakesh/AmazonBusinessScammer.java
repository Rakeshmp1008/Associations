package com.rakesh;

import com.rakesh.task.AmazonBusiness;
import com.rakesh.task.AmazonCartDAO;
import com.rakesh.task.ArrayAmazonCartDAO;
import com.rakesh.task.CartDTO;

public class AmazonBusinessScammer {

	public static void main(String[] args) {
		
		CartDTO cartRef=new CartDTO("Sony",2,20000f,"Speaker");
		AmazonCartDAO amazonCartDao=new ArrayAmazonCartDAO();
		
		AmazonBusiness business=new AmazonBusiness(amazonCartDao);
		business.saveCart(cartRef);
		business.findByName("tony");
		business.displayCart();
	}

}
