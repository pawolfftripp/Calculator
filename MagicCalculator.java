package com.Calculator;

import java.io.PrintStream;
import java.lang.Math;

public class MagicCalculator extends Calculator{



    public static PrintStream squareRoot(double num) {
        double num1 = Math.sqrt(num);
        return System.out.printf("The square root of %s is %s", num, num1);
    }

    public static PrintStream sine(double num) {
        double num1 = Math.sin(num);
        return System.out.printf("The value of sin %s is %s", num, num1);
    }

    public static PrintStream cosine(double num) {
        double num1 = Math.cos(num);
        return System.out.printf("The value of cos %s is %s", num, num1);
    }

    public static PrintStream tangent(double num) {
        double num1 = Math.tan(num);
        return System.out.printf("The value of tan %s is %s", num, num1);
    }

    public static PrintStream factorial(int num) {
        long fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return System.out.printf("The factorial of %s is %s", num, fact);
    }

}
