import java.util.Scanner;
public class Bubble_Sort {
  public static void BubbleSort(int arr[], int n){
    for(int i=n-1;i>=0;i--){
        int didSwap=0;
        
        for(int j=0;j<=i-1;j++){
            if (arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                didSwap=1;
            }

        }
      if(didSwap==0){
        break;
      }
      System.out.println("runs");
    }
  }

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = input.nextInt();
    int arr[]= new int[n];

    System.out.println("Enter the elements in the array:");
    for(int i=0;i<n;i++){
        arr[i]= input.nextInt();
    }


    BubbleSort(arr,n);

    System.out.println("Sorted Array:");
    for( int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }


  }
    
}
