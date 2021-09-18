package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;

class Ball {
    int x;
    int y;
    int dx;
    int dy;

    Ball() {
        x = 250;
        y = 50;
        dx = 1;
        dy = 1;
    }


    public void update(PApplet pApplet) {
        x = x + dx;
        y = y + dy;

        if (x > pApplet.width || x < 0) dx *= -1;
        if (y > 480 || y + dy < 0) dy *= -1;
    }

    public void draw(PApplet pApplet) {
        pApplet.strokeWeight(10);
        pApplet.stroke(255);
        pApplet.point(x, y);
    }
}
