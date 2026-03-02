package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    public TestMainApplication() {

        TestMainApplication testMainApplication = new TestMainApplication();

        int sum = testMainApplication.add(5, 3);
        System.out.println("Sum: " + sum);
        
    }

    

    //methods for operators

    public int add(int num1, int num2) {
        return num1 + num2;
        
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public long modulo(long num1, long num2) {
        return num1 % num2;
    } 
}




    
