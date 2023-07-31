package com.jdk.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		//List of customer object
		
		List<Customer> custList=Arrays.asList(
				
				new Customer("Tom", 30),
				new Customer("Steve", 40),
				new Customer("dev", 20),
				new Customer("Sony", 33),
				new Customer("Afsu", 24)
				);
				
		//Example1: filter-findAny
		
		Customer customer=custList.stream() //convert list to stream                         
		.filter(x->"Tom".equals(x.getName()))//filter on base on Tom
		.findAny()//if it finds then return the list
		.orElse(null);
		System.out.println(customer.getName()+"\t"+customer.getAge());
		
		System.out.println("---------------NUll check");
		//Example2: filter-did not find any Or else
		Customer customer1=custList.stream()
				.filter(x->"imran".equals(x.getName()))
				.findAny()
				.orElse(null);
		System.out.println(customer1);
		
		//Example3: filter-with multiple condition.
		
		Customer customer2=custList.stream()
				.filter(x->"Steve".equals(x.getName()) && 40 == x.getAge())
				.findAny()
				.orElse(null);
		System.out.println(customer2.getName()+"\t"+customer2.getAge());

	}

}
