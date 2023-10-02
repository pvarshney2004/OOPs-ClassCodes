package Array;
import java.util.*;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //length of an array
        int n = sc.nextInt();
        //array declaration
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //idx of the element you want to delete
        int idx = sc.nextInt();
        DeleteElement(arr,idx);
    }
    public static void DeleteElement(int[] arr, int idx){
        int n = arr.length;
        int[] newarr = new int[n-1];
        for(int i=0; i< newarr.length; i++){
            if(i<idx){
                newarr[i]=arr[i];
            }
            else{
                newarr[i]=arr[i+1];
            }
        }
        for(int i=0; i< newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
