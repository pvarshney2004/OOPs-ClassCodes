class Test{
    public int sum(){
        return 0;
    }
    public int sum(int x, int y){
        return x+y;
    }
    public float sum(float a, float b){
        return a+b;
    }
    public void m1(){
        System.out.println("no-parameter");
    }
    public void m1(int x){
        System.out.println(x);
    }
    public void m1(float y){
        System.out.println(y);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        int a = 2;
        int b = 4;
        System.out.println(t.sum(a,b));
        t.m1(1);
        t.m1(2.3f);
        t.m1();
    }
}
