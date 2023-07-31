package com.jdk.streams;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	public static List<Employee> getEmployee(){
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"imran","it",430000));
		list.add(new Employee(102,"shaf","civil",500000));
		list.add(new Employee(103,"waris","mech",600000));
		list.add(new Employee(104,"danish","cse",700000));
		list.add(new Employee(105,"tabrez","cse",1100000));
		list.add(new Employee(106,"shahid","bsc",300000));
		
		return list;
	}

}
