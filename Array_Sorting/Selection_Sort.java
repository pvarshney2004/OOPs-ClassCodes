package Array_Sorting;
import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Before Sorting: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Wait a Second Bro! I am Sorting your array....");
        Sort(arr);
        System.out.println("Array After Sorting: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minidx = MinIdx(arr,i);
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;

        }
    }
    public static int MinIdx(int[] arr, int i){
        int min=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }

}
