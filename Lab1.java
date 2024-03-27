
/*1. Create a Java program that acts as a simple calculator. ● The program should prompt the user to enter two numbers and an operator (+, -, *, /). ● Perform the corresponding calculation based on the operator. ● Handle potential exceptions, such as division by zero or invalid operator input. ● Display the result or an appropriate error message.*/ 
package DemoException;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt5ing the user to enter two numbers and an operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Performing the calculation based on the operator
        double result = 0;
        try {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator input");
            }

            // Displaying the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            // Handling exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}
