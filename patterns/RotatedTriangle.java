package patterns;
import java.util.Scanner;

public class RotatedTriangle {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
    
}
