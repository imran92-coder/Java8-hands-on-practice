package com.jdk8.streams.listSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNameFrromList {

	public static void main(String[] args) {
		
		//find duplicate Integer from the list
		List<Integer> list=Arrays.asList(10,15,20,10,98,60,78,98,20);
		
		Set<Integer> collect = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(collect);
		
		//find the Duplicate name from the list
        List<String> list1=Arrays.asList("imran","mohan","faiz","danis","imran","tabrez","danis");
		
		Set<String> collect1 = list1.stream().filter(name->Collections.frequency(list1, name)>1).collect(Collectors.toSet());
		System.out.println(collect1);
		
		//
		List<String> list2=Arrays.asList("imran","khan","imran","tabrez","bhai","tabrez");
		Set<String> duplicateName=list2.stream().filter(n->Collections.frequency(list2,n)>1).collect(Collectors.toSet());
		System.out.println(duplicateName);
	}

}
