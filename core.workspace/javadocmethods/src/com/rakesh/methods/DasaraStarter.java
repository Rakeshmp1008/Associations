package com.rakesh.methods;

public class DasaraStarter {
	 ;

	public static void main(String[] args) {
		
		
			String name="RAKESH";
			int index=name.indexOf("S");
			//System.out.println(index);
			
			String name1="RAKESH";
			CharSequence sea=name1.subSequence(1, 3);
			//System.out.println(sea);
			
			String comp="JOHN";
			String comp1="JOHN";
			int comparison=comp.compareTo(comp1);
			//System.out.print(comparison);
		
			String prefix="RaKeSh";
			boolean find=prefix.startsWith("RaKeSh");
			//System.out.print(find);

			String num="R";
			int rakesh=Integer.parseInt(num);
			System.out.println(rakesh);
			
}
}
