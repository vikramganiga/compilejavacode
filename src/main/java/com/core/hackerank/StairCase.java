package com.core.hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= n; i++) {
            int j = i;
            int b = n-i;
            String result="";
            while (b > 0){
                System.out.print("blank"+b);
                result +=" ";
                b--;
            }
            
            do {
                //System.out.print("#");
                result+="#";
                j--;
            } while (j != 0);
            System.out.println(result);
        }
        

        bufferedReader.close();
    }
}
