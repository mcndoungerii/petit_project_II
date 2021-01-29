package com.company;

public class MMethod {

    public static void main(String[] args) {
        test("Paulo");
        int finalResult = addNum(5,6);
        System.out.println(finalResult);
        System.out.println(fullName("George","The Man"));
        System.out.println(myChar('#'));
        System.out.println("My Boolean is " + myBoolean(true));
        System.out.println("My Float is " +myFloat(1.5f,2.5f));
        System.out.println("Meu double es " + myDouble(1.5,2.5));
        System.out.println("Byte is " + myByte((byte) 4));
        System.out.println("MyShort is " + myShort((short) 347));

    }

    public static void test(String name) {
        System.out.println(name);
    }
    // Adding Return type int
    public static  int addNum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }
    // Return type String
    public static String fullName(String firstName, String lastName) {

        return firstName + " " + lastName;

    }

    //Return Char
    public static char myChar(char a) {
        return a;
    }

    //Return boolean
    public static boolean myBoolean(boolean y) {
        return y;
    }

    //Return float
    public static float myFloat(float c, float d) {
        float res = c * d;
        return res;
    }

    //Return double
    public static  double myDouble(double c, double d) {
        double res = 0.0;
        res = c * d;
        return res;
    }

    //Return byte
    public static byte myByte(byte e) {
        byte res;
        res = (byte) (e * 20);
        return res;

    }

    //Return short
    public static short myShort(short e) {
        short res;
        res = (short) (e * 800);
        return res;

    }

}
