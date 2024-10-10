package com.example;

import java.util.Scanner;

public class App {

    // Conversion factor can vary by institution, here we assume a factor of 9.5 for the conversion
    public static final double CONVERSION_FACTOR = 9.5;

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter their CGPA
        System.out.println("Enter your CGPA (Cumulative Grade Point Average): ");
        
        // Read the CGPA input as a double
        double cgpa = scanner.nextDouble();
        
        // Convert CGPA into percentage using the conversion factor
        double percentage = convertCgpaToPercentage(cgpa);
        
        // Display the percentage result
        System.out.printf("Your percentage is: %.2f%%\n", percentage);
        
        // Closing the scanner
        scanner.close();
    }

    // Method to convert CGPA into percentage
    public static double convertCgpaToPercentage(double cgpa) {
        return cgpa * CONVERSION_FACTOR;
    }
}
