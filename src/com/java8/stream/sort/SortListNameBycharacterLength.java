package com.java8.stream.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListNameBycharacterLength {

	public static void main(String[] args) {
		
		//sort list of String by character length
		List<String> names=Arrays.asList("imran","aftaab","danish","tabrezBhai","hi");
		names.stream().sorted((a1,a2)->a2.length()-a1.length()).collect(Collectors
				.toList()).forEach(System.out::println);

	}

}
