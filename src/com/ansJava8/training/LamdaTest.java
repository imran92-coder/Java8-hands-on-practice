package com.ansJava8.training;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java8  word");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
		
		new Thread(()-> System.out.println("in run method expression")).start();

	}

}
