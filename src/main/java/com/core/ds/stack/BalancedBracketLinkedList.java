package com.core.ds.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class BalancedBracketLinkedList {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        Character temp;
        String result = "YES";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                       result = "NO";
                    break;
                    }
                  else{
                       temp = stack.pop();
                  };

                if (temp == null) {
                    result = "NO";
                    break;
                }

                String completeBracket = temp + String.valueOf(s.charAt(i));
                if (completeBracket.equals("{}") || completeBracket.equals("[]") || completeBracket.equals("()")) {
                    continue;
                } else {
                    result = "NO";
                    break;
                }
            }
        }

        if(stack.isEmpty())
                result = "YES";
        else    
            result = "NO";

        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int t = Integer.parseInt(bufferedReader.readLine().trim());

            for (int tItr = 0; tItr < t; tItr++) {
                String s = bufferedReader.readLine();

                String result = isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
