import java.util.Scanner;

public class Main {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {  // Validate that the input is an integer
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();  // Consume the invalid input
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();  // Return the valid integer
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();
        
        // Determine if the number is even or odd
        String result = checkEvenOrOdd(number);
        
        // Display the result message
        System.out.println(result);
    }
}
