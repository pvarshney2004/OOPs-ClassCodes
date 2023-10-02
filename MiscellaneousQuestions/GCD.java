package MiscellaneousQuestions;

public class GCD {
    public static void main(String[] args) {
        int num1=17;
        int num2=102;
        while(num2%num1!=0){
            int rem = num2%num1;
            num2=num1;
            num1=rem;
        }
        System.out.println(num1);
    }
}
