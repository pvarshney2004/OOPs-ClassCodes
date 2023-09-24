import java.util.*;
public class pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
        int n = 10;
        int star=1;
        int space=n-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" \t");
                i++;
            }

            int j=1;
            while(j<=star){
                System.out.print(i+"\t");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star+=2;
        }

    }
}
