package com.rakesh;

import com.rakesh.abstractfile.Assignment;
import com.rakesh.abstractfile.JavaAssignment;

public class AssignmentStarter {

	public static void main(String[] args) {

		Assignment tip=new JavaAssignment(10);
		System.out.println(tip.toString());
	}

}
