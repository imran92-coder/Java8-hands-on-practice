package com.jdk8.streams.findDuplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateElementFromList {

	public static void main(String[] args) {
		//count DUplicate names from the given List using java8
		List<String> list = Arrays.asList("imran", "ans", "imran", "hello", "danis", "tabrez", "imran", "tabrez");
		//Map<Object, Long> count = list.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		Map<Object, Long> count1=list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
		count1.entrySet().forEach(System.out::println);

		// Count duplicate number from the given list using java8
		List<Integer> num = Arrays.asList(1, 3, 3, 5, 4, 5, 5, 7, 6, 4, 8, 7, 8, 9);
		System.out.println("this count is for Integer Arrays");
		Map<Integer, Long> collect = num.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		collect.entrySet().forEach(System.out::println);

	}

}
