public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 12345;
        int x=n;
        int ans=0;
        while(x>0){
            int rem=x%10;
            ans=(ans*10)+rem;
            x/=10;
        }
        System.out.println(ans);
    }
}
