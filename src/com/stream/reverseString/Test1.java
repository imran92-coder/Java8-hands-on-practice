package com.stream.reverseString;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

public class Test1 {

public static void main(String[] args) {
	BiFunction<String, String, Boolean> biFunction = (x, y) -> x.equals(y);
	System.out.println(biFunction.apply("java8", "java8"));
}

}
