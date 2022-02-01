package com.perfview.techservice.ds.dlinkedlist;

public class DemoDLinkedList {
	
	public static void main(String args[]) {
		
		Employee employee = new Employee("A");
		
		EmployeeDLinkedList employeeDLinkedList = new EmployeeDLinkedList(employee);
		
		employee = new Employee("B");
		employeeDLinkedList.addFront(employee);
		

		employee = new Employee("C");
		employeeDLinkedList.addFront(employee);
		
		employeeDLinkedList.print();
		
		employeeDLinkedList.deleteFront();
		employeeDLinkedList.print();
	
	}

}
