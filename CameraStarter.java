package com.rakesh.dp;

import com.rakesh.dp.dao.CameraDAO;
import com.rakesh.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {

		CameraDTO dtoref = new CameraDTO();

		dtoref.setCompany("NIKON");
		dtoref.setCost(45300f);
		dtoref.setPixel(24f);
		dtoref.setType("DSLR");
		dtoref.setWeight(800f);

		CameraDTO dtoref1 = new CameraDTO("CANON", "SLR", 18f, 18000f, 200f);
		CameraDTO dtoref2 = new CameraDTO("SONY", "SLR", 18f, 20000f, 200f);
		CameraDTO dtoref3 = new CameraDTO("SAMSUNG", "SLR", 18f, 21000f, 300f);

		CameraDAO daoref = new CameraDAO();
		daoref.addcamera(dtoref);
		daoref.addcamera(dtoref1);
		daoref.addcamera(dtoref3);

		daoref.deletecamera(2);
		daoref.update(2, dtoref2);

		CameraDTO[] refdto = daoref.getDto();

		for (int key = 0; key < refdto.length; key++) {
			CameraDTO ref = refdto[key];
			System.out.println("*************************************************************************************");
			if (ref != null) {
				System.out.println(ref.getCompany());
				System.out.println(ref.getCost());
				System.out.println(ref.getPixel());
				System.out.println(ref.getType());
				System.out.println(ref.getWeight());

			} else {
				System.out.println("EMPTY INDEX");
			}
		}

	}

}
