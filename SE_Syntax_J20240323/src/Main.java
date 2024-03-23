import com.manba.www.Outer;

public class Main {
    public static void main(String[] args) {
        IShape iShape=new Cycle();
        IShape iShape2=new Rect();

        new IShape(){
            @Override
            public void draw() {

            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public void smoeting() {

            }

            @Override
            public void kaonengnaing() {

            }
        }.draw();


    }
}
