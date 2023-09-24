import java.util.*;
public class pattern29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int space = n - 1;
        int row = 1;
        int zero = -1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(row + " ");
                j++;
            }
            int k = 1;
            while (k <= zero) {
                System.out.print("0 ");
                k++;
            }
            int a = 1;
            if (row <= a) {
                a = 2;
            }
            while (a <= star) {
                System.out.print(row + " ");
                a++;
            }

            System.out.println();

            space--;
            row++;
            zero += 2;
        }

    }
}
