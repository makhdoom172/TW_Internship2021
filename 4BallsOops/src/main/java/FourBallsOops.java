import processing.core.PApplet;

public class FourBallsOops extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBallsOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        createBalls();
    }

    private void createBalls() {
        for(int num=1; num<=4; num++) {
            balls[num - 1] = new Ball(num, num*(HEIGHT/5));
        }
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        for(int num=1; num<=4; num++) {
            ellipse(balls[num-1].speed, (num*HEIGHT)/5, balls[num-1].DIAMETER, balls[num-1].DIAMETER);
            balls[num-1].speed += num;
        }
    }

}