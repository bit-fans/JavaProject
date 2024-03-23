package abstract_Demo;

public class Rect extends Shape{
    public Rect(String type) {
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
