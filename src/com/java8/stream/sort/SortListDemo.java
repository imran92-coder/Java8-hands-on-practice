package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.jdk.streams.DataBase;
import com.jdk.streams.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(9);
		
		// Traditional approach to sort a list and reverse sort
		
		/*
		 * Collections.sort(list); //ascending order
		 * Collections.reverse(list); //descending order
		 */
		
		//sort the even number from the list using Java8 stream API
		list.stream().filter(evenNum->evenNum%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		//sort the odd number from the list using Java8 stream API
		list.stream().filter(oddNum->oddNum%2!=0).collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		//sorting the list using Java8 stream API
		
		/*
		 * list.stream().sorted().forEach(System.out::println); //ascending order
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 * //descending order
		 */		 		
		
		List<Employee> employees= DataBase.getEmployee();
		employees.forEach(System.out::println);
		

	}

}
