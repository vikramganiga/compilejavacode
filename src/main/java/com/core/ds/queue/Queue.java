package com.core.ds.queue;

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

		if (front > back)
			return null;
		else {
			front++;
			return data.get(front);
		}
	}

}
