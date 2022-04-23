package java_2.lesson_2.common;

import java.awt.*;

public interface CommonObject {
    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
