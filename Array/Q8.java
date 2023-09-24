package Array;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]+" ");
        }


    }
}
