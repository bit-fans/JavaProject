package Demo2;

class Money implements Cloneable{
    public int money;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Person implements Cloneable{
    public String name;
    public Money m;
    public Person(String name) {
        this.name = name;
        this.m=new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp=(Person) super.clone();

        tmp.m=(Money) this.m.clone();
        return tmp;
    }
}
