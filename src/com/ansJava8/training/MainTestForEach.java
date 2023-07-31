package com.ansJava8.training;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Integer> inter=new ArrayList<>(); inter.add(5); inter.add(2);
		 * inter.add(6); inter.add(9); inter.add(12); inter.add(2);
		 */
		
		ArrayList<String> names=new ArrayList<>();
		names.add("afsu");
		names.add("imu");
		names.add("hello");
		names.add("ansu");
		names.add("parveen");
		names.add("farzi");
		names.forEach((name)->System.out.println("UsingForEach: "+names));
		
		
		
		/*
		 * System.out.
		 * println("--------------------------------------------------using iterator interface"
		 * ); Iterator<Integer> itr=inter.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * System.out.
		 * println("--------------------------------------------------using Lambda expression"
		 * ); inter.forEach((n)-> System.out.println(n));
		 */
		
		
		

		
		

	}
	

}
