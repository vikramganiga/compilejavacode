package com.perfview.techservice.ds.linkedlist;

public class EmployeLinkedList {

	private EmployeNode employeNode;

	public EmployeLinkedList(Employee employee) {
		employeNode = new EmployeNode(employee);		
	}

	public void addFront(Employee employee) {
		EmployeNode employeNode = new EmployeNode(employee);
		employeNode.setEmployeNode(this.employeNode);
		this.employeNode = employeNode;
	}

	public void display() {
		EmployeNode list = this.employeNode;

		while (list != null) {
			System.out.println("Employee " + list.getEmployee().getName());
			list = list.getEmployeNode();
		}
	}

	public void deleteFront() {
		employeNode = employeNode.getEmployeNode();
	}

}
