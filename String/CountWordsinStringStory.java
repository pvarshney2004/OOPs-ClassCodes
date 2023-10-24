package String;

public class CountWordsinStringStory {
    public static void main(String[] args) {
        String str = "Welcome! to Mathura, UP";
        int out = CountWords(str);
        System.out.println(out);
    }

    public static int CountWords(String str) {
        //splitting into string array as space delimeter
        String[] words = str.split("\\s+");
        return words.length;
    }
}
