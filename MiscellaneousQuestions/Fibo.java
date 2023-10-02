package MiscellaneousQuestions;
import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print("Series: \n"+n1+" "+n2+" ");
        for(int i=1; i<=(n-2); i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }
}
