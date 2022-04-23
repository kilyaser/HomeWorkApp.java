package java_2.lesson_2.common;

import java.awt.*;

public interface Controller {
    void onDrawCanvas(GameCanvas c, Graphics g, float deltaTime);
}
