package java_2.lesson_2.circles;

import java_2.lesson_2.common.CommonObject;
import java_2.lesson_2.common.GameCanvas;
import java_2.lesson_2.common.Sprite;

import java.awt.*;

public class Background implements CommonObject {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2f));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 3f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        color = new Color(red, green, blue);
    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        canvas.setBackground(color);
    }
}
