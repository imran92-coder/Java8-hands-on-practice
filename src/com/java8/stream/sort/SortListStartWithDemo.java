package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListStartWithDemo {

	public static void main(String[] args) {
		//sort the list word StartWith "a"
		List<String> list=Arrays.asList("imran","afsana","afsu","imu","adam","farjana_afsu");
		list.stream().filter(emp->emp.startsWith("af"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		// filter odd number and cube it
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		List<Integer> squares =
		    numbers.stream()
		           .filter(n->n%2==0)
		           .map(n -> n * n * n)
		           .collect(Collectors.toList());
		squares.forEach(System.out::println);
		System.out.println("--------------------------------------------------------");
		//filtering cube of even num and for sum of All cubes 
		List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8);
		Integer cubeSumForEvenNum=arr.stream()
		.filter(obj->obj%2==0)
		.map(obj->obj*obj*obj)
		.collect(Collectors.summingInt(value->value));
		System.out.println(cubeSumForEvenNum);
	}

}
