import abstract_Demo.Cycle;
import abstract_Demo.Rect;
import abstract_Demo.Shape;

public class Main {
    public static Animal fun (){
        return new Dog("黄浩洋",20);
    }

    public static void main123(String[] args) {
//        Animal animal=new Dog("黄浩洋",20);
//        animal.eat();

//        Dog dog=new Dog("黄浩洋",20);
//        fun(dog);

        fun().eat();

    }

    public static void main33(String[] args) {
        Animal animal=new Dog("h",3);
        animal.eat();
        if(animal instanceof Dog){
        Dog dog=(Dog)animal;
        dog.wags();
        }else {
            System.out.println("hh");
        }
    }

    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape=new Cycle();
        Shape shape1=new Rect();
        drawMap(shape);
        drawMap(shape1);
    }
}
