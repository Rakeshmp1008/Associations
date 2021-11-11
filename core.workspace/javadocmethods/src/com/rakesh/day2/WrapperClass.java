package com.rakesh.day2;

public class WrapperClass {
	
	public static void main(String[] args) {
		
	
		
		Integer chappalSize=9;
		 int shoeSize=chappalSize.intValue();
		System.out.println(shoeSize);
		
		Float num=98.256f;
		int conv=num.intValue();
		System.out.println(conv);

		//int
		
		Integer rev=123;
		int rev1=Integer.reverse(1);
		System.out.println(rev1);
		
		Integer lucky=027;
		int num1=Integer.bitCount(07);
		System.out.println(num1);
	
		Integer raki=45854;
		int raki1=Integer.rotateLeft(5, 2);
		System.out.println(raki1);
		
		Integer garuda=1008;
		 garuda=Integer.signum(garuda);
		System.out.println(garuda);
		
		int comp=Integer.compare(2, 2);
		System.out.println(comp);
		
		//float
		
		float man=Float.valueOf(10.08f);
		System.out.println(man);
		
		boolean ans=Float.isNaN(10.08f);
		System.out.println(ans);
		
		boolean can=Float.isInfinite(10.08f);
		System.out.println(can);
		
		float val=Float.max(21,22);
		System.out.println(val);
		
		float val1=Float.parseFloat("1008");
		System.out.println(val1);
		
		//boolean
		
	
		boolean var1=Boolean.getBoolean("");
		System.out.println(var1);
		
		String var3="Rakesh";
		int var2=Boolean.valueOf(var3).compareTo(Boolean.valueOf(var1));
		System.out.println(var2);
		
		boolean var4=Boolean.logicalAnd(can, var1);
		System.out.println(var4);
		
		boolean var5=Boolean.parseBoolean("true");
		System.out.println(var5);
		
		String var6=Boolean.toString(var5);
		System.out.println(var6);
		
		//character
		char[] var8={1,2,3};
		int var7=Character.codePointAt(char[] 2 , 10, 11);
		System.out.println(var7);
		
		
		
		
	}
	
}
