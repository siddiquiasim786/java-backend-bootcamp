package io.javabrains.javabasics.homework;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("num2 = " + num1);
        System.out.print("Enter num1 : ");
        int num2 = sc.nextInt();
        double operation;
        operation = num1 + num2;
        System.out.println("sum = " + operation);
        operation = num1 - num2;
        System.out.println("difference = " + operation);
        operation = num1 * num2;
        System.out.println("product = " + operation);
        operation = num1 / num2;
        System.out.println("quotient = " + operation);
    }
}
