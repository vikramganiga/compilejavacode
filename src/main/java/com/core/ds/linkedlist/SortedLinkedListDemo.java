package com.core.ds.linkedlist;

public class SortedLinkedListDemo {

	public static void main(String args[]) {
		
		EmployeSortedLinkedList employeLinkedList = new EmployeSortedLinkedList();
		
		Employee employee = new Employee("A");
		employeLinkedList.addAscendingOrder(employee);
		
		//Adding one more employee
		employee = new Employee("C");
		employeLinkedList.addAscendingOrder(employee);
		

		//Adding one more employee
		employee = new Employee("B");
		employeLinkedList.addAscendingOrder(employee);

		employeLinkedList.display();
		
		//Delete from front
		employeLinkedList.deleteFront();
		
		System.out.println("After deleting the front ");
		employeLinkedList.display();

	}
}
