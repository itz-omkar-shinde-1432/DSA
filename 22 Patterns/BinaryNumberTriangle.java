package patterns;
import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for the binary number triangle: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int start;
            if(i % 2==0){
                start =0;
            }else{
                start =1;
            }
            for(int j=0;j<i;j++){
                System.out.print(start+" ");
                start = 1 - start; // Toggle between 0 and 1
            }
             System.out.println();
        }
    }
    
}
