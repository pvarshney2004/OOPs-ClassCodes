
class test02{
    int y = 12;
    test02(){
        System.out.println("Theek hai");
    }
}

class test01 extends test02{

    private int mob;

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    int x;
    String name;
    public void print(){
        System.out.println("Hey!");
    }
    test01(){
        super();
        this.name = name;
        this.x = x;
    }
    test01(String name, int x){
//        super();
        this(name);  //same class ke constructor ko call karta hai
        this.name = name;
        this.x = x;
    }
    test01(String name){
        System.out.println("kuch nahi");
//        System.out.println(x);
    }
}

public class this_super_practise {
    public static void main(String[] args) {
        test01 t = new test01();
        t.x = 45;
        t.name = "pa";
        System.out.println(t.x);
        System.out.println(t.name);


        test01 t2 = new test01("Prashant",16);

        System.out.println(t2.x);
        System.out.println(t2.name);

    }
}
