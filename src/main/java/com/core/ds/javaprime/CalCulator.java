package com.core.ds.javaprime;

import java.util.Scanner;

public class CalCulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float firstValue = scanner.nextFloat();
        scanner.nextLine();
        String operator = scanner.next();
        scanner.nextLine();
        float secondValue = scanner.nextFloat();

        System.out.print(" "+ firstValue + " " +operator + " " +secondValue);

        switch (operator) {
            case "+":
                 System.out.println("="+ (firstValue+secondValue));
                break;
             case "-":
                 System.out.println("="+ (firstValue-secondValue));
                break;
             case "/":
                 System.out.println("="+ (firstValue/secondValue));
                break;
             case "*":
                 System.out.println("="+ (firstValue*secondValue));
                break;
            default:
                System.out.println ("invalid value");
                break;
        }

    }
}
