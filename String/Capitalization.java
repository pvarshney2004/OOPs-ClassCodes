package String;

public class Capitalization {
    public static void main(String[] args) {
        String str = "prashant";
        if(Character.isLowerCase(str.charAt(0))){
            str=Character.toUpperCase(str.charAt(0))+str.substring(1);
            System.out.println(str);
        }
        else{
            System.out.println(str);
        }
    }
}
