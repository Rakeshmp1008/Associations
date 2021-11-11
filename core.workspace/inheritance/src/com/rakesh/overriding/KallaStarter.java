package com.rakesh.overriding;

public class KallaStarter {

	public static void main(String[] args) {

		Kalla kalla=new Kalla("Pablo",50,"Drug Dealer",25);
		System.out.println(kalla.age);
		System.out.println(kalla.name);
		System.out.println(kalla.noOfCases);
		System.out.println(kalla.specialization);
		
		kalla.robbery("VEERAPPAN");
		
		WalletKalla walletKalla=new WalletKalla();
		walletKalla.robbery("bin laden");

		Kalla ref=new WalletKalla();
		ref.robbery("MUTTAPPA RAI");
		

		
	}

}
