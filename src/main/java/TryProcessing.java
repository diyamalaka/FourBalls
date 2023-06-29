import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private Circle circle1,circle2,circle3,circle4;
    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }
    public class Circle {
        private int x,height,speed;

        public Circle(int x, int height, int speed) {
            this.x = x;
            this.height = height;
            this.speed = speed;
        }

        public void display() {
            ellipse(x, height, DIAMETER, DIAMETER);
            x += speed;
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
        circle1 = new Circle(0, HEIGHT/5, 1);
        circle2 = new Circle(0, 2*HEIGHT/5, 2);
        circle3 = new Circle(0, 3*HEIGHT/5, 3);
        circle4 = new Circle(0, 4*HEIGHT/5, 4);
    }

    @Override
    public void draw() {
//        paintWhite();
        circle1.display();
        circle2.display();
        circle3.display();
        circle4.display();
    }

    private void paintWhite() {
        background(255);
    }
}