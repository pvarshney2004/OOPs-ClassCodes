import java.util.*;
public class Pattern_online {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int space=n-1;
        int space_2 = -1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            if(row==n){
                star=2*n-1;
            }
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=space_2){
                System.out.print("  ");
                k++;
            }
            int p=1;
            if(row==1){
                p=2;
            }
            while(p<=star){
                if(row==n){
                    break;
                }
                System.out.print("* ");
                p++;
            }
            System.out.println();
            row++;
            space--;
            space_2+=2;

        }

    }
}
