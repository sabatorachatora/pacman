package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;

class Stage {
    Ball ball = new Ball();
    Paddle paddle = new Paddle();

    public Stage() {
    }

    public void update(PApplet pApplet) {

        int bx = ball.x + ball.dx;
        int by = ball.y + ball.dy;

        int px = paddle.x;
        int py = paddle.y;
        int pw = paddle.w;
        int ph = paddle.h;
        //px < bx < (px + pw)
        //py < by < (py + ph)
        if(
            px < bx && bx < (px + pw) &&
            py < by && by < (py+ph)
        ){
            ball.dy = ball.dy*-1;
        }
    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);
        ball.draw(pApplet);
        paddle.draw(pApplet);
    }

}