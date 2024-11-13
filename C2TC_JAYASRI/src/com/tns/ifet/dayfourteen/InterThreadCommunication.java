package com.tns.ifet.dayfourteen;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Q obj=new Q();
		
		Producer p1=new Producer(obj); //Producer thread
		Consumer c1=new Consumer(obj); //Consumer thread
					
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
