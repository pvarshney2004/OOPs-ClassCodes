package MiscellaneousQuestions;

public class PrimeinRange {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        for(int i=start;  i <=end; i++){
            if(i==0 || i==1){
                continue;
            }
            int prime=1;
            for(int j=2; j<=(i/2); j++){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }
            if(prime==1){
                System.out.print(i+" ");
            }

        }
    }
}
