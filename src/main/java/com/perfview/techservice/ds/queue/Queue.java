package com.perfview.techservice.ds.queue;

import java.util.ArrayList;

public class Queue {

	ArrayList<Employee> data = new ArrayList<Employee>();
	private int front;
	private int back;

	public Queue() {
		super();
		front = -1;
		back = -1;
	}

	public boolean add(Employee employee) {
		back++;
		data.add(back, employee);
		return true;

	}

	public Employee remove() {

		if (front == -1 && front >= data.size())
			return null;
		else {
			front++;
			return data.get(front);
		}
	}

}
