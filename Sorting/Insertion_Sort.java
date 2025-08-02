import java.util.Scanner;
public class Insertion_Sort {

    public static void InsertionSort(int arr[],int n){

        for(int i=0;i<=n-1;i++){
                int j=i;
                while(j>0 && arr[j-1]>arr[j]){

                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                


                    j--;

                }
        }
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n= input.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        InsertionSort(arr, n);

        System.out.print("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
