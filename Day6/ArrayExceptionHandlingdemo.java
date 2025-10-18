import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

           
            int[] numbers = new int[size];

            System.out.println("\nEnter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("\nYour array elements are:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\n\nNow, let's access elements by index.");

           
            char choice;
            do {
                System.out.print("\nEnter the index you want to access: ");
                int index = scanner.nextInt();

                try {
                    System.out.println("Element at index " + index + " = " + numbers[index]);
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Invalid index! Valid range is 0 to " + (size - 1));
                    System.out.println("Exception Message: " + e.getMessage());
                }

                System.out.print("\nDo you want to access another element? (y/n): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        } 
        finally {
            System.out.println("\nProgram executed successfully. Closing resources...");
            scanner.close();
        }
    }
}
