import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int speedBall1 = 0, speedBall2 = 0, speedBall3 = 0, speedBall4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(speedBall1, HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(speedBall2, 2*(HEIGHT/5), DIAMETER, DIAMETER);
        ellipse(speedBall3, 3*(HEIGHT/5), DIAMETER, DIAMETER);
        ellipse(speedBall4, 4*(HEIGHT/5), DIAMETER, DIAMETER);
        speedBall1 += 1;
        speedBall2 += 2;
        speedBall3 += 3;
        speedBall4 += 4;
    }

}