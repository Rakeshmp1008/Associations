package com.rakesh.dp;

import com.rakesh.dp.dao.BucketDAO;
import com.rakesh.dp.dto.BucketDTO;

public class BucketStarter {

	public static void main(String[] args) {

		BucketDTO dtoref = new BucketDTO();

		dtoref.setColor("RED");
		dtoref.setPrice(100f);
		dtoref.setQuantity(10f);
		dtoref.setSize("BIG");
		dtoref.setCompany(false);
		dtoref.setWeight(300f);

		BucketDTO dtoref1 = new BucketDTO("WHITE", "SMALL", 8f, 300f, 250f, true);
		BucketDTO dtoref2 = new BucketDTO("BLACK", "MEDIUM", 5f, 250f, 200f, false);
		BucketDTO dtoref3 = new BucketDTO("BLUE", "SMALL", 8f, 300f, 250f, true);
		BucketDTO dtoref4 = new BucketDTO("GREEN", "BIG", 8f, 500f, 150f, true);

		BucketDAO daoref = new BucketDAO();
		daoref.addbucket(dtoref);
		daoref.addbucket(dtoref1);
		daoref.addbucket(dtoref2);
		daoref.addbucket(dtoref4);

		daoref.deleteBucket(3);
		daoref.update(3, dtoref3);

		BucketDTO[] refdto = daoref.getDto();

		for (int key = 0; key < refdto.length; key++) {
			BucketDTO ref = refdto[key];
			System.out.println("*************************************************************************************");
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getPrice());
				System.out.println(ref.getQuantity());
				System.out.println(ref.getSize());
				System.out.println(ref.isCompany());
				System.out.println(ref.getWeight());
			} else {
				System.out.println("EMPTY INDEX");
			}
		}

	}

}
