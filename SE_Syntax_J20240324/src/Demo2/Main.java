package Demo2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1=new Person("zhangsan");
        Person person2=(Person) person1.clone();
        //System.out.println(person1.name);
        System.out.println(person1.m.money);
        //System.out.println(person2.name);
        System.out.println(person2.m.money);

        person2.m.money=999;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
