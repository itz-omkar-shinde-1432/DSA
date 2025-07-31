/*• Program Name: Number Triangle Pattern  
• Purpose     : To print a number triangle pattern where each row i contains numbers from 1 to i  
• Example     :  
    1  
    1 2  
    1 2 3  
    ...  
• Author      : Omkar Shinde  
• Date        : July 17, 2025  */
package patterns;
import java.util.Scanner;

public class NumberTrianglePattern {

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
