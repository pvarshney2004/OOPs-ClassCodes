package Array;
import java.util.*;
public class ArrayNextSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        plusOne(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] plusOne(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        arr = new int[arr.length+1];
        arr[0]=1;
        return arr;
    }
}