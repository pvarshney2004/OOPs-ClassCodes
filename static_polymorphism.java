class Test1{
    public void m1(){
        System.out.println("no-parameter");
    }
    public void m1(int x){
        System.out.println(x);
    }
    public void m1(String y){
        System.out.println(y);
    }
}

public class static_polymorphism {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1();
        t1.m1(2);
        t1.m1("Prashant");
    }
}
