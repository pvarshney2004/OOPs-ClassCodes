package thisof_superof;

public class Child extends Parent{
    Child(int x){
        super();
        System.out.println(x);
    }

    public static void main(String[] args) {
        Child c = new Child(34);
    }

}
