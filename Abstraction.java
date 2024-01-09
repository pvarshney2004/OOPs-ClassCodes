abstract class laptop{

    //abstract class can contain both abstract and non-abstract method

    //abstract
    public abstract void screen();
    public abstract void keyboard();
    public abstract void touchpad();
    //non-abstract
    public void n1(){
        System.out.println("abstract class Laptop");
    }


}

class Lenovo extends laptop{
    public void screen(){
        System.out.println("Screen 14-Inch");
    }

     public void keyboard() {

    }

    public void touchpad() {

    }
    public void camera(){
        System.out.println("Click a picture");
    }
}

class asus extends laptop{


    public void screen(){
        System.out.println("show");
    }

    @Override
    public void keyboard() {
        System.out.println("typing");
    }

    @Override
    public void touchpad() {
        System.out.println("mouse");

    }
}
class hi extends asus{
//    if we extends the child of abstract class then also we don't have to implement all method'''
}

abstract class HP extends laptop{
//    if we extends the abstract class and make the child class abstract then we dono't need to implemnet parent methods to child
}
public class Abstraction {
    public static void main(String[] args) {
        asus a = new asus();
        a.screen();
        a.keyboard();
        a.touchpad();
        hi h = new hi();
        h.n1();

        Lenovo lv = new Lenovo();
        lv.camera();
    }

}
