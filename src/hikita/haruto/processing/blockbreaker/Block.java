package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;

class Block implements Collision {
    int x = 255;
    int y = 450;
    static int WIDTH = 30;
    static int HEIGHT = 15;

    public Block(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(PApplet pApplet) {
        pApplet.noStroke();
        pApplet.fill(255,255,255);
        pApplet.rect(x, y, WIDTH, HEIGHT);
    }

    @Override
    public boolean isHit(int x, int y) {
        if(this.x < x && x < (this.x + WIDTH) &&this.y < y && y < (this.y+HEIGHT)){
            return true;
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }
}

