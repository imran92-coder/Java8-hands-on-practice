package com.jdk8.streams.listSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findEmployeeDetailsGroupingByDepartmentId {

	public static void main(String[] args) {
		List<Employee> empDetails=new ArrayList<Employee>();
		
		empDetails.add(new Employee(101, "imran", 101, "active", 10000));
		empDetails.add(new Employee(102, "ansari", 102, "active", 10000));
		empDetails.add(new Employee(103, "faiz", 103, "active", 10000));
		empDetails.add(new Employee(104, "shahin", 101, "active", 10000));

		Map<Integer, List<Employee>> collect = empDetails.stream().collect(Collectors.groupingBy(employee->employee.getDepId()));
		collect.entrySet().forEach(System.out::println);
		

	}

}
