package com.imu.exception;

import java.io.IOException;

public class Exception_Lab2 {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
		
		int x=0;
		int res=10/x;
		}catch(ArithmeticException ex1) {
			System.out.println("exception handled in Arithmetic block");
		}catch(Exception ex2) {
			System.out.println("uncheck exception");
		}
		System.out.println("main ensa:");

	}

}
