package com.tns.ifet.dayeleven.trycatch;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("I am in main method"); 
		int result;
		
		result=TryCatchEx.performDivision(12,0);
		if (result!=0)
			System.out.println("Diviosin is "+result);
		
		System.out.println("------------------------------");
		
		result=TryCatchEx.performDivision(12,3);
		if (result!=0)
			System.out.println("Division is "+result);
		
		System.out.println("------------------------------");
		System.out.println(TryCatchEx.performDivision(12f, 5f));
		
		System.out.println("------------------------------");
		System.out.println(TryCatchEx.performDivision(12f, 0f));
		

	}

}
