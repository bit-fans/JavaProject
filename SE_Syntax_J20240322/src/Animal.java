public class Animal {
    public String name;
    public int age;



    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+"吃了！");
    }
}
