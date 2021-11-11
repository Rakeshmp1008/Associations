package com.rakesh.dp.dto;

public class FaceBookApplicationDTO extends ApplicationDTO {

	private String ceoName;
	private String headQuater;
	
	public FaceBookApplicationDTO() {
     
		
	}

	public FaceBookApplicationDTO(String ceoName, String headQuater) {
		super("FaceBook",2.3f,"DAMN GOD","SHIVASAI");	
		this.ceoName = ceoName;
		this.headQuater = headQuater;
		System.out.println("invoked facebook application");
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getHeadQuater() {
		return headQuater;
	}

	public void setHeadQuater(String headQuater) {
		this.headQuater = headQuater;
	}
	
	
}
    