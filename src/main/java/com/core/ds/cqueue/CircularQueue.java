package com.core.ds.cqueue;

/**
 * 
 * Queue
 * 
 * top -->(1 element) A B C rear -->(last element) D
 * 
 * 
 * @author vshetty
 *
 */
public class CircularQueue {

	private int rear;
	private int top;
	private int size;
	private boolean circular;
	private Employee[] queue;

	public CircularQueue() {
		size = 5;
		queue = new Employee[size];
		rear = -1;
		top = -1;
		
		circular = false;

	}

	public boolean add(Employee employee) {

		if (top == -1 && rear == -1) {

			top++;
			rear++;

			queue[top] = employee;

			System.out.println("Queue is empty, first element is inserted at " + top);
			return true;
		}

		if (top < (size-1) && top > -1 && circular == false) {
			
			top++;
			queue[top] = employee;

			System.out.println("Element is inserted at " + top);

			if (top == size) {
				top = 0;
				circular = true;
			}

			return true;
		}

		if (top < (size-1) && circular == true) {

			if (rear == 0) {
				System.out.println("queue is full");
				return false;
			}

			if (top < rear) {
				top++;
				queue[top] = employee;
				

				System.out.println("Element is inserted at " + top);

			} else {
				System.out.println("queue is full");
				return false;
			}
		}

		System.out.println("Queue is in the error state, add failed");
		return false;

	}

	public Employee remove() {
		Employee employee = null;

		if (rear == -1) {
			System.out.println("queue is empty "+ rear);
			return employee;
		}

		if (rear < size && rear > -1) {

			employee = queue[rear];
			queue[top] = null;

			System.out.println("queue is removed, at " + rear);
			rear++;

			if (rear == size & top != -1)
				rear = 0;
			else if( rear == size)
				rear = -1;

			return employee;
		}

		System.out.println("Queue is in the error state, remove failed");
		return employee;
	}

	public void print() {

		System.out.println();
		for (int i = 0; i < size ; i++) {

			Employee employee = queue[i];

			if (employee == null)
				System.out.println(" null ");
			else {
				System.out.println(" " + employee.getName());
			}
		}
		System.out.println();
	}

}
