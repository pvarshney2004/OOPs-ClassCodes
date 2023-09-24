import java.util.*;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        while (row <= n) {
            int i = 1;
            int ad = n;
            while (i <= star) {

                if (row + i == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(ad + " ");
                }
                ad--;
                i++;

            }
            System.out.println();
            row++;

        }

    }

}
