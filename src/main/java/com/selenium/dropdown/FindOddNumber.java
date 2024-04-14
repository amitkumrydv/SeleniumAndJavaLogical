package com.selenium.dropdown;
public class FindOddNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array of numbers
        
        // Iterate through the array to find the first odd number
        for (int number : numbers) {
            if (number % 2 != 0) { // Check if the number is odd
                System.out.println("The first odd number is: " + number);
                break; // Exit the loop once an odd number is found
            }
        }
    }
}
