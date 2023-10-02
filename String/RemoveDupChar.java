package String;

import java.util.*;
public class RemoveDupChar {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = "aabacbn";
        String newstr = removeDupChar(str);
        System.out.println(newstr);
    }

    public static String removeDupChar(String str) {
        String newstr="";
        for(int i=0; i<str.length(); i++){
            boolean isDup=false;
            for(int j=0; j<newstr.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                newstr+=str.charAt(i);
            }
        }
        return newstr;
    }
}
