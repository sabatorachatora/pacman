package hikita.haruto.processing.pacman;

import processing.core.PApplet;

public class Main extends PApplet {

    String[] stage = {
            "111111111111111111111111111111111111111",
            "100000000000000000000000000000000000111",
            "101111000000000001101111110111011110111",
            "100000000000000000000111110000000000011",
            "110111000000000001110011110111011101001",
            "000111111110111111111011110111011100001",
            "110000000000000000000000000000001101101",
            "111111101101111111111011111111100001101",
            "111111100000000000000011111111110111101",
            "111111101111011111111000000000000000001",
            "111111111111111111111111111111111111111",

    };

    float pacmanX = 0;
    float pacmanY = 5;

    int stageweight = 11;
    long lastProcTime;
    boolean bKeyPressed = false;
    int bKeyCode = keyCode;


    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

        //移動処理

        float bx = pacmanX;
        float by = pacmanY;

        if(!bKeyPressed && keyPressed){
            bKeyCode = keyCode;
            bKeyPressed = true;
        }

        long now = System.currentTimeMillis();
        long dt = now - lastProcTime;
        if(dt > 20) {
            System.out.println(bKeyCode);
            //if (bKeyPressed) {
                if (bKeyCode == 38) by-=0.2;
                if (bKeyCode == 40) by+=0.2;
                if (bKeyCode == 37) bx-=0.2;
                if (bKeyCode == 39) bx+=0.2;
            //}
            lastProcTime = now;
            bKeyPressed = false;

            if(bx>0 && bx<stage.length && by>0 && by<stage[(int)by].length()){
                if(stage[(int)by].charAt((int) bx) == '0') {
                    pacmanX = bx;
                    pacmanY = by;
                }
            }
        }
        System.out.println("bx = " + bx);
        System.out.println("by = " + by);


        Math.round(bx);
        Math.round(by);

        System.out.println("bx = " + bx);
        System.out.println("by = " + by);



        this.background(0);
        this.fill(255);
        for(int i=0; i<stage.length; i++){

            int y =i*11;
            for(int j=0; j<stage[i].length();j++){  //メモ{j++を削除して試験、エラー発生せず : j<stage[i]...がi<stage[i]...になっていた、j++は関係なし
                char c = stage[i].charAt(j);  //メモ{charAt(j)の()内をてきとーなもので代入して試験、エラー発生せず : 上段エラーのとばっちり、修正の必要なし
                if(c == '1') {
                    int x = j*11;
                    this.noStroke();
                    this.rect(x, y, 10, 10);
                }
            }
        }

        stroke(255, 255, 0);
        strokeWeight(stageweight);
        point(pacmanX*stageweight+stageweight/2, pacmanY*stageweight+stageweight/2);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
