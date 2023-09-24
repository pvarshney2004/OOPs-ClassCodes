import java.util.*;
public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        int n = sc.nextInt();
//        System.out.println(n);
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        int[] arr = new int[n]; //initialization of array
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }

 */
        String s = new String("Prashant");

        String s1 = "Abhishek";
        String s2 = "Abhishek";
        String s3 = new String("Abhishek");
        String s4 = new String("Abhishek");
//        System.out.println(s1==s2);    //Address check karta hai
//        System.out.println(s1==s3);
//        System.out.println(s4==s3);

        System.out.println(s1.equals(s2));  //Content check karat hai
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s));
        System.out.println(s1.equals(s4));








    }
}
