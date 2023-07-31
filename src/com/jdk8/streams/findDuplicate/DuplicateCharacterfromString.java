package com.jdk8.streams.findDuplicate;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterfromString {

	public static void main(String[] args) {
		String input = "Hello, World!";
        countDuplicateCharacters(input);
    }

    public static void countDuplicateCharacters(String input) {
        Map<Character, Long> charCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for (Map.Entry<Character, Long> entry : charCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

