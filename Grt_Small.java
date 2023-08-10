package quest3;
import java.util.Scanner;

public class Grt_Small {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Create an array to store ten integers

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ten integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Read integers from the user and store them in the array
        }

        int smallest = numbers[0]; // Initialize the smallest value with the first element of the array
        int largest = numbers[0];  // Initialize the largest value with the first element of the array

        // Loop through the array to find the smallest and largest values
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if a smaller value is found
            }
            if (numbers[i] > largest) {
                largest = numbers[i];  // Update largest if a larger value is found
            }
        }

        // Print the smallest and largest values
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);

        scanner.close();
    }
}
