package com.ansJava8.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hello {
	public static void main(String[] args) {
		String input="hello my name is imran and imran ok";
		String[] word=input.split(" ");
		List<String> name=Arrays.asList(word);

    // Find duplicate elements and their occurrence count using Java streams
    Map<String, Long> occurrences = name.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    // Filter and print duplicates
    occurrences.entrySet().stream()
            .filter(entry -> entry.getValue() > 0)
            .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times."));
}
}
