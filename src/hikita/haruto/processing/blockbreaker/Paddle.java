package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;
import processing.core.PConstants;

import static processing.core.PConstants.RADIUS;

class Paddle implements Collision {
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
        if(pApplet.keyPressed){
            if (pApplet.keyCode == 37) x -=5;
            if(pApplet.keyCode == 39) x +=5;
        }
    }

    @Override
    public boolean isHit(int x, int y) {
        if(this.x < x && x < (this.x + this.w) &&this.y < y && y < (this.y+h)){
            return true;
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }
}

