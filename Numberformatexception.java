/*2. Write a program that takes user input and converts it to an integer using Integer.parseInt(). Handle the NumberFormatException and NullPointerException that might occur during the conversion*/
package DemoException;

import java.util.Scanner;

public class Numberformatexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        String userInput = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(userInput);
            System.out.println("You entered: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Input is null. Please provide a valid input.");
        }
    }
}
