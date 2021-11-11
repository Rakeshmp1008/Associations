package com.rakesh.dp;

import com.rakesh.dp.dto.BraceletDTO;

public class Bracelet{

	public static void main(String[] args) {

		BraceletDTO braceletDTO = new BraceletDTO();

		braceletDTO.setColor("GOLD");
		braceletDTO.setMarterial("IRON");
		braceletDTO.setPrice(20.03f);
		braceletDTO.setGemUsed(true);
		braceletDTO.setGifted(false);

		BraceletDTO braceletDTO1 = new BraceletDTO("GOLD", "IRON", 23.02f, true, false);
		BraceletDTO braceletDTO2 = new BraceletDTO("BLACK", "IRON", 23.02f, true, false);
		BraceletDTO braceletDTO3 = new BraceletDTO("RED", "IRON", 23.02f, true, false);
		BraceletDTO braceletDTO4 = new BraceletDTO("RAY", "IRON", 23.02f, true, false);
		BraceletDTO braceletDTO5 = new BraceletDTO("PINK", "IRON", 23.02f, true, false);

		BraceletDTO[] braceref = new BraceletDTO[7];
		braceref[0] = braceletDTO1;
		braceref[1] = braceletDTO1;
		braceref[2] = braceletDTO1;
		braceref[3] = braceletDTO1;
		braceref[6] = braceletDTO1;

		for (int lock = 0; lock < braceref.length; lock++) {

			BraceletDTO ref = braceref[lock];
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getMarterial());
				System.out.println(ref.getPrice());
				System.out.println(ref.isGifted());
				System.out.println(ref.isGemUsed());
			} else {
				System.out.println("invalid");
			}

		}
	}
}
