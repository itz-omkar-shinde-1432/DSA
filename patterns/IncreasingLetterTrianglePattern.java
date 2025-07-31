package patterns;
import java.util.Scanner;

public class IncreasingLetterTrianglePattern {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    
}
