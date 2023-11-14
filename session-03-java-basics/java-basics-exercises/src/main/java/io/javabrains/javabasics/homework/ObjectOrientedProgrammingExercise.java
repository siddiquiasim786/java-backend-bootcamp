package io.javabrains.javabasics.homework;

import java.util.Scanner;

public class ObjectOrientedProgrammingExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of  rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter width of  rectangle: ");
        int width = sc.nextInt();
        Rectangle rectangle = new Rectangle();
        System.out.println("area of rectangle = " + rectangle.area(length,width));

    }
}

class Rectangle {
    public static int area(int length, int width) {
        return length*width;
    }
}
