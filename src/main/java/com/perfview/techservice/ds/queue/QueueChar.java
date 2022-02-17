package com.perfview.techservice.ds.queue;

public class QueueChar {

	char[] elements = new char[10];
	private int front;
	private int back;

	public QueueChar() {
		super();
		front = -1;
		back = -1;
	}

	public boolean add(Character value) {
		back++;
		elements[back] = value;
		return true;

	}

	public Character remove() {

		if (front > back)
			return null;
		else {
			front++;
			return elements[front];
		}
	}

}
