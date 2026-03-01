package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    

    

    public static void println(String output, Object... args) {
        System.out.printf(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        return scanner.nextLine();

        

        

        
        
    }
    

    public static Integer getIntegerInput(String prompt) {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        println(prompt);
        while (!scanner.hasNextDouble()) {
            println("Invalid input. Please enter a double.");
            scanner.next(); // Consume the invalid input
        }
        double userInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        return userInput;
        
    }
    
        
        
        
    }



