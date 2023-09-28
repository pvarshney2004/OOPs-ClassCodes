package String;

public class changeCase {
    public static void main(String[] args) {
        String str = "PrasHaNt";
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                newstr=newstr+Character.toLowerCase(str.charAt(i));
            }
            else{
                newstr=newstr+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(newstr);
    }
}
