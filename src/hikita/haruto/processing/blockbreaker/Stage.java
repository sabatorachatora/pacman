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

        if(paddle.isHit(bx, by)){
            ball.onAction(paddle.x, paddle.y);
        }

        ball.update(pApplet);
        paddle.update(pApplet);
    }

    public void draw(PApplet pApplet) {
        pApplet.background(128);
        ball.draw(pApplet);
        paddle.draw(pApplet);
    }

}