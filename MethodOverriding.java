class Parent{
    String name;

    public void asset(){
        System.out.println("Land+Money");
    }
    public void bike(){
        System.out.println("Splendor");
    }
}

class Child extends Parent{
    String color;
    @Override
     public void bike(){
         System.out.println("Yamaha");
     }
     public void cycle(){
         System.out.println("Atlas");
     }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.asset();
        c.bike();

        Parent p = new Parent();
        p.asset();
        p.bike();
//
//        //PARENT reference holds child reference
        Parent p2 = new Child();   //pahle child class me jayega fir parent
        p2.asset();
        p2.bike();


        // The object 'p2' has access to
        // only the parent's properties.
        // That is, the colour property
        // cannot be accessed from 'p2'

//        method overloading = static polymorphism
//        method overriding = dynamic polymorphism


        


    }
}
