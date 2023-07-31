package com.jdk8.streams.findDuplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumberFromArray {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,3,4,4,6,7,5,5);
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

	}

}