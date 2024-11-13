package com.tns.ifet.dayeleven.v1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("the program continues....");
		try{
			int data=100/0;
		}
		finally {
			System.out.println("final");
		}

	}

}
