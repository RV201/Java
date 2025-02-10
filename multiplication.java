import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Multiply the two numbers
        double result = num1 * num2;
        
        // Display the result
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
