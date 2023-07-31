package com.imu.exception;

public class Exception_Lab1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("---main started----");
		
		Exception_Lab1 l1=new Exception_Lab1();
		Object obj=l1.clone();
		System.out.println("main completd");
		
	}

}
