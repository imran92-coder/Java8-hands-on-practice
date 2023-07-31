package com.jdk8.stream.map.demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratesMap {

	public static void main(String[] args) {
		Map<Integer, String> vehicles = new LinkedHashMap<>();
		vehicles.put(1, "Cycle");
		vehicles.put(10, "Motor Bike");
		vehicles.put(11, "Car");
		vehicles.put(15, "Bus");
		vehicles.put(18, "Truck");
		//System.out.println(vehicles);
		
		vehicles.entrySet().forEach(e->System.out.println(e.getKey()));
		

	}

}
