package com.jdk8.streams.listSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(6);
		list.add(8);
		list.add(21);
		list.add(11);
		list.add(18);
		Collections.sort(list);

		for (Integer itr : list) {
			System.out.println(itr);
		}
		System.out.println("------------------------------------------------------");
		Collections.reverse(list);
		for (Integer itr : list) {
			System.out.println(itr);
		}

	}

}
