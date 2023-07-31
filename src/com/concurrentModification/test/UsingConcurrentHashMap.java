package com.concurrentModification.test;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class UsingConcurrentHashMap {

	public static void main(String[] args) {
	ConcurrentHashMap<String, String> chm=new 	ConcurrentHashMap<>();
	chm.put("name", "imran");
	chm.put("email", "imran123@gmail.com");
	chm.put("phone", "7878787878");
	chm.put("address", "blr");
	
	Iterator itr=chm.keySet().iterator();
	while(itr.hasNext()) {
		String value=(String) itr.next();
		System.out.println(value+"\t"+chm.get(value));
		chm.put("sal", "50000");
	}
	

	}

}
