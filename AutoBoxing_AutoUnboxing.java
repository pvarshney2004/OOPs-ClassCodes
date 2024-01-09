public class AutoBoxing_AutoUnboxing {
    public static void main(String[] args) {
        //Autoboxing -> Conversion primitive to Wrapper(automatically)
        int x=10;
        Integer i1=x;

        //AutoUnboxing -> Conversion Wrapper to primitive(automatically)
        Integer i2 = new Integer(100);
        int y = i2;

        Integer i3 = Integer.valueOf(1000);
        int z = i3;
    }
}
