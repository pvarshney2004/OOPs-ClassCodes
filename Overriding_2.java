
class Animal
{
    public void eat()
    {
        System.out.println("grass");// overridden method.
    }
}

class Monkey extends Animal {
    public void eat()//overriding method.
    {
        System.out.println("fruit");
    }
}

public class Overriding_2 {


        public static void main(String[]args)
        {
            Monkey m1=new Monkey();
            m1.eat();
            Animal a1=new Monkey();
            a1.eat();//This is method overriding
        }

}
