import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int star = 1;
        int space = 0;
        int row = 1;
        while (row <= 2 * n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }
            star += 2;
            row++;
            space--;
            System.out.println();
        }
    }
}
