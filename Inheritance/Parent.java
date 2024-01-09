package Inheritance;

public class Parent {
    int x = 34;
    public void m1(){
        System.out.println("I am in Parent");
    }
    public void m2(int x){
        this.x = x;
        System.out.println(x);
    }

}
