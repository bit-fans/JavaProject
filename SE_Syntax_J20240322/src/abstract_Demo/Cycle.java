package abstract_Demo;

public class Cycle extends Shape{
    public Cycle(String type) {
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("○");
    }
}
