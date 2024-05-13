
package com.mycompany.prog2assignment6;
import java.util.Scanner;

public class Prog2assignment6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        Calculator calculator = new Calculator(n);
        
        System.out.print("How many operations would you like to perform? ");
        int numOfOperations = scanner.nextInt();
        
        for (int i = 0; i < numOfOperations; i++) {
            System.out.println("Choose operation:");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Sum of all numbers");
            System.out.println("4. Average of numbers");
            int choice = scanner.nextInt();
            int result;
            switch (choice) {
                case 1:
                    result = calculator.factorial(n);
                    System.out.println("Factorial of " + n + " is: " + result);
                    break;
                case 2:
                    result = calculator.fibonacci(n);
                    System.out.println("Fibonacci of " + n + " is: " + result);
                    break;
                case 3:
                    result = calculator.sumofAllNumbers(n);
                    System.out.println("Sum of all numbers up to " + n + " is: " + result);
                    break;
                case 4:
                    try {
                        double avg = calculator.average();
                        System.out.println("Average of numbers is: " + avg);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
