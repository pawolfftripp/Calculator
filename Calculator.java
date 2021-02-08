package com.Calculator;

import java.io.PrintStream;

public class Calculator {


    public static PrintStream addNums(int num1, int num2) {
        int returnNum = num1 + num2;
        return System.out.printf("The sum of %s and %s is %s", num1, num2, returnNum);
    }

    public static PrintStream subNums(int num1, int num2) {
        int returnNum = num1 - num2;
        return System.out.printf("The result of %s and %s is %s ", num1, num2, returnNum);
    }

    public static PrintStream multiplyNums(int num1, int num2) {
        int returnNum = num1 * num2;
        return System.out.printf("The product of %s and %s is %s ", num1, num2, returnNum);
    }

    public static PrintStream divideNums(int num1, int num2) {
        int returnNum = 0;
        if (num2 == 0) {
            System.out.println("Cannot divide by Zero!");
        } else {
            returnNum = num1 / num2;
        }
        return System.out.printf("The quotient of %s and %s is %s ", num1, num2, returnNum);
    }

    public static PrintStream squareNums(int num1) {
        int returnNum = num1 * num1;
        return System.out.printf("The square of %s is %s ", num1, returnNum);
    }
}
