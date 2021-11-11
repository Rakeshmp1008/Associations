package com.rakesh;

import com.rakesh.overridemethods.NewsPaper;
import com.rakesh.overridemethods.Tyre;

public class NewsPaperScammer {

	public static void main(String[] args) {

		NewsPaper ref=new NewsPaper("VIJAY","VIJAY WANI");
		NewsPaper ref1=new NewsPaper("VANDANA","VANDANA WANI");
		
		System.out.println(ref.equals(ref1));
	}

}
