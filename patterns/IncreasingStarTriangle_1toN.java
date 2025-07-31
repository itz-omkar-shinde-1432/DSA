package patterns;
import java.util.Scanner;
public class IncreasingStarTriangle_1toN {
    public static void function(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        function(n);
        sc.close();
    }
}
