package com.perfview.techservice.ds.linkedlist;

public class EmployeNode {

	private EmployeNode next;
	private Employee employee;
	
	
	public EmployeNode( Employee employee) {
		super();
		this.employee = employee;
		this.next = null;
	}

	public EmployeNode getEmployeNode() {
		return next;
	}

	public void setEmployeNode(EmployeNode employeNode) {
		this.next = employeNode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
