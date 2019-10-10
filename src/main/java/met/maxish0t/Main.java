package met.maxish0t;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static Ball myBall = new Ball();

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Test");
        jFrame.setVisible(true);
        jFrame.setSize(1000, 700);
    }

    public static class Ball {
        // Object
        float x;
        float y;
        float diameter;
        float color;
    }
}
