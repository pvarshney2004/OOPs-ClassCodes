import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int space=2*n-2;

        int row=1;
        while(row<=2*n){
            int i=1;
            while(i<=star) {
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
            if(row<=n){
                space-=2;
                star++;
            }
            else{
                space+=2;
                star--;
            }

        }
    }
}
