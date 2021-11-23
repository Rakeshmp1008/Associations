package com.rakesh.abstractfile;

public class JavaAssignment extends Assignment {
	
	private Integer noOfAssignments;
	
	public JavaAssignment() {
		
	}
	
	public JavaAssignment(Integer noOfAssignment) {
		this.noOfAssignments=noOfAssignment;
	}
	
	@Override
	public void cloneTask() {
		System.out.println("Invoked Override cloneTask");
		
	}
	public static void dtoTask() {
		System.out.println("Invoked DTO Task");
	}

}
