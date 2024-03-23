package com.manba.www;

public class Outer {
    public int data1=1;
    public int data2=2;

    public static int data =12;

    static class InnerClass{
        int data11=11;
        int data12=12;
        int data13=13;
        public static int data123=123;


        public void func(){
            System.out.println("InnerClass");
            Outer outer=new Outer();
            System.out.println(outer.data1);
            System.out.println(outer.data2);
            System.out.println(data);
            System.out.println(data11);
            System.out.println(data12);
            System.out.println(data13);
            System.out.println(data123);
        }
    }


    public void func(){
        System.out.println("Outer");
    }


}
