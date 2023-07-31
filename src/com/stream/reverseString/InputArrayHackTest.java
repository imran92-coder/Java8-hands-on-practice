package com.stream.reverseString;

import java.util.Arrays;
import java.util.List;

public class InputArrayHackTest {
	
	
	public static int[] calculateCounter(int[] arr) {
	    int n = arr.length;
	    int counter = 0;
	    int[] result = new int[n];
	    for (int i = 0; i < n; i++) {
	        result[i] = counter;
	        for (int j = 0; j < i; j++) {
	            int diff = Math.abs(arr[i] - arr[j]);
	            if (arr[j] > arr[i]) {
	                counter -= diff;
	            } else {
	                counter += diff;
	            }
	        }
	    }
	    List input=Arrays.asList(result);
	    input.forEach(System.out::println);
	    return result;
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4};
		System.out.println(calculateCounter(arr));

	}

}
