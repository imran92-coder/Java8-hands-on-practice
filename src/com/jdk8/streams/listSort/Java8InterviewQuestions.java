package com.jdk8.streams.listSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8InterviewQuestions {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(101,"imran",101,"active",2000));
		employeeList.add(new Employee(102,"danish",101,"active",5000));
		employeeList.add(new Employee(103,"tabrez",102,"inactive",6000));
		employeeList.add(new Employee(104,"himanshu",102,"inactive",4000));
		employeeList.add(new Employee(105,"shahid",103,"active",3500));
		employeeList.add(new Employee(106,"aslam",103,"inactive",3500));
		employeeList.add(new Employee(107,"peer",104,"active",3500));
		
		// print employee Details based on dept
		Map<Integer,List<Employee>> sortBaseOndDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepId, Collectors.toList()));
		sortBaseOndDept.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+"------"+entry.getValue());
		});
		
		// print employee count working in each dept
		Map<Integer,Long> coutnEmpBaseOnDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.counting()));
		coutnEmpBaseOnDept.entrySet().forEach(System.out::println);
		
		// print active and inactive status from the list
		long activeCount=employeeList.stream().filter(e->"active".equals(e.getStatus())).count();
		long inActiveCount=employeeList.stream().filter(e->"inactive".equals(e.getStatus())).count();
		System.out.println("Active count:"+activeCount);
		System.out.println("InActive count:"+inActiveCount);
		
		// print max/min salary from the employeeList
		Optional<Employee> maxSalry = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> minSalary=employeeList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("MaxSalry:"+maxSalry+"\t"+"MinSalary:"+minSalary);
	}

}
