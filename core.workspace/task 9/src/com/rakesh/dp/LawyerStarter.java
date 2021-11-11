package com.rakesh.dp;

import com.rakesh.dp.dao.LawyerDAO;
import com.rakesh.dp.dto.LawyerDTO;

public class LawyerStarter {

	public static void main(String[] args) {

		LawyerDTO dtoref = new LawyerDTO("MALLIKARJUN", "LLB phd", 5f, "MALE", 35, "HIGH COURT", 30, 5);
		LawyerDTO dtoref1 = new LawyerDTO("GOMATESH", "LLB law", 6f, "MALE", 40, "SUPREME COURT", 28, 10);
		LawyerDTO dtoref2 = new LawyerDTO("VANDANA", "LLB vada", 10f, "FEMALE", 35, "DISTRICT COURT", 21, 6);

		LawyerDAO daoref = new LawyerDAO();
		daoref.create(dtoref2);
		daoref.getExpByName("VANDANA");
		daoref.getQualificationByName("VANDANA");

		LawyerDTO[] refdto = daoref.getDtos();

		for (int urus = 0; urus < refdto.length; urus++) {
			LawyerDTO ref = refdto[urus];
			if (ref != null) {
				System.out.println(ref.getExperience());
				System.out.println(ref.getQualification());
			} else {
				System.out.println("EMPTY INDEX");
			}
		}
	}

}
