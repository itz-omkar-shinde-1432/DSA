package patterns;
import java.util.Scanner;

public class NumberCrownPattern {

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows for the number crown pattern: ");
        int n = sc.nextInt();
        int spaces = 2*(n - 1);

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            spaces -= 2; // Decrease spaces for the next row
            System.out.println();
        }
       

        








    }
    
}
