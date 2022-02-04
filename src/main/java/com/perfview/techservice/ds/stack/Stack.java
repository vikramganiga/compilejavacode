package com.perfview.techservice.ds.stack;

public class Stack {

	int top = -1;
	int[] elements = new int[10];

	//push the element to stack
	public void push(int value) throws StackException  {

		if (top == 9) {
			throw  new StackException("Stack is full");
		}
		top++;
		elements[top] = value;
	}

	//remove last pushed element
	public int pop() throws StackException{
		
		if (top == -1) {
			throw new StackException("Stack is empty");
		}
		int tmp= elements[top];
		top--;
		return tmp;
		
	}

	//last element, without removing it
	public int peek() {

		if (top == -1) {
			new StackException("Stack is empty");
		}
		return elements[top];
	}
}
