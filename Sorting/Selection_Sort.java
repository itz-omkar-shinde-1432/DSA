import java.util.Scanner;

public class Selection_Sort {
    public static void SelectionSort(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int miniIndex = i;

            for(int j=i+1; j<=n-1;j++){

                if(arr[j]< arr[miniIndex]){ miniIndex = j;}
            }
            int temp = arr[miniIndex];
            arr[miniIndex] = arr[i];
            arr[i] = temp;

        }
    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        SelectionSort(arr, n);
        
        System.out.println("Sorted array:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}