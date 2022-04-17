package java_2.lesson_2.bricks;

import java_2.lesson_2.common.CommonObject;
import java_2.lesson_2.common.Controller;
import java_2.lesson_2.common.GameCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainBricks extends JFrame implements Controller {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    // private Ball[] sprites = new Ball[10];
    private CommonObject[] objectss = new CommonObject[1];
    private int objectsCount;

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < objectsCount; i++) {
            objectss[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < objectsCount; i++) {
            objectss[i].render(canvas, g);
        }
    }
    @Override
    public void onDrawCanvas(GameCanvas c, Graphics g, float deltaTime) {
        update(c, deltaTime);
        render(c, g);
    }

    private void initApplication() {

    }

    private MainBricks() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Bricks");
        GameCanvas canvas = new GameCanvas(this);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1)
                    addObjects(new Brick(e.getX(), e.getY()));
                else if (e.getButton() == MouseEvent.BUTTON3)
                    removeSprite();
            }
        });
        add(canvas);
        initApplication();
        setVisible(true);
    }
    private void addObjects(CommonObject s){
        if(objectsCount == objectss.length){
            CommonObject[] temp = new CommonObject[objectss.length * 2];
            System.arraycopy(objectss, 0, temp, 0, objectss.length);
            objectss = temp;
        }
        objectss[objectsCount++] = s;
    }
    private void removeSprite(){
        if(objectsCount > 1) objectsCount--;
    }

    public static void main(String[] args) {
        new MainBricks();
    }

}
