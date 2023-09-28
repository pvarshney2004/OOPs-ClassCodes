package String;

public class CheckEqual {
    public static void main(String[] args) {
        String s1 = "prashant";
        String s2 = "varshney";
        System.out.println(CheckEquals(s1,s2));
    }
    private static boolean CheckEquals(String s1, String s2) {
        if(s1==s2){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)!=s2.charAt(j)){
                    return false;
                }
            }
        }
         return true;
    }
}
