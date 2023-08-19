package com.core.ds.stack;

public class StackGeneric<T> {

	int top = -1;
	T elements[];

	public StackGeneric(int size) {
		elements = (T[]) new Object[size];
	}

	// push the element to stack
	public void push(T value) throws StackException {

		if (top == 9) {
			throw new StackException("Stack is full");
		}
		top++;
		elements[top] = value;
	}

	// remove last pushed element
	public T pop() throws StackException {

		if (top == -1) {
			throw new StackException("Stack is empty");
		}
		T tmp = elements[top];
		top--;
		return tmp;

	}

	// last element, without removing it
	public T peek() {

		if (top == -1) {
			new StackException("Stack is empty");
		}
		return elements[top];
	}
}
