package com.rakesh.dp.dao;

import com.rakesh.dp.dto.ApplicationDTO;
import com.rakesh.dp.dto.FaceBookApplicationDTO;
import com.rakesh.dp.dto.InstagramApplicationDTO;

public class ApplicationDAO {
	private ApplicationDTO[] dtos = new ApplicationDTO[10];
	private Integer zee = 0;
	public int n = 0;

	public void save(ApplicationDTO dto) {
		System.out.println("save method inovked");
		if (this.zee < this.dtos.length) {
			this.dtos[this.zee++] = dto;
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println(dto.getCompany());
			System.out.println(dto.getFounder());
			System.out.println(dto.getName());
			System.out.println(dto.getVersion());
		}

			if (dto instanceof FaceBookApplicationDTO) {
				FaceBookApplicationDTO fref = (FaceBookApplicationDTO) dto;

				System.out.println(fref.getName());
				System.out.println(fref.getVersion());
				System.out.println(fref.getCompany());
				System.out.println(fref.getFounder());
				System.out.println(fref.getHeadQuater());
				System.out.println(fref.getCeoName());
			}

				if (dto instanceof InstagramApplicationDTO) {
					InstagramApplicationDTO iref = (InstagramApplicationDTO) dto;

					System.out.println(iref.getName());
					System.out.println(iref.getVersion());
					System.out.println(iref.getCompany());
					System.out.println(iref.getFounder());
					System.out.println(iref.getTotalUsers());
					System.out.println(iref.getLocation());
				}
		
		
	}

	public ApplicationDTO[] searchApplicationByName(String appName) {
		System.out.println("Name Passed : ".concat(appName));
		for (int can = 0; can < dtos.length; can++) {
			ApplicationDTO ref = this.dtos[can];

			if (ref != null) {
				String searchName = ref.getName();
				if (appName.equals(searchName)) {
					System.out.println("Name is found :".concat(searchName));
				} else {
					System.out.println("Name is Not Found");

				}
				return null;

			}
		}
		return null;
	}

}