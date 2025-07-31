package patterns;
import java.util.Scannar;
import java.util.Scanner;

public class Alpha_Triangle_Pattern {
public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=0;i<n;i++){
        for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
              
              System.out.print(ch + " ");
          }
        System.out.println();
        }


}
}

