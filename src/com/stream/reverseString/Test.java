package com.stream.reverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
	        names.add("John");
	        names.add("Jane");
	        names.add("Bob");
	        names.add("John");
	        names.add("Alice");
	        names.add("Jane");

	        // Find the duplicate names using Java 8
	       // Set<String> duplicates = names.stream()
	               // .filter(n -> Collections.frequency(names, n) > 1)
	              //  .collect(Collectors.toSet());

	        // Print the duplicate names
	        //System.out.println("Duplicate names: " + duplicates);
	        
	       Set<String> dupName= names.stream().filter(e->Collections.frequency(names, e)>1).collect(Collectors.toSet());
	       System.out.println(dupName);
	        
	}

}
