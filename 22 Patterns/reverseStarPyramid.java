package patterns;
import java.util.Scanner;

/*
  Reverse Star Pyramid Pattern
  Author: Omkar Shinde
 */

public class reverseStarPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the reverse star pyramid: ");
        int n = sc.nextInt(); 

        // Loop through each row
        for (int i = 0; i < n; i++) {

            // Print spaces before the stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars in a decreasing pattern (odd count)
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            // Move to next line after printing each row
            System.out.println();
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
