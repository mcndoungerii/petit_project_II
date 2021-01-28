package com.company;

public class MMethod {

    public static void main(String[] args) {
        test("Paulo");
        addNum(5,6);
        anotherMethod();

    }

    public static void test(String name) {
        System.out.println(name);
    }

    public static  void addNum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void anotherMethod() {
        System.out.println("Another Method");
    }
}
