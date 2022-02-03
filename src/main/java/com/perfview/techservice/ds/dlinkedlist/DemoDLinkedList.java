package com.perfview.techservice.ds.dlinkedlist;

public class DemoDLinkedList {
	
	public static void main(String args[]) {
		
		Employee employee = new Employee("A");
		
		EmployeeDLinkedList employeeDLinkedList = new EmployeeDLinkedList(employee);
		
		employee = new Employee("B");
		employeeDLinkedList.addFront(employee);
		

		employee = new Employee("C");
		employeeDLinkedList.addFront(employee);
		
		System.out.println("Add Front Works");
		employeeDLinkedList.print();
		
		System.out.println("Delete works");
		employeeDLinkedList.deleteFront();
		employeeDLinkedList.print();
		
		Employee employeeExisting = new Employee("B");
		Employee employeeNew = new Employee("Z");
		
		System.out.println("Add Before works");
		employeeDLinkedList.addBefore(employeeNew,employeeExisting);
		employeeDLinkedList.print();
	
	}

}
