package String;
import java.util.*;
public class RemoveSpeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String newstr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newstr);

    }
}
