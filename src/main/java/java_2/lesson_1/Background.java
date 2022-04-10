package java_2.lesson_1;

import java.awt.*;
import java.util.Random;

public class Background extends Thread {
    private static Random rnd = new Random();
    private final Color color;
    private GameCanvas gameCanvas;

    public Background(GameCanvas canvas) {
        this.color = new Color(rnd.nextInt());
        this.gameCanvas = canvas;

    }
    public void setBackgroundColor(){
        gameCanvas.setBackground(color);
    }


}
