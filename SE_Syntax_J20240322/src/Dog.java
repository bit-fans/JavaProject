public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(this.name+"吃了！");
    }
    public void wags(){
        System.out.println(this.name+"想吃桌饺");
    }
}
