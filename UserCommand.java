package com.Calculator;

import java.util.Scanner;

public class UserCommand extends MagicCalculator{

    public static Scanner userInput = new Scanner(System.in);
    public String select = userInput.nextLine();

    public static String selectFunction() {
        System.out.println("Please select a calculator function. Type 'q' to quit. Options are <add, subtract, multiply, divide, square, sqrt, sine, cosine, tangent, factorial>");
        String select = userInput.nextLine();
        return select;
    }


    public static void closeScanner() {
        userInput.close();
    }

    public static int setInt1() {
        int num1 = -1;
        System.out.println("Number One: ");
        String num = userInput.nextLine();
        try {
            num1 = Integer.parseInt(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be an integer");
        }
        return num1;
    }

    public static int setInt2() {
        int num2 = -1;
        System.out.println("Number Two: ");
        String num = userInput.nextLine();
        try {
            num2 = Integer.parseInt(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be an integer");
        }
        return num2;
    }

    public static double setDouble1() {
        double num1 = -1;
        System.out.println("Number One: ");
        String num = userInput.nextLine();
        try {
            num1 = Double.parseDouble(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be a number");
        }
        return num1;
    }

    public static double setDouble2() {
        double num2 = -1;
        System.out.println("Number Two:");
        String num = userInput.nextLine();
        try {
            num2 = Double.parseDouble(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be a number");
        }
        return num2;
    }

    public static long setLong1() {
        long num1 = -1;
        System.out.println("Number One: ");
        String num = userInput.nextLine();
        try {
            num1 = Long.parseLong(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be a number");
        }
        return num1;
    }

    public static long setLong2() {
        long num2 = -1;
        System.out.println("Number Two: ");
        String num = userInput.nextLine();
        try {
            num2 = Long.parseLong(num);
        }
        catch (Exception NumberFormatException) {
            System.out.println("Must be a number");
        }
        return num2;
    }
}



