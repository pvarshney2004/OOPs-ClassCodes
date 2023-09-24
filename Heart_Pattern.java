import java.util.*;
public class Heart_Pattern {
    public static void main(String[] args) {

        //Upper part
        int space=1;
        int star=3;
        int space_2=3;
        int row=1;
        while(row<=2){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
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
            while(p<=star){
                System.out.print("* ");
                p++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;
            space_2-=2;
        }

        //lower part
        int row_2=1;
        int star_2=11;
        int space_3=0;
        while(row_2<=6){
            int i=1;
            while(i<=space_3){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star_2){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            star_2-=2;
            space_3++;
            row_2++;
        }


    }
}