import java.util.*;
public class SwastikaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //n=5
        int star=1;
        int space=n-2;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            if(row==n){
                space=0;
                star=n-1;
            }
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(row==1||row==n){
                k=-(n-2);
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
        }

        int sp1=n-1;
        int sp2=n-2;
        int s1=1;
        int r1=1;
        while(r1<=n-2){
            int i=1;
            while(i<=sp1){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=s1){
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=sp2){
                System.out.print("  ");
                k++;
            }
            int p=1;
            while(p<=s1){
                System.out.print("* ");
                p++;
            }

            System.out.println();
            r1++;
        }

        int s2=n;
        int r2=1;
        while(r2<=1){
            int i=1;
            while(i<=s2){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=n-2){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            r2++;
        }
    }
}
