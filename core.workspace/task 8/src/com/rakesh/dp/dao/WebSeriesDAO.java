package com.rakesh.dp.dao;

import com.rakesh.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dto = new WebSeriesDTO[10];
	private int india = 0;

	// C R U D
	public void addWebSeries(WebSeriesDTO dto) {
		if (india < this.dto.length && dto != null) {
			this.dto[this.india++] = dto;
		} else {
			System.out.println("Create method is invalid");
		}
	}

	public WebSeriesDTO[] getDto() {
		return dto;
	}

	public void updateWebSeries(int ind, WebSeriesDTO name) {
		if (ind >= 0 && ind < this.dto.length && name != null) {
			this.dto[ind] = name;
		} else {
			System.out.println("UPDATE METHOD IS INVALID");
		}
	}

	public void deleteWebSeries(int mad) {
		if (mad >= 0 && mad < this.dto.length) {
			this.dto[mad] = null;
		} else {
			System.out.println("DELETE METHOD INVALID");
		}
	}
}