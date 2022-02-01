package com.perfview.techservice.ds.linkedlist;

public class Demo {

	public static void main(String args[]) {
		
		Employee employee = new Employee("A");
		EmployeLinkedList employeLinkedList = new EmployeLinkedList(employee);
		
		//Adding one more employee
		employee = new Employee("B");
		employeLinkedList.addFront(employee);
		
		//Adding one more employee
		employee = new Employee("C");
		employeLinkedList.addFront(employee);

		employeLinkedList.display();
		
		//Delete from front
		employeLinkedList.deleteFront();
		
		System.out.println("After deleting the front ");
		employeLinkedList.display();

	}
}
