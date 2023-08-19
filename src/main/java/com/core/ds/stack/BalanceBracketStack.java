package com.core.ds.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BalanceBracketStack {
    public static void main(String[] args) throws IOException, StackException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StackGeneric<String> elements;
        String temp;

        int t = Integer.parseInt(bufferedReader.readLine().trim());
        elements = new StackGeneric<String>(t);
        String result = "pass";

        for (int tItr = 0; tItr < t; tItr++) {

            String singleBracket = bufferedReader.readLine();

            if (singleBracket.equals("{") || singleBracket.equals("[") || singleBracket.equals("(")) {
                elements.push(singleBracket);
            } else {
                temp = elements.pop();

                if (temp == null) {
                    result = "failed";
                    break;
                }

                String completeBracket = temp + singleBracket;
                if (completeBracket.equals("{}") || completeBracket.equals("[]") || completeBracket.equals("()")) {
                    continue;
                } else {
                    result = "failed";
                    break;
                }
            }

        }
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
