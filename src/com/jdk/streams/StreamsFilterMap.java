package com.jdk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<Customer> custList = Arrays.asList(
				new Customer("Tom", 30), 
				new Customer("Steve", 40), 
				new Customer("dev", 20), 
				new Customer("Sony", 33),
				new Customer("Afsu", 24));

		String name = custList.stream()
				.filter(x -> "Sony".equals(x.getName()))
				.map(Customer::getName).findAny()
				.orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------------------------");
		//print All names for the list
	List<String> allCustName=	custList.stream()
		.map(Customer::getName)
		.collect(Collectors.toList());
	
	allCustName.forEach(System.out::println);
	
		

	}

}
