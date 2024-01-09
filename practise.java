class parent11{
    parent11(int x){
        x=x;
    }
}
class child11 extends parent11{
    child11(){
        super(10);
        System.out.println("Child no");
    }
}

public class practise {
    public static void main(String[] args) {
//        System.out.println("hello");
        child11 c = new child11();
        System.out.println();


    }
}
