package io.javabrains.javabasics.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypesExercise {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter person's name:");
            String name = reader.readLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Enter Salary:");
            double salary = Double.parseDouble(reader.readLine());
            System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
        } catch (IOException ioException) {
            System.out.println("An error occurred while trying to read input. Please try again.");
            ioException.printStackTrace();
        } finally {
            try {
                // Close the BufferedReader in the finally block
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}