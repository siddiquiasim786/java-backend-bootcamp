package io.javabrains.javabasics.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("the number of vowels in the string: " + printVowelsInString(str));
    }
    public static int printVowelsInString(String str) {
        // Define an ArrayList of vowels
        ArrayList<Character> vowelsList = new ArrayList<>();

        vowelsList.add('a');
        vowelsList.add('e');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('u');

        int count = 0;
        char[] charArray= str.toCharArray();
        for (char ch : charArray) {
            if(vowelsList.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
