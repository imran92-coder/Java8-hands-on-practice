package com.ansJava8.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 3, 4, 6, 1, 7, 8);
        int targetSum = 9;

        List<List<Integer>> pairs = findPairsWithSum(numbers, targetSum);

        // Print all pairs whose sum is 9
        for (List<Integer> pair : pairs) {
            System.out.println(pair.get(0) + " + " + pair.get(1) + " = " + targetSum);
        }
    }

    public static List<List<Integer>> findPairsWithSum(List<Integer> numbers, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();
        numbers.stream()
                .flatMap(num1 -> numbers.stream()
                        .filter(num2 -> num1 + num2 == targetSum && numbers.indexOf(num1) < numbers.indexOf(num2))
                        .map(num2 -> Arrays.asList(num1, num2)))
                .forEach(pairs::add);
        return pairs;
    }
}