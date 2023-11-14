package io.javabrains.javabasics.homework;

import java.util.Scanner;

public class OperatorsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        double operation;
        operation = num1 + num2;
        System.out.println("sum = " + operation);
        operation = num1 - num2;
        System.out.println("difference = " + operation);
        operation = num1 * num2;
        System.out.println("multiplication = " + operation);
        operation = num1 / num2;
        System.out.println("division = " + operation);
        operation = num1 % num2;
        System.out.println("modulus = " + operation);
        num1++;
        num1++;
        System.out.println("increment of num1 by 2= " + num1);
        num1--;
        System.out.println("decrement of num1 by 1= " + num1);
    }
}
