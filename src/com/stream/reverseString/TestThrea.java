package com.stream.reverseString;

public class TestThrea implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("running");
	}
	public static void main(String[] args) {
		Thread d = new Thread(new TestThrea());
		d.run();
		d.run();
		d.start();
	}
}

