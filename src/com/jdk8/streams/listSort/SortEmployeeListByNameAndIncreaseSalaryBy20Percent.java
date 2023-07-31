package com.jdk8.streams.listSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeListByNameAndIncreaseSalaryBy20Percent {

	public static void main(String[] args) {
		List<Employee1> employees=new ArrayList();
		employees.add(new Employee1("imran", 20000));
		employees.add(new Employee1("azam", 70000));
		employees.add(new Employee1("tabrez", 60000));
		employees.add(new Employee1("danis", 30000));
		employees.add(new Employee1("hasan", 50000));
		
		employees.stream().sorted(Comparator.comparing(Employee1::getName))
		.map(emp -> {
			  emp.setSalry(emp.getSalry() *120/100);
			  return emp;
			}).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
class Employee1{
	String name;
	int salry;
	public Employee1(String name, int salry) {
		this.name = name;
		this.salry = salry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalry() {
		return salry;
	}
	public void setSalry(int salry) {
		this.salry = salry;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salry=" + salry + "]";
	}
	
	
	
	
}