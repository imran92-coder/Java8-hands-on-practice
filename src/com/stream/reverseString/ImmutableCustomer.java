package com.stream.reverseString;

import java.util.List;

public class ImmutableCustomer {

	public static void main(String[] args) {
		

	}

}

final class Customers{
	private final String custName;
	private final List<Long> phone;
	public Customers(String custName, List<Long> phone) {
		this.custName = custName;
		this.phone = phone;
	}
	public String getCustName() {
		return custName;
	}
	public List<Long> getPhone() {
		return phone;
	}
	
	
	
	
}
