package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

class Stage {
    Ball ball = new Ball();
    Paddle paddle = new Paddle();
    List<Block> blocks = new ArrayList<>();

    public Stage(PApplet pApplet) {

        int width = pApplet.width;
        int height = pApplet.height;

        int BW = Block.WIDTH;
        int BH = Block.HEIGHT;
        int BG = 5;

        int n = width/(BW+BG);
        int space = width - (BW+BG) * n + BG;

        int startXPos = space/2;
        for(int i=0; i<n; i++){
            Block block = new Block(startXPos, 10);
            blocks.add(block);
            startXPos = startXPos + (BW+BG);
        }
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

        //ブロックの描画
        for(int i=0; i<blocks.size(); i++){
            blocks.get(i).draw(pApplet);
        }
    }

}