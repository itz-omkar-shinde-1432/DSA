package patterns;
import java.util.Scanner;

public class Alpha_Hill_Pattern {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");

        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }


            char ch = 'A';
            int breakpoint = (2*i+1)/2;

            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch+" ");
                if (breakpoint >= j) ch++;
                else ch--;
            }

            
            System.out.println();
        }


        input.close();
    }
    
}
