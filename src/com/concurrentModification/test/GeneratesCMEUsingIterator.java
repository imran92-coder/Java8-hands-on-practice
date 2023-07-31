package com.concurrentModification.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeneratesCMEUsingIterator {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(101);
		list.add(104);
		list.add(102);
		list.add(108);
		list.add(105);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Integer value=(Integer)itr.next();
			
			list.add(110);
		}

	}

}
