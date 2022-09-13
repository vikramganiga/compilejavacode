package com.core.ds.stack;

public class StackDemo {

	public static void main(String args[]) {
		Stack stack = new Stack();
		
		try {
			stack.push(10);
			stack.push(20);
		} catch (StackException e) {
			System.out.println(e.getError());
			e.printStackTrace();
		}
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (StackException e) {
			System.out.println(e.getError());
			e.printStackTrace();
		}
		
	}
}
