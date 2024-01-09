package Inheritance;

public class Child extends Parent{
    public static void main(String[] args) {
        Child c = new Child();
        int x1 = c.x;
        System.out.println(x1);
        c.m1();
        c.m2(23);
    }
}
