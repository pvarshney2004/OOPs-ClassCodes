package MiscellaneousQuestions;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextByte();
        CalculateLCM(a,b);
    }

    private static void CalculateLCM(int a, int b) {
        int lcm = a>b ? a : b;
        while(true){
            if(lcm%a==0&&lcm%b==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }

}
