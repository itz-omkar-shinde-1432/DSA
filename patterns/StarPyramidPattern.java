package patterns;
import java.util.Scanner;
public class StarPyramidPattern {
    Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        StarPyramidPattern pattern = new StarPyramidPattern();
        System.out.print("Enter the number of rows for the star pyramid: ");
        int n = pattern.sc.nextInt();
        pattern.printStarPyramid(n);
    }
    public void printStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
    


    
}
