package Array;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println("Odd"+arr[i]);
            }
            else{
                System.out.println("Even"+arr[i]);
            }
        }
    }
}
