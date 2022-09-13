package com.core.ds.dlinkedlist;

public class EmployeeDLinkedList {

	EmployeeNode employeeNode;

	public EmployeeDLinkedList(Employee employee) {
		this.employeeNode = new EmployeeNode(employee);
		this.employeeNode.setEmployee(employee);
	}

	public void addFront(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);

		employeeNode.setTail(this.employeeNode);
		this.employeeNode.setHead(employeeNode);
		this.employeeNode = employeeNode;

	}

	public void deleteFront() {
		if (employeeNode == null || employeeNode.getTail() == null)
			employeeNode = null;
		else {
			this.employeeNode = this.employeeNode.getTail();
			this.employeeNode.setHead(null);
		}
	}

	public void print() {

		EmployeeNode employeeNode = this.employeeNode;
		EmployeeNode employeeNodeBack = null;

		System.out.println("Backwards");
		while (employeeNode != null) {
			System.out.println(employeeNode.getEmployee().getName());
			employeeNodeBack = employeeNode;
			employeeNode = employeeNode.getTail();
		}
		employeeNode = employeeNodeBack;
		System.out.println("farwards");
		do {
			System.out.println(employeeNode.getEmployee().getName());
			employeeNode = employeeNode.getHead();
		} while (employeeNode != null);
	}

	public void addBefore(Employee newEmployee, Employee existingEmployee) {

		EmployeeNode employeeNode = this.employeeNode;
		EmployeeNode employeeNodeBack = null;
		EmployeeNode employeeNodeNew = new EmployeeNode(newEmployee);
		
		while (employeeNode != null) {			
			//System.out.println(employeeNode.getEmployee().getName());
			if ( employeeNode.getEmployee().getName().contentEquals(existingEmployee.getName())) {
				
				if(employeeNodeBack ==  null) {
					//first node
					employeeNode.setHead(employeeNodeNew);
					employeeNodeNew.setTail(employeeNode);
					this.employeeNode = employeeNodeNew;
				}
				else {
					employeeNodeBack.setTail(employeeNodeNew);
					employeeNodeNew.setHead(employeeNodeBack);
					
					employeeNodeNew.setTail(employeeNode);
					employeeNode.setHead(employeeNodeNew);
				}
			}

			employeeNodeBack = employeeNode;
			employeeNode = employeeNode.getTail();
		}
	}

}
