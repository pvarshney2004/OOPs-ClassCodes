public class TypeCasting {
    public static void main(String[] args) {
        int x = 23;
        long l = x;    //small to big(int to long)
        short s = (short) x;   //big to small

        float f = 12.3f;
        double d = f;

        double d1 = 12.3;
        float f1 = (float)d1;   //big to small


    }
}
