package io.javabrains.javabasics.homework;

import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[5];
        for (int i = 0; i <number.length; i++) {
            System.out.println("Enter number" + (i+1) + " : ");
            number[i] = sc.nextInt();
        }
        int largest = number[0];
        for (int i = 0; i <number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
          //  System.out.println("Enter number at index " + (i+1) + " of Array number: " + number[i]);
        }
        System.out.println("largest number = " + largest);
    }
}
