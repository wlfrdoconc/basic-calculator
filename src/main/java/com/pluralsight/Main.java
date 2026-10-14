package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Ask the user for two numbers to input
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = read.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = read.nextInt();


        // 2. Display the available calculations
        System.out.println("Possible calculatons: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        read.nextLine();

        // 3. Ask the user to select an operation
        System.out.print("Please select an option: ");
        String operation = read.nextLine();

        // 4. Multiply the two numbers
        int multipliedResult = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multipliedResult);

        // 5. Display the equation and result
    }
}