import java.util.*;

public class pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            int length = i;
            if (i > n) {
                length = 2 * n - i;
            }

            for (int j = 1; j <= length; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

}
