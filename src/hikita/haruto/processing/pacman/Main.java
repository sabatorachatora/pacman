package hikita.haruto.processing.pacman;

import processing.core.PApplet;

public class Main extends PApplet {

    String[] stage = {
            "111111111111111111111111111111111111111",
            "100000000000000000000000000000000000111",
            "101111000000000001111111110111111110111",
            "100000000000000001111111110111111110011",
            "110111000000000001111111110111111111001",
            "110111111110111111111111110111111111101",
            "100000000000000000000000000001111111101",
            "111111101101111111111011111111111111101",
            "111111100000000000000011111111111111101",
            "111111101111011111111011111111111111001",
            "111111111111111111111111111111111111111",

    };

    int pacmanX = 0;
    int pacmanY = 5;

    int stageweight = 11;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        System.out.println(keyCode);
        if(keyPressed){
            if(keyCode == 38) pacmanY--;
            if(keyCode == 40) pacmanY++;
            if(keyCode == 37) pacmanX--;
            if(keyCode == 39) pacmanX++;


        }

        this.background(0);
        this.fill(0);
        for(int i=0; i<stage.length; i++){

            int y =i*11;
            for(int j=0; i<stage[i].length(); j++){
                char c = stage[i].charAt(j);
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
