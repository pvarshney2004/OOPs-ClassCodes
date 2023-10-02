package Array;
import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //length of an array
        int n = sc.nextInt();
        //array declaration
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //index at which you want to insert element
        int pos = sc.nextInt();
        //element to be inserted
        int x = sc.nextInt();

        insertElement(arr,x,pos);
    }
    private static void insertElement(int[] arr, int x, int pos) {
        int n = arr.length;
        int[] newarr = new int[n+1];
        for(int i=0; i<n+1; i++){
            if (i < pos ) {
                newarr[i] = arr[i];
            }
            else if (i == pos ) {
                newarr[i] = x;
            }
            else {
                newarr[i] = arr[i - 1];
            }
        }
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
