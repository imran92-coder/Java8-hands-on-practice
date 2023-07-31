package com.jdk8.streams.listSort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateElementFromList {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("imran","ans","imran","hello","danis","tabrez","imran","tabrez");
	
	Map<Object, Long> count=list.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
			//list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
	count.entrySet().forEach(System.out::println);
	}

}
