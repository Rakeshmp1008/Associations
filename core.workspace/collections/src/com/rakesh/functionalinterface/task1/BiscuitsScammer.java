package com.rakesh.functionalinterface.task1;

import com.rakesh.functionalinterface.StringMatch;

public class BiscuitsScammer {

	public static void main(String[] args) {

		BiscuitDAO daos=new BiscuitDAO();
		
		StringMatch match=new EqualsBiscuits();
		boolean bite=daos.findBiscuits(match, "Parle");
		System.out.println(bite);
		
		StringMatch match1=new EqualsIgnoreCaseBiscuits();
		boolean bite1=daos.findBiscuits(match1, "BRItania");
		System.out.println(bite1);
		
		StringMatch match2=new FindStartsWithBiscuits();
		boolean bite2=daos.findBiscuits(match2, "O");
		System.out.println(bite2);
		
		StringMatch match3=new FindEndsWithBiscuits();
		boolean bite3=daos.findBiscuits(match3, "s");
		System.out.println(bite3);
		
		
		
		
	}

}
