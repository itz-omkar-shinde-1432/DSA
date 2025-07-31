package patterns;
import java.util.Scanner;
 

public class Symmetry_Star_Pattern {
    public static void symmetry(int n) {
        n = 2 * n;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row < n / 2 && (col < (n / 2 - row) || col >= (n / 2 + row))) {
                    System.out.print("* ");
                } else if (row >= n / 2 && (col <= (row - n / 2) || col >= (n - row + n / 2 - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the symmetry star pattern (n): ");
       int n = input.nextInt();
        symmetry(n);
        input.close();
    }
} 