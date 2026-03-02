package com.zipcodewilmington.scientificcalculator;





/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static int add(int num1, int num2) {
        return num1 + num2;

        //create a class it will look very similiar with this one 
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            //throw new IllegalArgumentException("Cannot divide by zero");
            return 0;
        }
        return num1 / num2;
    }
    public static void main(String[] args) {

        double currentValue = 0;
        boolean running = true; 

        

        

        while(running){
            Console.println("Current value: %s", currentValue);
            String operator = Console.getStringInput("Enter an operator (+, -, *, /) , enter scientific : sqrt, log, sin, cos, tan, or 'exit' to quit:");
            if (operator.equals("exit")) {
                running = false;
            } else {
                double n1 = Console.getDoubleInput("Enter a number");
                double n2 = Console.getDoubleInput("Enter another number"); 
                double result = 0;
                switch (operator) {
                    case "+":
                        result = add((int)n1, (int)n2);
                        break;
                    case "-":
                        result = subtract((int)n1, (int)n2);
                        break;
                    case "*":
                        result = multiply(n1, n2);
                        break;
                    case "/":
                        result = divide(n1, n2);
                        break;
                    case "sqrt":
                        result = ScientificFeatures.squareRoot(n1);
                        break;
                    case "log":
                        result = ScientificFeatures.logarithm(n1);
                        break;
                    case "sin":
                        result = ScientificFeatures.sine(n1);
                        break;
                    case "cos":
                        result = ScientificFeatures.cosine(n1);
                        break;
                    case "tan":
                        result = ScientificFeatures.tangent(n1);
                        break;
                    
                    default:
                        Console.println("Invalid operator");
                        break;

                    }
                
               

                
                currentValue = result;
            }
        }
    }
}

        
    

