package abstract_Demo;

public abstract class Shape {
    public String type;
    public Shape(String type){
        this.type=type;
    }
    public abstract void draw();
}
