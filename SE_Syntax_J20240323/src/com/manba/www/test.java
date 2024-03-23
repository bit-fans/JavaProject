package com.manba.www;

public class test {
    public static void main(String[] args) {
//        Object object=new Person();
        Person person1=new Person("zhangsan");
        Person person2=new Person("zhangsan");
        System.out.println(person1==person2);
//        Person person3=person1;
//        System.out.println(person1==person3);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
//        Person person3=(Person)object;
//        System.out.println(object.toString());

    }
}
