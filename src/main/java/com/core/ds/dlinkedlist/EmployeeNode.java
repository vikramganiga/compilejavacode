package com.core.ds.dlinkedlist;

public class EmployeeNode {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private Employee employee;
	
	public EmployeeNode(Employee employee) {
		this.employee=employee;
	}

	public EmployeeNode getHead() {
		return head;
	}

	public void setHead(EmployeeNode head) {
		this.head = head;
	}

	public EmployeeNode getTail() {
		return tail;
	}

	public void setTail(EmployeeNode tail) {
		this.tail = tail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
}
