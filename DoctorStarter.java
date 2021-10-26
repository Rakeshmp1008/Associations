package com.rakesh.dp;

import com.rakesh.dp.dao.DoctorDAO;
import com.rakesh.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {

		DoctorDTO dtoref = new DoctorDTO("KUMAR","EYE","VASAN EYE CARE","MALE");
		DoctorDTO dtoref1 = new DoctorDTO("ARJUN","SKIN","SKIN CARE","MALE");
		
		DoctorDAO daoref = new DoctorDAO();
		daoref.create(dtoref);
		daoref.create(dtoref1, 5);
		
		
		daoref.indexOccupied();
		daoref.matchByName("ARJUN");

		DoctorDTO[] refdto = daoref.getDtos();

		for (int click = 0; click < refdto.length; click++) {
			DoctorDTO ref = refdto[click];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getGender());
				System.out.println(ref.getSpecilization());
				System.out.println(ref.getHospitalName());

			}else {
				System.out.println("EMPTY INDEX : ".concat(String.valueOf(click)));
			}
		}

	}
}