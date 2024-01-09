package thisof_superof;
//thisof - current class ke constructor ko call karna (always use inside the constructor
//super of = parent class ke constructor ko call karta hai
public class Test {
    Test(){
        this(10);
        System.out.println("no-args");
    }

    public Test(int i) {

    }
}
