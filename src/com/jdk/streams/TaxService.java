package com.jdk.streams;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public static List<Employee> evaluateTaxUser(String input) {
//using if-else condition		
//		if(input.equalsIgnoreCase("tax")) {
//		List<Employee> taxable = DataBase.getEmployee().stream().filter(emp -> emp.getSalary()> 500000).collect(Collectors.toList());
//		taxable.stream().forEach(System.out::println);
//		return taxable;
//		
//	}else {
//		List<Employee> nonTaxable = DataBase.getEmployee().stream().filter(emp -> emp.getSalary()<= 500000).collect(Collectors.toList());
//		nonTaxable.stream().forEach(System.out::println);
//		return nonTaxable;
//		
//	}
//using ternary operator 
		return(input.equalsIgnoreCase("tax"))?
			DataBase.getEmployee().stream().filter(emp -> emp.getSalary()> 500000).collect(Collectors.toList()):
			DataBase.getEmployee().stream().filter(emp -> emp.getSalary()<= 500000).collect(Collectors.toList());
			
	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUser("tax"));
		
	}

}
