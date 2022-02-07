package com.perfview.techservice.ds.stack;

public class StackChar {

	int top = -1;
	char[] elements = new char[10];

	// push the element to stack
	public boolean push(Character value) {

		if (top == 9) {
			return false;
		}
		top++;
		elements[top] = value;
		return true;
	}

	// remove last pushed element
	public Character pop(){

		if (top == -1) {
			return null;
		}
		Character tmp = elements[top];
		top--;
		return tmp;

	}

}
