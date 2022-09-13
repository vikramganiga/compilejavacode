package com.core.ds.linkedlist;

public class EmployeSortedLinkedList {

	private EmployeNode employeNode;

	public EmployeSortedLinkedList() {
	}

	public void addAscendingOrder(Employee employee) {
		// create node
		EmployeNode employeNodeNew = new EmployeNode(employee);

		// first node and list is empty
		if (this.employeNode == null) {
			this.employeNode = employeNodeNew;
			return;
		}

		// if not first node
		EmployeNode list = this.employeNode;
		EmployeNode lastNode = null;

		while (list != null) {

			if (employeNodeNew.getEmployee().getName().compareTo(list.getEmployee().getName()) > 0) {

				System.out.println(employeNodeNew.getEmployee().getName() + " > " + list.getEmployee().getName());

			} else {

				System.out.println(employeNodeNew.getEmployee().getName() + " < = " + list.getEmployee().getName());
				
				if(lastNode == null){
					employeNodeNew.setEmployeNode(list);
					this.employeNode = employeNodeNew;
				}
				
				lastNode.setEmployeNode(employeNodeNew);
				employeNodeNew.setEmployeNode(list);
				
				break;
			}

			lastNode = list;
			list = list.getEmployeNode();
		}
		
		if(list == null) {
			lastNode.setEmployeNode(employeNodeNew);
		}

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
