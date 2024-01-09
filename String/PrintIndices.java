package String;

public class PrintIndices {
    public static void main(String[] args) {
        String str = "Hello";
        printIndices(str);

    }
    public static void printIndices(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                System.out.println(i);
            }
        }
    }
}
