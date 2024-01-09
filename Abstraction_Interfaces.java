interface Car{
    void windows();
    void tyres();
    void seatbelt();
}

class nano implements Car{
    @Override
    public void windows(){
        System.out.println("Khidki metal ki");
    }

    @Override
    public void tyres() {
        System.out.println("Tubeless tyres");
    }

    @Override
    public void seatbelt() {
        System.out.println("Leather wali seatbelt");
    }

}

public class Abstraction_Interfaces {
    public static void main(String[] args) {
        nano n = new nano();
        n.seatbelt();
        n.tyres();
        n.windows();
    }
}
