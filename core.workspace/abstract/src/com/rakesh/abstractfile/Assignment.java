package com.rakesh.abstractfile;

public abstract class Assignment {

	private String day;

	public Assignment() {
		System.out.println("Invoked no -arg Assignment");
	}

	public Assignment(String day) {
		System.out.println("Invoked Assignment");
		this.day = day;
		System.out.println(this.day);

	}

	public void doneTask() {
		System.out.println("Invoked Donetask");
		System.out.println("day is :".concat(day));
	}
	public static void dtoTask() {
		System.out.println("Invoked dtoTask");
		
	}
	
	public abstract void cloneTask();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
