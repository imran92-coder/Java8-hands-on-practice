package com.ansJava8.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEmpDetailBasedOnDepartIdAndCountEmployee {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("imran", "ansari","Dep-101", "active", 20000));
		empList.add(new Employee("danish","khan", "Dep-101", "active", 30000));
		empList.add(new Employee("tabrez", "hussain", "Dep-101", "active", 40000));
		empList.add(new Employee("aayush","srivas", "Dep-102", "active", 50000));
		empList.add(new Employee("jay", "bhai","Dep-103", "active", 60000));
		empList.add(new Employee("rahul","singh", "Dep-104", "active", 70000));
		
		//To print emp details based on deptId; 
		
		Map<String,List<Employee>> empListBaseDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
		empListBaseDept.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		});
		System.out.println("******************************************************");
		//WAP to print employee count working in each departments
		Map<String,Long> empcount=empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		empcount.entrySet().forEach(entry->{
			System.out.println("Dept "+entry.getKey()+"----------"+entry.getValue());
		});
		
	}

}
