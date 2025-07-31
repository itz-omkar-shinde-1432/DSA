// Package declaration (optional, based on your project structure)
package patterns;

// Importing Scanner class to take input from the user
import java.util.Scanner;

/**
 * This program prints an inverted star triangle pattern.
 * Example for n = 4:
 * * * * 
 * * * 
 * * 
 * *
 */
public class InvertedStarTriangle {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the number of rows
        System.out.print("Enter the number of rows for the inverted star triangle: ");
        int n = sc.nextInt(); // Reading the number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print stars in each row
            // In each row, print (n - i + 1) stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        // Closing the scanner to avoid resource leak
        sc.close();
    }
}
