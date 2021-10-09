package hikita.haruto.processing.blockbreaker;

import processing.core.PApplet;

public class ProcessingMain extends PApplet {
    Stage stg;

    @Override
    public void settings() {
        size(500, 500);

        stg = new Stage(this);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        stg.update(this);
        stg.draw(this);
    }


}