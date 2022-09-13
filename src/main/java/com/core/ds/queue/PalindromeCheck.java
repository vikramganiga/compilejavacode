package com.core.ds.queue;

import com.core.ds.stack.StackChar;

/**
 * Not working solution, StringBuffer compareTo issue
 * 
 * @author vshetty
 *
 */
public class PalindromeCheck {

	public static void main(String[] args) {
		
		String input = "m";
		StringBuffer stackOutput = new StringBuffer("");
		StringBuffer queueOutput = new StringBuffer("");
		StackChar stackChar = new StackChar();
		QueueChar queueChar = new QueueChar();

		for (int i = 0; i < input.length(); i++) {

			if (!stackChar.push(input.charAt(i))) {
				System.out.println("stack is full");
			}
			
			
			if (!queueChar.add(input.charAt(i))) {
				System.out.println("Queue is full");
			}

		}
		
		Character stackResult = stackChar.pop();
		Character queueResult = queueChar.remove();
		
		while(stackResult != null) {
			
			stackOutput = stackOutput.append(stackResult);
			stackResult = stackChar.pop();
		}  
		
		while(queueResult != null) {
			
			queueOutput = queueOutput.append(queueResult);
			queueResult =  queueChar.remove();
		} 
		
		System.out.println("Queue result "  +queueOutput );
		System.out.println("Stack result "  +stackOutput );
		System.out.println("Compare result "  +queueOutput.compareTo(stackOutput) );
		
		if(queueOutput.compareTo(stackOutput) == 0) {
			System.out.println(stackOutput +" String is Palindrom of "  +queueOutput );
		}
		else {
			System.out.println(stackOutput +" String is not Palindrom of " +queueOutput );
		}
		
		if(queueOutput == stackOutput) {
			System.out.println(stackOutput +" String is Palindrom of "  +queueOutput );
		}
		else {
			System.out.println(stackOutput +" String is not Palindrom of " +queueOutput );
		}
	}

}
