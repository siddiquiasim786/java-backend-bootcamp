package io.javabrains.javabasics;

public class ArrayChallenge {

    static {
        System.out.println("Class just loaded.");
    }

    public int i;

    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int [] numbers = {10,20,30,15,17,45};
        int sum = 0;
        int largest = numbers[0];
        double average = 0;

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for(int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if(numbers.length > 0) {
                if(largest < numbers[i]){
                    largest = numbers[i];
                }
            }
        }
        average = (double) sum/numbers.length;
        System.out.println("sum = " + sum);
        System.out.println("largest = " + largest);
        System.out.println("average = " + average);
    }
}
