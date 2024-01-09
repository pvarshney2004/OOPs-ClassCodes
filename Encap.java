class abc{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

public class Encap {
    public static void main(String[] args) {
        abc m = new abc();
        m.setX(4);
        System.out.println(m.getX());


    }
}
