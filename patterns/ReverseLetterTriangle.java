package patterns;
import java.util.Scanner;

public class ReverseLetterTriangle {

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            for( char j='A';j<=('A'+n)-i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
