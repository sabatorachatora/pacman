package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;
import processing.core.PConstants;

import static processing.core.PConstants.RADIUS;

class Paddle {
    int x = 255;
    int y = 450;
    int w =50;
    int h = 10;


    public void draw(PApplet pApplet) {
        pApplet.noStroke();
        pApplet.fill(255,255,255);
        pApplet.rect(x, y, w, h);
    }

    public void update(PApplet pApplet) {
        if(pApplet.keyCode == 37) x = x -5;
        if(pApplet.keyCode == 39) x = x +5;
    }
}

