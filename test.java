import java.awt.*;

import javax.swing.JFrame;

class test {

    public void draw(Graphics g) {
        g.fillOval(50, 50, 100, 100);
    }

    public static void drawNode(String title) {

    }

    public static void drawArrow() {

    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(640, 480);
        f.setTitle("test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}