package com.jdk8.streams.listSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindRecordByNameFromList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "imran", 101, "active", 10000));
		list.add(new Employee(102, "ansari", 101, "active", 10000));
		list.add(new Employee(103, "faiz", 101, "active", 10000));
		list.add(new Employee(104, "shahin", 101, "active", 10000));

		// fine the employee with name "imran"
		Stream<Employee> filter = list.stream().filter(emp -> emp.getEmpName().equalsIgnoreCase("faiz"));

		// find the employee with departments

		Optional<Employee> emp = list.stream().filter(e -> e.getEmpName().equalsIgnoreCase("faiz")).findAny();

		if (emp.isPresent()) {
			System.out.println(emp);
		}

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		distinct.stream().forEach(System.out::println);

	}

}
