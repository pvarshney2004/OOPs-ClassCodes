public class WrapperClass {
    public static void main(String[] args) {

        //Primitive to Wrapper

        //1. Using new keyword
        int x = 10; //Primitive DataType
        Integer i1 = new Integer(x);
        Integer i7 = new Integer(10);
        System.out.println(i1); //10
        System.out.println(i7);

        //2. Using valueOf() method
        int i5 = 20;
        Integer i2 = Integer.valueOf(100);  //valueOf() is a static method because it is called by class name.
        Integer j = new Integer(i5);
        System.out.println(i2 +" "+j); //100 - Wrapper 

        //3. By using autoboxing
        int k =12;
        Integer k1=k;
        System.out.println(k1);
        
        
        //Wrapper to Primitive
        
        //1. By using xxxValue()
        Integer z = 23;
        int abc = z.intValue();
        Float f = 23.44f;
        float f1 = f.floatValue();
        System.out.println(abc); //10
        System.out.println(f1);

        //2. By using Auto-Unboxing
        Integer i4 = 222;
        int ii = i4;
        System.out.println(ii);


        //Wrapper class to String

        //1. using toString method
        Integer c = 23;
        Integer d = 233;
        String s1 = c.toString();
        String s2 = d.toString();
        System.out.println(s1+s2);


        //String to Wrapper

        //1. Using new keyword
        String s3 = "127";
        System.out.println(s3+10);
        Integer i6 = new Integer(s3);       //Using parseInt()
        System.out.println(i6+10);

        //2. using valueOf()
        Integer xx = Integer.valueOf(s3);
        System.out.println(xx);


        //String to primitive
        String s8 = "122";
        byte b1 = Byte.parseByte(s8);
        System.out.println(b1);   //range from -128 to 127
        int i0 = Integer.parseInt(s8);
        System.out.println(i0);


    }
}
//javap java.util.Scanner on cmd to see the command info.