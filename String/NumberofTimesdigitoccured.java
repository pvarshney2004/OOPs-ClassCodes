package String;
import java.util.*;
public class NumberofTimesdigitoccured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int[] arr = new int[s.length];
        for(int i=0; i<s.length; i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int target = sc.nextInt();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
