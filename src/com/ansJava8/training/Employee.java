package com.ansJava8.training;

public class Employee {
	private String firstname;
	private String lastName;
	private String deptId;
	private String status="active";
	private int salary;
	
	
	
	public Employee(String firstname, String lastName, String deptId, String status, int salary) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastName=" + lastName + ", deptId=" + deptId + ", status="
				+ status + ", salary=" + salary + "]";
	}
	
	
	
}
