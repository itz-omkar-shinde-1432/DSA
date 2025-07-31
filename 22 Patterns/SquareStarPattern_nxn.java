/*
- Program: SquareStarPattern_nxn
- Description: Prints an n x n square pattern of asterisks (*) based on user input.
- Example:
    Input:
      Enter the size of the square pattern (n): 4
    Output:
      * * * * 
      * * * * 
      * * * * 
      * * * * 
- Usage: Basic pattern printing to understand nested loops and method structure.
- Author: Omkar Shinde
- Package: patterns
*/
package patterns;
import java.util.Scanner;
public class SquareStarPattern_nxn {

    public static void nForest(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the square pattern (n):");
        int n=input.nextInt();
        nForest(n);
        input.close();


    }
}
