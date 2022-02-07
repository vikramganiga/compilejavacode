package com.perfview.techservice.ds.stack;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String input = "help";
		StringBuffer resultedInput = new StringBuffer("");
		StackChar stackChar = new StackChar();

		for (int i = 0; i < input.length(); i++) {

			if (!stackChar.push(input.charAt(i))) {
				System.out.println("stack is full");
			}

		}
		
		Character result = stackChar.pop();;
		
		while(result != null) {
			
			resultedInput = resultedInput.append(result);
			result = stackChar.pop();
		} 

		if(input.contentEquals(resultedInput)) {
			System.out.println(input +" String is Palindrom of "  +resultedInput );
		}
		else {
			System.out.println(input +" String is not Palindrom of " +resultedInput );
		}
	}

}
