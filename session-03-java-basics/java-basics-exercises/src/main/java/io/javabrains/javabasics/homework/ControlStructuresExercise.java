package io.javabrains.javabasics.homework;

import java.util.Scanner;

public class ControlStructuresExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("zero");
        } else if(number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
