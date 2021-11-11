package com.rakesh;

import com.rakesh.overridemethods.Sock;

public class SockScammer {
	public static void main(String[] args) {
		
		
		Sock ref = new Sock();
		ref.setSize('6');
		ref.setPrice(100f);

		Sock ref1 = new Sock();
		ref1.setSize('5');
		ref1.setPrice(90f);

		System.out.println(ref.equals(ref1));
	}
}
