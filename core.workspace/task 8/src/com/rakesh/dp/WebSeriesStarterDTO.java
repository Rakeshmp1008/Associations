package com.rakesh.dp;

import com.rakesh.dp.dao.WebSeriesDAO;

import com.rakesh.dp.dto.WebSeriesDTO;

public class WebSeriesStarterDTO {

	public static void main(String[] args) {

		WebSeriesDTO webseriesref = new WebSeriesDTO();

		webseriesref.setName("GOT");
		webseriesref.setCast("ROSE EMILY");
		webseriesref.setNoOfCharacters(1000);
		webseriesref.setRating(9.5f);
		webseriesref.setTotalSeason(8);
		webseriesref.setCurrentSeason(8);

		WebSeriesDTO webseriesref1 = new WebSeriesDTO("VIKINGS", "RAGNAR LOTHBROK", 8, 9.2f, 5, 5);
		WebSeriesDTO webseriesref2 = new WebSeriesDTO("FAMILY MAN", "RAVI", 12, 9.8f, 2, 2);
		WebSeriesDTO webseriesref3 = new WebSeriesDTO("ASUR", "RAKESH", 11, 9.0f, 3, 3);

		WebSeriesDAO daoref = new WebSeriesDAO();
		daoref.addWebSeries(webseriesref);
		daoref.addWebSeries(webseriesref1);
		daoref.addWebSeries(webseriesref2);
		daoref.addWebSeries(webseriesref3);
		
	
		daoref.updateWebSeries(5, webseriesref2);
		daoref.deleteWebSeries(2);

		WebSeriesDTO[] dtoref = daoref.getDto();

		for (int nan = 0; nan < dtoref.length; nan++) {
			WebSeriesDTO ref = dtoref[nan];
			System.err.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getNoOfCharacters());
				System.out.println(ref.getCast());
				System.out.println(ref.getRating());
				System.out.println(ref.getTotalSeason());
				System.out.println(ref.getCurrentSeason());
			} else {
				System.err.println("INVALID");
			}
		}

	}

}