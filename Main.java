package com.Calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userSelection;

        do {
            userSelection = UserCommand.selectFunction();

            if (userSelection.equals("add")) {
                int num1 = UserCommand.setInt1();
                int num2 = UserCommand.setInt2();
                Calculator.addNums(num1, num2);
            } else if (userSelection.equals("subtract")) {
                int num1 = UserCommand.setInt1();
                int num2 = UserCommand.setInt2();
                Calculator.subNums(num1, num2);
            } else if (userSelection.equals("multiply")) {
                int num1 = UserCommand.setInt1();
                int num2 = UserCommand.setInt2();
                Calculator.multiplyNums(num1, num2);
            } else if (userSelection.equals("divide")) {
                int num1 = UserCommand.setInt1();
                int num2 = UserCommand.setInt2();
                Calculator.divideNums(num1, num2);
            } else if (userSelection.equals("square")) {
                int num1 = UserCommand.setInt1();
                Calculator.squareNums(num1);
            } else if (userSelection.equals("sqrt")) {
                double num1 = UserCommand.setDouble1();
                MagicCalculator.squareRoot(num1);
            } else if (userSelection.equals("sine")) {
                double num1 = UserCommand.setDouble1();
                MagicCalculator.sine(num1);
            } else if (userSelection.equals("cosine")) {
                double num1 = UserCommand.setDouble1();
                MagicCalculator.cosine(num1);
            } else if (userSelection.equals("tangent")) {
                double num1 = UserCommand.setDouble1();
                MagicCalculator.tangent(num1);
            } else if (userSelection.equals("factorial")) {
                int num1 = UserCommand.setInt1();
                MagicCalculator.factorial(num1);
            } else if (userSelection.equals("q")) {
                UserCommand.closeScanner();
                System.exit(0);
            } else {
                System.out.println("invalid response, try again.");
            }
            System.out.println();
            System.out.println();

        } while (userSelection != "q");

    }
}



//HELPER CODE

//        System.out.println(Calculator.addNums(5, 10));
//        System.out.println(Calculator.subNums(25, 5));
//        System.out.println(Calculator.multiplyNums(10, 15));
//        System.out.println(Calculator.divideNums(99, 2));
//        System.out.println(Calculator.squareNums(5));

//        System.out.println(MagicCalculator.squareRoot(10));
//        System.out.println(MagicCalculator.sine(37));
//        System.out.println(MagicCalculator.cosine(23));
//        System.out.println(MagicCalculator.tangent(3));
//        System.out.println(MagicCalculator.factorial(5));

//Confirming MagicCalculator class extends Calculator class
//        System.out.println(MagicCalculator.addNums(1,2));



