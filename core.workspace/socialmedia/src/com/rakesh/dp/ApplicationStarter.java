package com.rakesh.dp;


import com.rakesh.dp.dao.ApplicationDAO;
import com.rakesh.dp.dto.ApplicationDTO;
import com.rakesh.dp.dto.FaceBookApplicationDTO;
import com.rakesh.dp.dto.InstagramApplicationDTO;


public class ApplicationStarter {

	public static void main(String[] args) {
		
		ApplicationDAO daoref=new ApplicationDAO();
		daoref.save(new ApplicationDTO ("PUBG",1.3f,"KRAFTON","John"));
		daoref.save(new InstagramApplicationDTO(10,"locationa"));
		daoref.save(new FaceBookApplicationDTO("Rakesh","California"));
		
	
		
		

	}  

}
