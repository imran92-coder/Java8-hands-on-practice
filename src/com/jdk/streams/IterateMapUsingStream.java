package com.jdk.streams;

import java.util.Map;
import java.util.TreeMap;

public class IterateMapUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new TreeMap<>();
		map.put("city", "bangalore");
		map.put("name", "imran");
		map.put("email", "amu@gmail.com");
		map.put("subject", "java");
		
		//print the elements of map
		map.entrySet().stream()
		.forEach(e ->System.out.println(e.getKey()+"\t"+e.getValue()));

	}

}
