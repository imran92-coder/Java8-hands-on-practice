package com.concurrentModification.test;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GeneratesCMEUsingMap {

	public static void main(String[] args) {
		Map<String,String> hm=new ConcurrentHashMap<>();
		hm.put("city", "blr");
		hm.put("work", "developer");
		hm.put("salry", "20000");
		hm.put("email", "imran.ans@acc.com");
		Iterator<String> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			Object key=itr.next();
			System.out.println(key+"\t"+hm.get(key));
			hm.put("type", "employee");
		}
		

	}

}
