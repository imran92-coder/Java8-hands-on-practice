package com.jdk8.stream.map.demo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Jane", 30);
        linkedHashMap.put("Bob", 40);

        // Get a list of keys using Java 8
        linkedHashMap.entrySet().stream().forEach(e->System.out.println(e.getKey()));
               
    }
}